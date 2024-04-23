package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromePartitioningTest {

  @Test
  void test01() {
    PalindromePartitioning solution = new PalindromePartitioning();

    String s = "a";
    List<List<String>> actualAnswer = solution.partition(s);

    assertThat(actualAnswer).isNotNull()
        .hasSize(1)
        .contains(List.of("a"));
  }

  @Test
  void test02() {
    PalindromePartitioning solution = new PalindromePartitioning();

    String s = "ab";
    List<List<String>> actualAnswer = solution.partition(s);

    assertThat(actualAnswer).isNotNull()
        .hasSize(1)
        .contains(List.of("a", "b"));
  }

  @Test
  void test03() {
    PalindromePartitioning solution = new PalindromePartitioning();

    String s = "aa";
    List<List<String>> actualAnswer = solution.partition(s);

    assertThat(actualAnswer).isNotNull()
        .hasSize(2)
        .contains(List.of("a", "a"), List.of("aa"));
  }

  @Test
  void test04() {
    PalindromePartitioning solution = new PalindromePartitioning();

    String s = "aab";
    List<List<String>> actualAnswer = solution.partition(s);

    assertThat(actualAnswer).isNotNull()
        .hasSize(2)
        .contains(List.of("a", "a", "b"), List.of("aa", "b"));
  }

  @Test
  void test05() {
    PalindromePartitioning solution = new PalindromePartitioning();

    String s = "abba";
    List<List<String>> actualAnswer = solution.partition(s);

    assertThat(actualAnswer).isNotNull()
        .hasSize(3)
        .contains(List.of("a", "b", "b", "a"), List.of("a", "bb", "a"), List.of("abba"));
  }

  @Test
  void test06() {
    PalindromePartitioning solution = new PalindromePartitioning();

    String s = "aabbccddddccbbaa";
    List<List<String>> actualAnswer = solution.partition(s);

    assertThat(actualAnswer).isNotNull()
        .isNotEmpty()
        .contains(
            List.of("a","a","b","b","c","c","d","d","d","d","c","c","b","b","a","a"),
            List.of("a","a","b","b","c","c","d","d","d","d","c","c","b","b","aa"),
            List.of("a","a","b","b","c","c","d","d","d","d","c","c","bb","a","a"),
            List.of("a","a","b","b","c","c","d","d","d","d","c","c","bb","aa"),
            List.of("a","a","b","b","c","c","d","d","d","d","cc","b","b","a","a"),
            List.of("a","a","b","b","c","c","d","d","d","d","cc","b","b","aa"),
            List.of("a","a","b","b","c","c","d","d","d","d","cc","bb","a","a"),
            List.of("a","a","b","b","c","c","d","d","d","d","cc","bb","aa"),
            List.of("a","a","b","b","c","c","d","d","dd","c","c","b","b","a","a"),
            List.of("a","a","b","b","c","c","d","d","dd","c","c","b","b","aa"),
            List.of("a","a","b","b","c","c","d","d","dd","c","c","bb","a","a"),
            List.of("a","a","b","b","c","c","d","d","dd","c","c","bb","aa"),
            List.of("a","a","b","b","c","c","d","d","dd","cc","b","b","a","a"),
            List.of("a","a","b","b","c","c","d","d","dd","cc","b","b","aa"),
            List.of("a","a","b","b","c","c","d","d","dd","cc","bb","a","a"),
            List.of("a","a","b","b","c","c","d","d","dd","cc","bb","aa")
            );
  }

}