/**
 * Determine se um tabuleiro de Sudoku 9 x 9 é válido.
 * Somente as células preenchidas precisam ser validadas de acordo com as seguintes regras:
 *
 * 1. Cada linha deve conter os dígitos de 1 a 9 sem repetição.
 *
 * 2. Cada coluna deve conter os dígitos de 1 a 9 sem repetição.
 *
 * 3. Cada uma das nove subcaixas 3 x 3 da grade deve conter os dígitos de 1 a 9 sem repetição.
 *
 * Nota: Um tabuleiro de Sudoku (parcialmente preenchido) pode ser válido, mas não é necessariamente solucionável.
 *
 * Somente as células preenchidas precisam ser validadas de acordo com as regras mencionadas.
 *
 * Restrições:
 *
 * board.length == 9
 *
 * board[i].length == 9
 *
 * board[i][j] é um digito 1-9 ou '.'.
 *
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function (board) {
  const rows = [];
  const columns = [];
  const subBoxes = [];

  for (let i = 0; i < 9; i++) {
    rows.push(new Set());
    columns.push(new Set());
    subBoxes.push(new Set());
  }

  for (let i = 0; i < board.length; i++) {
    for (let j = 0; j < board.length; j++) {
      let element = board[i][j];
      if (element !== ".") {
        let subBox = getSubBox(i, j, subBoxes);
        if (
          rows[i].has(element) ||
          columns[j].has(element) ||
          subBox.has(element)
        ) {
          console.log(`element: ${element}`);
          console.log(`row: ${[...rows[i]]}`);
          console.log(`column: ${[...columns[j]]}`);
          console.log(`subBox: ${[...subBox]}`);
          return false;
        }
        rows[i].add(element);
        columns[j].add(element);
        subBox.add(element);
      }
    }
  }

  return true;
};

const getSubBox = (i, j, subBoxes) => {
  if (i >= 0 && i <= 2) {
    if (j >= 0 && j <= 2) return subBoxes[0];
    if (j >= 3 && j <= 5) return subBoxes[1];
    return subBoxes[2];
  }
  if (i >= 3 && i <= 5) {
    if (j >= 0 && j <= 2) return subBoxes[3];
    if (j >= 3 && j <= 5) return subBoxes[4];
    return subBoxes[5];
  }
  if (j >= 0 && j <= 2) return subBoxes[6];
  if (j >= 3 && j <= 5) return subBoxes[7];
  return subBoxes[8];
};

let board = [
  ["5", "3", ".", ".", "7", ".", ".", ".", "."],
  ["6", ".", ".", "1", "9", "5", ".", ".", "."],
  [".", "9", "8", ".", ".", ".", ".", "6", "."],
  ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
  ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
  ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
  [".", "6", ".", ".", ".", ".", "2", "8", "."],
  [".", ".", ".", "4", "1", "9", ".", ".", "5"],
  [".", ".", ".", ".", "8", ".", ".", "7", "9"],
];
