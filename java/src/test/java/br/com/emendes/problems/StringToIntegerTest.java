package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringToIntegerTest {

  @Test
  @DisplayName("Must return 42 when input is \"42\"")
  void test1() {
    StringToInteger solution = new StringToInteger();
    String input = "42";

    int actualAnswer = solution.myAtoi(input);
    int expectedAnswer = 42;

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return -2987 when input is \"-2987\"")
  void test2() {
    StringToInteger solution = new StringToInteger();
    String input = "-2987";

    int actualAnswer = solution.myAtoi(input);
    int expectedAnswer = -2987;

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest
  @ValueSource(strings = {
      "     107", "     +107", "+107due678437", "107deuhid1",
      "   107dhuei", "  +107fiwef9h", "     +0000000000000000107dedgyegd"})
  @DisplayName("Must return 107 when input has leading whilespace and trailing non numbers")
  void test3(String input) {
    StringToInteger solution = new StringToInteger();

    int actualAnswer = solution.myAtoi(input);
    int expectedAnswer = 107;

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest
  @ValueSource(strings = {
      "30000000000000000000", "+3000000000", "  3000000000",
      "30000000000000000000", "  +3000000000000000fwohfiuewhf", "3000000000000000000000000000000fyurewhfuerohf"})
  @DisplayName("Must return 2147483647 when input is bigger than 2147483647")
  void test4(String input) {
    StringToInteger solution = new StringToInteger();

    int actualAnswer = solution.myAtoi(input);
    int expectedAnswer = 2147483647;

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest
  @ValueSource(strings = {
      "-30000000000000000000", "-300000000000", "  -3000000000fwfwe",
      "-3000000000000000000", "  -3000000000000000000deudiediwehd", "    -3000000000dwyeuhdo"})
  @DisplayName("Must return -2147483648 when input is less than -2147483648")
  void test5(String input) {
    StringToInteger solution = new StringToInteger();

    int actualAnswer = solution.myAtoi(input);
    int expectedAnswer = -2147483648;

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest
  @ValueSource(strings = {"    ", " -r345", "f1942", "uwyefg", ""})
  @DisplayName("Must return 0 when input is invalid")
  void test6(String input) {
    StringToInteger solution = new StringToInteger();

    int actualAnswer = solution.myAtoi(input);
    int expectedAnswer = 0;

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}