package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado as strings s1, s2 e s3, encontre se s3 é formado por intercalação de s1 e s2.<br>
 * <br>
 * A intercalação de duas strings s e t é uma configuração onde s e t são divididos em n e m substrings respectivamente,
 * de maneira que:<br>
 * <ul>
 *   <li>s = s1 + s2 + s3 + ... + sn</li>
 *   <li>s = t1 + t2 + t3 + ... + tm</li>
 *   <li>|n - m| <= 1</li>
 *   <li>A intercalação é s1 + t1 + s2 + t2 + s3 + t3 + ... ou t1 + s1 + t2 + s2 + t3 + s3 + ...</li>
 * </ul>
 * <br>
 * Restrições:<br>
 * 0 <= s1.length, s2.length <= 100<br>
 * 0 <= s3.length <= 200<br>
 * s1, s2 e s3 são formadas por letras minúsculas inglesas.
 */
public class InterleavingString {

  public boolean isInterleave(String s1, String s2, String s3) {
    final int m = s1.length();
    final int n = s2.length();
    if (m + n != s3.length())
      return false;

    boolean[][] dp = new boolean[m + 1][n + 1];
    dp[0][0] = true;

    for (int i = 1; i <= m; i++)
      dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);

    for (int j = 1; j <= n; j++)
      dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);

    for (int i = 1; i <= m; i++)
      for (int j = 1; j <= n; j++)
        dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1) ||
            dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);

    return dp[m][n];
  }

  public boolean firstSolution(String s1, String s2, String s3) {
    if (s3.length() != s1.length() + s2.length()) return false;

    int[][][] dp = new int[s1.length() + 1][s2.length() + 1][s3.length()];

    for (int[][] dp2 : dp) {
      for (int[] dp3 : dp2) {
        Arrays.fill(dp3, -1);
      }
    }

    return firstSolutionHelper(s1, s2, s3, 0, 0, 0, dp);
  }

  private boolean firstSolutionHelper(String s1, String s2, String s3, int s1Index, int s2Index, int s3Index, int[][][] dp) {
    if (s3Index == s3.length()) return true;
    if (dp[s1Index][s2Index][s3Index] != -1) return dp[s1Index][s2Index][s3Index] == 1;

    boolean answer = false;
    if (s1Index < s1.length() && s1.charAt(s1Index) == s3.charAt(s3Index)) {
      answer = firstSolutionHelper(s1, s2, s3, s1Index + 1, s2Index, s3Index + 1, dp);
    }
    if (!answer && s2Index < s2.length() && s2.charAt(s2Index) == s3.charAt(s3Index)) {
      answer = firstSolutionHelper(s1, s2, s3, s1Index, s2Index + 1, s3Index + 1, dp);
    }
    dp[s1Index][s2Index][s3Index] = answer ? 1 : 0;
    return answer;
  }

}
