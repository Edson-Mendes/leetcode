/**
 * Dado uma matriz m x n de inteiros, se um elemento é zero, defina sua inteira coluna e linha para zero.
 *
 * Você deve fazer isso in-place.
 *
 * Restrições:
 *
 * m == matrix.length
 *
 * n == matrix[0].length
 *
 * 1 <= m, n <= 200
 *
 * -2³¹ <= matrix[i][j] <= 2³¹ - 1
 *
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
const firstSolution = function (matrix) {
  const lines = new Set();
  const columns = new Set();
  const m = matrix.length;
  const n = matrix[0].length;

  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      if (matrix[i][j] === 0) {
        lines.add(i);
        columns.add(j);
      }
    }
  }
  for (const line of lines) {
    for (let j = 0; j < n; j++) {
      matrix[line][j] = 0;
    }
  }
  for (const column of columns) {
    for (let i = 0; i < m; i++) {
      matrix[i][column] = 0;
    }
  }
};

const setZeroes = function (matrix) {
  const m = matrix.length;
  const n = matrix[0].length;
  let firstLine = false;
  let firstColumn = false;

  for (let j = 0; j < n && !firstLine; j++) {
    if (matrix[0][j] === 0) firstLine = true;
  }
  for (let i = 0; i < m && !firstColumn; i++) {
    if (matrix[i][0] === 0) firstColumn = true;
  }
  for (let i = 1; i < m; i++) {
    for (let j = 1; j < n; j++) {
      if (matrix[i][j] === 0) {
        matrix[0][j] = 0;
        matrix[i][0] = 0;
      }
    }
  }

  for (let i = 1; i < m; i++) {
    if (matrix[i][0] === 0)
      for (let j = 1; j < n; j++) {
        matrix[i][j] = 0;
      }
  }
  for (let j = 1; j < n; j++) {
    if (matrix[0][j] === 0)
      for (let i = 1; i < m; i++) {
        matrix[i][j] = 0;
      }
  }
  if (firstLine) for (let j = 0; j < n; j++) matrix[0][j] = 0;
  if (firstColumn) for (let i = 0; i < m; i++) matrix[i][0] = 0;
};
