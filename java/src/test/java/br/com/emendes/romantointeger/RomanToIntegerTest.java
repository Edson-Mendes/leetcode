package br.com.emendes.romantointeger;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanToIntegerTest {

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"I, 1", "II, 2", "III, 3", "IV, 4", "V, 5", "VI, 6", "VII, 7", "VIII, 8", "IX, 9"})
  @DisplayName("Must convert correctly with given input in range of I ~ IX")
  void test1(String input, int expectedAnswer) {
    RomanToInteger solution = new RomanToInteger();

    int actualAnswer = solution.romanToInt(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"X, 10", "XX, 20", "XXX, 30", "XL, 40", "L, 50", "LX, 60", "LXX, 70", "LXXX, 80", "XC, 90"})
  @DisplayName("Must convert correctly with given input in range of X ~ XC")
  void test2(String input, int expectedAnswer) {
    RomanToInteger solution = new RomanToInteger();

    int actualAnswer = solution.romanToInt(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"C, 100", "CC, 200", "CCC, 300", "CD, 400", "D, 500", "DC, 600", "DCC, 700", "DCCC, 800", "CM, 900"})
  @DisplayName("Must convert correctly with given input in range of X ~ XC")
  void test3(String input, int expectedAnswer) {
    RomanToInteger solution = new RomanToInteger();

    int actualAnswer = solution.romanToInt(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}