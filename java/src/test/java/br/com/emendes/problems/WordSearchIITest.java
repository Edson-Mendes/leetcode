package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordSearchIITest {

  @Test
  void test01() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'a'}
    };
    String[] words = {"a", "b", "c", "d"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains("a");
  }

  @Test
  void test02() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'o','a','a','n'},
        {'e','t','a','e'},
        {'i','h','k','r'},
        {'i','f','l','v'}
    };
    String[] words = {"oath", "pea", "eat", "rain"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(2).contains("eat", "oath");
  }

  @Test
  void test03() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'a','b'},
        {'c','d'}
    };
    String[] words = {"abcb"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test04() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'o','a','a','n'},
        {'e','t','a','e'},
        {'i','h','k','r'},
        {'i','f','l','v'}
    };
    String[] words = {"oath", "pea", "eat", "rain", "oate", "oata"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(4).contains("eat", "oath", "oate", "oata");
  }

  @Test
  void test05() {
    WordSearchII solution = new WordSearchII();

    char[][] board = {
        {'a','b'},
        {'c','d'}
    };
    String[] words = {"abcb", "acdb"};
    List<String> actualAnswer = solution.findWords(board, words);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains("acdb");
  }

}