package br.com.emendes.twosum;

/**
 * Dada um array <i>nums</i> de números inteiros e um inteiro <i>target</i>,
 * retorne os índices dos dois números de forma que eles somem para o <i>target</i>.<br>
 * Você pode assumir que cada entrada teria exatamente uma solução
 * @link <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int arraySize = nums.length;
    int i = 0;
    int j = 0;
    boolean wasFound = false;

    for (; i < arraySize && !wasFound; i++) {
      for (j = i + 1; j < arraySize; j++) {
        if (nums[i] + nums[j] == target) {
          wasFound = true;
          break;
        }
      }
    }

    return new int[]{i-1, j};
  }

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();

    int[] nums = {2, 7, 11, 15};
    int target = 22;

    int[] answer = ts.twoSum(nums, target);

    for (int value : answer){
      System.out.printf("%d ", value);
    }
    System.out.println();
  }

}
