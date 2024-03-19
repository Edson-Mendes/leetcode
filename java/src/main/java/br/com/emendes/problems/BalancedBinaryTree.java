package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado uma binary tree, determine se é height-balanced.<br>
 * <br>
 * Uma height-balanced binary tree é uma binary tree em que a profundidade das duas subtrees de cada node
 * nunca difere em mais de um.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da binary tree esta no intervalo [0, 5000].<br>
 * -10⁴ <= Node.val <= 10⁴.
 */
public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    int diff = treeNodeHeight(root.left, 0) - treeNodeHeight(root.right, 0);

    return (diff == -1 || diff == 1 || diff == 0) && isBalanced(root.left) && isBalanced(root.right);
  }

  private int treeNodeHeight(TreeNode node, int height) {
    if (node == null) return height;
    height++;
    return Math.max(
        treeNodeHeight(node.left, height),
        treeNodeHeight(node.right, height)
    );
  }

}
