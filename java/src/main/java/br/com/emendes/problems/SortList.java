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
