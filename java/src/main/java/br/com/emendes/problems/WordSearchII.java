package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado um board de caracteres de tamanho m x n e uma lista de words, retorte todas as palavras no board.<br>
 * <br>
 * Cada palavra deve ser construída a partir de letras de células sequencialmente adjacentes,
 * onde células adjacentes são vizinhas horizontal ou verticalmente.
 * A mesma célula de letra não pode ser usada mais de uma vez em uma palavra.<br>
 * <br>
 * Restrições:<br>
 * -> m == board.length<br>
 * -> n == board[i].length<br>
 * -> 1 <= m, n <= 12<br>
 * -> board[i][j] é uma letra minúscula<br>
 * -> 1 <= words.length <= 3 * 10⁴<br>
 * -> 1 <= words[i].length <= 10<br>
 * -> words[i] consiste de letras minúsculas<br>
 * -> Todas as palavras em words são únicas
 */
public class WordSearchII {

  private int[] boardCharacters;

  public List<String> findWords(char[][] board, String[] words) {
    List<String> foundWords = new ArrayList<>();
    boardCharacters = generateBoardCharacters(board);
    for (String word : words) {
      if (hasCharacters(word) && check(word, board)) {
        foundWords.add(word);
      }
    }

    return foundWords;
  }

  private boolean check(String word, char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (checkPath(word, 0, board, i, j)) return true;
      }
    }
    return false;
  }

  private boolean checkPath(String word, int index, char[][] board, int i, int j) {
    if (index == word.length()) return true;
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
    if (board[i][j] == '.') return false;
    if (word.charAt(index++) != board[i][j]) return false;

    char cache = board[i][j];
    board[i][j] = '.';
    boolean isGoodPath = checkPath(word, index, board, i + 1, j) ||
                         checkPath(word, index, board, i - 1, j) ||
                         checkPath(word, index, board, i, j + 1) ||
                         checkPath(word, index, board, i, j - 1);

    board[i][j] = cache;
    return isGoodPath;
  }

  private boolean hasCharacters(String word) {
    int[] boardCharactersCopy = new int[123];
    for (int i = 'a'; i <= 'z'; i++) {
      boardCharactersCopy[i] = this.boardCharacters[i];
    }
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      boardCharactersCopy[c]--;
      if (boardCharactersCopy[c] < 0) return false;
    }
    return true;
  }

  private int[] generateBoardCharacters(char[][] board) {
    boardCharacters = new int[123];
    for (char[] line : board) {
      for (char c : line) {
        boardCharacters[c]++;
      }
    }
    return boardCharacters;
  }

}
