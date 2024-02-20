package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InterleavingStringTest {

  @Test
  void test01() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("", "", "");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("", "a", "a");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test03() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("a", "", "a");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("a", "", "");

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test05() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("", "a", "");

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test06() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("abc", "def", "abcde");

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test07() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("abc", "def", "abcdef");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test08() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("ace", "bdf", "abcdef");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test09() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("bdf", "ace", "abcdef");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test10() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("abc", "abc", "aabcbc");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test11() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("aabcc", "dbbca", "aadbbcbcac");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test12() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave("aabcc", "dbbca", "aadbbbaccc");

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test13() {
    InterleavingString solution = new InterleavingString();

    boolean actualAnswer = solution.isInterleave(
        "abababababababababababababababababababababababababababababababababababababababababababababababababbb",
        "babababababababababababababababababababababababababababababababababababababababababababababababaaaba",
        "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababbb");

    assertThat(actualAnswer).isFalse();
  }

}