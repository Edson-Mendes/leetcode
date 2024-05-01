package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um array nums não vazio de inteiros, cada elemento aparece duas vezes exceto por um.
 * Encontre esse é único número.<br>
 * <br>
 * Você deve implementar um solução com complexidade de tempo linear e que use apenas espaço extra constante.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= nums.length <= 3 * 10⁴</li>
 *   <li>-3 * 10⁴ <= nums[i] <= 3 * 10⁴</li>
 *   <li>Cada elemento da matriz aparece duas vezes, exceto um elemento que aparece apenas uma vez.</li>
 * </ul>
 */
public class SingleNumber {

  public int singleNumber(int[] nums) {
    int answer = 0;

    for (int value : nums) {
      answer ^= value;
    }

    return answer;
  }

  /**
   * First solution.
   */
  public int firstSolution(int[] nums) {
    Arrays.sort(nums);

    for (int i = 1; i < nums.length; i += 2) {
      if (nums[i] != nums[i - 1]) return nums[i - 1];
    }

    return nums[nums.length - 1];
  }

}
