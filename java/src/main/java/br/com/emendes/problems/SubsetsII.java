package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    List<List<Integer>> answer = new ArrayList<>();
    generateSubsets(nums, 0, new ArrayList<>(), answer);

    return answer;
  }

  private void generateSubsets(int[] nums, int index, List<Integer> currList, List<List<Integer>> subsets) {
    subsets.add(new ArrayList<>(currList));

    for (int i = index; i < nums.length; i++) {
      if (i != index && nums[i] == nums[i - 1]) continue;
      currList.add(nums[i]);
      generateSubsets(nums, i + 1, currList, subsets);
      currList.remove(currList.size() - 1);
    }
  }

}
