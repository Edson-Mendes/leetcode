package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Você recebe o root de uma binary search tree (BST),
 * onde os valores de exatamente dois nós da árvore foram trocados por engano.
 * Recupere a árvore sem mudar sua estrutura.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore está no intervalo [2, 100]<br>
 * -2³¹ <= Node.val <= 2³¹ - 1
 */
public class RecoverBinarySearchTree {

  private TreeNode pred;
  private TreeNode first;
  private TreeNode second;

  public void recoverTree(TreeNode root) {
    pred = null;
    first = null;
    second = null;
    inorder(root);
    swap(first, second);
  }

  private void inorder(TreeNode root) {
    if (root == null)
      return;

    inorder(root.left);

    if (pred != null && root.val < pred.val) {
      second = root;
      if (first == null)
        first = pred;
      else
        return;
    }
    pred = root;

    inorder(root.right);
  }

  private void swap(TreeNode node1, TreeNode node2) {
    int temp = node1.val;
    node1.val = node2.val;
    node2.val = temp;
  }

}
