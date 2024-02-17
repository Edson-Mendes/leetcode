package br.com.emendes.problems;

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
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;

    return countTrees(1, n, dp);
  }

  private int countTrees(int min, int max, int[] dp) {
    if (min > max) return 1;
    if (dp[max - min + 1] != 0)
      return dp[max - min + 1];

    for (int i = min; i <= max; ++i) {
      dp[max - min + 1] += countTrees(min, i - 1, dp) * countTrees(i + 1, max, dp);
    }

    return dp[max - min + 1];
  }

}
