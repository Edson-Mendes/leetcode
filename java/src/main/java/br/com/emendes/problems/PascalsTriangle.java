package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado um inteiro numsRows, retorne os primeiros numRows do triângulo de Pascal.<br>
 * <br>
 * No triângulo de Pascal, cada número é a soma dos dois números diretamente acima dele, conforme
 * <a href="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif">Pascal's triangle link</a>.
 * <br><br>
 * Restrições:<br>
 * 1 <= numRows <= 30
 */
public class PascalsTriangle {

  private List<List<Integer>> answer;

  public List<List<Integer>> generate(int numRows) {
    answer = new ArrayList<>();
    answer.add(List.of(1));
    generate(1, numRows);
    return answer;
  }

  private void generate(int currRow, int numRows) {
    if (currRow == numRows) return;

    List<Integer> currentList = new ArrayList<>();
    List<Integer> previousList = answer.get(currRow - 1);

    currentList.add(1);

    for (int i = 1; i < currRow; i++) {
      int value = previousList.get(i - 1) + previousList.get(i);
      currentList.add(value);
    }

    currentList.add(1);
    answer.add(currentList);
    generate(currRow + 1, numRows);
  }

}
