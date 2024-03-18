package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;

/**
 * Dado um array de inteiros onde os elementos estão ordenados em ordem crescente,
 * converta para uma binary search tree balanceada.<br>
 * <br>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁴<br>
 * -10⁴ <= nums[i] <= 10⁴<br>
 * nums está ordenado estritamente em ordem crescente.
 */
public class ConvertSortedArrayToBinarySearchTree {

  public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
  }

  private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
    if (end < start) return null;

    int half = (start + end) / 2;
    return new TreeNode(
        nums[half],
        sortedArrayToBSTHelper(nums, start, half - 1),
        sortedArrayToBSTHelper(nums, half + 1, end)
    );
  }

}
