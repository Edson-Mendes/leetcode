/**
 * Dado uma linked list, troque a cada dois nós adjacentes e retorne o head.
 * Você deve resolver o problema sem modificar os valores nos nós da lista
 * (ou seja, somente os próprios nós podem ser alterados).
 *
 * Restrições:
 *
 * O número de nodes na lista está no intervalo [0, 100].
 *
 * 0 <= Node.val <= 100
 *
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function (head) {
  let dummy = new ListNode(-1, head);
  let node = dummy;
  let first = head;
  while (first?.next) {
    let second = first.next;
    first.next = second.next;
    second.next = first;
    node.next = second;
    node = first;
    first = first.next;
  }

  return dummy.next;
};

function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}

const generateListNode = (values) => {
  let dummy = { val: 0 };
  let node = dummy;
  for (const val of values) {
    node.next = { val: val, next: null };
    node = node.next;
  }

  return dummy.next;
};
