package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordBreakIITest {

  @Test
  void test01() {
    WordBreakII solution = new WordBreakII();

    String s = "a";
    List<String> wordDict = List.of("a");
    List<String> actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isNotNull().hasSize(1)
        .contains("a");
  }

  @Test
  void test02() {
    WordBreakII solution = new WordBreakII();

    String s = "a";
    List<String> wordDict = List.of("b");
    List<String> actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test03() {
    WordBreakII solution = new WordBreakII();

    String s = "catsanddog";
    List<String> wordDict = List.of("cat", "cats", "and", "sand", "dog");
    List<String> actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isNotNull().hasSize(2)
        .contains("cats and dog", "cat sand dog");
  }

  @Test
  void test04() {
    WordBreakII solution = new WordBreakII();

    String s = "pineapplepenapple";
    List<String> wordDict = List.of("apple", "pen", "applepen", "pine", "pineapple");
    List<String> actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isNotNull().hasSize(3)
        .contains("pine apple pen apple", "pineapple pen apple", "pine applepen apple");
  }

  @Test
  void test05() {
    WordBreakII solution = new WordBreakII();

    String s = "catsandog";
    List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
    List<String> actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

}