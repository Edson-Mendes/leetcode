package br.com.emendes.problems;

import java.util.List;

/**
 * Dado um array triangle, retorne a soma mínima do caminho de cima para baixo.<br>
 * <br>
 * Para cada passo, você pode passar para um número adjacente da linha abaixo. Mais formalmente,
 * se você estiver no índice i da linha atual, poderá passar para o índice i ou para o índice i + 1 na próxima linha.<br>
 * <br>
 * Restrições:<br>
 * 1 <= triangle.length <= 200<br>
 * triangle[0].length == 1<br>
 * triangle[i].length == triangle[i-1].length + 1<br>
 * -10⁴ <= triangle[i][j] <= 10⁴
 */
public class Triangle {

  public int minimumTotal(List<List<Integer>> triangle) {
    int penultimate = triangle.size() - 2;
    for (int i = penultimate; i > -1; i--) {
      List<Integer> current = triangle.get(i);
      List<Integer> below = triangle.get(i + 1);
      for (int j = 0; j < current.size(); j++) {
        current.set(j, current.get(j) + Math.min(below.get(j), below.get(j + 1)));
      }
    }

    return triangle.get(0).get(0);
  }

  /**
   * Second Solution.
   */
  public int secondSolution(List<List<Integer>> triangle) {
    int rows = triangle.size();
    if (rows == 1) return triangle.get(0).get(0);

    int[] previousRow = {triangle.get(0).get(0)};
    for (int i = 1; i < rows; i++) {
      previousRow = calcRow(previousRow, triangle.get(i), i + 1);
    }

    int answer = Integer.MAX_VALUE;

    for (int value : previousRow) {
      if (value < answer) {
        answer = value;
      }
    }

    return answer;
  }

  private int[] calcRow(int[] previousRow, List<Integer> currRow, int rowLength) {
    int[] result = new int[rowLength];

    int value = currRow.get(0) + previousRow[0];
    result[0] = value;

    for (int i = 1; i < rowLength - 1; i++) {
      result[i] = currRow.get(i) + Math.min(previousRow[i - 1], previousRow[i]);
    }

    value = currRow.get(rowLength - 1) + previousRow[rowLength - 2];
    result[rowLength - 1] = value;
    return result;
  }

}
