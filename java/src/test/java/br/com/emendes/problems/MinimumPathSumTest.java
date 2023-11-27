package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumPathSumTest {

  @Test
  void test01() {
    MinimumPathSum solution = new MinimumPathSum();

    int[][] grid = {{1, 3, 1, 0, 5}};
    int actualAnswer = solution.minPathSum(grid);

    Assertions.assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    MinimumPathSum solution = new MinimumPathSum();

    int[][] grid = {{1}, {3}, {1}, {0}, {5}};
    int actualAnswer = solution.minPathSum(grid);

    Assertions.assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test03() {
    MinimumPathSum solution = new MinimumPathSum();

    int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
    int actualAnswer = solution.minPathSum(grid);

    Assertions.assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test04() {
    MinimumPathSum solution = new MinimumPathSum();

    int[][] grid = {{1, 2, 3}, {4, 5, 6}};
    int actualAnswer = solution.minPathSum(grid);

    Assertions.assertThat(actualAnswer).isEqualTo(12);
  }

}