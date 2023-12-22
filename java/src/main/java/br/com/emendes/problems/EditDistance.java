package br.com.emendes.problems;

/**
 * Dado duas strings word1 e word2, retorne o número mínimo de operações necessárias
 * para converter word1 em word2.<br><br>
 * <p>
 * Você tem as seguintes operações permitidas sobre a string:<br>
 * - inserir um caracter.<br>
 * - deletar um caracter.<br>
 * - substituir um caracter.<br><br>
 * <p>
 * Restrições:<br>
 * 0 <= word1.length, word2.length <= 500<br>
 * word1 e word2 consistem de letras inglesas minúsculas.
 */
public class EditDistance {

  public int firstSolution(String word1, String word2) {
    final int i1 = word1.length();
    final int i2 = word2.length();

    int[][] dp = new int[i1 + 1][i2 + 1];

    for (int i = 1; i <= i1; ++i)
      dp[i][0] = i;

    for (int j = 1; j <= i2; ++j)
      dp[0][j] = j;

    for (int i = 1; i <= i1; ++i)
      for (int j = 1; j <= i2; ++j)
        if (word1.charAt(i - 1) == word2.charAt(j - 1))
          dp[i][j] = dp[i - 1][j - 1];
        else
          dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;

    return dp[i1][i2];
  }

  public int minDistance(String word1, String word2) {
    int i = word1.length();
    int j = word2.length();
    int[][] dp = new int[i][j];

    for (int k = 0; k < i; k++) {
      for (int v = 0; v < j; v++) {
        dp[k][v] = -1;
      }
    }

    return minDistance(i - 1, j - 1, word1, word2, dp);
  }

  private int minDistance(int i, int j, String word1, String word2, int[][] dp) {
    if (i < 0) return j + 1;
    if (j < 0) return i + 1;

    if (dp[i][j] != -1) {
      return dp[i][j];
    }
    if (word1.charAt(i) == word2.charAt(j)) {
      dp[i][j] = minDistance(i - 1, j - 1, word1, word2, dp);
      return dp[i][j];
    }

    dp[i][j] = 1 + Math.min(Math.min(minDistance(i - 1, j, word1, word2, dp), minDistance(i, j - 1, word1, word2, dp)), minDistance(i - 1, j - 1, word1, word2, dp));
    return dp[i][j];
  }

}
