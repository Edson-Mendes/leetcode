package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
    List<TreeNode> values = toTreeNodeList(head);

    return sortedListToBSTHelper(values, 0, values.size() - 1);
  }

  private TreeNode sortedListToBSTHelper(List<TreeNode> nodes, int start, int end) {
    if (end < start) return null;

    int half = (start + end) / 2;
    TreeNode node = nodes.get(half);

    node.left = sortedListToBSTHelper(nodes, start, half - 1);
    node.right = sortedListToBSTHelper(nodes, half + 1, end);
    return node;
  }

  private List<TreeNode> toTreeNodeList(ListNode head) {
    List<TreeNode> treeNodeList = new ArrayList<>();

    while (head != null) {
      treeNodeList.add(new TreeNode(head.val));
      head = head.next;
    }

    return treeNodeList;
  }

}
