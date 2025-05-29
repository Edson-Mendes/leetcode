package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado o root de uma binary search tree, e um inteiro k, retorne o kth menor valor (1-indexed)
 * de todos os valores dos nodes da tree.
 * <br><br>
 * Restrições:<br>
 * O número de nodes da tree é n.<br>
 * 1 <= k <= n <= 10⁴<br>
 * 0 <= Node.val <= 10⁴<br>
 * <br>
 * Follow-up: Se o BST for modificado com frequência (ou seja, podemos fazer operações de inserção e exclusão) e
 * você precisar encontrar o k-ésimo com menor frequência, como você otimizaria?
 */
public class KthSmallestElementInABST {

  public int kthSmallest(TreeNode root, int k) {
    int counter = 0;
    Deque<TreeNode> stack = new ArrayDeque<>();
    while (root != null || !stack.isEmpty()) {
      if (root == null) {
        root = stack.pop();
        if (++counter == k) break;
        root = root.right;
      } else {
        stack.push(root);
        root = root.left;
      }
    }

    return root.val;
  }

  public int firstSolution(TreeNode root, int k) {
    traverse(root, k);
    return answer;
  }

  private int answer = -1;
  private int rank = 0;

  private void traverse(TreeNode node, int k) {
    if (node == null) return;
    traverse(node.left, k);
    if (++rank == k) {
      answer = node.val;
      return;
    }
    traverse(node.right, k);
  }

}
