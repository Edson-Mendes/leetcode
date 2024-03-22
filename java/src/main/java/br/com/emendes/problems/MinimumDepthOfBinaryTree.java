package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado uma binary tree, encontre a menor profundidade.<br>
 * <br>
 * A menor profundidade é o número de nodes ao longo do menor caminho da root até a leaf mais próximo.<br>
 * <br>
 * Nota: leaf é o node sem filhos.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore esta no intervalo [0, 10⁵].<br>
 * -1000 <= Node.val <= 1000
 */
public class MinimumDepthOfBinaryTree {

  private int minDepth;

  public int minDepth(TreeNode root) {
    minDepth = Integer.MAX_VALUE;

    minDepth(root, 0);
    return minDepth;
  }

  private int minDepth(TreeNode node, int depth) {
    if (node == null) {
      if (depth < minDepth) minDepth = depth;
      return minDepth;
    }
    depth++;

    if (minDepth < depth) return minDepth;

    if (node.left != null && node.right != null)
      return Math.min(minDepth(node.left, depth), minDepth(node.right, depth));

    if (node.left == null) return minDepth(node.right, depth);
    else return minDepth(node.left, depth);
  }

}
