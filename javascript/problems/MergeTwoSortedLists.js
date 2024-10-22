/**
 * Você recebe dois heads de duas linked lists ordenadas list1 e list2.
 *
 * Mescle as duas listas em um única lista ordenada.
 * A lista deve ser feita juntando os nodes das duas primeiras listas.
 *
 * Retorne o head da lista mesclada.
 *
 * Restrições:
 *
 * O número de nodes em ambas as listas está no intervalo [0, 50].
 *
 * -100 <= Node.val <= 100
 *
 * Ambas as listas estão ordenadas em ordem não decrescente.
 *
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function (list1, list2) {
  let dummy = new ListNode(-1);
  let node = dummy;
  while (list1 && list2) {
    if (list1.val <= list2.val) {
      node.next = list1;
      list1 = list1.next;
    } else {
      node.next = list2;
      list2 = list2.next;
    }
    node = node.next;
  }
  while (list1) {
    node.next = list1;
    list1 = list1.next;
    node = node.next;
  }
  while (list2) {
    node.next = list2;
    list2 = list2.next;
    node = node.next;
  }

  return dummy.next;
};

function ListNode(val, next) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}
