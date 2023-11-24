package br.com.emendes.problems;

/**
 * Existe um robo em um grid m x n. O robo está inicialmente localizado na canto superior esquerdo (grid[0][0]).
 * O robo tenta se mover para o canto inferior direito (grid[m-1][n-1].
 * O robo pode apenas se mover para baixo ou para esquerda.<br><br>
 * <p>
 * Dado dois inteiros m e n, retorne o número de caminhos únicos que o robo pode
 * tomar para alcançar o canto inferior direito.<br><br>
 * <p>
 * Os casos de teste são gerados de forma que a resposta seja menor ou igual a 2 * 10⁹.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= m, n <= 100
 */
public class UniquePaths {

  public int uniquePaths(int m, int n) {
    if (m == 1 || n == 1) return 1;

    int[][] buffer = new int[m][n];

    for (int i = 0; i < m; i++) {
      buffer[i][0] = 1;
    }
    for (int i = 0; i < n; i++) {
      buffer[0][i] = 1;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        buffer[i][j] = buffer[i - 1][j] + buffer[i][j - 1];
      }
    }

    return buffer[m - 1][n - 1];
  }

}
