package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um array de inteiros nums e um inteiro k, retorne o Kth maior elemento no array.<br>
 * <br>
 * Note que é o Kth maior elemento em ordem ordenado, não o Kth elemento distinto.<br>
 * <br>
 * Você pode resolver sem ordenar o array?<br>
 * <br>
 * Restrições:<br>
 * 1 <= k <= nums.length <= 10⁵<br>
 * -10⁴ <= nums[i] <= 10⁴
 */
public class KthLargestElementInAnArray {

  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);

    return nums[nums.length - k];
  }

}
