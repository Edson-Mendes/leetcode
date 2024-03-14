package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado dois arrays de inteiros inorder e postorder, onde inorder é o percurso em ordem da mesma tree
 * e postorder é a travessia de pós-ordem de uma binary tree, construa e retorne a binary tree.<br>
 * <br>
 * Restrições:<br>
 * 1 <= inorder.length <= 3000<br>
 * postorder.length == inorder.length<br>
 * -3000 <= postorder[i], inorder[i] <= 3000<br>
 * postorder e inorder consistem de valores únicos.<br>
 * Cada valor de inorder também aparece em preorder.<br>
 * é garantido que postorder é o percurso de pós-ordem da árvore.<br>
 * é garantido que inorder é o percurso em ordem da árvore.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    Map<Integer, Integer> searchMap = new HashMap<>();

    for (int i = 0; i < inorder.length; i++) {
      searchMap.put(inorder[i], i);
    }

    return buildTreeHelper(postorder, postorder.length - 1, 0, postorder.length - 1, searchMap);
  }

  private TreeNode buildTreeHelper(int[] postorder, int p, int ini, int end, Map<Integer, Integer> searchMap) {
    if (end < ini) return null;

    int curr = searchMap.get(postorder[p]);

    return new TreeNode(
        postorder[p],
        buildTreeHelper(postorder, p - (end - curr + 1), ini, curr - 1, searchMap),
        buildTreeHelper(postorder, p - 1, curr + 1, end, searchMap)
    );
  }

}
