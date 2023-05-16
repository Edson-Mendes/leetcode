package br.com.emendes.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Dada um array <i>nums</i> de números inteiros e um inteiro <i>target</i>,
 * retorne os índices dos dois números de forma que eles somem para o <i>target</i>.<br>
 * Você pode assumir que cada entrada teria exatamente uma solução
 *
 * @link <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
public class TwoSum {

  /**
   * Solução O(n<sup>2</sup>).
   *
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    int arraySize = nums.length;
    int i = 0;
    int j = 1;

    while (i < j) {
      if (nums[i] + nums[j] == target) {
        break;
      } else if (j == arraySize - 1) {
        i++;
        j = i + 1;
      } else {
        j++;
      }
    }

    return new int[]{i, j};
  }

  public int[] twoSumUsingHashMap(int[] nums, int target) {
    int[] answer = new int[2];
    Map<Integer, Integer> hash = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      Integer diff = target - nums[i];
      if (hash.containsKey(diff)) {
        answer[0] = i;
        answer[1] = hash.get(diff);
        return answer;
      }
      hash.put(nums[i], i);
    }
    return answer;
  }

  public static void main(String[] args) {
    TwoSum ts = new TwoSum();

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] answer = ts.twoSumUsingHashMap(nums, target);

    for (int value : answer) {
      System.out.printf("%d ", value);
    }
    System.out.println();
  }

}
