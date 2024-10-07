package br.com.emendes.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Dado um array de inteiros nums e um inteiro k, retorne true se existe dois índices distintos i e j no array
 * de modo que nums[i] == nums[j] e abs(i - j) <= k.<br>
 * <br>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁵<br>
 * -10⁹ <= nums[i] <= 10⁹<br>
 * 0 <= k <= 10⁵
 */
public class ContainsDuplicateII {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> seen = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!seen.add(nums[i])) return true;
      if (i >= k) seen.remove(nums[i - k]);
    }
    return false;
  }

  public boolean firstSolution(int[] nums, int k) {
    Map<Integer, Integer> numberToIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (numberToIndex.containsKey(nums[i]) && (Math.abs(numberToIndex.get(nums[i]) - i) <= k)) return true;

      numberToIndex.put(nums[i], i);
    }

    return false;
  }

}
