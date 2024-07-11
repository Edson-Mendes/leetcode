package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

/**
 * Dado o head de duas listas encadeadas headA e headB, retorne o node em que as duas listas se cruzam.
 * Se as duas listas não tiverem uma interseção retorne null.<br>
 * <br>
 * Os casos de teste são gerados de forma que não haja ciclos em nenhuma parte de toda a estrutura vinculada.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes de listA é m</li>
 *   <li>O número de nodes da listB é n</li>
 *   <li>1 <= m, n <= 3 * 10⁴</li>
 *   <li>1 <= Node.val <= 10⁵</li>
 * </ul>
 */
public class IntersectionOfTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lengthA = length(headA);
    int lengthB = length(headB);
    if (lengthA > lengthB) {
      headA = skip(headA, lengthA - lengthB);
    } else if (lengthA < lengthB) {
      headB = skip(headB, lengthB - lengthA);
    }
    while (headA != null && headB != null) {
      if (headA == headB) return headA;
      headA = headA.next;
      headB = headB.next;
    }

    return null;
  }

  private ListNode skip(ListNode node, int toSkip) {
    while (toSkip > 0 && node != null) {
      node = node.next;
      toSkip--;
    }

    return node;
  }

  private int length(ListNode head) {
    int length = 0;
    while (head != null) {
      length++;
      head = head.next;
    }
    return length;
  }

  /**
   * First solution.
   */
  public ListNode firstSolution(ListNode headA, ListNode headB) {
    while (headA != null) {
      ListNode nodeB = headB;
      while (nodeB != null) {
        if (headA == nodeB) return headA;
        nodeB = nodeB.next;
      }
      headA = headA.next;
    }

    return null;
  }

}
