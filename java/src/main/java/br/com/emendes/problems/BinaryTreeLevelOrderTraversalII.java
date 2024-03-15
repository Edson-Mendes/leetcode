package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Dado o root de uma binary tree, retorne a travessia de ordem de nível ascendente dos valores de seus nós.
 * (da esquerda para a direita, nível por nível, da folha à raiz).<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da árvore esta no intervalo [0, 2000].<br>
 * -1000 <= Node.val <= 1000
 */
public class BinaryTreeLevelOrderTraversalII {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> answer = new LinkedList<>();

    levelOrderBottomHelper(root, 0, answer);

    Collections.reverse(answer);
    return answer;
  }

  private void levelOrderBottomHelper(TreeNode node, int level, List<List<Integer>> answer) {
    if (node == null) return;

    List<Integer> levelList;
    if (level >= answer.size()) {
      levelList = new ArrayList<>();
      answer.add(levelList);
    } else {
      levelList = answer.get(level);
    }

    level++;
    levelList.add(node.val);
    levelOrderBottomHelper(node.left, level, answer);
    levelOrderBottomHelper(node.right, level, answer);
  }

}
