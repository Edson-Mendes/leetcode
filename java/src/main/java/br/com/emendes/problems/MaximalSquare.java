package br.com.emendes.problems;

/**
 * Dado uma matriz de m x n preenchida por 0s e 1s, encontre o maior quadrado contendo apenas 1s e retorne sua área.<br>
 * <br>
 * Restrições:<br>
 * m == matrix.length<br>
 * n == matrix[i].length<br>
 * 1 <= m, n <= 300<br>
 * matrix[i][j] é '0' ou '1'.
 */
public class MaximalSquare {

  public int maximalSquare(char[][] matrix) {
    int[][] mat = countCells(matrix);
    int m = matrix.length;
    int n = matrix[0].length;
    int maxSize = 0;
    for (int i = m - 1; i > maxSize - 1; i--) {
      for (int j = n - 1; j > maxSize - 1; j--) {
        if (mat[i][j] > maxSize)
          maxSize = Math.max(maxSize, getSquareSideSize(i, j, mat));
      }
    }
    return maxSize * maxSize;
  }

  private int getSquareSideSize(int i, int j, int[][] mat) {
    int size = mat[i][j--];
    int count = 1;
    while (count < size && j > -1 && mat[i][j] > count) {
      if (mat[i][j] < size) size = mat[i][j];
      count++;
      j--;
    }

    return count;
  }

  private int[][] countCells(char[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int[][] mat = new int[m][n];
    for (int j = 0; j < n; j++) {
      mat[0][j] = matrix[0][j] == '1' ? 1 : 0;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = matrix[i][j] == '1' ? mat[i-1][j] + 1 : 0;
      }
    }

    return mat;
  }

}
