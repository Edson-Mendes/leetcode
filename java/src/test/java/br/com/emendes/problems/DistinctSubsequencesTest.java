package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DistinctSubsequencesTest {

  @Test
  void test01() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct("a", "a");

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test02() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct("a", "b");

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test03() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct("a", "ab");

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test04() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct("abcde", "abcde");

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test05() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct("abcdee", "abcde");

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test06() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct("babgbag", "bag");

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test07() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct("rabbbit", "rabbit");

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test08() {
    DistinctSubsequences solution = new DistinctSubsequences();

    int actualAnswer = solution.numDistinct(
        "adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc",
        "bcddceeeebecbc");

    Assertions.assertThat(actualAnswer).isEqualTo(700531452);
  }

}