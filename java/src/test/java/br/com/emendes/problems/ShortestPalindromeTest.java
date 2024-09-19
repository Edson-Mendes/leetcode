package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShortestPalindromeTest {

  @Test
  void test01() {
    ShortestPalindrome solution = new ShortestPalindrome();

    String actualAnswer = solution.shortestPalindrome("");

    assertThat(actualAnswer).isNotNull().isEqualTo("");
  }

  @Test
  void test02() {
    ShortestPalindrome solution = new ShortestPalindrome();

    String actualAnswer = solution.shortestPalindrome("a");

    assertThat(actualAnswer).isNotNull().isEqualTo("a");
  }

  @Test
  void test03() {
    ShortestPalindrome solution = new ShortestPalindrome();

    String actualAnswer = solution.shortestPalindrome("aa");

    assertThat(actualAnswer).isNotNull().isEqualTo("aa");
  }

  @Test
  void test04() {
    ShortestPalindrome solution = new ShortestPalindrome();

    String actualAnswer = solution.shortestPalindrome("ab");

    assertThat(actualAnswer).isNotNull().isEqualTo("bab");
  }

  @Test
  void test05() {
    ShortestPalindrome solution = new ShortestPalindrome();

    String actualAnswer = solution.shortestPalindrome("aacecaaa");

    assertThat(actualAnswer).isNotNull().isEqualTo("aaacecaaa");
  }

  @Test
  void test06() {
    ShortestPalindrome solution = new ShortestPalindrome();

    String actualAnswer = solution.shortestPalindrome("abcd");

    assertThat(actualAnswer).isNotNull().isEqualTo("dcbabcd");
  }

}