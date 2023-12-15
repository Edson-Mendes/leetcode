package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SqrtXTest {

  @Test
  void test01() {
    SqrtX solution = new SqrtX();

    int actualAnswer = solution.mySqrt(0);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    SqrtX solution = new SqrtX();

    int actualAnswer = solution.mySqrt(1);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test03() {
    SqrtX solution = new SqrtX();

    int actualAnswer = solution.mySqrt(4);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    SqrtX solution = new SqrtX();

    int actualAnswer = solution.mySqrt(577_820);

    Assertions.assertThat(actualAnswer).isEqualTo(760);
  }

  @Test
  void test05() {
    SqrtX solution = new SqrtX();

    int actualAnswer = solution.mySqrt(2_147_483_647);

    Assertions.assertThat(actualAnswer).isEqualTo(46_340);
  }

}