package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * É dado a você a head de uma singly linked list. A lista pode ser representada como:<br>
 * <br>
 * 0 -> 1 -> 2 -> ... -> n-1 -> n<br>
 * <br>
 * Reordene a lista de modo que:<br>
 * <br>
 * 0 -> n -> 1 -> n-1 -> 2 -> n-2 -> ...<br>
 * <br>
 * Você não deve modificar os valores de cada node. Apenas os próprios nodes podem ser mudados.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes da lista está no intervalo de [1, 5 * 10⁴]</li>
 *   <li>1 <= Node.val <= 1000</li>
 * </ul>
 */
public class ReorderList {

  public void reorderList(ListNode head) {
    if (head.next == null) return;
    ListNode mid = findMid(head);
    ListNode reversed = reverseList(mid);
    merge(head, reversed);
  }

  private void merge(ListNode l1, ListNode l2) {
    while (l2 != null) {
      ListNode next = l1.next;
      l1.next = l2;
      l1 = l1.next;
      l2 = next;
    }
  }

  private ListNode reverseList(ListNode head) {
    ListNode curr = head.next;
    ListNode prev = head;
    ListNode next = null;
    prev.next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }

  private ListNode findMid(ListNode head) {
    ListNode prev = null;
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      prev = slow;
      fast = fast.next.next;
      slow = slow.next;
    }
    prev.next = null;

    return slow;
  }

  /**
   * First solution.
   */
  public void firstSolution(ListNode head) {
    Deque<ListNode> nodes = new LinkedList<>();

    ListNode node = head.next;
    while (node != null) {
      nodes.add(node);
      node = node.next;
    }

    node = head;
    while (!nodes.isEmpty()) {
      node.next = nodes.removeLast();
      node = node.next;
      if (!nodes.isEmpty()) {
        node.next = nodes.removeFirst();
        node = node.next;
      }
    }
    node.next = null;

  }

}
