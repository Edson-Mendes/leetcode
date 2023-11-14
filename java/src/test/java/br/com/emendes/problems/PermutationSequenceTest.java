package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationSequenceTest {

  @Test
  void test01() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(1, 1);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("1");
  }

  @Test
  void test02() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(3, 1);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("123");
  }

  @Test
  void test03() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(3, 3);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("213");
  }

  @Test
  void test04() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(4, 9);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("2314");
  }

  @Test
  void test05() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(4, 1);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("1234");
  }

  @Test
  void test06() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(4, 6);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("1432");
  }

  @Test
  void test07() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(4, 7);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("2134");
  }

  @Test
  void test08() {
    PermutationSequence solution = new PermutationSequence();

    String actualAnswer = solution.getPermutation(4, 12);

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("2431");
  }

}