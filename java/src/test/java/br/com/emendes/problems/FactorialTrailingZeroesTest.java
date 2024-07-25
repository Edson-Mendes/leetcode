package br.com.emendes.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTrailingZeroesTest {

  @ParameterizedTest
  @CsvSource(value = {"0, 0", "1, 0", "5, 1", "6, 1", "25, 6", "28, 6", "125, 31", "720, 178"})
  void test(int input, int expectedAnswer) {
    FactorialTrailingZeroes solution = new FactorialTrailingZeroes();

    int actualAnswer = solution.trailingZeroes(input);

    assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}