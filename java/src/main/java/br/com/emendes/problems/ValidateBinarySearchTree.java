package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Dado o root de uma binary tree, determine se é uma binary search tree (BST) válida.<br>
 * <br>
 * Uma válida BST é definida como:<br>
 * <ul>
 *   <li>A subtree a esquerda do node contém apenas nodes com chaves menores que a chave do node.</li>
 *   <li>A subtree a direta do node contém apenas node com chaves maiores que a chave do node.</li>
 *   <li>Ambas subtrees direta e esquerda devem ser binary search trees.</li>
 * </ul>
 * Restrições:<br>
 * O número de nodes na árvore está no intervalo [1, 10⁴].<br>
 * -2³¹ <= Node.val <= 2³¹ - 1
 */
public class ValidateBinarySearchTree {

  public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
  }

  private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
    if (root == null) return true;
    if (minNode != null && root.val <= minNode.val) return false;
    if (maxNode != null && root.val >= maxNode.val) return false;

    return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
  }

  public boolean firstSolutionHelper(TreeNode root) {
    Set<Integer> values = new HashSet<>();

    return firstSolutionHelper(root, root, values);
  }

  public boolean firstSolutionHelper(TreeNode node, TreeNode root, Set<Integer> values) {
    if (node == null) return true;
    if (values.contains(node.val) || !treeNodeContains(node.val, root)) return false;

    values.add(node.val);
    return firstSolutionHelper(node.left, root, values) && firstSolutionHelper(node.right, root, values);
  }

  private boolean treeNodeContains(int value, TreeNode node) {
    if (node == null) return false;
    if (value == node.val) return true;
    if (value < node.val) return treeNodeContains(value, node.left);
    return treeNodeContains(value, node.right);
  }

}
