package br.com.emendes.problems;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Dado uma array de inteiros nums e dois inteiros indexDiff e valueDiff.<br>
 * <br>
 * Encontre um par de indices (i, j) que:<br>
 * -> i != j<br>
 * -> abs(i - j) <= indexDiff<br>
 * -> abs(nums[i] - nums[j]) <= valueDiff<br>
 * <br>
 * Retorne true se tal par existir ou false caso contrário.<br>
 * <br>
 * Restrições:<br>
 * 2 <= nums.length <= 10⁵<br>
 * -10⁹ <= nums[i] <= 10⁹<br>
 * 1 <= indexDiff <= nums.length<br>
 * 0 <= valueDiff <= 10⁹
 */
public class ContainsDuplicateIII {

  public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
    TreeSet<Long> seen = new TreeSet<>();
    for (int i = 0; i < nums.length; i++) {
      long num = nums[i];
      Long ceiling = seen.ceiling(num);
      if (ceiling != null && ceiling - num <= valueDiff) return true;
      Long floor = seen.floor(num);
      if (floor != null && num - floor <= valueDiff) return true;

      seen.add(num);
      if (i >= indexDiff) {
        seen.remove((long) nums[i - indexDiff]);
      }
    }
    return false;
  }

  public boolean firstSolution(int[] nums, int indexDiff, int valueDiff) {
    Set<Integer> seen = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      for (int value : seen) {
        if (Math.abs(value - nums[i]) <= valueDiff) return true;
      }
      seen.add(nums[i]);
      if (i >= indexDiff) seen.remove(nums[i - indexDiff]);
    }

    return false;
  }

}
