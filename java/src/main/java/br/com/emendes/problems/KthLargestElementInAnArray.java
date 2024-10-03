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
    return quickSelect(nums, 0, nums.length - 1, nums.length - k);
  }

  private int quickSelect(int[] nums, int start, int pivot, int pos) {
    int i = start;
    int p = start;
    while (i < pivot) {
      if (nums[i] <= nums[pivot]) {
        swap(nums, p, i);
        p++;
      }
      i++;
    }
    swap(nums, p, pivot);
    if (pos == p) return nums[p];
    if (pos < p) return quickSelect(nums, start, p - 1, pos);
    return quickSelect(nums, p + 1, pivot, pos);
  }

  private void swap(int[] nums, int p, int i) {
    int cache = nums[p];
    nums[p] = nums[i];
    nums[i] = cache;
  }

  public int firstSolution(int[] nums, int k) {
    Arrays.sort(nums);

    return nums[nums.length - k];
  }

}
