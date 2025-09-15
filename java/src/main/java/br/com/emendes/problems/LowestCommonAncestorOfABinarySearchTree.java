package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 * Dado uma binary tree (BST), encontre o menor node ancestral comum (LCA) de
 * dois nodes da BST.<br>
 * <br>
 * De acordo com a definição de LCA do wikipedia.<br>
 * "O menor ancestral comum é definido entre dois nós p e q como o menor nó em
 * T que tem p e q como descendentes (onde permitimos que um nó seja descendente de si mesmo)."<br>
 * <br>
 * Restrições:<br>
 * O número de nodes na tree está no intervalo [2, 10⁵].<br>
 * -10⁹ <= Node.val <= 10⁹<br>
 * Todos Node.val são únicos.<br>
 * p != q<br>
 * p e q existem na BST.
 */
public class LowestCommonAncestorOfABinarySearchTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while ((root.val > p.val && root.val > q.val) || (root.val < p.val && root.val < q.val)) {
      root = p.val < root.val ? root.left : root.right;
    }

    return root;
  }

  public TreeNode firstSolution(TreeNode root, TreeNode p, TreeNode q) {
    Deque<TreeNode> pDeque = savePathAsStack(root, p);
    Set<TreeNode> qSet = savePathAsSet(root, q);

    TreeNode answer = new TreeNode(2_000_000_000);
    while (!pDeque.isEmpty()) {
      TreeNode node = pDeque.pop();
      if (qSet.contains(node))
        return node;
    }

    return answer;
  }

  private Set<TreeNode> savePathAsSet(TreeNode root, TreeNode node) {
    Set<TreeNode> set = new HashSet<>();
    while (root.val != node.val) {
      set.add(root);
      if (node.val > root.val)
        root = root.right;
      else
        root = root.left;
    }
    set.add(root);
    return set;
  }

  private Deque<TreeNode> savePathAsStack(TreeNode root, TreeNode node) {
    Deque<TreeNode> deque = new ArrayDeque<>();
    while (root.val != node.val) {
      deque.push(root);
      if (node.val > root.val)
        root = root.right;
      else
        root = root.left;
    }
    deque.push(root);
    return deque;
  }

}
