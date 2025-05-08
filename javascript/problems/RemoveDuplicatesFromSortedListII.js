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
  while (head) {
    while (head.val === head.next?.val) {
      head = head.next;
    }
    if (prev.next === head) prev = prev.next;
    else prev.next = head.next;
    head = head.next;
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