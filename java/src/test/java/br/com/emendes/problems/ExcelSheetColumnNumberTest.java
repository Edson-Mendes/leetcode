package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExcelSheetColumnNumberTest {

  @ParameterizedTest
  @CsvSource(value = {"'A', 1", "'Z', 26", "'AA', 27", "'ZY', 701", "'DAG', 2737", "'FXSHRXW', 2147483647"})
  void test01(String input, int expectedAnswer) {
    ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();

    int actualAnswer = solution.titleToNumber(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}