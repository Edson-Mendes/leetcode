/**
 * Você recebe um array de k linked lists chamado lists, cada linked list está ordenada em ordem crescente.
 *
 * Mescle todas as linked lists em uma linked list e a retorne.
 *
 * Restrições:
 *
 * k == lists.length
 *
 * 0 <= k <= 10⁴
 *
 * 0 <= lists[i].length <= 500
 *
 * -10⁴ <= lists[i][j] <= 10⁴
 *
 * lists[i] está ordenado em ordem crescente.
 *
 * A soma de lists[i].length não excederá 10⁴.
 *
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
var mergeKLists = function (lists) {
  if (lists.length === 0) return null;
  let length = lists.length;

  while (length > 1) {
    let index = 0;
    let newIndex = 0;
    while (index + 1 < length) {
      lists[newIndex] = merge(lists[index], lists[index + 1]);
      index += 2;
      newIndex++;
    }
    if (index < length) {
      lists[newIndex] = lists[index];
      newIndex++;
    }
    length = newIndex;
  }

  return lists[0];
};

const merge = (list1, list2) => {
  let dummy = new ListNode(-1);
  let node = dummy;
  while (list1 && list2) {
    if (list1.val <= list2.val) {
      node.next = list1;
      list1 = list1.next;
    } else {
      node.next = list2;
      list2 = list2.next;
    }
    node = node.next;
  }
  while (list1) {
    node.next = list1;
    list1 = list1.next;
    node = node.next;
  }
  while (list2) {
    node.next = list2;
    list2 = list2.next;
    node = node.next;
  }

  return dummy.next;
};

const generateListNode = (values) => {
  let dummy = { val: 0 };
  let node = dummy;
  for (const val of values) {
    node.next = { val: val, next: null };
    node = node.next;
  }

  return dummy.next;
};

var firstSolution = function (lists) {
  let dummy = new ListNode(-1);
  let node = dummy;
  let length = lists.length;
  while (true) {
    let i = 0;
    while (!lists[i] && i < length) {
      i++;
    }
    if (i === length) break;
    let j = i + 1;
    while (j < length) {
      if (lists[j]) {
        if (lists[j].val < lists[i].val) i = j;
      }
      j++;
    }
    node.next = lists[i];
    lists[i] = lists[i].next;
    node = node.next;
  }

  return dummy.next;
};

function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}
