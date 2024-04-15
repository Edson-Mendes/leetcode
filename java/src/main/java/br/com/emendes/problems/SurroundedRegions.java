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
  private char[][] board;

  public void solve(char[][] board) {
    this.n = board.length;
    this.m = board[0].length;
    this.board = board;
    for (int j = 0; j < m; j++) {
      mark(0, j);
      mark(n - 1, j);

    }
    for (int i = 0; i < n; i++) {
      mark(i, 0);
      mark(i, m - 1);
    }
    flip();
  }

  private void mark(int i, int j) {
    if (i > -1 && i < n && j > -1 && j < m && board[i][j] == 'O') {
      board[i][j] = '-';
      mark(i + 1, j);
      mark(i - 1, j);
      mark(i, j + 1);
      mark(i, j - 1);
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
