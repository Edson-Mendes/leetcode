package br.com.emendes.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FractionToRecurringDecimalTest {

  @ParameterizedTest(name = "[{index}] - should return {2} when numerator is {0} and denominator is {1}")
  @CsvSource(value = {
      "10, 10, '1'", "1, 2, '0.5'", "2, 1, '2'", "4, 333, '0.(012)'", "5, 100, '0.05'",
      "16, 6, '2.(6)'", "-50, 8, '-6.25'", "7, -12, '-0.58(3)'", "-1, -2147483648, '0.0000000004656612873077392578125'"
  })
  void test01(int numerator, int denominator, String expectedAnswer) {
    FractionToRecurringDecimal solution = new FractionToRecurringDecimal();

    String actualAnswer = solution.fractionToDecimal(numerator, denominator);

    assertThat(actualAnswer).isNotNull().isEqualTo(expectedAnswer);
  }

}