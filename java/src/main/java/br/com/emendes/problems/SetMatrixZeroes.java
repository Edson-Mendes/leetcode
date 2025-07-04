package br.com.emendes.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Dado uma matriz m x n de inteiros, se um elemento é 0, defina toda a linha e coluna para 0.<br>
 * Você deve fazer isso in-place.<br><br>
 * <p>
 * Restrições:<br>
 * m == matrix.length<br>
 * n == matrix[0].length<br>
 * 1 <= m, n <= 200<br>
 * -2³¹ <= matrix[i][j] <= 2³¹ - 1
 */
public class SetMatrixZeroes {

  public void setZeroes(int[][] matrix) {
    boolean firstRow = false;
    boolean firstColumn = false;
    int m = matrix.length;
    int n = matrix[0].length;

    for (int i = 0; i < m; i++)
      if (matrix[i][0] == 0) {
        firstColumn = true;
        break;
      }
    for (int j = 0; j < n; j++)
      if (matrix[0][j] == 0) {
        firstRow = true;
        break;
      }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }
    for (int i = 1; i < m; i++)
      if (matrix[i][0] == 0)
        for (int j = 1; j < n; j++)
          matrix[i][j] = 0;
    for (int j = 1; j < n; j++)
      if (matrix[0][j] == 0)
        for (int i = 1; i < m; i++)
          matrix[i][j] = 0;
    if (firstRow)
      for (int j = 0; j < n; j++)
        matrix[0][j] = 0;
    if (firstColumn)
      for (int i = 1; i < m; i++)
        matrix[i][0] = 0;
  }

  public void firstSolution(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    Set<Integer> rows = new HashSet<>();
    Set<Integer> columns = new HashSet<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          rows.add(i);
          columns.add(j);
        }
      }
    }
    for (int row : rows) {
      for (int j = 0; j < n; j++) {
        matrix[row][j] = 0;
      }
    }
    for (int column : columns) {
      for (int i = 0; i < m; i++) {
        matrix[i][column] = 0;
      }
    }
  }

}
