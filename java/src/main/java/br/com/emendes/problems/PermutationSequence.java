package br.com.emendes.problems;

/**
 * O conjunto [1, 2, 3, ..., n] contém um total de n! permutações únicas.<br>
 * Listando e rotulando todas as permutações em ordem, teremos a sequencia abaixo:<br>
 * "123"<br>
 * "132"<br>
 * "213"<br>
 * "231"<br>
 * "312"<br>
 * "321"<br><br>
 *
 * Dado dois inteiros n e k, retorne a késima sequencia de permutação.<br><br>
 *
 * Restrições:<br>
 * 1 <= n <= 9<br>
 * 1 <= k <= n!
 */
public class PermutationSequence {

  private static final int[] FACTORIAL = {0, 1, 2, 6, 24, 120, 720, 5_040, 40_320, 362_880};

  public String getPermutation(int n, int k) {
    if (n == 1) return "1";

    int length = n;
    StringBuilder answer = new StringBuilder();
    boolean[] buffer = new boolean[n+1];

    while (length > 1) {
      int iTh = k / FACTORIAL[length-1];
      int remainder = k % FACTORIAL[length - 1];

      if (remainder > 0) {
        iTh += 1;
        k = remainder;
      } else {
        k = FACTORIAL[length - 1];
      }

      int value = getIThNonUsed(iTh, buffer);
      answer.append(value);
      buffer[value] = true;
      length--;
    }

    int value = getIThNonUsed(1, buffer);
    answer.append(value);

    return answer.toString();
  }

  private int getIThNonUsed(int iTh, boolean[] buffer) {
    int counter = 0;
    int i = 1;
    while (counter < iTh) {
      if (!buffer[i]) counter++;
      i++;
    }

    return i - 1;
  }

}
