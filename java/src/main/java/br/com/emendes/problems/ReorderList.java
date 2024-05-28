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
