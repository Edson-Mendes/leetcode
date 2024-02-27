package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado a raiz de duas Binary Search Trees p e q, escreva uma função que verifique se são iguais ou não.<br>
 * <br>
 * Duas Binary Search Trees são consideradas iguais se são estruturalmente identicas, e os nodes possuem o mesmo valor.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes de ambas as árvores estão no intervalo [0, 100].<br>
 * -10⁴ <= Node.val <= 10⁴
 */
public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    if (p == null || q == null || p.val != q.val) return false;

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }

}
