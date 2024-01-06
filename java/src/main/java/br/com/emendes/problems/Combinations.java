package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado dois interiros n e k, retorne todas as possíveis combinações de k números do intervalo [1, n].<br><br>
 * <p>
 * Você pode retornar a resposta em qualquer ordem.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= n <= 20<br>
 * 1 <= k <= n
 */
public class Combinations {

  private List<List<Integer>> answer;

  public List<List<Integer>> combine(int n, int k) {
    if (n == 1) {
      return List.of(List.of(1));
    }
    answer = new ArrayList<>();

    for (int i = 1; i <= n - k + 1; i++) {
      combine(i, n, k, new ArrayList<>());
    }
    return answer;
  }

  private void combine(int value, int n, int k, List<Integer> list) {
    list.add(value);
    if (list.size() == k) {
      answer.add(list);
      return;
    }
    for (int newValue = value + 1; newValue <= n; newValue++) {
      combine(newValue, n, k, new ArrayList<>(list));
    }
  }

}
