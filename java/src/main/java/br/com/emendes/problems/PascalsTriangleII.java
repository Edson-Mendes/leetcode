package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado um inteiro rowIndex, retorne o rowIndexTH (0-indexed) linha do Pascal's Triangle.<br>
 * <br>
 * No triângulo de Pascal, cada número é a soma dos dois números diretamente acima dele, conforme
 * <a href="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif">Pascal's triangle link</a>.
 * <br><br>
 * Restrições:<br>
 * 0 <= rowIndex <= 33
 */
public class PascalsTriangleII {

  public List<Integer> getRow(int rowIndex) {
    if (rowIndex == 0) return List.of(1);
    if (rowIndex == 1) return List.of(1, 1);

    List<Integer> current = List.of(1, 1);
    List<Integer> previous;
    for (int curr = 2; curr <= rowIndex; curr++) {
      previous = current;
      current = new ArrayList<>();
      current.add(1);
      for (int i = 1; i < curr; i++) {
        int value = previous.get(i - 1) + previous.get(i);
        current.add(value);
      }
      current.add(1);
    }

    return current;
  }

  /**
   * First Solution.
   */
  public List<Integer> firstSolution(int rowIndex) {
    if (rowIndex == 0) return List.of(1);
    if (rowIndex == 1) return List.of(1, 1);

    return getRow(2, rowIndex, List.of(1, 1));
  }

  private List<Integer> getRow(int currRow, int rowTarget, List<Integer> previous) {
    if (currRow > rowTarget) return previous;

    List<Integer> current = new ArrayList<>();
    current.add(1);

    for (int i = 1; i < currRow; i++) {
      int value = previous.get(i - 1) + previous.get(i);
      current.add(value);
    }

    current.add(1);
    return getRow(currRow + 1, rowTarget, current);
  }

}
