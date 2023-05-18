package br.com.emendes.problems;

/**
 * Determine se um tabuleiro de Sudoku 9 x 9 é válido.
 * Apenas as células preenchidas precisam ser validadas de acordo com as seguintes regras:<br>
 *
 * <li>Cada linha deve conter os dígitos 1-9 sem repetição.</li>
 * <li>Cada coluna deve conter os dígitos 1-9 sem repetição.</li>
 * <li>Cada uma das nove subcaixas 3 x 3 da grade deve conter os dígitos 1-9 sem repetição.</li>
 * <br>
 * <p>
 * Nota:<br>
 * <li>Um tabuleiro de Sudoku (parcialmente preenchido) pode ser válido, mas não é necessariamente solucionável.</li>
 * <li>Apenas as células preenchidas precisam ser validadas de acordo com as regras mencionadas.</li>
 * <br>
 * <p>
 * Restrições:<br>
 * board.length == 9<br>
 * board[i].length == 9<br>
 * board[i][j] é um dígito 1-9 ou '.'.
 */
public class ValidSudoku {

  public boolean isValidSudoku(char[][] board) {
    int[][] boardInt = charBoardToInt(board);
    return hasValidLines(boardInt) && hasValidColumns(boardInt) && hasValidSubBoxes(boardInt);
  }

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

  private boolean hasValidLines(int[][] board) {
    for (int i = 0; i < 9; i++) {
      int[] check = new int[10];
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != 0) {
          if (check[board[i][j]] > 0) return false;
          else {
            check[board[i][j]]++;
          }
        }
      }
    }
    return true;
  }

  private boolean hasValidColumns(int[][] board) {
    for (int j = 0; j < 9; j++) {
      int[] check = new int[10];
      for (int i = 0; i < 9; i++) {
        if (board[i][j] != 0) {
          if (check[board[i][j]] > 0) return false;
          else {
            check[board[i][j]]++;
          }
        }
      }
    }
    return true;
  }

  private boolean hasValidSubBoxes(int[][] board) {
    return isValidSubBox(board, 0, 3, 0, 3) &&
        isValidSubBox(board, 0, 3, 3, 6) &&
        isValidSubBox(board, 0, 3, 6, 9) &&
        isValidSubBox(board, 3, 6, 0, 3) &&
        isValidSubBox(board, 3, 6, 3, 6) &&
        isValidSubBox(board, 3, 6, 6, 9) &&
        isValidSubBox(board, 6, 9, 0, 3) &&
        isValidSubBox(board, 6, 9, 3, 6) &&
        isValidSubBox(board, 6, 9, 6, 9);
  }

  private boolean isValidSubBox(int[][] board, int iStart, int iEnd, int jStart, int jEnd) {
    int[] check = new int[10];
    for (int i = iStart; i < iEnd; i++) {
      for (int j = jStart; j < jEnd; j++) {
        if (board[i][j] != 0) {
          if (check[board[i][j]] > 0) return false;
          else {
            check[board[i][j]]++;
          }
        }
      }
    }
    return true;
  }

}
