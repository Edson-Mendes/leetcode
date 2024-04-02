package br.com.emendes.problems;

import br.com.emendes.problems.util.Node;

/**
 * Dado uma binary tree formada por {@link Node}.<br>
 * <br>
 * Preencha cada ponteiro next para apontar para seu próximo node direito. Se não existir próximo node,
 * o ponteiro next deve ser settado NULL.<br>
 * <br>
 * Inicialmente, todos os ponteiros next estão NULL.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da binary tree esta no intervalo [0, 6000].<br>
 * -100 <= Node.val <= 100
 */
public class PopulatingNextRightPointersInEachNodeII {

  private Node[] levels;

  public Node connect(Node root) {
    if (root != null) {
      levels = new Node[6000];
      connect(root, 0);
    }

    return root;
  }

  private void connect(Node node, int level) {
    if (node == null) return;
    if (levels[level] != null) {
      levels[level].next = node;
    }
    levels[level++] = node;

    connect(node.left, level);
    connect(node.right, level);
  }

}
