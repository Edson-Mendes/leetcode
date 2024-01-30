package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado o head de uma Linked List e um valor x, particione de maneira que todos os nodes menores que x
 * venham antes que os nodes maiores ou iguais a x.<br>
 * <br>
 * Você deve preservar a ordem relativa dos nodes em cada uma das partições.<br>
 * <br>
 * Retrições:<br>
 * O número de nodes na lista está no intervalo [0, 200].<br>
 * -100 <= Node.val <= 100<br>
 * -200 <= x <= 200
 */
public class PartitionList {

  public ListNode partition(ListNode head, int x) {
    if (x <= -100 || x > 100) return head;

    ListNode dummy = new ListNode(0, head);
    ListNode current = head;
    ListNode previous = dummy;

    while (current != null && current.val < x) {
      previous = current;
      current = current.next;
    }

    ListNode lastLesser = previous;
    ListNode firstEqualsGreater = current;

    while (current != null) {
      if (current.val < x) {
        previous.next = current.next;
        current.next = firstEqualsGreater;
        lastLesser.next = current;
        lastLesser = current;
        current = previous.next;
      } else {
        previous = current;
        current = current.next;
      }
    }

    return dummy.next;
  }

}
