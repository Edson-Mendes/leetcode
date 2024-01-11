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

  public boolean exist(char[][] board, String word) {
    if (board.length * board[0].length < word.length()) return false;

    char[] wordArray = word.toCharArray();
    if (!hasCharacters(board, wordArray)) return false;

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (checkPath(i, j, board, 0, wordArray)) return true;
      }
    }

    return false;
  }

  private boolean hasCharacters(char[][] board, char[] wordArray) {
    int[] counterCharacter = new int[128];

    for (char[] chars : board) {
      for (char character : chars) {
        counterCharacter[character]++;
      }
    }
    for (char character : wordArray) {
      counterCharacter[character]--;
      if (counterCharacter[character] < 0) return false;
    }
    return true;
  }

  private boolean checkPath(int i, int j, char[][] board, int indexCharacter, char[] word) {
    if (indexCharacter == word.length) return true;
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
    if (board[i][j] != word[indexCharacter] || board[i][j] == '.') return false;

    char cache = board[i][j];
    board[i][j] = '.';
    boolean isGoodPath = checkPath(i, j + 1, board, indexCharacter + 1, word) ||
        checkPath(i + 1, j, board, indexCharacter + 1, word) ||
        checkPath(i, j - 1, board, indexCharacter + 1, word) ||
        checkPath(i - 1, j, board, indexCharacter + 1, word);

    board[i][j] = cache;
    return isGoodPath;
  }

}
