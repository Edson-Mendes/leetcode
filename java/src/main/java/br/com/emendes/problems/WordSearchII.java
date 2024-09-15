package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
      trie.add(word, 0);
    }

    Set<String> answer = new HashSet<>();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        trie.search(board, i, j, answer);
      }
    }

    return new ArrayList<>(answer);
  }

  private class Trie {

    private Trie[] children;
    private String word;

    public Trie() {
      children = new Trie[26];
    }

    public void add(String word, int index) {
      if (index == word.length()) {
        this.word = word;
        return;
      }
      char c = word.charAt(index);
      if (children[c - 'a'] == null) {
        children[c - 'a'] = new Trie();
      }
      children[c - 'a'].add(word, index + 1);
    }

    public void search(char[][] board, int i, int j, Set<String> foundWords) {
      if (word != null) foundWords.add(word);
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
