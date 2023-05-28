package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dado um array candidates de inteiros distintos e um inteiro target,
 * retorne uma lista de todas as combinações únicas de candidates em que a soma dos números escolhidos seja igual target.
 * Voçẽ pode retornar a combinação em qualquer ordem.<br><br>
 * <p>
 * O mesmo número pode ser escolhido entre os candidates um número ilimitado de vezes.
 * Duas combinações são únicas se a frequência de pelo menos um dos números escolhidos é diferente.<br><br>
 * <p>
 * Os casos de teste são gerados de forma que o número de combinações exclusivas que sejam iguais a target
 * seja menor que 150 combinações para a entrada fornecida.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= candidates.length <= 30<br>
 * 2 <= candidates[i] <= 40<br>
 * Todos os elementos de candidates são diferentes<br>
 * 1 <= target <= 40
 */
public class CombinationSum {

  List<List<Integer>> answer;
  int candidatesLength;

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    answer = new ArrayList<>();
    candidatesLength = candidates.length;

    Arrays.sort(candidates);

    combinationSum(new ArrayList<>(), candidates, target, 0);

    return answer;
  }

  private void combinationSum(List<Integer> currCombination, int[] candidates, int target, int index) {
    int indexFound = Arrays.binarySearch(candidates, target);
    if (indexFound > -1) {
      ArrayList<Integer> combination = new ArrayList<>(currCombination);
      combination.add(candidates[indexFound]);
      answer.add(combination);
    }

    int halfTarget = target / 2;

    while (index < candidatesLength && candidates[index] <= halfTarget) {
      ArrayList<Integer> nextCombination = new ArrayList<>(currCombination);
      nextCombination.add(candidates[index]);
      combinationSum(nextCombination, candidates, target - candidates[index], index);
      index++;
    }
  }

}
