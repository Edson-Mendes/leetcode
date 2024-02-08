package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GrayCodeTest {

  @Test
  void test01() {
    GrayCode solution = new GrayCode();

    List<Integer> actualAnswer = solution.grayCode(1);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2)
        .containsExactly(0, 1);
  }

  @Test
  void test02() {
    GrayCode solution = new GrayCode();

    List<Integer> actualAnswer = solution.grayCode(2);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(4)
        .containsExactly(0, 1, 3, 2);
  }

  @Test
  void test03() {
    GrayCode solution = new GrayCode();

    List<Integer> actualAnswer = solution.grayCode(3);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(8)
        .containsExactly(0, 1, 3, 2, 6, 7, 5, 4);
  }

  @Test
  void test04() {
    GrayCode solution = new GrayCode();

    List<Integer> actualAnswer = solution.grayCode(4);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(16)
        .containsExactly(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8);
  }

}