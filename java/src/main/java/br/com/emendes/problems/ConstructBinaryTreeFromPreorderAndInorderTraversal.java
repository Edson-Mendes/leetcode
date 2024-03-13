package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

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
    Map<Integer, Integer> searchMap = new HashMap<>();

    for (int i = 0; i < inorder.length; i++) {
      searchMap.put(inorder[i], i);
    }

    return buildTreeHelper(preorder, 0, 0, preorder.length - 1, searchMap);
  }

  private TreeNode buildTreeHelper(int[] preorder, int p, int ini, int end, Map<Integer, Integer> searchMap) {
    if (end < ini) return null;

    int curr = searchMap.get(preorder[p]);

    return new TreeNode(
        preorder[p],
        buildTreeHelper(preorder, p + 1, ini, curr - 1, searchMap),
        buildTreeHelper(preorder, p + (curr + 1 - ini), curr + 1, end, searchMap)
    );
  }

}
