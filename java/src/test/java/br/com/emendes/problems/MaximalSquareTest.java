package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximalSquareTest {

  @Test
  void test01() {
    MaximalSquare solution = new MaximalSquare();

    char[][] matrix = {{'1'}};
    int actualAnswer = solution.maximalSquare(matrix);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    MaximalSquare solution = new MaximalSquare();

    char[][] matrix = {{'0'}};
    int actualAnswer = solution.maximalSquare(matrix);

    assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test03() {
    MaximalSquare solution = new MaximalSquare();

    char[][] matrix = {{'0', '1'}, {'1', '0'}};
    int actualAnswer = solution.maximalSquare(matrix);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test04() {
    MaximalSquare solution = new MaximalSquare();

    char[][] matrix = {{'1', '1'}, {'1', '1'}};
    int actualAnswer = solution.maximalSquare(matrix);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test05() {
    MaximalSquare solution = new MaximalSquare();

    char[][] matrix = {{'1', '1'}, {'0', '1'}};
    int actualAnswer = solution.maximalSquare(matrix);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test06() {
    MaximalSquare solution = new MaximalSquare();

    char[][] matrix = {
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}
    };
    int actualAnswer = solution.maximalSquare(matrix);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test07() {
    MaximalSquare solution = new MaximalSquare();

    char[][] matrix = {
        {'1', '1', '1', '1', '1', '1', '1', '1'},
        {'1', '1', '1', '1', '1', '1', '1', '0'},
        {'1', '1', '1', '1', '1', '1', '1', '0'},
        {'1', '1', '1', '1', '1', '0', '0', '0'},
        {'0', '1', '1', '1', '1', '0', '0', '0'}
    };
    int actualAnswer = solution.maximalSquare(matrix);

    assertThat(actualAnswer).isEqualTo(16);
  }

}