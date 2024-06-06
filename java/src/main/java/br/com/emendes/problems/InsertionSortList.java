package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado o head de uma linked list, ordene a lista usando insertion sort, e retorne o head da linked list ordenada.<br>
 * <br>
 * Os passos do algoritmo insertion sort:<br>
 * <ol>
 *  <li>Insertion sort itera, consumindo um elemento de entrada a cada repetição e aumentando uma lista de saída classificada.</li>
 *  <li>A cada iteração, a ordenação por inserção remove um elemento dos dados de entrada, encontra o local
 *  ao qual pertence na lista ordenada e o insere lá.</li>
 *  <li>Ele se repete até que nenhum elemento de entrada permaneça.</li>
 * </ol>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes da lista esta no intervalo [1, 5000].</li>
 *   <li>-5000 <= Node.val <= 5000</li>
 * </ul>
 */
public class InsertionSortList {

  public ListNode insertionSortList(ListNode head) {
    ListNode dummy = new ListNode(-10_000);
    ListNode curr = head;

    while (curr != null) {
      ListNode next = curr.next;
      ListNode prev = dummy;
      while (prev.next != null && prev.next.val < curr.val) {
        prev = prev.next;
      }
      curr.next = prev.next;
      prev.next = curr;
      curr = next;
    }

    return dummy.next;
  }

  public ListNode secondSolution(ListNode head) {
    Deque<ListNode> nodes = new ArrayDeque<>();
    Deque<ListNode> prevs = new ArrayDeque<>();
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode curr = head;
    ListNode prev = dummy;
    while (curr != null) {
      nodes.push(curr);
      prevs.push(prev);
      prev = prev.next;
      curr = curr.next;
    }
    while (!nodes.isEmpty()) {
      curr = nodes.pop();
      prev = prevs.pop();
      ListNode next = curr.next;
      while (next != null && curr.val > next.val) {
        swap(prev, curr, next);
        prev = next;
        next = curr.next;
      }
    }

    return dummy.next;
  }

  public ListNode firstSolution(ListNode head) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    insertionSort(head, dummy);
    return dummy.next;
  }

  private void insertionSort(ListNode curr, ListNode prev) {
    if (curr.next == null) return;

    insertionSort(curr.next, curr);

    ListNode next = curr.next;
    while (next != null && curr.val > next.val) {
      swap(prev, curr, next);
      prev = next;
      next = curr.next;
    }
  }

  private void swap(ListNode n1Prev, ListNode n1, ListNode n2) {
    if (n1 == n2) return;
    n1Prev.next = n2;
    n1.next = n2.next;
    n2.next = n1;
  }

}
