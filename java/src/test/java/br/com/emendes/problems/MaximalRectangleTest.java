package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximalRectangleTest {

  @Test
  void test01() {
    MaximalRectangle solution = new MaximalRectangle();
    char[][] matrix = {{'0'}};
    int actualAnswer = solution.maximalRectangle(matrix);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    MaximalRectangle solution = new MaximalRectangle();
    char[][] matrix = {{'1'}};
    int actualAnswer = solution.maximalRectangle(matrix);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test03() {
    MaximalRectangle solution = new MaximalRectangle();
    char[][] matrix = {
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'},
    };
    int actualAnswer = solution.maximalRectangle(matrix);

    Assertions.assertThat(actualAnswer).isEqualTo(6);
  }

}