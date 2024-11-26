package br.com.emendes.problems;

import java.util.*;

/**
 * Dado um array nums de números inteiros, que pode conter duplicatas,
 * retorne todas as possíveis permutações únicas em qualquer ordem.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 8<br>
 * -10 <= nums[i] <= 10
 */
public class PermutationsII {

  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> permutations = new ArrayList<>();
    Arrays.sort(nums);
    generatePermutations(nums, new boolean[nums.length], new ArrayList<>(), permutations);

    return permutations;
  }

  private void generatePermutations(int[] nums, boolean[] used, ArrayList<Integer> permutation, List<List<Integer>> permutations) {
    if (permutation.size() == nums.length) {
      permutations.add(new ArrayList<>(permutation));
      return;
    }
    for (int index = 0; index < nums.length; index++) {
      if (used[index] || index > 0 && nums[index] == nums[index - 1] && !used[index - 1]) continue;
      used[index] = true;
      permutation.add(nums[index]);
      generatePermutations(nums, used, permutation, permutations);
      used[index] = false;
      permutation.remove(permutation.size() - 1);
    }
  }

  /**
   * First Solution.
   */
  public List<List<Integer>> firstSolution(int[] nums) {
    Set<List<Integer>> permutations = new HashSet<>();
    generatePermutations2(0, nums, permutations);
    return permutations.stream().toList();
  }

  private void generatePermutations2(int ind, int[] nums, Set<List<Integer>> ans) {
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
        generatePermutations2(ind + 1, nums, ans);
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
