/**
 * Você recebe duas linked lists não vazias representando dois inteiros não negativos.
 * Os digitos estão armazenados em ordem reversa, e cada node contém um único digito.
 * Some os dois números e retorne a soma como uma linked list.
 *
 * Você pode assumir que os dois número não possuem zeros a esquerda, exceto o próprio zero.
 *
 * Restrições:
 *
 * o número de nodes em cada lista está no intervalo [1, 100].
 *
 * 0 <= Node.val <= 9
 *
 * É garantido que os números não possuem zeros a esquerda.
 *
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
  let dummy = { val: 0, next: null };
  let result = dummy;
  let remainder = 0;
  while (l1 && l2) {
    let val = l1.val + l2.val + remainder;
    remainder = Math.floor(val / 10);
    val = val % 10;
    result.next = { val: val, next: null };
    result = result.next;
    l1 = l1.next;
    l2 = l2.next;
  }
  while (l1) {
    let val = l1.val + remainder;
    remainder = Math.floor(val / 10);
    val = val % 10;
    result.next = { val: val, next: null };
    result = result.next;
    l1 = l1.next;
  }
  while (l2) {
    let val = l2.val + remainder;
    remainder = Math.floor(val / 10);
    val = val % 10;
    result.next = { val: val, next: null };
    result = result.next;
    l2 = l2.next;
  }
  if (remainder > 0) {
    result.next = {val: remainder, next: null};
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