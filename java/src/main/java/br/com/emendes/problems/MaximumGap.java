package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um array de inteiros nums, retorne a diferença máxima entre dois elementos sucessivos em sua forma ordenada.
 * Se o array tiver menos de dois elementos retorne 0.<br>
 * <br>
 * Você deve escrever um algoritmo que execute em tempo linear e use espaço extra linear.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= nums.length <= 10⁵</li>
 *   <li>0 <= nums[i] <= 10⁹</li>
 * </ul>
 */
public class MaximumGap {

  public int maximumGap(int[] nums) {
    Arrays.sort(nums);
    int answer = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      answer = Math.max(answer, nums[i + 1] - nums[i]);
    }

    return answer;
  }

}
