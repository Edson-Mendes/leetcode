package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrambleStringTest {

  @Test
  void test01() {
    ScrambleString solution = new ScrambleString();

    boolean actualAnswer = solution.isScramble("a", "a");

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    ScrambleString solution = new ScrambleString();

    boolean actualAnswer = solution.isScramble("a", "b");

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    ScrambleString solution = new ScrambleString();

    boolean actualAnswer = solution.isScramble("great", "rgeat");

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    ScrambleString solution = new ScrambleString();

    boolean actualAnswer = solution.isScramble("abcde", "caebd");

    Assertions.assertThat(actualAnswer).isFalse();
  }

}