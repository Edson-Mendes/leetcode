package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Dado o root de uma árvore binária, retornar a passagem em ordem dos valores de seus nós.<br>
 * <br>
 * Restrições:<br>
 * O número de node da árvore está no range de [0, 100]<br>
 * -100 <= Node.val <= 100<br>
 * <br>
 * Follow up: A solução recursiva é trivial, você poderia fazer isso iterativamente?
 */
public class BinaryTreeInorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    Deque<TreeNode> stack = new LinkedList<>();
    List<Integer> answer = new ArrayList<>();
    TreeNode node = root;

    while (node != null || !stack.isEmpty()) {
      if (node == null) {
        node = stack.pop();
        answer.add(node.val);
        node = node.right;
      } else {
        stack.push(node);
        node = node.left;
      }
    }

    return answer;
  }

  public List<Integer> firstSolution(TreeNode root) {
    ArrayList<Integer> answer = new ArrayList<>();
    inorderTraversal(root, answer);

    return answer;
  }

  private void inorderTraversal(TreeNode node, List<Integer> answer) {
    if (node != null) {
      inorderTraversal(node.left, answer);
      answer.add(node.val);
      inorderTraversal(node.right, answer);
    }
  }

}
