package br.com.emendes.problems;

/**
 * Dado um grid board de m x n caracteres e uma string word, retorne true se word exists no grid.<br><br>
 * <p>
 * A palavra pode ser construída a partir de letras de células adjacentes sequencialmente,
 * onde as células adjacentes são vizinhas horizontal ou verticalmente.
 * A mesma célula de letra não pode ser usada mais de uma vez.<br><br>
 * <p>
 * Restrições:<br>
 * m == board.length<br>
 * n = board[i].length<br>
 * 1 <= m, n <= 6<br>
 * 1 <= word.length <= 15<br>
 * board e word consistem de letras inglesas maiúsculas e minúsculas.
 */
public class WordSearch {

  private int m;
  private int n;
  private int totalChar;
  private char[] wordChar;
  private char[][] board;

  public boolean exist(char[][] board, String word) {
    m = board.length;
    n = board[0].length;
    totalChar = word.length();
    this.board = board;
    if (m * n < totalChar) return false;

    wordChar = word.toCharArray();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (checkPath(i, j, 0, new boolean[m][n])) return true;
      }
    }

    return false;
  }

  private boolean checkPath(int i, int j, int indexCharacter, boolean[][] used) {
    if (indexCharacter == totalChar) return true;
    if (i < 0 || i >= m || j < 0 || j >= n) return false;
    if (board[i][j] != wordChar[indexCharacter] || used[i][j]) return false;

    used[i][j] = true;
    boolean isGoodPath = checkPath(i, j + 1, indexCharacter + 1, used);
    if (!isGoodPath) {
      isGoodPath = checkPath(i + 1, j, indexCharacter + 1, used);
      if (!isGoodPath) {
        isGoodPath = checkPath(i, j - 1, indexCharacter + 1, used);
        if (!isGoodPath) {
          isGoodPath = checkPath(i - 1, j, indexCharacter + 1, used);
          if (!isGoodPath) {
            used[i][j] = false;
          }
          return isGoodPath;
        }
      }
    }
    return true;
  }

}
