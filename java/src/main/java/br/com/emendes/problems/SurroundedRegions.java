package br.com.emendes.problems;

/**
 * Dado uma matriz board de m x n contendo 'X' ou 'O', capture todas as regiões que estão cercadas em 4 direções por 'X'.
 * <br><br>
 * Uma região é capturada invertendo todos os 'O's em 'X's naquela região cercada.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>m == board.length</li>
 *   <li>n == board[i].length</li>
 *   <li>1 <= m, n <= 200</li>
 *   <li>board[i][j] é 'X' or 'O'</li>
 * </ul>
 */
public class SurroundedRegions {

  private int n;
  private int m;
  private int nBound;
  private int mBound;
  private char[][] board;

  public void solve(char[][] board) {
    this.n = board.length;
    this.m = board[0].length;
    this.nBound = n - 1;
    this.mBound = m - 1;
    this.board = board;
    solveHelper();
    flip();
  }

  private void mark(int i, int j) {
    if (i > 0 && i < nBound && j > 0 && j < mBound && board[i][j] == 'O') {
      board[i][j] = '-';
      mark(i + 1, j);
      mark(i - 1, j);
      mark(i, j + 1);
      mark(i, j - 1);
    }
  }

  private void solveHelper() {
    int lastN = n - 1;
    int lastM = m - 1;
    for (int j = 0; j < m; j++) {
      if (board[0][j] == 'O') {
        board[0][j] = '-';
        mark(1, j);
      }
      if (board[lastN][j] == 'O') {
        board[lastN][j] = '-';
        mark(lastN - 1, j);
      }
    }
    for (int i = 0; i < n; i++) {
      if (board[i][0] == 'O') {
        board[i][0] = '-';
        mark(i, 1);
      }
      if (board[i][lastM] == 'O') {
        board[i][lastM] = '-';
        mark(i, lastM - 1);
      }
    }
  }

  private void flip() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (board[i][j] == '-') {
          board[i][j] = 'O';
        } else if (board[i][j] == 'O') {
          board[i][j] = 'X';
        }
      }
    }
  }

}
