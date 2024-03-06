package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado o root de uma binary tree, eturn the level order traversal of its nodes' values.
 * da esquerda para a direita.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore esta no intervalo [0, 2000].<br>
 * -1000 <= Node.val <= 1000
 */
public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> answer = new ArrayList<>();

    levelOrder(root, 0, answer);

    return answer;
  }

  private void levelOrder(TreeNode node, int level, List<List<Integer>> answer) {
    if (node == null) return;

    List<Integer> levelList;
    if (level < answer.size()) {
      levelList = answer.get(level);
    } else {
      levelList = new ArrayList<>();
      answer.add(levelList);
    }

    levelList.add(node.val);
    levelOrder(node.left, level + 1, answer);
    levelOrder(node.right, level + 1, answer);
  }

}
