package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Dado o root de uma binary tree, retorne the zigzag level order traversal of its nodes' values.
 * Ou seja, da esquerda para a direita, depois da direita para a esquerda para o próximo nível e alterne entre níveis.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore esta no intervalo [0, 2000].<br>
 * -100 <= Node.val <= 100
 */
public class BinaryTreeZigzagLevelOrderTraversal {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> answer = new ArrayList<>();
    zigzagLevelOrder(root, 0, true, answer);

    return answer;
  }

  private void zigzagLevelOrder(TreeNode node, int level, boolean isLeft, List<List<Integer>> answer) {
    if (node == null) return;

    List<Integer> listLevel;
    if (level < answer.size()) {
      listLevel = answer.get(level);
    } else {
      listLevel = new LinkedList<>();
      answer.add(listLevel);
    }

    if (isLeft) {
      listLevel.add(node.val);
    } else {
      listLevel.add(0, node.val);
    }

    zigzagLevelOrder(node.left, level + 1, !isLeft, answer);
    zigzagLevelOrder(node.right, level + 1, !isLeft, answer);
  }

}
