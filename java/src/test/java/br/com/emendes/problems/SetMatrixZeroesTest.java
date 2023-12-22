package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {

  @Test
  void test01() {
    SetMatrixZeroes solution = new SetMatrixZeroes();

    int[][] matrix = {{0}};
    solution.setZeroes(matrix);

    int[] expectedValue = {0};
    Assertions.assertThat(matrix).contains(expectedValue, Index.atIndex(0));
  }

  @Test
  void test02() {
    SetMatrixZeroes solution = new SetMatrixZeroes();

    int[][] matrix = {{0, 1}};
    solution.setZeroes(matrix);

    int[] expectedValue = {0, 0};
    Assertions.assertThat(matrix).contains(expectedValue, Index.atIndex(0));
  }

  @Test
  void test03() {
    SetMatrixZeroes solution = new SetMatrixZeroes();

    int[][] matrix = {{0}, {1}};
    solution.setZeroes(matrix);

    int[] expectedValue = {0};
    Assertions.assertThat(matrix).contains(expectedValue, Index.atIndex(0))
        .contains(expectedValue, Index.atIndex(1));
  }

  @Test
  void test04() {
    SetMatrixZeroes solution = new SetMatrixZeroes();

    int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    solution.setZeroes(matrix);

    int[] expectedFirstRow = {1, 0, 1};
    int[] expectedSecondRow = {0, 0, 0};
    int[] expectedThirdRow = {1, 0, 1};

    Assertions.assertThat(matrix).contains(expectedFirstRow, Index.atIndex(0))
        .contains(expectedSecondRow, Index.atIndex(1))
        .contains(expectedThirdRow, Index.atIndex(2));
  }

  @Test
  void test05() {
    SetMatrixZeroes solution = new SetMatrixZeroes();

    int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    solution.setZeroes(matrix);

    int[] expectedFirstRow = {0, 0, 0, 0};
    int[] expectedSecondRow = {0, 4, 5, 0};
    int[] expectedThirdRow = {0, 3, 1, 0};

    Assertions.assertThat(matrix).contains(expectedFirstRow, Index.atIndex(0))
        .contains(expectedSecondRow, Index.atIndex(1))
        .contains(expectedThirdRow, Index.atIndex(2));
  }

}