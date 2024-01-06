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

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> answer = new ArrayList<>();
    combine(n, k, 1, new ArrayList<>(), answer);
    return answer;
  }

  private void combine(int n, int k, int value, List<Integer> list, List<List<Integer>> answer) {
    if (list.size() == k) {
      answer.add(new ArrayList<>(list));
      return;
    }

    for (int i = value; i <= n; i++) {
      list.add(i);
      combine(n, k, i + 1, list, answer);
      list.remove(list.size() - 1);
    }
  }

}
