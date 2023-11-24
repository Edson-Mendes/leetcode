package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado a head de uma linked list, rotacione a lista para a direta em k vezes.<br><br>
 *
 * Restrições:<br>
 * O número de nodes da lista está no intervalo de [0, 500].<br>
 * -100 <= Node.val <= 100<br>
 * 0 <= k <= 2 * 10⁹
 */
public class RotateList {

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) return head;

    int listSize = 1;
    ListNode tail = head;

    while(tail.next != null) { // O(n)
      listSize++;
      tail = tail.next;
    }

    k = k % listSize;
    if (k == 0) return head;

    int index = listSize - k - 1;
    ListNode newTail = head;

    while (index > 0) {
      newTail = newTail.next;
      index--;
    }

    tail.next = head;
    ListNode newHead = newTail.next;
    newTail.next = null;

    return newHead;
  }

}
