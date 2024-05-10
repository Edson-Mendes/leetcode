package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordBreakTest {

  @Test
  void test00() {
    WordBreak solution = new WordBreak();

    String s = "a";
    List<String> wordDict = List.of("a", "b", "c");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test01() {
    WordBreak solution = new WordBreak();

    String s = "a";
    List<String> wordDict = List.of("b", "c", "d");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test02() {
    WordBreak solution = new WordBreak();

    String s = "abc";
    List<String> wordDict = List.of("a", "b", "c");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test03() {
    WordBreak solution = new WordBreak();

    String s = "abc";
    List<String> wordDict = List.of("ab", "c");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    WordBreak solution = new WordBreak();

    String s = "abcd";
    List<String> wordDict = List.of("ab", "cd");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    WordBreak solution = new WordBreak();

    String s = "leetcode";
    List<String> wordDict = List.of("leet", "code");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test06() {
    WordBreak solution = new WordBreak();

    String s = "applepenapple";
    List<String> wordDict = List.of("apple", "pen");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test07() {
    WordBreak solution = new WordBreak();

    String s = "catsandog";
    List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");

    boolean actualAnswer = solution.wordBreak(s, wordDict);

    assertThat(actualAnswer).isFalse();
  }

}