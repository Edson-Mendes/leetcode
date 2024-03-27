package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Dado o root de uma binary tree, converta a árvore em uma linked list:
 * <ul>
 *   <li>A linked list deve usar a mesma classe TreeNode onde o ponteiro da direita deve apontar para o pŕoximo
 *   node da lista, e os ponteiros esquerdos devem ser sempre null.</li>
 *   <li>A linked list deve estar na mesma ordem que pre-order traversal da binary tree.</li>
 * </ul>
 * Restrições:<br>
 * O número de nodes da binary tree esta no intervalo [0, 2000].<br>
 * -100 <= Node.val <= 100
 */
public class FlattenBinaryTreeToLinkedList {

  public void flatten(TreeNode root) {
    List<TreeNode> list = new LinkedList<>();
    fillList(root, list);

    int lastIndex = list.size() - 2;
    int i = 0;
    while (i <= lastIndex) {
      TreeNode node = list.get(i);
      node.left = null;
      node.right = list.get(++i);
    }
  }

  private void fillList(TreeNode node, List<TreeNode> nodeList) {
    if (node == null) return;

    nodeList.add(node);
    fillList(node.left, nodeList);
    fillList(node.right, nodeList);
  }

}
