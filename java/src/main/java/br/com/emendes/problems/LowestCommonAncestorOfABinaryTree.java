package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado uma Binary Tree, encontre o menor ancestra comum (LCA) de dado dois nodes da árvore.
 * <br><br>
 * De acordo com a definição de LCA na Wikipédia: “O menor ancestral comum é definido entre dois nós p e q como
 * o menor nó em T que tem p e q como descendentes (onde permitimos que um nó seja descendente de si mesmo).”
 * <br><br>
 * Restrições:<br>
 * -> O número de nodes da árvore está no range [2, 10⁵].<br>
 * -> -10⁹ <= Node.val <= 10⁹<br>
 * -> Todos os Node.val são únicos.<br>
 * -> p != q<br>
 * -> p e q existem na árvore.
 */
public class LowestCommonAncestorOfABinaryTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root.val == p.val || root.val == q.val)
      return root;
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if (left != null && right != null)
      return root;
    return left == null ? right : left;
  }

  public TreeNode firstSolution(TreeNode root, TreeNode p, TreeNode q) {
    Deque<TreeNode> pPath = new ArrayDeque<>();
    Deque<TreeNode> qPath = new ArrayDeque<>();
    getPath(root, p, pPath);
    getPath(root, q, qPath);
    TreeNode lca = null;
    while (!pPath.isEmpty() && !qPath.isEmpty() && pPath.peekLast().val == qPath.peekLast().val) {
      lca = pPath.removeLast();
      qPath.removeLast();
    }

    return lca;
  }

  private boolean getPath(TreeNode root, TreeNode node, Deque<TreeNode> path) {
    if (root == null) return false;
    if (root.val == node.val) {
      path.push(root);
      return true;
    }
    path.push(root);
    if (getPath(root.left, node, path) || getPath(root.right, node, path)) return true;
    path.pop();
    return false;
  }

}
