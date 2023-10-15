package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NQueensIITest {

  @ParameterizedTest(name = "when input is {0} must return {1}")
  @CsvSource(value = {"1,1", "2,0", "3,0", "4,2", "5,10", "6,4", "7,40", "8,92", "9,352"})
  void test01(int input, int expectedAnswer) {
    NQueensII solution = new NQueensII();

    int actualAnswer = solution.totalNQueens(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}