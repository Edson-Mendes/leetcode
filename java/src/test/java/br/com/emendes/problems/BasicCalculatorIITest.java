package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasicCalculatorIITest {

  @Test
  void test01() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("2 + 2");

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test02() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("2 - 2");

    assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test03() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("3 * 3");

    assertThat(actualAnswer).isEqualTo(9);
  }

  @Test
  void test04() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("3 / 3");

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test05() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("3+2*2");

    assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test06() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("3/2");

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test07() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate(" 3+5 / 2 ");

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test08() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("5-20");

    assertThat(actualAnswer).isEqualTo(-15);
  }

  @Test
  void test09() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("5-20/4");

    assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test10() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("2*3+4");

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test11() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("222*33+444444");

    assertThat(actualAnswer).isEqualTo(451770);
  }

  @Test
  void test12() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("444444+222*33");

    assertThat(actualAnswer).isEqualTo(451770);
  }

  @Test
  void test13() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("2*3-4");

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test14() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("7*3/4");

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test15() {
    BasicCalculatorII solution = new BasicCalculatorII();
    int actualAnswer = solution.calculate("  12 + 12    * 3/2");

    assertThat(actualAnswer).isEqualTo(30);
  }

}