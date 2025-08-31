package br.com.emendes.problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfDigitOneTest {

  @Test
  void test01() {
    NumberOfDigitOne solution = new NumberOfDigitOne();
    int actualAnswer = solution.countDigitOne(0);

    assertThat(actualAnswer).isZero();
  }

  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
  void test02(int input) {
    NumberOfDigitOne solution = new NumberOfDigitOne();
    int actualAnswer = solution.countDigitOne(input);

    assertThat(actualAnswer).isOne();
  }

  @ParameterizedTest
  @CsvSource(value = {"10,2", "11,4", "12,5", "13,6", "8192,3533","99,20", "999,300", "9999,4000", "99999,50000"})
  void test03(int input, int output) {
    NumberOfDigitOne solution = new NumberOfDigitOne();
    int actualAnswer = solution.countDigitOne(input);

    assertThat(actualAnswer).isEqualTo(output);
  }

  @Test
  void test04() {
    NumberOfDigitOne solution = new NumberOfDigitOne();
    int actualAnswer = solution.countDigitOne(123_456_789);

    assertThat(actualAnswer).isEqualTo(130_589_849);
  }

  @Test
  void test05() {
    NumberOfDigitOne solution = new NumberOfDigitOne();
    int actualAnswer = solution.countDigitOne(376_872_346);

    assertThat(actualAnswer).isEqualTo(404_139_775);
  }

}