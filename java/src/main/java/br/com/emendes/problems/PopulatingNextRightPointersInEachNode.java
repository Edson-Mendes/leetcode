package br.com.emendes.problems;

import br.com.emendes.problems.util.Node;

/**
 * Você recebe uma binary tree perfeita onde todos as leaves estão no mesmo level, e cada pai tem dois filhos.
 * A binary tree tem a seguinte definição {@link Node}.<br>
 * <br>
 * Preencha cada next ponteiro para apontar para seu próximo node direito. Se não existir próximo node direito,
 * o ponteiro next deve receber NULL.<br>
 * <br>
 * Inicialmente, todos os ponteiros next estão NULL.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes da binary tree esta no intervalo [0, 2¹² - 1].<br>
 * -1000 <= Node.val <= 1000
 */
public class PopulatingNextRightPointersInEachNode {

  private Node[] buffer;

  public Node connect(Node root) {
    buffer = new Node[12];
    connect(root, 0);

    return root;
  }

  private void connect(Node node, int level) {
    if (node == null) return;
    if (buffer[level] != null) {
      buffer[level].next = node;
    }
    buffer[level++] = node;
    connect(node.left, level);
    connect(node.right, level);
  }

}
