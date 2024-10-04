package br.com.emendes.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Dado um array de inteiros nums, retorne true se qualquer valor apareça ao menos duas vezes no array,
 * e retorne false se todos os elementos são distintos.<br>
 * <br>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁵<br>
 * -10⁹ <= nums[i] <= 10⁹
 */
public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
      if (seen.contains(num)) return true;
      seen.add(num);
    }

    return false;
  }

}
