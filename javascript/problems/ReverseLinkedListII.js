/**
 * Dado o head de uma linked list e dois inteiro left e right onde left <= right,
 * reverta os nodes da lista da posição left até a posição right, e retorne a lista revertida.
 *
 * Restrições:
 *
 * - o número de nodes da lista é n.
 *
 * - 1 <= n <= 500
 *
 * - -500 <= Node.val <= 500
 *
 * - 1 <= left <= right <= n
 */
const reverseBetween = function (head, left, right) {
  if (left === right) return head;
  const dummy = new ListNode(-1, head);
  let prev = dummy;
  for (let i = 0; i < left - 1; i++) prev = prev.next;

  const tail = prev.next;
  for (let i = 0; i < right - left; i++) {
    const cache = tail.next;
    tail.next = cache.next;
    cache.next = prev.next;
    prev.next = cache;
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
