package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado o head de uma linked list, retorne true se a lista for um palíndromo ou false caso contrário.
 * <br><br>
 * Restrições:<br>
 * o número de nodes na lista está no intervalo [1, 10⁵].<br>
 * 0 <= Node.val <= 9
 */
public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    Deque<Integer> stack = new ArrayDeque<>();

    ListNode node = head;
    while (node != null) {
      stack.push(node.val);
      node = node.next;
    }
    while (head != null && stack.pop().equals(head.val))
      head = head.next;

    return stack.isEmpty();
  }

}
