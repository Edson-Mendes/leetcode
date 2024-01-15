package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado o head de uma lista encadeada ordenada, delete todos os nodes que possuem números duplicados,
 * deixando apenas os números distintos da lista original. Retorne a lista ordenada.<br><br>
 * <p>
 * Restrições:<br>
 * O número de nodes na lista é no intervalo [0, 300].<br>
 * -100 <= Node.val <= 100<br>
 * É garantido que a lista está ordenada em ordem crescente.
 */
public class RemoveDuplicatesFromSortedListII {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0, head);
    ListNode prev = dummy;

    while (head != null) {
      while (head.next != null && head.val == head.next.val) {
        head = head.next;
      }
      if (prev.next == head) {
        prev = prev.next;
      } else {
        prev.next = head.next;
      }
      head = head.next;
    }

    return dummy.next;
  }

  public ListNode firstSolution(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode start = head;

    while (start != null && start.next != null && start.val == start.next.val) {
      int value = start.val;
      while (start != null && start.val == value) {
        start = start.next;
      }
    }

    if (start == null) return null;
    ListNode previous = start;
    ListNode curr = start.next;
    while (curr != null) {
      while (curr != null && curr.next != null && curr.val == curr.next.val) {
        int value = curr.val;
        while (curr != null && curr.val == value) {
          curr = curr.next;
        }
      }
      if (previous.next != curr) {
        previous.next = curr;
      }
      previous = curr;
      if (curr != null)
        curr = curr.next;
    }

    return start;
  }

}
