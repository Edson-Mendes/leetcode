package br.com.emendes.problems;

import java.util.LinkedList;
import java.util.List;

/**
 * O conjunto [1, 2, 3, ..., n] contém um total de n! permutações únicas.<br>
 * Listando e rotulando todas as permutações em ordem, teremos a sequencia abaixo:<br>
 * "123"<br>
 * "132"<br>
 * "213"<br>
 * "231"<br>
 * "312"<br>
 * "321"<br><br>
 * <p>
 * Dado dois inteiros n e k, retorne a késima sequencia de permutação.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= n <= 9<br>
 * 1 <= k <= n!
 */
public class PermutationSequence {

  private static final int[] FACTORIAL = {1, 1, 2, 6, 24, 120, 720, 5_040, 40_320, 362_880};

  public String getPermutation(int n, int k) {
    if (n == 1) return "1";

    List<Integer> values = new LinkedList<>();
    StringBuilder answer = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      values.add(i);
    }

    k--;

    for (int i = n - 1; i >= 0; i--) {
      int index = k / FACTORIAL[i];
      k = k % FACTORIAL[i];
      answer.append(values.get(index));
      values.remove(index);
    }

    return answer.toString();
  }

  public String firstSolution(int n, int k) {
    if (n == 1) return "1";

    int length = n;
    StringBuilder answer = new StringBuilder();
    boolean[] buffer = new boolean[n + 1];

    while (length > 1) {
      int iTh = k / FACTORIAL[length - 1];
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
