package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado o root de uma binary tree completa, retorne o número de nodes na tree.<br>
 * <br>
 * De acordo com o Wikipedia, cada level, exceto possivelmente o último, é completamente preenchido em uma
 * árvore binária completa, e todos os nós no último nível estão o mais à esquerda possível.
 * Pode ter entre 1 e 2^h nodes, inclusive no último nível h.<br>
 * <br>
 * Projete um algoritmo que seja executado em complexidade de tempo menor que O(n).<br>
 * <br>
 * Restrições:<br>
 * O número de nodes na árvore está no intervalo [0, 5 * 10⁴].<br>
 * 0 <= Node.val <= 5 * 10⁴<br>
 * É garantido que a árvore está completa.
 */
public class CountCompleteTreeNodes {

  public int countNodes(TreeNode root) {
    if (root == null)
      return 0;

    TreeNode left = root;
    TreeNode right = root;
    int heightL = 0;
    int heightR = 0;

    while (left != null) {
      heightL++;
      left = left.left;
    }

    while (right != null) {
      heightR++;
      right = right.right;
    }

    if (heightL == heightR)
      return (int) Math.pow(2, heightL) - 1;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }

  public int firstSolution(TreeNode root) {
    if (root == null) return 0;

    return 1 + countNodes(root.left) + countNodes(root.right);
  }

}
