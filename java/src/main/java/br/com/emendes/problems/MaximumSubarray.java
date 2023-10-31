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

  /**
   * Complexidade de tempo: O(n).<br>
   * Complexidade de espaço: O(1).
   */
  public int maxSubArray(int[] nums) {
    int numsLength = nums.length;
    if (numsLength == 1) return nums[0];

    int sums = nums[0];
    int answer = nums[0];

    for (int i = 1; i < numsLength; i++) {
      int currSum = sums + nums[i];
      sums = currSum > nums[i] ? currSum : nums[i];
      if (sums > answer) {
        answer = sums;
      }
    }

    return answer;
  }

}
