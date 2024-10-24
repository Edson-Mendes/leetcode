/**
 * Dado o head de uma linked list, reverta os nodes da lista em k nodes por vez, e retorne a lista modificada.
 *
 * k é um inteiro positivo e é menor ou igual ao tamanho da lista. Se o número de nodes da lista não for
 * multiplo de k então os nós deixados de fora, no final, devem permanecer como estão.
 *
 * Você não pode alterar os valores nos nós da lista, apenas os nós em si podem ser alterados.
 *
 * Restrições:
 *
 * O número de nodes da lista é igual a n
 *
 * 1 <= k <= n <= 5000
 *
 * 0 <= Node.val <= 1000
 *
 * Acompanhamento: Você pode resolver o problema com complexidade de espaço O(1)?
 *
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var reverseKGroup = function (head, k) {
  let dummy = new ListNode(-1, head);
  let prev = dummy;
  let node = dummy;
  let count = 0;
  let stack = [];
  while (node.next) {
    node = node.next;
    stack.push(node);
    count++;
    if (count === k) {
      prev.next.next = node.next;
      prev.next = node;
      stack.pop();
      while (stack.length) {
        node.next = stack.pop();
        node = node.next;
      }
      count = 0;
      prev = node;
    }
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

let list = reverseKGroup(generateListNode([1, 2, 3, 4, 5]), 1);

while (list) {
  console.log(list.val);
  list = list.next;
}
