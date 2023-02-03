package br.com.emendes.reverseinteger;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

  @Test
  @DisplayName("Must return 321 when x is 123")
  void test1() {
    ReverseInteger solution = new ReverseInteger();
    int input = 123;
    int expectedAnswer = 321;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 1 when x is 1")
  void test2() {
    ReverseInteger solution = new ReverseInteger();
    int input = 1;
    int expectedAnswer = 1;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return -321 when x is -123")
  void test3() {
    ReverseInteger solution = new ReverseInteger();
    int input = -123;
    int expectedAnswer = -321;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return -1 when x is -1")
  void test4() {
    ReverseInteger solution = new ReverseInteger();
    int input = -1;
    int expectedAnswer = -1;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 21 when x is 120")
  void test5() {
    ReverseInteger solution = new ReverseInteger();
    int input = 120;
    int expectedAnswer = 21;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 21 when x is 120")
  void test6() {
    ReverseInteger solution = new ReverseInteger();
    int input = -120;
    int expectedAnswer = -21;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 0 when 2147483647")
  void test7() {
    ReverseInteger solution = new ReverseInteger();
    int input = 2147483647;
    int expectedAnswer = 0;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 0 when -2147483648")
  void test8() {
    ReverseInteger solution = new ReverseInteger();
    int input = -2147483648;
    int expectedAnswer = 0;

    int actualAnswer = solution.reverse(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}