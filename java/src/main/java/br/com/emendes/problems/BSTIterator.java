package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Implemente a classe BSTIterator que representa um iterador sobre uma binary search tree (bst) inorder traversal:<br>
 * <br>
 * <ul>
 *   <li>BSTIterator(TreeNode root) inicializa o objeto da classe BSTItenator.
 *   O root do BST é fornecida como parte do construtor.
 *   O ponteiro deve ser inicializado com um número inexistente menor que qualquer elemento do BST.</li>
 *   <li>boolean hasNext() Retorna true se existir um número no percurso à direita do ponteiro,
 *   caso contrário retorna false.</li>
 *   <li>int next() Move o ponteiro para a direita e retorna o número no ponteiro.</li>
 * </ul>
 * Observe que ao inicializar o ponteiro para um menor número inexistente,
 * a primeira chamada para next() retornará o menor elemento no BST.<br>
 * <br>
 * Você pode assumir que as chamadas next() sempre serão válidas.
 * Ou seja, haverá pelo menos um próximo número na passagem em ordem quando next() for chamado.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>O número de nodes na tree está no intervalo [1, 10⁵].</li>
 *   <li>0 <= Node.val <= 10⁶</li>
 *   <li>Serão feitas no máximo 10⁵ chamadas para hasNext(), e next().</li>
 * </ul>
 * <br>
 * Follow Up: Você poderia implementar next() e hasNext() para rodar em tempo médio O(1) e usar memória O(h),
 * onde h é a altura da árvore?
 */
public class BSTIterator {

  private final Deque<TreeNode> stack;

  public BSTIterator(TreeNode root) {
    stack = new LinkedList<>();
    toLeft(root);
  }

  public int next() {
    TreeNode node = stack.pop();
    if (node.right != null) {
      toLeft(node.right);
    }
    return node.val;
  }

  public boolean hasNext() {
    return !stack.isEmpty();
  }

  private void toLeft(TreeNode node) {
    while (node != null) {
      stack.push(node);
      node = node.left;
    }
  }

}
