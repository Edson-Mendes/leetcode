/**
 * Dado o head de uma linked list e uma valor x, particione de forma que todos os
 * nodes menores que x venham antes dos nodes maiores e iguais a x.
 *
 * Você deve preservar a ordem relativa original em ambas as partições.
 *
 * Restrições:
 *
 * Restrições:
 *
 * O números de nodes na lista está no intervalo [0, 200].
 *
 * -100 <= Node.val <= 100
 *
 * -200 <= x <= 200
 */
const partition = function (head, x) {
  let lessStart = null;
  let lessEnd = null;
  let greaterEqualStart = null;
  let greaterEqualEnd = null;
  while (head) {
    if (head.val < x) {
      if (!lessStart) {
        lessStart = head;
        lessEnd = head;
      } else {
        lessEnd.next = head;
        lessEnd = head;
      }
    } else if (!greaterEqualStart) {
      greaterEqualStart = head;
      greaterEqualEnd = head;
    } else {
      greaterEqualEnd.next = head;
      greaterEqualEnd = head;
    }
    head = head.next;
  }
  if (greaterEqualEnd) greaterEqualEnd.next = null;
  if (!lessEnd) {
    return greaterEqualStart;
  }
  lessEnd.next = greaterEqualStart;
  return lessStart;
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
