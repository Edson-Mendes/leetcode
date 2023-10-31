package br.com.emendes.problems;

/**
 * Dado um array de inteiros nums, encontre o subarray com a maior soma de todos os elementos do subarray,
 * e retorne a soma.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁵<br>
 * -10⁴ <= nums[i] <= 10⁴
 */
public class MaximumSubarray {

  public int maxSubArray(int[] nums) {
    int numsLength = nums.length;
    int answer = -100_000_000;

    for (int i = 0; i < numsLength; i++) {
      int accumulator = 0;
      for (int j = i; j < numsLength; j++) {
        accumulator += nums[j];
        if (accumulator > answer) {
          answer = accumulator;
        }
      }
    }

    return answer;
  }

}
