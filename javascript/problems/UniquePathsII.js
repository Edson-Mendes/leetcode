/**
 * Você recebe um array grid de inteiros de dimensões m x n. Existe um robô que está no canto superior
 * esquerdo (grid[0][0]). O robô tenta se mover para o canto inferior direito (grid[m-1][n-1]).
 * O robô pode apenas andar para dereita ou para baixo em qualquer tempo.
 *
 * Um obstáculo e um espaço são marcados como 1 ou 0, respectivamente, na grade.
 * Um caminho que o robô toma não pode incluir nenhum quadrado que seja um obstáculo.
 *
 * Retorne o número de caminhos únicos possíveis que o robô pode seguir para chegar ao canto inferior direito.
 *
 * Os casos de teste são gerados para que a resposta seja menor ou igual a 2 * 10⁹.
 *
 * Restrições:
 *
 * m == obstacleGrid.length
 *
 * n == obstacleGrid[i].length
 *
 * 1 <= m, n <= 100
 *
 * obstacleGrid[i][j] é 0 ou 1.
 *
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
const uniquePathsWithObstacles = function (obstacleGrid) {
  const m = obstacleGrid.length;
  const n = obstacleGrid[0].length;
  if (obstacleGrid[0][0] === 1 || obstacleGrid[m - 1][n - 1] === 1) return 0;
  obstacleGrid[0][0] = 1;
  for (let j = 1; j < n; j++)
    obstacleGrid[0][j] = obstacleGrid[0][j] === 1 ? 0 : obstacleGrid[0][j - 1];
  for (let i = 1; i < m; i++)
    obstacleGrid[i][0] = obstacleGrid[i][0] === 1 ? 0 : obstacleGrid[i - 1][0];

  for (let i = 1; i < m; i++)
    for (let j = 1; j < n; j++) 
      obstacleGrid[i][j] = obstacleGrid[i][j] === 1 ? 0 : obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];

  return obstacleGrid[m - 1][n - 1];
};
