package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado uma string s, particione s de maneira que cada substring seja um palíndromo.<br>
 * <br>
 * Retorne os cortes mínimos necessários para um particionamento palíndromo de s.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>1 <= s.length <= 2000</li>
 *   <li>s consiste de letras minúsculas inglesas.</li>
 * </ul>
 */
public class PalindromePartitioningII {

  public int minCut(String s) {
    final int n = s.length();
    boolean[][] isPalindrome = new boolean[n][n];
    for (boolean[] row : isPalindrome)
      Arrays.fill(row, true);
    int[] dp = new int[n];
    Arrays.fill(dp, n);

    for (int l = 2; l <= n; l++)
      for (int i = 0, j = l - 1; j < n; i++, j++)
        isPalindrome[i][j] = s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1];

    for (int j = 0; j < n; j++) {
      if (isPalindrome[0][j]) {
        dp[j] = 0;
        continue;
      }

      for (int i = 0; i < j; i++)
        if (isPalindrome[i + 1][j])
          dp[j] = Math.min(dp[j], dp[i] + 1);
    }

    return dp[n - 1];
  }

}
