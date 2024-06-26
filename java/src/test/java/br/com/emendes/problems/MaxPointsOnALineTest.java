package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxPointsOnALineTest {

  @Test
  void test01() {
    MaxPointsOnALine solution = new MaxPointsOnALine();
    int[][] points = {{1, 1}};
    int actualAnswer = solution.maxPoints(points);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test02() {
    MaxPointsOnALine solution = new MaxPointsOnALine();
    int[][] points = {{1, 1}, {7, 13}};
    int actualAnswer = solution.maxPoints(points);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test03() {
    MaxPointsOnALine solution = new MaxPointsOnALine();
    int[][] points = {{1, 1}, {1, 4}, {1, 7}};
    int actualAnswer = solution.maxPoints(points);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test04() {
    MaxPointsOnALine solution = new MaxPointsOnALine();
    int[][] points = {{1, 1}, {2, 2}, {3, 3}};
    int actualAnswer = solution.maxPoints(points);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test05() {
    MaxPointsOnALine solution = new MaxPointsOnALine();
    int[][] points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
    int actualAnswer = solution.maxPoints(points);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test06() {
    MaxPointsOnALine solution = new MaxPointsOnALine();
    int[][] points = {{0, 1}, {0, 0}, {0, 4}, {0, -2}, {0, -1}, {0, 3}, {0, -4}};
    int actualAnswer = solution.maxPoints(points);

    assertThat(actualAnswer).isEqualTo(7);
  }

}