package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BitwiseAndOfNumbersRangeTest {

  @Test
  void test01() {
    BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

    int actualAnswer = solution.rangeBitwiseAnd(0, 0);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

    int actualAnswer = solution.rangeBitwiseAnd(0, 0);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test03() {
    BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

    int actualAnswer = solution.rangeBitwiseAnd(1, 10);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test04() {
    BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

    int actualAnswer = solution.rangeBitwiseAnd(5, 7);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test05() {
    BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

    int actualAnswer = solution.rangeBitwiseAnd(1, 2147483647);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test06() {
    BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

    int actualAnswer = solution.rangeBitwiseAnd(7, 10);

    assertThat(actualAnswer).isZero();
  }

}