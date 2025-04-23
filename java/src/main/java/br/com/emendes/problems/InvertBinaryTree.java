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
    invertTreeHelper(root);
    return root;
  }

  private void invertTreeHelper(TreeNode node) {
    if (node == null) return;
    TreeNode aux = node.left;
    node.left = node.right;
    node.right = aux;

    invertTreeHelper(node.left);
    invertTreeHelper(node.right);
  }

}
