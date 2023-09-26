package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Locale;

class PowXNTest {

  @BeforeAll
  static void setUp() {
    Locale.setDefault(Locale.US);
  }

  @Test
  void test01() {
    PowXN solution = new PowXN();

    double base = 10;
    int exponent = 0;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("1.00000");
  }

  @Test
  void test02() {
    PowXN solution = new PowXN();

    double base = 0;
    int exponent = 3;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("0.00000");
  }

  @Test
  void test03() {
    PowXN solution = new PowXN();

    double base = 2.00000;
    int exponent = 10;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("1024.00000");
  }

  @Test
  void test04() {
    PowXN solution = new PowXN();

    double base = 2.10000;
    int exponent = 3;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("9.26100");
  }

  @Test
  void test05() {
    PowXN solution = new PowXN();

    double base = 2.00000;
    int exponent = -2;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("0.25000");
  }

  @Test
  void test06() {
    PowXN solution = new PowXN();

    double base = 2.00000;
    int exponent = -2147483648;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("0.00000");
  }

  @Test
  void test07() {
    PowXN solution = new PowXN();

    double base = 8.95371;
    int exponent = -1;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("0.11169");
  }

  @Test
  void test08() {
    PowXN solution = new PowXN();

    double base = -1.00000;
    int exponent = -2147483648;
    double actualAnswer = solution.myPow(base, exponent);

    Assertions.assertThat(String.format("%.5f", actualAnswer)).isEqualTo("1.00000");
  }

}