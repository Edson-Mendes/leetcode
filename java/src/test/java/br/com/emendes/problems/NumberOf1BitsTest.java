package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOf1BitsTest {

  @Test
  void test01() {
    NumberOf1Bits solution = new NumberOf1Bits();

    int actualAnswer = solution.hammingWeight(1);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    NumberOf1Bits solution = new NumberOf1Bits();

    int actualAnswer = solution.hammingWeight(2);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test03() {
    NumberOf1Bits solution = new NumberOf1Bits();

    int actualAnswer = solution.hammingWeight(11);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test04() {
    NumberOf1Bits solution = new NumberOf1Bits();

    int actualAnswer = solution.hammingWeight(128);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test05() {
    NumberOf1Bits solution = new NumberOf1Bits();

    int actualAnswer = solution.hammingWeight(2147483645);

    assertThat(actualAnswer).isEqualTo(30);
  }

}