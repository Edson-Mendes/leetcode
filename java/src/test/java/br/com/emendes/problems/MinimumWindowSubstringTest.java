package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {

  @Test
  void test01() {
    MinimumWindowSubstring solution = new MinimumWindowSubstring();

    String actualAnswer = solution.minWindow("a", "a");

    Assertions.assertThat(actualAnswer).isEqualTo("a");
  }

  @Test
  void test02() {
    MinimumWindowSubstring solution = new MinimumWindowSubstring();

    String actualAnswer = solution.minWindow("ADOBECODEBANC", "ABC");

    Assertions.assertThat(actualAnswer).isEqualTo("BANC");
  }

  @Test
  void test03() {
    MinimumWindowSubstring solution = new MinimumWindowSubstring();

    String actualAnswer = solution.minWindow("a", "aa");

    Assertions.assertThat(actualAnswer).isEmpty();
  }

  @Test
  void test04() {
    MinimumWindowSubstring solution = new MinimumWindowSubstring();

    String actualAnswer = solution.minWindow("abb", "ab");

    Assertions.assertThat(actualAnswer).isEqualTo("ab");
  }

  @Test
  void test05() {
    MinimumWindowSubstring solution = new MinimumWindowSubstring();

    String actualAnswer = solution.minWindow("ADOBECODEBANC", "ABBC");

    Assertions.assertThat(actualAnswer).isEqualTo("BECODEBA");
  }

  @Test
  void test06() {
    MinimumWindowSubstring solution = new MinimumWindowSubstring();

    String actualAnswer = solution.minWindow("AA", "AAAA");

    Assertions.assertThat(actualAnswer).isEqualTo("");
  }

}