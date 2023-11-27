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

  /**
   * Solução em que é alterado o grid de entrada.
   */
  public int secondSolution(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i > 0 && j > 0) {
          grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
        } else if (i > 0) {
          grid[i][j] += grid[i - 1][j];
        } else if (j > 0) {
          grid[i][j] += grid[i][j - 1];
        }
      }
    }

    return grid[m - 1][n - 1];
  }

  /**
   * Solução usando recursividade e armazenamento dos pontos do grid já calculados.
   */
  public int thirdSolution(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] memo = new int[m][n];
    return find(grid, m - 1, n - 1, memo);
  }

  private int find(int[][] grid, int m, int n, int[][] memo) {
    if (m == 0 && n == 0)
      return grid[0][0];
    else if (m < 0 || n < 0)
      return Integer.MAX_VALUE;
    else if (memo[m][n] != 0)
      return memo[m][n];
    memo[m][n] = grid[m][n] +
        Math.min(find(grid, m - 1, n, memo), find(grid, m, n - 1, memo));

    return memo[m][n];
  }

}
