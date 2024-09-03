package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HappyNumberTest {

  @Test
  void test01() {
    HappyNumber solution = new HappyNumber();

    boolean actualAnswer = solution.isHappy(1);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    HappyNumber solution = new HappyNumber();

    boolean actualAnswer = solution.isHappy(2);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    HappyNumber solution = new HappyNumber();

    boolean actualAnswer = solution.isHappy(10);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    HappyNumber solution = new HappyNumber();

    boolean actualAnswer = solution.isHappy(19);

    assertThat(actualAnswer).isTrue();
  }

}