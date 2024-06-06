package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado o head de uma linked list, ordene a lista em ordem ascendente e retorne o head.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes da lista esta no intervalo de [0, 5 * 10⁴].</li>
 *   <li>-10⁵ <= Node.val <= 10⁵</li>
 * </ul>
 */
public class SortList {

  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) return head;

    ListNode slow = head;
    ListNode fast = head;
    ListNode mid = head;
    while (fast != null && fast.next != null) {
      mid = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    mid.next = null;
    head = sortList(head);
    slow = sortList(slow);
    return merge(head, slow);
  }

  private ListNode merge(ListNode h1, ListNode h2) {
    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy;

    while (h1 != null && h2 != null) {
      if (h1.val <= h2.val) {
        prev.next = h1;
        h1 = h1.next;
      } else {
        prev.next = h2;
        h2 = h2.next;
      }
      prev = prev.next;
    }
    while (h1 != null) {
      prev.next = h1;
      h1 = h1.next;
      prev = prev.next;
    }
    while (h2 != null) {
      prev.next = h2;
      h2 = h2.next;
      prev = prev.next;
    }

    return dummy.next;
  }

  /**
   * First solution - Insertion sort algorithm.
   */
  public ListNode firstSolution(ListNode head) {
    ListNode dummy = new ListNode(-1);
    ListNode curr = head;
    while (curr != null) {
      ListNode next = curr.next;
      ListNode prev = dummy;

      while (prev.next != null && prev.next.val < curr.val) {
        prev = prev.next;
      }
      curr.next = prev.next;
      prev.next = curr;
      curr = next;
    }

    return dummy.next;
  }

}
