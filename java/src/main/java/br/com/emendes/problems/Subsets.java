package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado um array de inteiros nums de elementos únicos, retorne todos os possíveis subconjuntos.<br><br>
 * <p>
 * A solução não deve conter listas duplicadas. Retorne a solução em qualquer ordem.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 10<br>
 * -10 <= nums[i] <= 10<br>
 */
public class Subsets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> answer = new ArrayList<>();
    subsets(new ArrayList<>(), answer, nums, 0);

    return answer;
  }

  // First solution
  public void subsets(int currIndex, int[] nums, List<Integer> subset, List<List<Integer>> answer) {
    subset.add(nums[currIndex]);
    answer.add(subset);

    for (int i = currIndex + 1; i < nums.length; i++) {
      subsets(i, nums, new ArrayList<>(subset), answer);
    }
  }

  // Second solution
  public void subsets(List<Integer> subset, List<List<Integer>> answer, int[] nums, int start) {
    if (start > nums.length) return;
    answer.add(new ArrayList<>(subset));

    for (int i = start; i < nums.length; i++) {
      subset.add(nums[i]);
      subsets(subset, answer, nums, i + 1);
      subset.remove(subset.size() - 1);
    }
  }

}
