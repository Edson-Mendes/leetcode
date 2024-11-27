/**
 * Dado um matriz 2D n x n representando uma imagem, rotacione a imagem em 90 graus (sentido horário).
 *
 * Você deve rotacionar a imagem in-place, o que significa que você deve modificar a matriz de entrada
 * diretamente. NÃO ALOQUE outra matriz 2D para essa solução.
 *
 * Restrições:
 *
 * n == matrix.length == matrix[i].length
 *
 * 1 <= n <= 20
 *
 * -1000 <= matrix[i][j] <= 1000
 *
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
const rotate = function (matrix) {
  let steps = matrix.length - 1;
  let end = steps;
  let i = 0;
  while (steps > 0) {
    let j = i;
    while (j < end) {
      let ni = end - (end - j);
      let nj = end;
      swap(matrix, i, j, ni, nj);
      nj = end - (steps - (end - ni));
      ni = end;
      swap(matrix, i, j, ni, nj);
      ni = end - (steps - (nj - i));
      nj = i;
      swap(matrix, i, j, ni, nj);
      j++;
    }
    i++;
    end--;
    steps -= 2;
  }
  return matrix;
};

const swap = (matrix, i1, j1, i2, j2) => {
  const temp = matrix[i1][j1];
  matrix[i1][j1] = matrix[i2][j2];
  matrix[i2][j2] = temp;
};
