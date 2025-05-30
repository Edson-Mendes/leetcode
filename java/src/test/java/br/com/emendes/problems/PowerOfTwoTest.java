package br.com.emendes.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class PowerOfTwoTest {

  @ParameterizedTest
  @ValueSource(ints = {7777777, 666666, 11111, 7, 5, 3, 0, -16, -8, -10, -11111, Integer.MIN_VALUE})
  void test01(int invalidN) {
    PowerOfTwo solution = new PowerOfTwo();
    boolean actualAnswer = solution.isPowerOfTwo(invalidN);

    assertThat(actualAnswer).isFalse();
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 4, 8, 16, 32, 64})
  void test02(int validN) {
    PowerOfTwo solution = new PowerOfTwo();
    boolean actualAnswer = solution.isPowerOfTwo(validN);

    assertThat(actualAnswer).isTrue();
  }

}