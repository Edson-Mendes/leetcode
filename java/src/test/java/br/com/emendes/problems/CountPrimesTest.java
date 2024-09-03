package br.com.emendes.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CountPrimesTest {

  @ParameterizedTest(name = "when input is {0} output should be {1}")
  @CsvSource(value = {"0, 0", "1, 0", "10, 4", "5000000, 348513", "2, 0"})
  void test(int input, int expectedAnswer) {
    CountPrimes solution = new CountPrimes();

    int actualAnswer = solution.countPrimes(input);

    assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}