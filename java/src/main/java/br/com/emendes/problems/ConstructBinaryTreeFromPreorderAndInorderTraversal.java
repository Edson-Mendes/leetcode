package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Dado dois arrays de inteiros preorder e inorder, onde preorder é a travessia de pré-ordem de uma binary tree
 * e inorder é o percurso em ordem da mesma tree, construa e retorne a binary tree.<br>
 * <br>
 * Restrições:<br>
 * 1 <= preorder.length <= 3000<br>
 * inorder.length == preorder.length<br>
 * -3000 <= preorder[i], inorder[i] <= 3000<br>
 * preorder e inorder consistem de valores únicos.<br>
 * Cada valor de inorder também aparece em preorder.<br>
 * é garantido que preorder é o percurso de pré-ordem da árvore.<br>
 * é garantido que inorder é o percurso em ordem da árvore.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    TreeNode root = buildTreeHelper(preorder, inorder, 0, 0, preorder.length - 1);

    return root;
  }

  private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int p, int ini, int end) {
    if (end < ini) return null;

    int curr = search(inorder, ini, end, preorder[p]);

    return new TreeNode(
        preorder[p],
        buildTreeHelper(preorder, inorder, p + 1, ini, curr - 1),
        buildTreeHelper(preorder, inorder, p + (curr + 1 - ini), curr + 1, end)
    );
  }

  private int search(int[] array, int ini, int end, int value) {
    for (int i = ini; i <= end; i++) {
      if (array[i] == value) return i;
    }

    return -1;
  }

}
