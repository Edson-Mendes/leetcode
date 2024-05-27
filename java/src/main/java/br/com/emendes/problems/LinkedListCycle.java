package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Dado o head de uma linked list, determine se a linked list contém um ciclo.<br>
 * <br>
 * Existe um ciclo em uma linked list se houver algum nó na lista que possa ser alcançado novamente
 * seguindo continuamente o próximo ponteiro. Internamente, pos é usado para denotar o índice do nó
 * ao qual o próximo ponteiro da cauda está conectado. Observe que pos não é passado como parâmetro.<br>
 * <br>
 * Retorne true se houver um ciclo na linked list. Caso contrário, retorne false.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes da lista está no intervalo [0, 10⁴]</li>
 *   <li>-10⁵ <= Node.val <= 10⁵</li>
 *   <li>pos é -1 ou um índice válido na linked list.</li>
 * </ul>
 * <br>
 * Follow up: você pode resolver isso com complexida de memória de O(1)?
 */
public class LinkedListCycle {

  public boolean hasCycle(ListNode head) {
    int counter = 0;

    while (head != null && counter <= 10_001) {
      head = head.next;
      counter++;
    }

    return counter > 10_001;
  }

  public boolean firstSolution(ListNode head) {
    Set<ListNode> visited = new HashSet<>();

    while (head != null) {
      if (visited.contains(head)) return true;
      visited.add(head);
      head = head.next;
    }
    return false;
  }

}
