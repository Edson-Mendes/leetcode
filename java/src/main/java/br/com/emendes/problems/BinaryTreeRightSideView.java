package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado o root de uma binary tree, imagine você do lado direito dela,
 * retorne os valores dos nós que você pode ver ordenados de cima para baixo.<br>
 * <br>
 * Restrições:<br>
 * -> O número de nodes da binary tree está no intervalo [0, 100].<br>
 * -> -100 <= Node.val <= 100
 */
public class BinaryTreeRightSideView {

  public List<Integer> rightSideView(TreeNode root) {
    List<List<Integer>> levelList = new ArrayList<>();
    fillLevelList(0, root, levelList);

    return levelList.stream().map(ll -> ll.get(ll.size() - 1)).toList();
  }

  private void fillLevelList(int level, TreeNode node, List<List<Integer>> levelList) {
    if (node == null) return;
    List<Integer> nodesLevel;
    if (levelList.size() > level) {
      nodesLevel = levelList.get(level);
    } else {
      nodesLevel = new ArrayList<>();
      levelList.add(nodesLevel);
    }
    nodesLevel.add(node.val);
    fillLevelList(level + 1, node.left, levelList);
    fillLevelList(level + 1, node.right, levelList);
  }

}
