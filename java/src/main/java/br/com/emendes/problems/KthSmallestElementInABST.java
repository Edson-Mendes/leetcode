package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado o root de uma binary search tree, e um inteiro k, retorne o kth menor valor (1-indexed)
 * de todos os valores dos nodes da tree.
 * <br><br>
 * Restrições:<br>
 * O número de nodes da tree é n.<br>
 * 1 <= k <= n <= 10⁴<br>
 * 0 <= Node.val <= 10⁴<br>
 * <br>
 * Follow-up: Se o BST for modificado com frequência (ou seja, podemos fazer operações de inserção e exclusão) e
 * você precisar encontrar o k-ésimo com menor frequência, como você otimizaria?
 */
public class KthSmallestElementInABST {

  public int kthSmallest(TreeNode root, int k) {
    return kthSmallestHelper(root, new Counter(k));
  }

  private int kthSmallestHelper(TreeNode node, Counter counter) {
    if (node == null) return -1;
    int result = kthSmallestHelper(node.left, counter);
    if (result >= 0) return result;
    if (counter.value == 1) return node.val;
    counter.value--;
    result = kthSmallestHelper(node.right, counter);
    if (result >= 0) return result;
    return -1;
  }

  private static class Counter {

    public int value;

    public Counter(int value) {
      this.value = value;
    }

  }

}
