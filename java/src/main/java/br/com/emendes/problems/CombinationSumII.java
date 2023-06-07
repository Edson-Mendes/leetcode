package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Dado uma collection de números candidatos (candidates) e um número alvo (target),
 * encontre todos as combinações únicas em candidates onde os números candidates somam igual a target.<br><br>
 *
 * cada número em candidates pode ser usado apenas uma vez na combinação.<br><br>
 *
 * Nota: o conjunto solução não deve conter combinações duplicadas.<br><br>
 *
 * Restrições:<br>
 * 1 <= candidates.length <= 100<br>
 * 1 <= candidates[i] <= 50<br>
 * 1 <= target <= 30<br>
 */
public class CombinationSumII {

  private List<List<Integer>> answer;
  private int candidatesLength;

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    answer = new ArrayList<>();
    candidatesLength = candidates.length;

    Arrays.sort(candidates);

    int indexFound = Arrays.binarySearch(candidates, target);
    if (indexFound > -1) {
      answer.add(List.of(target));
    }

    int previousCandidate = -1;
    int halfTarget = target/2;

    for (int i = 0; i < candidatesLength && candidates[i] <= halfTarget; i++) {
      if (previousCandidate != candidates[i]) {
        combinationSum(new ArrayList<>(), target, i, candidates);
      }
      previousCandidate = candidates[i];
    }

    return answer;
  }

  private void combinationSum(List<Integer> currCombination, int target, int startIndex, int[] candidates) {
    if (target == 0) {
      answer.add(currCombination);
      return;
    }

    target -= candidates[startIndex];
    if (target < 0) return;

    currCombination.add(candidates[startIndex]);
    int halfTarget = target/2;

    ArrayList<Integer> nextCombination;

    int indexFound = Arrays.binarySearch(candidates, startIndex+1, candidatesLength, target);
    if (indexFound > -1) {
      nextCombination = new ArrayList<>(currCombination);
      nextCombination.add(candidates[indexFound]);
      combinationSum(nextCombination, 0, indexFound + 1, candidates);
    }

    int previousCandidate = -1;

    for (int i = startIndex+1; i < candidatesLength && candidates[i] <= halfTarget; i++) {
      if (previousCandidate != candidates[i]) {
        nextCombination = new ArrayList<>(currCombination);
        combinationSum(nextCombination, target, i, candidates);
      }
      previousCandidate = candidates[i];
    }

  }

}
