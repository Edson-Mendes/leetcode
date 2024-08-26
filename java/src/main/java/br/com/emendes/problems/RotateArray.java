package br.com.emendes.problems;

/**
 * Dado um array de inteiros nums, rotacione o array para a direita por k passos,
 * onde k é não negativo.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= nums.length <= 10⁵<br>
 * -> -2³¹ <= nums[i] <= 2³¹ - 1<br>
 * -> 0 <= k <= 10⁵<br>
 * <br>
 * Follow up: Você pode resolver com complexidade de espaço O(1)?
 */
public class RotateArray {

  /**
   * Second solution.<br><br>
   * O(n) Time complexity.
   * O(1) Space complexity.
   */
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  private void reverse(int[] nums, int left, int right) {
    while (left < right) {
      swap(nums, left, right);
      left++;
      right--;
    }
  }

  private void swap(int[] nums, int i, int j) {
    int buffer = nums[i];
    nums[i] = nums[j];
    nums[j] = buffer;
  }

  /**
   * First solution.<br><br>
   * O (n) Time complexity.<br>
   * O (n) Space complexity.
   */
  public void firstSolution(int[] nums, int k) {
    int steps = k % nums.length;
    int[] rotateNums = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      rotateNums[getIndex(i, steps, nums.length)] = nums[i];
    }
    System.arraycopy(rotateNums, 0, nums, 0, nums.length);
  }

  private int getIndex(int actualIndex, int steps, int length) {
    int nextIndex = actualIndex + steps;
    return nextIndex >= length ? nextIndex - length : nextIndex;
  }

}
