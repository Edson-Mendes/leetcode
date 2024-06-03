package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado o root de uma binaru tree, retorne o preorder traversal dos valores dos nodes.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes da tree esta no intervalo de [0, 100].</li>
 *   <li>-100 <= Node.val <= 100</li>
 * </ul>
 * Follow up: a solução recursiva é trivial, você poderia fazer isso iterativamente?
 */
public class BinaryTreePreorderTraversal {

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
    preorderTraversalHelper(root, answer);

    return answer;
  }

  private void preorderTraversalHelper(TreeNode node, List<Integer> answer) {
    if (node == null) return;

    answer.add(node.val);
    preorderTraversalHelper(node.left, answer);
    preorderTraversalHelper(node.right, answer);
  }

}
