package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsIITest {

  @Test
  void test01() {
    UniquePathsII solution = new UniquePathsII();

    int[][] obstacleGrid = {{0, 0, 0, 1, 0, 0}};
    int actualAnswer = solution.uniquePathsWithObstacles(obstacleGrid);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    UniquePathsII solution = new UniquePathsII();

    int[][] obstacleGrid = {{0}, {0}, {0}, {1}, {0}, {0}};
    int actualAnswer = solution.uniquePathsWithObstacles(obstacleGrid);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test03() {
    UniquePathsII solution = new UniquePathsII();

    int[][] obstacleGrid = {{0, 0, 0, 0, 0, 0}};
    int actualAnswer = solution.uniquePathsWithObstacles(obstacleGrid);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test04() {
    UniquePathsII solution = new UniquePathsII();

    int[][] obstacleGrid = {{0}, {0}, {0}, {0}, {0}, {0}};
    int actualAnswer = solution.uniquePathsWithObstacles(obstacleGrid);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test05() {
    UniquePathsII solution = new UniquePathsII();

    int[][] obstacleGrid = {{0, 1}, {0, 0}};
    int actualAnswer = solution.uniquePathsWithObstacles(obstacleGrid);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test06() {
    UniquePathsII solution = new UniquePathsII();

    int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    int actualAnswer = solution.uniquePathsWithObstacles(obstacleGrid);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

}