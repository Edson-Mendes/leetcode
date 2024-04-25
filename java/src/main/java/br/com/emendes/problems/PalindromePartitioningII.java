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
    int[] cutDp = new int[s.length()];
    boolean[][] dp = new boolean[s.length()][s.length()];
    for (int i = 0; i < s.length(); i++) {
      int minimumCuts = i;
      for (int j = 0; j <= i; j++) {
        if (s.charAt(i) == s.charAt(j) && (i < (j + 2) || dp[j + 1][i - 1])) {
          dp[j][i] = true;
          if (j == 0) {
            minimumCuts = 0;
          } else {
            minimumCuts = Math.min(minimumCuts, cutDp[j - 1] + 1);
          }

        }
      }
      cutDp[i] = minimumCuts;
    }
    return cutDp[s.length() - 1];
  }

  public int firstSolution(String s) {
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
