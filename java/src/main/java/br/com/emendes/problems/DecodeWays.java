package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Uma mensagem contendo letras de A-Z pode ser codificada em números usando o mepeamento a seguir:<br>
 * <br>
 * 'A' -> "1"<br>
 * 'B' -> "2"<br>
 * ...<br>
 * 'Z' -> "26"<br>
 * <br>
 * Para decodificar uma mensagem codificada, todos os digitos devem ser agrupados e então mapeados para as letras
 * usando o reverso do mapeamento mostrado acima (pode ter multiplas maneiras). Por exemplo, "11106 pode ser mapeado para:<br>
 * <br>
 * "AAJF" com o agrupamento (1 1 10 6)<br>
 * "KJF" com o agrupamento (11 10 6)<br>
 * <br>
 * Note que o agrupamento (1 11 06) é inválido por que "06" não pode ser mapeado para 'F' desde que "6" é diferente de "06".<br>
 * <br>
 * Dado uma String s contendo apenas digitos, retorne o número de maneiras que pode ser decodificado.<br>
 * <br>
 * Os casos de teste são gerados para que a resposta caiba em um número inteiro de 32 bits.<br>
 * <br>
 * Restrições:<br>
 * 1 <= s.length <= 100<br>
 * s contém apenas digitos e pode conter zero(s) à esquerda.
 */
public class DecodeWays {

  public int numDecodings(String s) {
    if (s.charAt(0) == '0') return 0;
    char[] digits = s.toCharArray();

    int[] dp = new int[digits.length];
    Arrays.fill(dp, -1);

    return numDecodings(digits, 0, dp);
  }

  private int numDecodings(char[] digits, int index, int[] dp) {
    if (index == digits.length) return 1;
    if (dp[index] != -1) return dp[index];
    if (digits[index] == '0') {
      dp[index] = 0;
      return 0;
    }
    if (isTwoDigits(digits, index)) {
      dp[index] = numDecodings(digits, index + 1, dp) + numDecodings(digits, index + 2, dp);
    } else {
      dp[index] = numDecodings(digits, index + 1, dp);
    }
    return dp[index];
  }

  private boolean isTwoDigits(char[] digits, int index) {
    int next = index + 1;
    if (next >= digits.length) return false;
    if (digits[index] == '1' && (digits[next] >= 48 && digits[next] <= 57)) return true;
    return digits[index] == '2' && (digits[next] >= 48 && digits[next] <= 54);
  }

}
