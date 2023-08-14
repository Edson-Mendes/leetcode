package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

  private List<List<Integer>> answer;

  public List<List<Integer>> permute(int[] nums) {
    answer = new ArrayList<>();

    Set<Integer> values = new HashSet<>();

    for (int value : nums) {
      values.add(value);
    }

    generatePermutations(values, new ArrayList<>());

    return answer;
  }

  private void generatePermutations(Set<Integer> remaining, List<Integer> currList) {
    if (remaining.isEmpty()) {
      answer.add(currList);
      return;
    }
    remaining.forEach(value -> {
      List<Integer> nextList = new ArrayList<>(currList);
      nextList.add(value);

      Set<Integer> nextRemaining = new HashSet<>(remaining);
      nextRemaining.remove(value);

      generatePermutations(nextRemaining, nextList);
    });
  }

}
