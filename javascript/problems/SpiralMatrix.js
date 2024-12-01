/**
 * Dado um array m x n matrix, retorne todos os elementos de matrix em ordem espiral.
 *
 * Restrições:
 *
 * m == matrix.length
 *
 * m == matrix[i].length
 *
 * 1 <= m, n <= 10
 *
 * -100 <= matrix[i][j] <= 100
 *
 * @param {number[][]} matrix
 * @return {number[]}
 */
const spiralOrder = function (matrix) {
  const total = matrix.length * matrix[0].length;
  let index = 0;
  let si = 0;
  let sj = 0;
  let ei = matrix.length - 1;
  let ej = matrix[0].length - 1;
  const elements = [];
  while (index < total) {
    for (let j = sj; j <= ej && index < total; j++) {
      elements[index++] = matrix[si][j];
    }
    si++;
    for (let i = si; i <= ei && index < total; i++) {
      elements[index++] = matrix[i][ej];
    }
    ej--;
    for (let j = ej; j >= sj && index < total; j--) {
      elements[index++] = matrix[ei][j];
    }
    ei--;
    for (let i = ei; i >= si && index < total; i--) {
      elements[index++] = matrix[i][sj];
    }
    sj++;
  }

  return elements;
};
