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
   * Complexidade de tempo: O(n).
   * Complexidade de espaço: O(n).
   */
  public int maxSubArray(int[] nums) {
    int numsLength = nums.length;
    if (numsLength == 1) return nums[0];

    int[] sums = new int[numsLength];
    int answer = sums[0] = nums[0];

    for (int i = 1; i < numsLength; i++) {
      int currSum = sums[i-1] + nums[i];
      sums[i] = currSum > nums[i] ? currSum : nums[i];
      if (sums[i] > answer) {
        answer = sums[i];
      }
    }

    return answer;
  }

}
