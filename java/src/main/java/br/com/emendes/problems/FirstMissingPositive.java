package br.com.emendes.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Dado um array de inteiros não ordenado nums.
 * Retorne o menor inteiro positivo ausente.<br><br>
 * Voçê deve implementar o algoritmo com complexidade de tempo O(n) e complexidade de espaço em O(1).<br><br>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁵<br>
 * -2³¹ <= nums[i] <= 2³¹ - 1
 */
public class FirstMissingPositive {

  // Complexidade de tempo O(n)
  // Complexidade de espaço O(n)
  public int firstMissingPositive(int[] nums) {
    Set<Integer> remainder = new HashSet<>();
    int smallest = 1;
    for (int num : nums) {
      if (num >= smallest) {
        if (num == smallest) {
          smallest++;
        } else {
          remainder.add(num);
        }
      }
    }

    while (remainder.contains(smallest)) {
      smallest++;
    }

    return smallest;
  }

}
