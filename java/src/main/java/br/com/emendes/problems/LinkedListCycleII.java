package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Dado o head de uma linked list, retorne o node onde o ciclo começa, se não existir ciclo, retorne null.<br>
 * <br>
 * Existe um ciclo em uma linked list se houver algum nó na lista que possa ser alcançado novamente
 * seguindo continuamente o próximo ponteiro. Internamente, pos é usado para denotar o índice do nó
 * ao qual o próximo ponteiro da cauda está conectado. Observe que pos não é passado como parâmetro.<br>
 * <br>
 * Não modifique a linked list<br>
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
public class LinkedListCycleII {

  public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (fast == slow) {
        slow = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return slow;
      }
    }

    return null;
  }

  public ListNode firstSolution(ListNode head) {
    Set<ListNode> visited = new HashSet<>();

    while (head != null) {
      if (visited.contains(head)) return head;
      visited.add(head);
      head = head.next;
    }

    return null;
  }

}
