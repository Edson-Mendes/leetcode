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
    int maxArea = 0;
    int m = matrix.length;
    int n = matrix[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        maxArea = Math.max(maxArea, getSquareArea(i, j, matrix, m, n, 1));
      }
    }
    return maxArea;
  }

  private int getSquareArea(int indexI, int indexJ, char[][] matrix, int m, int n, int cells) {
    int count = cells / 2 + 1;
    int i = indexI;
    int j = indexJ;
    while (count > 0 && i < m && j < n && matrix[i][j] == '1') {
      count--;
      i++;
    }
    if (count > 0)
      return 0;
    count = cells / 2;
    i--;
    j--;
    while (count > 0 && i < m && j < n && matrix[i][j] == '1') {
      j--;
      count--;
    }

    return count == 0 ? getSquareArea(indexI, indexJ + 1, matrix, m, n, cells + 2) + cells : 0;
  }

}
