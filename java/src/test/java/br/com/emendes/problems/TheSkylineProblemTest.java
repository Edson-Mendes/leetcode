package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TheSkylineProblemTest {

  @Test
  void test01() {
    TheSkylineProblem solution = new TheSkylineProblem();

    int[][] buildings = {
        {1, 5, 11}
    };
    List<List<Integer>> actualAnswer = solution.getSkyline(buildings);

    assertThat(actualAnswer).isNotNull()
        .hasSize(2)
        .containsExactly(List.of(1, 11), List.of(5, 0));
  }

  @Test
  void test02() {
    TheSkylineProblem solution = new TheSkylineProblem();

    int[][] buildings = {
        {1, 5, 11},
        {1, 5, 20}
    };
    List<List<Integer>> actualAnswer = solution.getSkyline(buildings);

    assertThat(actualAnswer).isNotNull()
        .hasSize(2)
        .containsExactly(List.of(1, 20), List.of(5, 0));
  }

  @Test
  void test03() {
    TheSkylineProblem solution = new TheSkylineProblem();

    int[][] buildings = {
        {1, 5, 20},
        {1, 5, 11}
    };
    List<List<Integer>> actualAnswer = solution.getSkyline(buildings);

    assertThat(actualAnswer).isNotNull()
        .hasSize(2)
        .containsExactly(List.of(1, 20), List.of(5, 0));
  }

  @Test
  void test04() {
    TheSkylineProblem solution = new TheSkylineProblem();

    int[][] buildings = {
        {1, 5, 11},
        {2, 7, 7},
        {3, 9, 13},
        {12, 16, 7},
        {14, 25, 3},
    };
    List<List<Integer>> actualAnswer = solution.getSkyline(buildings);

    assertThat(actualAnswer).isNotNull()
        .hasSize(6)
        .containsExactly(List.of(1, 11), List.of(3, 13), List.of(9, 0), List.of(12, 7), List.of(16, 3), List.of(25, 0));
  }

  @Test
  void test05() {
    TheSkylineProblem solution = new TheSkylineProblem();

    int[][] buildings = {
        {2, 9, 10},
        {3, 7, 15},
        {5, 12, 12},
        {15, 20, 10},
        {19, 24, 8},
    };
    List<List<Integer>> actualAnswer = solution.getSkyline(buildings);

    assertThat(actualAnswer).isNotNull()
        .hasSize(7)
        .containsExactly(List.of(2, 10), List.of(3, 15), List.of(7, 12), List.of(12, 0), List.of(15, 10), List.of(20, 8), List.of(24, 0));
  }

  @Test
  void test06() {
    TheSkylineProblem solution = new TheSkylineProblem();

    int[][] buildings = {
        {2, 9, 10},
        {7, 15, 10}
    };
    List<List<Integer>> actualAnswer = solution.getSkyline(buildings);

    assertThat(actualAnswer).isNotNull()
        .hasSize(2)
        .containsExactly(List.of(2, 10), List.of(15, 0));
  }

}