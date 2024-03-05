package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

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

  /**
   * Solução iterativa.
   */
  public boolean isSymmetric(TreeNode root) {
    if (root.left == null || root.right == null) return root.left == root.right;

    Deque<TreeNode> stack1 = new LinkedList<>();
    Deque<TreeNode> stack2 = new LinkedList<>();

    stack1.push(root.left);
    stack2.push(root.right);

    while (!stack1.isEmpty() && !stack2.isEmpty()) {
      TreeNode node1 = stack1.pop();
      TreeNode node2 = stack2.pop();

      if (!isEquals(node1, node2)) return false;

      if (node1 != null) {
        stack1.push(node1.left);
        stack1.push(node1.right);
      }
      if (node2 != null) {
        stack2.push(node2.right);
        stack2.push(node2.left);
      }
    }

    return stack1.isEmpty() && stack2.isEmpty();
  }

  /**
   * Usado no método {@link SymmetricTree#isSymmetric(TreeNode)}.
   */
  private boolean isEquals(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) return true;
    if (node1 == null || node2 == null) return false;
    return node1.val == node2.val;
  }

  /**
   * Solução recursiva.
   */
  public boolean recursivelySolution(TreeNode root) {
    return isSymmetric(root.left, root.right);
  }

  /**
   * Usado no método {@link SymmetricTree#recursivelySolution(TreeNode)}.
   */
  private boolean isSymmetric(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) return true;
    if (node1 == null || node2 == null) return false;

    return node1.val == node2.val &&
        isSymmetric(node1.left, node2.right) &&
        isSymmetric(node1.right, node2.left);
  }

}
