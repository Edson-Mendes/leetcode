package br.com.emendes.problems;

/**
 * Escreva um programa para resolver um quebra-cabeça Sudoku preenchendo as células vazias.<br><br>
 *
 * Uma solução de sudoku deve satisfazer todas as seguintes regras:<br>
 * - Cada um dos dígitos 1-9 deve ocorrer exatamente uma vez em cada linha.<br>
 * - Cada um dos dígitos 1-9 deve ocorrer exatamente uma vez em cada coluna.<br>
 * - Cada um dos dígitos 1-9 deve ocorrer exatamente uma vez em cada uma das 9 subcaixas 3x3 da grade.<br>
 * - O caracter '.' indica uma célula vazia.<br><br>
 *
 *
 * Restrições:<br>
 * - board.length == 9.<br>
 * - board[i].length == 9.<br>
 * - board[i][j] is a digit or '.'.<br>
 * - É garantido que o board de entrada possui apenas uma solução.<br>
 */
public class SudokuSolver {

  public void solveSudoku(char[][] board) {
    int[][] boardInt = charBoardToInt(board);

    int valueFound = valueFound(boardInt);
  }

  private int valueFound(int[][] boardInt) {
    int valueFound = 0;
    for (int i = 0; i < 9;i++) {
      for (int j = 0; j < 9; j++) {
        if (boardInt[i][j] != 0){
          valueFound++;
        }
      }
    }

    return valueFound;
  }

  /**
   * Converte um board do tipo char[][] para int[][].
   */
  private int[][] charBoardToInt(char[][] board) {
    int[][] boardInt = new int[9][9];

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          boardInt[i][j] = 0;
        } else {
          boardInt[i][j] = board[i][j] - 48;
        }
      }
    }

    return boardInt;
  }

}
