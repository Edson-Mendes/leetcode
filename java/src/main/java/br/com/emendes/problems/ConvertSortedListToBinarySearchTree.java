package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.TreeNode;

/**
 * Dado o head de uma singly linked list onde os elementos estão ordenados em ordem crescente,
 * converta para uma binary search tree.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes na head está no intervalo [0, 2 * 10⁴].<br>
 * -10⁵ <= Node.val <= 10⁵
 */
public class ConvertSortedListToBinarySearchTree {

  public TreeNode sortedListToBST(ListNode head) {
    int[] values = sortedListToArray(head);

    return sortedListToBSTHelper(values, 0, values.length - 1);
  }

  private TreeNode sortedListToBSTHelper(int[] values, int start, int end) {
    if (end < start) return null;

    int half = (start + end) / 2;
    return new TreeNode(
        values[half],
        sortedListToBSTHelper(values, start, half - 1),
        sortedListToBSTHelper(values, half + 1, end)
    );
  }

  private int[] sortedListToArray(ListNode head) {
    int length = listNodeLength(head);
    int[] array = new int[length];
    int i = 0;
    while (i < length) {
      array[i++] = head.val;
      head = head.next;
    }
    return array;
  }

  private int listNodeLength(ListNode node) {
    int length = 0;

    while (node != null) {
      length++;
      node = node.next;
    }

    return length;
  }


}
