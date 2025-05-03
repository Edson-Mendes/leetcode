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
    int candidate1 = 0;
    int candidate2 = 1;
    int counter1 = 0;
    int counter2 = 0;
    for (final int value : nums) {
      if (value == candidate1)
        counter1++;
      else if (value == candidate2)
        counter2++;
      else if (counter1 == 0) {
        candidate1 = value;
        counter1 = 1;
      } else if (counter2 == 0) {
        candidate2 = value;
        counter2 = 1;
      } else {
        counter1--;
        counter2--;
      }
    }
    counter1 = 0;
    counter2 = 0;
    for (final int value : nums) {
      if (value == candidate1) counter1++;
      else if (value == candidate2) counter2++;
    }
    if (counter1 > nums.length / 3) answer.add(candidate1);
    if (counter2 > nums.length / 3) answer.add(candidate2);
    return answer;
  }

  public List<Integer> secondSolution(int[] nums) {
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
