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
    int rows = triangle.size();
    if (rows == 1) return triangle.get(0).get(0);

    for (int i = 1; i < rows; i++) {
      int rowLength = i + 1;
      List<Integer> previousRow = triangle.get(i - 1);
      List<Integer> currentRow = triangle.get(i);

      int value = currentRow.remove(0) + previousRow.get(0);
      currentRow.add(0, value);
      for (int j = 1; j < rowLength - 1; j++) {
        value = currentRow.remove(j) + Math.min(previousRow.get(j - 1), previousRow.get(j));
        currentRow.add(j, value);
      }
      value = currentRow.remove(rowLength - 1) + previousRow.get(rowLength - 2);
      currentRow.add(value);
    }

    return triangle.get(rows - 1).stream().min(Integer::compareTo).orElseThrow();
  }

}
