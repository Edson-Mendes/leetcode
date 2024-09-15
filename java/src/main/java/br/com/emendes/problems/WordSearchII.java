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

  public List<String> findWords(char[][] board, String[] words) {
    Trie trie = new Trie();
    for (String word : words) {
      trie.add(word);
    }

    List<String> answer = new ArrayList<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        trie.search(board, i, j, answer);
      }
    }
    return answer;
  }

  private static class Trie {

    private final Trie[] children;
    private String word;

    public Trie() {
      children = new Trie[26];
    }

    public void add(String word) {
      char[] wordArray = word.toCharArray();
      Trie node = this;
      for (char c : wordArray) {
        int index = c - 'a';
        if (node.children[index] == null)
          node.children[index] = new Trie();
        node = node.children[index];
      }
      node.word = word;
    }

    public void search(char[][] board, int i, int j, List<String> foundWords) {
      if (word != null) {
        foundWords.add(word);
        word = null;
      }
      if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
      if (board[i][j] == '.') return;
      int index = board[i][j] - 'a';
      if (children[index] == null) return;

      char cache = board[i][j];
      board[i][j] = '.';
      children[index].search(board, i + 1, j, foundWords);
      children[index].search(board, i - 1, j, foundWords);
      children[index].search(board, i, j + 1, foundWords);
      children[index].search(board, i, j - 1, foundWords);
      board[i][j] = cache;
    }

  }

}
