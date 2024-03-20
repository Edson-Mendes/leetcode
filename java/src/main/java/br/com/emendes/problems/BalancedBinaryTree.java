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
    return getHeight(root, 0) != -1;
  }

  private int getHeight(TreeNode root, int height) {
    if (root == null) return height;
    if (height == -1) return height;
    height++;

    int left = getHeight(root.left, height);
    if (left == -1) return -1;

    int right = getHeight(root.right, height);
    if (right == -1) return -1;

    int diff = Math.abs(right - left);
    if (diff > 1) return -1;

    height = Math.max(left, right);
    return height;
  }

}
