package br.com.emendes.problems;

import java.util.Arrays;

/**
 * O quebra-cabeças N-Queens é um problema de por n queens em um tabuleiro de nxn,
 * em que duas rainhas não devem atacar uma a outra.<br><br>
 * <p>
 * Dado um inteiro n, retorne o número de distintas soluções para o quebra-cabeças N-Queens.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= n <= 9
 */
public class NQueensII {

  private int answer = 0;

  public int totalNQueens(int n) {
    this.answer = 0;
    char[][] board = new char[n][n];

    for (int i = 0; i < n; i++)
      Arrays.fill(board[i], '.');

    putQueens(n, 0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1], board);
    return answer;
  }

  private void putQueens(int n, int i, boolean[] cols, boolean[] diag1, boolean[] diag2, char[][] board) {
    if (i == n) {
      answer += 1;
      return;
    }
    for (int j = 0; j < n; j++) {
      if (cols[j] || diag1[i + j] || diag2[j - i + n - 1])
        continue;
      board[i][j] = 'Q';
      cols[j] = diag1[i + j] = diag2[j - i + n - 1] = true;
      putQueens(n, i + 1, cols, diag1, diag2, board);
      cols[j] = diag1[i + j] = diag2[j - i + n - 1] = false;
      board[i][j] = '.';
    }
  }

}
