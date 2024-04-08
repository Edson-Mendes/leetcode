package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Um path em uma binary tree é uma sequência de nodes onde cada par de nós adjacentes na sequência possui
 * uma aresta conectando-os. Um node só pode aparecer na sequência no máximo uma vez.
 * Observe que o caminho não precisa passar pela raiz.<br>
 * <br>
 * O path sum é a soma dos valores dos nodes no caminho.<br>
 * <br>
 * Dada o root de uma binary tree, retorne a soma máxima do caminho de qualquer caminho não vazio.<br>
 * <br>
 * Restrições:<br>
 * o número de nodes da binary tree esta no intervalo [1, 3 * 10⁴].<br>
 * -1000 <= Node.val <= 1000
 */
public class BinaryTreeMaximumPathSum {

  private int answer;

  public int maxPathSum(TreeNode root) {
    answer = Integer.MIN_VALUE;

    maxPathSumSolver(root);
    return answer;
  }

  private int maxPathSumSolver(TreeNode node) {
    if (node == null) return 0;

    int leftPath = maxPathSumSolver(node.left);
    int rightPath = maxPathSumSolver(node.right);

    int childPathSum = Math.max(
        Math.max(node.val + leftPath, node.val),
        node.val + rightPath);

    answer = Math.max(answer, childPathSum);
    answer = Math.max(answer, node.val + leftPath + rightPath);

    return childPathSum;
  }

}
