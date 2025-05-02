package br.com.emendes.problems;

import java.util.*;

/**
 * Dado um array de inteiros de tamanho n, encontre todos os elementos que aparecem mais de | n/3 | vezes.
 * <br><br>
 * Restrições:
 * 1 <= nums.length <= 5 * 10⁴<br>
 * -10⁹ <= nums[i] <= 10⁹
 * <br><br>
 * Follow-up: Você pode resolver o problema em tempo linear e O(1) de espaço?
 */
public class MajorityElementII {

  public List<Integer> majorityElement(int[] nums) {
    List<Integer> answer = new ArrayList<>();
    Arrays.sort(nums);
    int index = 0;
    final int limit = nums.length / 3;
    while (index < nums.length) {
      if (index + limit < nums.length && nums[index] == nums[index + limit]) {
        answer.add(nums[index]);
        index = index + limit;
        index = nextNumber(nums, index);
      } else index++;
    }
    return answer;
  }

  private int nextNumber(int[] arr, int index) {
    int value = arr[index];
    while (index < arr.length && arr[index] == value) {
      index++;
    }
    return index;
  }

  /**
   * Time complexity: O(n)
   * Space complexity: O(n)
   */
  public List<Integer> firstSolution(int[] nums) {
    Map<Integer, Integer> counterElements = new HashMap<>();
    final int limit = nums.length / 3;
    for (int key : nums) {
      counterElements.compute(key, (k, v) -> v == null ? 1 : v + 1);
    }
    return counterElements.entrySet().stream()
        .filter(entry -> entry.getValue() > limit)
        .map(Map.Entry::getKey)
        .toList();
  }

}
