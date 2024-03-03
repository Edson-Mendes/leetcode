package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado o root de uma bynary tree, verifique se é espelhado (simétrico em volta do centro).<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore está no intervalo [1, 1000].<br>
 * -100 <= Node.val <= 100<br>
 * <br>
 * Follow up: Poderia resolver em ambas maneiras recursiva e iterativa.
 */
public class SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) return true;
    if (node1 == null || node2 == null) return false;

    return node1.val == node2.val &&
        isSymmetric(node1.left, node2.right) &&
        isSymmetric(node1.right, node2.left);
  }

}
