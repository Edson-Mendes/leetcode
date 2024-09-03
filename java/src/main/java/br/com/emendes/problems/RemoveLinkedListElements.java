package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado o head de uma linked list e um inteiro val, remova todos os nodes da linked list que tenham
 * node.val == val, e retorne o novo head.<br>
 * <br>
 * Restrições:<br>
 * -> O número de nodes da lista está no intervalo [0, 10⁴].<br>
 * -> 1 <= Node.val <= 50<br>
 * -> 0 <= val <= 50
 */
public class RemoveLinkedListElements {

  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0, head);
    ListNode node = head;
    ListNode prev = dummy;

    while (node != null) {
      if (node.val == val) {
        prev.next = node.next;
      } else {
        prev = prev.next;
      }
      node = node.next;
    }

    return dummy.next;
  }

}
