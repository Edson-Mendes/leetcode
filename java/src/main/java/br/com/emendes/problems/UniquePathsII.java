package br.com.emendes.problems;

/**
 * É dado a você um array obstacleGrid de inteiros m x n. Existe um robo localizado inicialmente no canto superior esquerdo.
 * (grid[0][0]). O robo tenta se mover para o canto inferior direito (grid[m-1][n-1]). O robo pode apenas se mover
 * para baixo e para direita em qualquer instante.<br><br>
 * <p>
 * Um obstáculo e um espaço são marcados no obstacleGrid como 1 ou zero respectivamente. Um caminho que que o robo fizer não
 * deve conter nenhum quadrado que tenha obstáculo.<br><br>
 * <p>
 * Retorne o número de possíveis caminhos únicos que o robo pode fazer para alcançar o canto inferior direito.<br><br>
 * <p>
 * Os casos de testes são gerados de modo que a resposta seja menor ou igual a  2 * 10⁹.<br><br>
 * <p>
 * Restrições:<br>
 * m == obstacleGrid.length<br>
 * n == obstacleGrid[i].length<br>
 * 1 <= m, n <= 100<br>
 * obstacleGrid[i][j] é 0 ou 1.
 */
public class UniquePathsII {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;

    // caso base.
    if (m == 1) {
      for (int j = 0; j < n; j++) {
        if (obstacleGrid[0][j] == 1) return 0;
      }
      return 1;
    }
    if (n == 1) {
      for (int i = 0; i < m; i++) {
        if (obstacleGrid[i][0] == 1) return 0;
      }
      return 1;
    }

    int[][] buffer = new int[m][n];

    // preencher a linha.
    int value = 1;
    for (int j = 0; j < n; j++) {
      if (obstacleGrid[0][j] == 1) value = 0;
      buffer[0][j] = value;
    }
    // preencher coluna.
    value = 1;
    for (int i = 0; i < m; i++) {
      if (obstacleGrid[i][0] == 1) value = 0;
      buffer[i][0] = value;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        buffer[i][j] = obstacleGrid[i][j] == 1 ? 0 : buffer[i - 1][j] + buffer[i][j - 1];
      }
    }

    return buffer[m - 1][n - 1];
  }

}
