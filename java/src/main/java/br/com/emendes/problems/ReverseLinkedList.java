package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado o head de uma singly linked list, reverta a lista, e retorne a lista revertida.<br>
 * <br>
 * Restrições:<br>
 * -> O número de nodes da lista está no intervalo [0, 5000].<br>
 * -> -5000 <= Node.val <= 5000<br>
 * <br>
 * Follow up: Uma lista encadeada pode ser revertida iterativamente e recursivamente.
 * Você pode implementar das duas maneiras?
 */
public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    return reverse(null, head);
  }

  private ListNode reverse(ListNode prev, ListNode curr) {
    if (curr == null) return prev;

    ListNode node = reverse(curr, curr.next);
    curr.next = prev;
    return node;
  }

  /**
   * Iterative solution.
   */
  public ListNode iterativeSolution(ListNode head) {
    ListNode prev = null;

    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

}
