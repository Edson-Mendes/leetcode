package br.com.emendes.problems;

/**
 * Dado um grid de m x n preenchido por números não negativos, encontre o caminho do canto superior esquerdo para
 * o canto inferior direito, que minimize a soma de todos os números ao longo do caminho.<br><br>
 * <p>
 * Nota: Você só pode se mover para baixo ou para direita em qualquer ponto do tempo.<br><br>
 * <p>
 * Restrições:<br>
 * m == grid.length<br>
 * n == grid[i].length<br>
 * 1 <= m, n <= 200<br>
 * 0 <= grid[i][j] <= 200
 */
public class MinimumPathSum {

  public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] buffer = new int[m][n];

    // Preencher primeira linha.
    buffer[0][0] = grid[0][0];
    for (int j = 1; j < n; j++) {
      buffer[0][j] = grid[0][j] + buffer[0][j - 1];
    }
    // Preencher primeira coluna.
    for (int i = 1; i < m; i++) {
      buffer[i][0] = grid[i][0] + buffer[i - 1][0];
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (buffer[i - 1][j] < buffer[i][j - 1]) {
          buffer[i][j] = grid[i][j] + buffer[i - 1][j];
        } else {
          buffer[i][j] = grid[i][j] + buffer[i][j - 1];
        }
      }
    }

    return buffer[m - 1][n - 1];
  }

}
