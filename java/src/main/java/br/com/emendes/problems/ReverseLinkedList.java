package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

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
    if (head == null) return null;

    Deque<ListNode> stack = new ArrayDeque<>();
    while (head != null) {
      stack.push(head);
      head = head.next;
    }

    head = stack.pop();
    ListNode prev = head;
    while (!stack.isEmpty()) {
      prev.next = stack.pop();
      prev = prev.next;
    }
    prev.next = null;
    return head;
  }

}
