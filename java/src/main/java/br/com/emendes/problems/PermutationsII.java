package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Dado um array nums de números inteiros, que pode conter duplicatas,
 * retorne todas as possíveis permutações únicas em qualquer ordem.<br><br>
 *
 * Restrições:<br>
 * 1 <= nums.length <= 8<br>
 * -10 <= nums[i] <= 10
 */
public class PermutationsII {

  public List<List<Integer>> permuteUnique(int[] nums) {
    Set<List<Integer>> permutations = new HashSet<>();
    generatePermutations(0, nums, permutations);
    return permutations.stream().toList();
  }

  private void generatePermutations(int ind, int[] nums, Set<List<Integer>> ans) {
    if (ind == nums.length) {
      List<Integer> permutation = new ArrayList<>();
      for (int num : nums) {
        permutation.add(num);
      }
      ans.add(permutation);
      return;
    }

    for (int i = ind; i < nums.length; i++) {
      if (!(nums[i] == nums[ind] && i != ind)) {
        swap(i, ind, nums);
        generatePermutations(ind + 1, nums, ans);
        swap(i, ind, nums);
      }
    }
  }

  private void swap(int i, int j, int[] nums) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }

}
