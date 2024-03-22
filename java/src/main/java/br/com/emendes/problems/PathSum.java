package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado o root de uma binary tree e um inteiro targetSum, retorne true se a árvore tem um caminho root-to-leaf
 * de modo que a soma de todos os valores ao longo do caminho seja igual targetSum.<br>
 * <br>
 * Uma leaf é um node sem filhos.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore esta no intervalo [0, 5000].<br>
 * -1000 <= Node.val <= 1000<br>
 * -1000 <= targetSum <= 1000
 */
public class PathSum {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    return hasPathSumHelper(root, targetSum);
  }

  private boolean hasPathSumHelper(TreeNode node, int total) {
    if (node == null) return total == 0;

    total -= node.val;
    if (node.left != null && node.right != null)
      return hasPathSumHelper(node.left, total) || hasPathSumHelper(node.right, total);
    if (node.left != null)
      return hasPathSumHelper(node.left, total);

    return hasPathSumHelper(node.right, total);
  }

}
