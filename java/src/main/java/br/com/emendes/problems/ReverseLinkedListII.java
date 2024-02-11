package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado a head de uma linked list e dois inteiros left e right onde left <= right,
 * inverta os nodes da lista da posição esquerda para a posição direita.
 * E retorne a linked list.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes na lista é n.<br>
 * 1 <= n <= 500<br>
 * -500 <= Node.val <= 500<br>
 * 1 <= left <= right <= n
 */
public class ReverseLinkedListII {

  public ListNode reverseBetween(ListNode head, int left, int right) {
    if (left == right) return head;
    ListNode dummy = new ListNode(0, head);
    ListNode leftLeft = dummy;
    ListNode nodeLeft = head;
    for (int i = 1; i < left; i++) {
      leftLeft = nodeLeft;
      nodeLeft = nodeLeft.next;
    }
    ListNode current = nodeLeft.next;
    ListNode previous = nodeLeft;
    ListNode next;
    left++;
    while (left <= right) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
      left++;
    }
    nodeLeft.next = current;
    leftLeft.next = previous;

    return dummy.next;
  }

}
