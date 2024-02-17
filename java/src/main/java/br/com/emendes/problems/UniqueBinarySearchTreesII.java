package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dado um inteiro n, retorn2 todos os BSTs (binary search tree) estruturalmente únicos,
 * que tenha exatamente n nodes de valores únicos de 1 até n.
 * Retorne a resposta em qualquer ordem.<br>
 * <br>
 * Restrições:<br>
 * 1 <= n <= 8
 */
public class UniqueBinarySearchTreesII {

  public List<TreeNode> generateTrees(int n) {
    if (n == 0)
      return new ArrayList<>();
    return generateTrees(1, n);
  }

  private List<TreeNode> generateTrees(int min, int max) {
    if (min > max)
      return Arrays.asList((TreeNode) null);

    List<TreeNode> answer = new ArrayList<>();

    for (int i = min; i <= max; i++) {
      for (TreeNode left : generateTrees(min, i - 1))
        for (TreeNode right : generateTrees(i + 1, max)) {
          answer.add(new TreeNode(i));
          answer.get(answer.size() - 1).left = left;
          answer.get(answer.size() - 1).right = right;
        }
    }

    return answer;
  }

}
