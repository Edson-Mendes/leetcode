package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado o root de uma binaru tree, retorne o postorder traversal dos valores dos nodes.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes da tree esta no intervalo de [0, 100].</li>
 *   <li>-100 <= Node.val <= 100</li>
 * </ul>
 * Follow up: a solução recursiva é trivial, você poderia fazer isso iterativamente?
 */
public class BinaryTreePostorderTraversal {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    postorderTraversalHelper(root, answer);

    return answer;
  }

  private void postorderTraversalHelper(TreeNode node, List<Integer> answer) {
    if (node == null) return;

    postorderTraversalHelper(node.left, answer);
    postorderTraversalHelper(node.right, answer);
    answer.add(node.val);
  }

}
