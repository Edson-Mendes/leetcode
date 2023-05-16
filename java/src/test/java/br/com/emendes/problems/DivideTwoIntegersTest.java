package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DivideTwoIntegersTest {

  @Test
  @DisplayName("Must return 3 when dividend = 10 and divisor = 3")
  void test1() {
    int dividendInput = 10;
    int divisorInput = 3;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  @DisplayName("Must return -2 when dividend = 7 and divisor = -3")
  void test2() {
    int dividendInput = 7;
    int divisorInput = -3;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isEqualTo(-2);
  }

  @Test
  @DisplayName("Must return 2_147_483_647 when dividend = -2_147_483_648 and divisor = -1")
  void test3() {
    int dividendInput = Integer.MIN_VALUE;
    int divisorInput = -1;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isEqualTo(Integer.MAX_VALUE);
  }

  @Test
  @DisplayName("Must return -2_147_483_647 when dividend = 2_147_483_647 and divisor = -1")
  void test4() {
    int dividendInput = Integer.MAX_VALUE;
    int divisorInput = -1;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isEqualTo(-2_147_483_647);
  }

  @Test
  @DisplayName("Must return 2_147_483_647 when dividend = -2_147_483_647 and divisor = -1")
  void test5() {
    int dividendInput = -2_147_483_647;
    int divisorInput = -1;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isEqualTo(2_147_483_647);
  }

  @Test
  @DisplayName("Must return 715827882 when dividend = 2147483647 and divisor = 3")
  void test6() {
    int dividendInput = 2_147_483_647;
    int divisorInput = 3;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isEqualTo(715_827_882);
  }

  @Test
  @DisplayName("Must return 1 when dividend = -2_147_483_648 and divisor = -2_147_483_648")
  void test7() {
    int dividendInput = -2_147_483_648;
    int divisorInput = -2_147_483_648;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  @DisplayName("Must return 0 when dividend = -100 and divisor = -2_147_483_648")
  void test8() {
    int dividendInput = -100;
    int divisorInput = -2_147_483_648;

    DivideTwoIntegers solution = new DivideTwoIntegers();
    int actualAnswer = solution.divide(dividendInput, divisorInput);

    Assertions.assertThat(actualAnswer).isZero();
  }

}