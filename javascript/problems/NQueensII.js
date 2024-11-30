/**
 * O quebra-cabeça das n rainhas é o problema de colocar n rainhas em um
 * tabuleiro de xadrez nx n de forma que nenhuma das duas rainhas ataque uma à outra.
 *
 * Dado um inteiro n, retorne o número de soluções distintas para o quebra-cabeça das n rainhas.
 *
 * Restrições:
 *
 * 1 <= n <= 9
 *
 * @param {number} n
 * @return {number}
 */
const totalNQueens = function (n) {
  if (n === 1) return 1;
  if (n === 2 || n === 3) return 0;
  const diag1 = createCache(n * 2 - 1);
  const diag2 = createCache(n * 2 - 1);
  const columns = createCache(n);

  return countBoards(0, 0, n, diag1, diag2, columns, 0);
};

const countBoards = (row, queens, total, diag1, diag2, columns, counter) => {
  if (queens === total) {
    return counter + 1;
  }
  for (let j = 0; j < total; j++) {
    const diag1Index = row - j + total - 1;
    if (diag1[diag1Index] && diag2[row + j] && columns[j]) {
      diag1[diag1Index] = false;
      diag2[row + j] = false;
      columns[j] = false;
      counter = countBoards(
        row + 1,
        queens + 1,
        total,
        diag1,
        diag2,
        columns,
        counter
      );
      diag1[diag1Index] = true;
      diag2[row + j] = true;
      columns[j] = true;
    }
  }

  return counter;
};

const createCache = (length) => {
  return new Array(length).fill(true);
};
