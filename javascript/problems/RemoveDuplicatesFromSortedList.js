/**
 * Dado o head de uma lista encadeada, delete todas as duplicatas de modo que
 * cada elemento apareça apenas uma vez. Retorne a lista ordenada.
 *
 * Restrições:
 *
 * o número de nodes está no intervalo [0, 300].
 *
 * -100 <= Node.val <= 100
 *
 * É garantido que a lista esta ordenada.
 */
const deleteDuplicates = function (head) {
  let dummy = new ListNode(-1, head);
  while (head) {
    if (head.val == head.next?.val) head.next = head.next.next;
    else head = head.next;
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
