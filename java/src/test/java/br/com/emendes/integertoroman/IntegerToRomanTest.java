package br.com.emendes.integertoroman;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IntegerToRomanTest {

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"1000, M", "2000, MM", "3000, MMM"})
  @DisplayName("Must convert correctly with given input in range of 1000 ~ 3000")
  void test1(int input, String expectedAnswer) {
    IntegerToRoman solution = new IntegerToRoman();

    String actualAnswer = solution.intToRoman(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"100, C", "200, CC", "300, CCC", "400, CD", "500, D", "600, DC", "700, DCC", "800, DCCC", "900, CM"})
  @DisplayName("Must convert correctly with given input in range of 100 ~ 900")
  void test2(int input, String expectedAnswer) {
    IntegerToRoman solution = new IntegerToRoman();

    String actualAnswer = solution.intToRoman(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"10, X", "20, XX", "30, XXX", "40, XL", "50, L", "60, LX", "70, LXX", "80, LXXX", "90, XC"})
  @DisplayName("Must convert correctly with given input in range of 10 ~ 90")
  void test3(int input, String expectedAnswer) {
    IntegerToRoman solution = new IntegerToRoman();

    String actualAnswer = solution.intToRoman(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"1, I", "2, II", "3, III", "4, IV", "5, V", "6, VI", "7, VII", "8, VIII", "9, IX"})
  @DisplayName("Must convert correctly with given input in range of 1 ~ 9")
  void test4(int input, String expectedAnswer) {
    IntegerToRoman solution = new IntegerToRoman();

    String actualAnswer = solution.intToRoman(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest(name = "Must return \"{1}\" when input is {0}")
  @CsvSource({"1994, MCMXCIV", "58, LVIII", "3999, MMMCMXCIX"})
  @DisplayName("Must convert correctly with given input")
  void test5(int input, String expectedAnswer) {
    IntegerToRoman solution = new IntegerToRoman();

    String actualAnswer = solution.intToRoman(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}