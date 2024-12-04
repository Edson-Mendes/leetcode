/**
 * Dado um inteiro positivo n, gere uma matriz n x n preenchido com elementos de 1 até n² em ordem espiral.
 *
 * Restrições:
 *
 * 1 <= n <= 20
 *
 * @param {number} n
 * @return {number[][]}
 */
const generateMatrix = function (n) {
  const total = n * n;
  let counter = 1;
  const matrix = createMatrix(n);
  let si = 0;
  let sj = 0;
  let ej = n - 1;
  let ei = ej;
  while (counter <= total) {
    for (let j = sj; j <= ej; j++) {
      matrix[si][j] = counter++;
    }
    si++;
    for (let i = si; i <= ei; i++) {
      matrix[i][ej] = counter++;
    }
    ej--;
    for (let j = ej; j >= sj; j--) {
      matrix[ei][j] = counter++;
    }
    ei--;
    for (let i = ei; i >= si; i--) {
      matrix[i][sj] = counter++;
    }
    sj++;
  }

  return matrix;
};

const createMatrix = (length) => {
  const matrix = [];
  for (let index = 0; index < length; index++) {
    matrix[index] = [];
  }
  return matrix;
};

console.log(generateMatrix(5));
