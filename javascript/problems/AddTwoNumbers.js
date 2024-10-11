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
  let carry = 0;
  while (l1 || l2 || carry > 0) {
    let sum = 0;
    if (l1) {
      sum += l1.val;
      l1 = l1.next;
    }
    if (l2) {
      sum += l2.val;
      l2 = l2.next;
    }
    sum += carry;
    carry = 0;
    if (sum > 9) {
      carry = 1;
      sum -= 10;
    }
    result.next = new ListNode(sum);
    result = result.next;
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

function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}
