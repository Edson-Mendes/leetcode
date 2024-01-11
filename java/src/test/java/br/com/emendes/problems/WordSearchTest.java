package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordSearchTest {

  @Test
  void test01() {
    WordSearch solution = new WordSearch();

    char[][] board = {{'a'}};
    String word = "a";
    boolean actualAnswer = solution.exist(board, word);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    WordSearch solution = new WordSearch();

    char[][] board = {{'a'}};
    String word = "ab";
    boolean actualAnswer = solution.exist(board, word);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    WordSearch solution = new WordSearch();

    char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "SEE";
    boolean actualAnswer = solution.exist(board, word);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    WordSearch solution = new WordSearch();

    char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "ABCB";
    boolean actualAnswer = solution.exist(board, word);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test05() {
    WordSearch solution = new WordSearch();

    char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "ABCBB";
    boolean actualAnswer = solution.exist(board, word);

    Assertions.assertThat(actualAnswer).isFalse();
  }

}