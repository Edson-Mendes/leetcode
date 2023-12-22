package br.com.emendes.problems;

import java.util.Arrays;

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

  public int minDistance(String word1, String word2) {
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

}
