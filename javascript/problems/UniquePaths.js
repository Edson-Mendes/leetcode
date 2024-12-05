/**
 * Há um robô em uma grade m x n. O robô está inicialmente localizado no canto superior esquerdo
 * (ou seja, grid[0][0]). O robô tenta se mover para o canto inferior direito
 * (ou seja, grade[m - 1][n - 1]). O robô só pode se mover para baixo ou para a direita em qualquer momento.
 *
 * Dados os dois inteiros m e n, retorne o número de caminhos únicos possíveis que
 * o robô pode seguir para chegar ao canto inferior direito.
 *
 * Os casos de teste são gerados para que a resposta seja menor ou igual a 2 * 10⁹.
 *
 * Restrições:
 *
 * 1 <= m, n <= 100
 *
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
const uniquePaths = function (m, n) {
  const cache = createMatrix(m, n);
  for (let i = 0; i < m; i++) cache[i][0] = 1;
  for (let j = 0; j < n; j++) {
    cache[0][j] = 1;
  }
  for (let i = 1; i < m; i++) {
    for (let j = 1; j < n; j++) {
      cache[i][j] = cache[i - 1][j] + cache[i][j - 1];
    }
  }
  return cache[m - 1][n - 1];
};

const createMatrix = (rows, columns) => {
  const matrix = [];
  for (let i = 0; i < rows; i++) {
    matrix.push([]);
  }
  return matrix;
};
