package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um array de inteiros nums onde cada elemento aparece três vezes exceto por um, que aparece exatamente uma vez.
 * Encontre o único elemento e retorne.<br>
 * <br>
 * Você deve implementar uma solução com complexidade de tempo linear e usar apenas espaço extra constante.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>1 <= nums.length <= 3 * 10⁴</li>
 *   <li>-2³¹ <= nums[i] <= 2³¹ - 1</li>
 *   <li>Cada elemento em nums aparece exatamente três vezes exceto por um elemento que aparece uma vez.</li>
 * </ul>
 */
public class SingleNumberII {

  public int singleNumber(int[] nums) {
    int ones = 0;
    int twos = 0;

    for (int value : nums) {
      ones ^= (value & ~twos);
      twos ^= (value & ~ones);
    }

    return ones;
  }

  /**
   * Second solution.
   */
  public int secondSolution(int[] nums) {
    int answer = 0;

    for (int i = 0; i < 32; i++) {
      int sum = 0;
      for (int value : nums) {
        sum += value >> i & 1;
      }
      sum %= 3;
      answer |= sum << i;
    }

    return answer;
  }

  /**
   * First solution.
   */
  public int firstSolution(int[] nums) {
    if (nums.length == 1) return nums[0];

    Arrays.sort(nums);

    int lastIndex = nums.length - 1;
    for (int i = 0; i < lastIndex; i += 3) {
      if (nums[i] != nums[i + 2]) return nums[i];
    }

    return nums[lastIndex];
  }

}
