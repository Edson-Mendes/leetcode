package br.com.emendes.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Dado um array nums de tamanho n, retorne o elemento majoritário.<br>
 * <br>
 * O elemento majoritário é o elemento que aparece mais de n/2 vezes. Você deve assumir que o elemento majoritário
 * sempre existe no array.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>n == nums.length</li>
 *   <li>1 <= n <= 5 * 10⁴</li>
 *   <li>-10⁹ <= nums[i] <= 10⁹</li>
 * </ul>
 */
public class MajorityElement {

  public int majorityElement(int[] nums) {
    Arrays.sort(nums);

    return nums[nums.length / 2];
  }

  public int firstSolution(int[] nums) {
    Map<Integer, Integer> cache = new HashMap<>();
    int half = nums.length / 2;

    for (int num : nums) {
      if (cache.containsKey(num)) {
        int value = cache.get(num);
        value++;
        if (value > half) return num;
      }
      cache.merge(num, 1, Integer::sum);
    }

    return cache.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).orElseThrow().getKey();
  }

}
