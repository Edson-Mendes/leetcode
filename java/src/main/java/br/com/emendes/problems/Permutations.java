package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado um array nums de números inteiros distintos, retorne todas as permutações possíveis.<br>
 * Você pode retornar a resposta em qualquer ordem.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 6<br>
 * -10 <= nums[i] <= 10<br>
 * Todos os inteiros em nums são únicos.
 */
public class Permutations {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    generatePermutations(0, nums, ans);
    return ans;
  }

  private void generatePermutations(int ind, int[] nums, List<List<Integer>> ans) {
    if (ind == nums.length) {
      List<Integer> permutation = new ArrayList<>();
      for (int num : nums) {
        permutation.add(num);
      }
      ans.add(permutation);
      return;
    }

    for (int i = ind; i < nums.length; i++) {
      swap(i, ind, nums);
      generatePermutations(ind + 1, nums, ans);
      swap(i, ind, nums);
    }
  }

  private void swap(int i, int j, int[] nums) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }

}
