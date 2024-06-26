package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Há n crianças em fila. Cada criança recebe um valor de classificação fornecido no array de inteiros ratings.<br>
 * <br>
 * Você está dando doces a essas crianças sujeitas aos seguintes requisitos:
 * <ul>
 *   <li>Cada criança deve ter pelo menos um doce.</li>
 *   <li>As crianças com uma classificação mais elevada ganham mais doces do que os seus vizinhos.</li>
 * </ul>
 * Retorne a quantidade mínima de doces necessária para distribuir os doces às crianças.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>n == ratings.length</li>
 *   <li>1 <= n <= 2 * 10⁴</li>
 *   <li>0 <= ratings[i] <= 2 * 10⁴</li>
 * </ul>
 */
public class Candy {

  public int candy(int[] ratings) {
    int[] startToEnd = new int[ratings.length];
    int[] endToStart = new int[ratings.length];
    int answer = 0;

    Arrays.fill(startToEnd, 1);
    Arrays.fill(endToStart, 1);

    for (int i = 1; i < ratings.length; i++) {
      if (ratings[i] > ratings[i - 1]) {
        startToEnd[i] = startToEnd[i - 1] + 1;
      }
    }
    for (int i = ratings.length - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        endToStart[i] = endToStart[i + 1] + 1;
      }
    }
    for (int i = 0; i < ratings.length; i++) {
      answer += Math.max(startToEnd[i], endToStart[i]);
    }

    return answer;
  }

  /**
   * First solution.
   */
  public int firstSolution(int[] ratings) {
    int candyCounter = 1;
    int[] cache = new int[ratings.length];
    cache[0] = 1;

    for (int i = 1; i < ratings.length; i++) {
      if (ratings[i] > ratings[i - 1]) {
        cache[i] = cache[i - 1] + 1;
        candyCounter += cache[i];
      } else if (ratings[i] < ratings[i - 1]) {
        cache[i]++;
        candyCounter++;
        int j = i;
        while (j > 0 && ratings[j] < ratings[j - 1] && cache[j] >= cache[j - 1]) {
          candyCounter += cache[j] + 1 - cache[j - 1];
          cache[j - 1] = cache[j] + 1;
          j--;
        }
      } else {
        cache[i]++;
        candyCounter++;
      }
    }

    return candyCounter;
  }

}
