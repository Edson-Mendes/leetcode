package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado o root de uma binary tree, inverta a árvore e retorne sua root.
 * <br><br>
 * Restrições:<br>
 * O número de nodes da tree está no intervalo de [0, 100].<br>
 * -100 <= Node.val <= 100
 */
public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;

    TreeNode left = root.left;
    TreeNode right = root.right;
    root.left = invertTree(right);
    root.right = invertTree(left);
    return root;
  }

}
