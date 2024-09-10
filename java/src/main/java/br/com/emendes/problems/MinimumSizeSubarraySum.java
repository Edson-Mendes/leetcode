package br.com.emendes.problems;

/**
 * Dado um array nums de inteiros positivos e um inteiro positivo target,
 * retorne o comprimento mínimo de um subarray cuja soma é maior ou igual ao target.
 * Se não houver tal submatriz, retorne 0.<br>
 * <br>
 * Restrições:<br>
 * -> 1<= target <= 10⁹<br>
 * -> 1 <= nums.length <= 10⁵<br>
 * 1 <= nums[i] <= 10⁴<br>
 * <br>
 * Follow up: Se você descobriu a solução O(n),
 * tente codificar outra solução cuja complexidade de tempo seja O(n log(n)).
 */
public class MinimumSizeSubarraySum {

  public int minSubArrayLen(int target, int[] nums) {
    int length = Integer.MAX_VALUE;
    int curr = 0;

    for (int right = 0, left = 0; right < nums.length; right++) {
      curr += nums[right];
      while (curr >= target) {
        length = Math.min(length, right - left + 1);
        curr -= nums[left++];
      }
    }

    return length == Integer.MAX_VALUE ? 0 : length;
  }

}
