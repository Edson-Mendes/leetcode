/**
 * Dado o head de uma linked list, rotacione a lista para a direita em k posições.
 *
 * Restrições:
 *
 * O número de nodes na lista está no intervalo [0, 500].
 *
 * -100 <= Node.val <= 100
 *
 * 0 <= k <= 2 * 10⁹
 *
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
const rotateRight = function (head, k) {
  const length = getLength(head);
  if (length === 0 || length === 1) return head;
  k = k % length;
  if (k === 0) return head;
  let tail = head;
  while (k > 0) {
    tail = tail.next;
    k--;
  }
  let newTail = head;
  while (tail.next) {
    tail = tail.next;
    newTail = newTail.next;
  }
  tail.next = head;
  let newHead = newTail.next;
  newTail.next = null;

  return newHead;
};

const getLength = (head) => {
  let length = 0;
  while (head) {
    length++;
    head = head.next;
  }
  return length;
};

function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}
