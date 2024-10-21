/**
 * Dado o head de uma linked list, remova o nth node da fim da lista e retorne o head.
 *
 * Restrições:
 *
 * O número de nodes na lista is sz.
 *
 * 1 <= sz <= 30
 *
 * 0 <= Node.val <= 100
 *
 * 1 <= n <= sz
 *
 * Acompanhamento: Você conseguiria fazer isso de uma só vez?
 *
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function (head, n) {
  let dummy = new ListNode(-1, head);
  let count = 1;
  while (count < n) {
    head = head.next;
    count++;
  }
  let prev = dummy;
  let node = dummy;
  while (head != null) {
    head = head.next;
    prev = node;
    node = node.next;
  }
  prev.next = node.next;
  node.next = null;
  return dummy.next;
};

var firstSolution = function (head, n) {
  let dummy = new ListNode(-1, head);
  let size = 0;
  let node = head;
  while (node != null) {
    size++;
    node = node.next;
  }
  node = dummy;
  let previous = dummy;
  let count = 0;
  let nth = size - n + 1;
  while (count < nth) {
    previous = node;
    node = node.next;
    count++;
  }

  previous.next = node.next;
  node.next = null;
  return dummy.next;
};

function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}
