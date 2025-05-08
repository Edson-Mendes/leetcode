/**
 * Dado o head de uma lista encadeada ordenada, delete TODOS os nodes que possuem números duplicados,
 * deixando apenas números distintos na lista. Retorne a lista ordenada.
 *
 * Restrições:
 *
 * O número de nodes está no intervalo [0, 300].
 *
 * -100 <= Node.val <= 100
 *
 * É garantido que a lista está ordenada em ordem crescente.
 */
const deleteDuplicates = function (head) {
  if (!head) return head;
  let dummy = new ListNode(-1, head);
  let prev = dummy;
  let curr = head;
  while (curr) {
    let node = curr.next;
    let isRepeated = false;
    while (curr.val === node?.val) {
      node = node.next;
      isRepeated = true;
    }
    if (isRepeated) {
      prev.next = node;
    } else {
      prev.next = curr;
      prev = prev.next;
    }
    curr = node;
  }

  return dummy.next;
};

function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}

function generateListNode(values) {
  const dummy = new ListNode(-1);
  let node = dummy;

  for (const val of values) {
    node.next = new ListNode(val);
    node = node.next;
  }
  return dummy.next;
}
