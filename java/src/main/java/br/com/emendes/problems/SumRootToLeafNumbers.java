package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Você recebe o root de uma binary tree contendo digitos de 0 até 9 apenas.<br>
 * <br>
 * Cada caminho root-to-leaf da árvore representa um número.
 * <ul>
 *   <li>
 *     Por exemplo, o caminho root-to-leaf 1 -> 2 -> 3 representa o número 123.
 *   </li>
 * </ul>
 * Retorne a soma total de todos os números root-to-leaf. Os casos de testes são gerados de modo que
 * a resposta caberá em um inteiro de 32-bits.<br>
 * <br>
 * Um node leaf é um node que não tem filhos.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>O número de nodes na binary tree esta no intervalo [1, 1000].</li>
 *   <li>0 <= Node.val <= 9</li>
 *   <li>A profuntidade da tree não vai exceder 10.</li>
 * </ul>
 */
public class SumRootToLeafNumbers {

  private int sum;

  public int sumNumbers(TreeNode root) {
    sum = 0;
    sumNumbers(root, 0);
    return sum;
  }

  private void sumNumbers(TreeNode node, int previousValue) {
    int newValue = (previousValue * 10) + node.val;
    if (isLeaf(node)) {
      sum += newValue;
      return;
    }
    if (node.left != null) {
      sumNumbers(node.left, newValue);
    }
    if (node.right != null) {
      sumNumbers(node.right, newValue);
    }
  }

  private boolean isLeaf(TreeNode node) {
    return node.left == null && node.right == null;
  }

}
