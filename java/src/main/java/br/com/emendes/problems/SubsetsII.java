package br.com.emendes.problems;

import java.util.*;

/**
 * Dado um array de inteiros nums que pode conter duplicatas, retorne todos os subsets possíveis do array.<br>
 * <br>
 * A solução não deve conter subsets duplicados. Retorne a solução em qualquer ordem.<br>
 * <br>
 * Restrições:<br>
 * 1 <= nums.length <= 10<br>
 * -10 <= nums[i] <= 10
 */
public class SubsetsII {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);

    Set<List<Integer>> subsets = new HashSet<>();
    generateSubsets(nums, 0, new ArrayList<>(), subsets);

    return subsets.stream().toList();
  }

  private void generateSubsets(int[] nums, int i, List<Integer> currList, Set<List<Integer>> subsets) {
    subsets.add(new ArrayList<>(currList));

    for (; i < nums.length; i++) {
      currList.add(nums[i]);
      generateSubsets(nums, i + 1, currList, subsets);
      currList.remove(currList.size() - 1);
    }
  }

}
