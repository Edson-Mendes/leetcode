package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfIslandsTest {

  @Test
  void test01() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {{'1'}};
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {{'0'}};
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test03() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {{'0', '0', '1', '0'}};
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test04() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {{'0', '0', '0', '0'}};
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test05() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {{'0', '1'}, {'1', '0'}};
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test06() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {{'0', '1'}, {'1', '1'}};
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test07() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    };
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test08() {
    NumberOfIslands solution = new NumberOfIslands();

    char[][] grid = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    int actualAnswer = solution.numIslands(grid);

    assertThat(actualAnswer).isEqualTo(3);
  }

}