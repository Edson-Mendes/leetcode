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

  public int firstMissingPositive(int[] nums) {
    int length = nums.length;
    int[] answer = new int[length + 1];

    for (int i = 0; i < length; i++) {
      if (nums[i] > 0 && nums[i] <= length) {
        answer[nums[i]] = 1;
      }
    }

    length = length + 1;
    for (int i = 1; i < length; i++) {
      if (answer[i] == 0) return i;
    }

    return length;
  }

  // Complexidade de tempo O(n)
  // Complexidade de espaço O(n)
  public int solution1(int[] nums) {
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
