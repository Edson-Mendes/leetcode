package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dado um inteiro n, retorne o número de BSTs (binary search trees) estruturalmente únicas com exatos n nodes
 * com valores de 1 até n.<br>
 * <br>
 * Restrições:<br>
 * 1 <= n <= 19
 */
public class UniqueBinarySearchTrees {

  public int numTrees(int n) {
    if (n == 1 || n == 2) return n;

    return countTrees(1, n).size();
  }

  private List<TreeNode> countTrees(int min, int max) {
    if (min > max)
      return Arrays.asList((TreeNode) null);

    List<TreeNode> ans = new ArrayList<>();

    for (int i = min; i <= max; ++i)
      for (TreeNode left : countTrees(min, i - 1))
        for (TreeNode right : countTrees(i + 1, max)) {
          ans.add(new TreeNode(i));
          ans.get(ans.size() - 1).left = left;
          ans.get(ans.size() - 1).right = right;
        }

    return ans;
  }

}
