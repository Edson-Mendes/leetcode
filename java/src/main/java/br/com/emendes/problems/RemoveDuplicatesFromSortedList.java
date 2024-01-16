package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado o head de uma lista encadeada ordenada,
 * delete todas as duplicatas de maneira que cada elemento apareça uma vez.
 * Retorne a lista encadeada ordenada.
 * <br><br>
 * Restrições:<br>
 * O número de nodes da lista está no intervalo [0, 300].<br>
 * -100 <= Node.val <= 100<br>
 * É garantido que a lista estará ordenada.
 */
public class RemoveDuplicatesFromSortedList {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0, head);

    ListNode curr = head;
    ListNode previous = dummy;

    while (curr != null) {
      while (curr.next != null && curr.val == curr.next.val) {
        curr = curr.next;
      }
      if (previous.next == curr) {
        previous = previous.next;
      } else {
        previous.next = curr;
        previous = curr;
      }
      curr = curr.next;
    }

    return dummy.next;
  }

}
