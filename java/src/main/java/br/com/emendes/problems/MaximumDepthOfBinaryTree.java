package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Dado o root de uma binary tree, retorne a profundidade máxima.<br>
 * <br>
 * A profundidade máxima de uma binary tree é o número de nodes ao longo do caminho mais longo, do root node até
 * o node mais distante.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore esta no intervalo [0, 10⁴]<br>
 * -100 <= Node.val <= 100
 */
public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    int depth = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (node.left != null)
          queue.offer(node.left);
        if (node.right != null)
          queue.offer(node.right);
      }
      depth++;
    }

    return depth;
  }

  public int firstSolution(TreeNode root) {
    return maxDepth(root, 0);
  }

  private int maxDepth(TreeNode node, int currMaxDepth) {
    if (node == null) return currMaxDepth;
    currMaxDepth++;

    return Math.max(maxDepth(node.left, currMaxDepth), maxDepth(node.right, currMaxDepth));
  }

}
