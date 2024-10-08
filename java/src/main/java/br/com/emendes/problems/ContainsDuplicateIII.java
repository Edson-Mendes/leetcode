package br.com.emendes.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    long min = Arrays.stream(nums).min().getAsInt();
    long diff = (long) valueDiff + 1;
    Map<Long, Long> bucket = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      long num = nums[i];
      long key = getKey(nums[i], min, diff);
      if (bucket.containsKey(key))
        return true;
      if (bucket.containsKey(key - 1) &&
          num - bucket.get(key - 1) < diff)
        return true;
      if (bucket.containsKey(key + 1) &&
          bucket.get(key + 1) - num < diff)
        return true;
      bucket.put(key, num);
      if (i >= indexDiff)
        bucket.remove(getKey(nums[i - indexDiff], min, diff));
    }

    return false;
  }

  private long getKey(int num, long min, long diff) {
    return (num - min) / diff;
  }

  public boolean firstSolution(int[] nums, int indexDiff, int valueDiff) {
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

}
