/**
 * Você recebe uma matriz de inteiros m x n com as seguintes propriedades:
 *
 * - Cada linha está ordenado em ordem não decrescente.
 *
 * - O primeiro inteiro de cada linha é maior que o último da linha anterior.
 *
 * Dado um inteiro target, retorne true se target está na matriz ou false caso contrário.
 *
 * Você deve escrever uma solução em O(log(m * n)) de complexidade de tempo.
 *
 * Restrições:
 *
 * m == matrix.length
 *
 * n == matrix[i].length
 *
 * 1 <= m, n <= 100
 *
 * -10⁴ <= matrix[i][j], target <= 10⁴
 */
const searchMatrix = function (matrix, target) {
  const row = findRow(matrix, target);
  if (row === -1) return false;
  return binarySearch(matrix, row, target);
};

const findRow = (matrix, target) => {
  let left = 0;
  let right = matrix.length - 1;
  while (left < right) {
    const mid = Math.floor((left + right) / 2);
    if (target < matrix[mid][0]) right = mid - 1;
    else left = mid + 1;
  }
  if (target < matrix[left][0]) return left - 1;
  return left;
};

const binarySearch = (matrix, row, target) => {
  let left = 0;
  let right = matrix[0].length - 1;

  while (left <= right) {
    const mid = Math.floor((left + right) / 2);
    if (target === matrix[row][mid]) return true;
    if (target < matrix[row][mid]) right = mid - 1;
    else left = mid + 1;
  }
  return false;
};
