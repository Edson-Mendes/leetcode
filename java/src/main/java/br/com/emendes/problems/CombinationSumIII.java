package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Encontre todas as combinações de k números que somam n de maneira que as seguintes condições sejam verdadeiras:<br>
 * <br>
 * -> Somente os números de 1 a 9 são usados.<br>
 * -> Cada número é usado no máximo uma vez.<br>
 * <br>
 * Retorna uma lista de todas as combinações válidas possíveis. A lista não deve conter a mesma combinação duas vezes,
 * e as combinações podem ser retornadas em qualquer ordem.<br>
 * <br>
 * Restrições:<br>
 * 2 <= k <= 9<br>
 * 1 <= n <= 60
 */
public class CombinationSumIII {

  public List<List<Integer>> combinationSum3(int k, int n) {
    if (n > 45) return List.of();
    List<List<Integer>> answer = new ArrayList<>();
    helper(k, n, 1, new ArrayList<>(), answer);

    return answer;
  }

  private void helper(int k, int n, int start, List<Integer> list, List<List<Integer>> answer) {
    if (k == 0 && n == 0) {
      answer.add(new ArrayList<>(list));
      return;
    }
    if (k == 0 || n < 0) return;

    for (int i = start; i <= 9; i++) {
      list.add(i);
      helper(k - 1, n - i, i + 1, list, answer);
      list.remove(list.size() - 1);
    }
  }

}
