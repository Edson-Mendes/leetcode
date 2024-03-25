package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado o root de uma binary tree e um inteiro targetSum, retorne todos os valores dos caminhos root-to-leaf em que
 * a soma dos nodes é igual a targetSum. Cada caminho deve ser retornado como uma lista dos valores dos nodes do caminho,
 * não a referencia do node.<br>
 * <br>
 * Um caminho root-to-leaf é o caminho da root até o fim de qualquer leaf node. Uma leaf é um node sem filhos.<br>
 * <br>
 * Restrições:<br>
 * O número de nodes esta no intervalo [0, 5000].<br>
 * -1000 <= Node.val <= 1000<br>
 * -1000 <= targetSum <= 1000
 */
public class PathSumII {

  private List<List<Integer>> answer;

  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    answer = new ArrayList<>();
    if (root == null) return answer;

    findAllPathSum(root, targetSum, new ArrayList<>());

    return answer;
  }

  private void findAllPathSum(TreeNode node, int currSum, List<Integer> currList) {
    if (node == null) {
      if (currSum == 0) {
        answer.add(new ArrayList<>(currList));
      }
      return;
    }

    currSum -= node.val;
    currList.add(node.val);

    if (node.left != null && node.right != null) {
      findAllPathSum(node.left, currSum, currList);
      findAllPathSum(node.right, currSum, currList);
    } else if (node.left == null) {
      findAllPathSum(node.right, currSum, currList);
    } else {
      findAllPathSum(node.left, currSum, currList);
    }

    currList.remove(currList.size() - 1);
  }

}
