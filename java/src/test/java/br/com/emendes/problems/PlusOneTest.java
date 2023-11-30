package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

  @Test
  void test01() {
    PlusOne solution = new PlusOne();

    int[] digits = {0};
    int[] actualAnswer = solution.plusOne(digits);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(1).containsExactly(1);
  }

  @Test
  void test02() {
    PlusOne solution = new PlusOne();

    int[] digits = {9};
    int[] actualAnswer = solution.plusOne(digits);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(2).containsExactly(1, 0);
  }

  @Test
  void test03() {
    PlusOne solution = new PlusOne();

    int[] digits = {4, 3, 2, 1};
    int[] actualAnswer = solution.plusOne(digits);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(4).containsExactly(4, 3, 2, 2);
  }

  @Test
  void test04() {
    PlusOne solution = new PlusOne();

    int[] digits = {1, 2, 3};
    int[] actualAnswer = solution.plusOne(digits);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(3).containsExactly(1, 2, 4);
  }

  @Test
  void test05() {
    PlusOne solution = new PlusOne();

    int[] digits = {9, 9, 9, 9};
    int[] actualAnswer = solution.plusOne(digits);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(5).containsExactly(1, 0, 0, 0, 0);
  }

}