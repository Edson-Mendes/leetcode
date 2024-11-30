/**
 * O quebra-cabeça das n rainhas é o problema de colocar n rainhas em um tabuleiro
 * de xadrez nx n de forma que nenhuma das duas rainhas ataque uma à outra.
 *
 * Dado um inteiro n, retorne todas as soluções distintas para o quebra-cabeça n-queens.
 * Você pode retornar a resposta em qualquer ordem.
 *
 * Cada solução contém uma configuração de tabuleiro distinta do posicionamento das n rainhas,
 * onde 'Q' e '.' indicam uma rainha e um espaço vazio, respectivamente.
 *
 * Restrições:
 *
 * 1 <= n <= 9
 *
 * @param {number} n
 * @return {string[][]}
 */
const solveNQueens = function (n) {
  if (n === 2 || n === 3) return [];
  const boards = [];
  const diag1 = createCache(n * 2 - 1);
  const diag2 = createCache(n * 2 - 1);
  const columns = createCache(n);
  console.log(diag1);
  console.log(diag2);
  console.log(columns);
  generateBoards(0, 0, n, diag1, diag2, columns, createEmptyBoard(n), boards);

  return boards;
};

const generateBoards = (
  counter,
  row,
  total,
  diag1,
  diag2,
  columns,
  board,
  boards
) => {
  if (counter === total) {
    boards.push(copyBoard(board));
    return;
  }
  for (let j = 0; j < total; j++) {
    const index = row - j + total - 1;
    if (diag1[index] && diag2[row + j] && columns[j]) {
      diag1[index] = false;
      diag2[row + j] = false;
      columns[j] = false;
      board[row][j] = "Q";
      generateBoards(
        counter + 1,
        row + 1,
        total,
        diag1,
        diag2,
        columns,
        board,
        boards
      );
      diag1[index] = true;
      diag2[row + j] = true;
      columns[j] = true;
      board[row][j] = ".";
    }
  }
};

const copyBoard = (board) => {
  const newBoard = [];
  for (const row of board) {
    newBoard.push(row.join(""));
  }

  return newBoard;
};

const createEmptyBoard = (length) => {
  const board = [];
  for (let i = 0; i < length; i++) {
    const line = new Array(length).fill(".");
    board.push(line);
  }
  return board;
};

const createCache = (length) => {
  return new Array(length).fill(true);
};
