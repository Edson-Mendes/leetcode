/**
 * Dado um grid m x n preenchido com número não negativos, encontre o caminho do canto superior esquerdo
 * para o canto inferior direito, com a menor soma ao longo do caminho.
 *
 * Nota: Você só pode se mover para baixo ou para direita a cada passo.
 *
 * Restrições:
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 <= m, n <= 200
 *
 * 0 <= grid[i][j] <= 200
 *
 * @param {number[][]} grid
 * @return {number}
 */
const minPathSum = function (grid) {
  const m = grid.length;
  const n = grid[0].length;
  for (let j = 1; j < n; j++) {
    grid[0][j] += grid[0][j - 1];
  }
  for (let i = 1; i < m; i++) {
    grid[i][0] += grid[i - 1][0];
  }
  for (let i = 1; i < m; i++) {
    for (let j = 1; j < n; j++) {
      grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
    }
  }

  return grid[m - 1][n - 1];
};
