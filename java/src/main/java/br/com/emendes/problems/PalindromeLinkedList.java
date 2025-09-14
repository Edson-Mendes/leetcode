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
 * <br><br>
 * Follow up: Você poderia resolver com complexidade de tempo O(n) e complexidade de espaço O(1)?
 */
public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    if (fast != null)
      slow = slow.next;
    slow = reverseList(slow);

    while (slow != null) {
      if (slow.val != head.val) return false;
      head = head.next;
      slow = slow.next;
    }
    return true;
  }

  private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }

    return prev;
  }

  public boolean firstSolution(ListNode head) {
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
