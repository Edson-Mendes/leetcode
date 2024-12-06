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
    if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;
    int[] cache = new int[n];
    cache[0] = 1;
    for (int j = 1; j < n; j++)
      cache[j] = obstacleGrid[0][j] == 1 ? 0 : cache[j - 1];

    for (int i = 1; i < m; i++) {
      cache[0] = obstacleGrid[i][0] == 1 ? 0 : cache[0];
      for (int j = 1; j < n; j++)
        cache[j] = obstacleGrid[i][j] == 1 ? 0 : cache[j - 1] + cache[j];
    }
    return cache[n - 1];
  }

  public int firstSolution(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;

    obstacleGrid[0][0] = 1;
    for (int j = 1; j < n; j++)
      obstacleGrid[0][j] = obstacleGrid[0][j] == 1 ? 0 : obstacleGrid[0][j - 1];
    for (int i = 1; i < m; i++)
      obstacleGrid[i][0] = obstacleGrid[i][0] == 1 ? 0 : obstacleGrid[i - 1][0];

    for (int i = 1; i < m; i++)
      for (int j = 1; j < n; j++)
        obstacleGrid[i][j] = obstacleGrid[i][j] == 1 ? 0 : obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];

    return obstacleGrid[m - 1][n - 1];
  }

}
