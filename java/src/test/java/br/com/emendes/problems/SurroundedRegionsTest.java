package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SurroundedRegionsTest {

  @Test
  void test01() {
    SurroundedRegions solution = new SurroundedRegions();

    char[][] board = {
        {'X'}
    };
    char[][] expectedBoard = {
        {'X'}
    };
    solution.solve(board);

    Assertions.assertThat(board).isDeepEqualTo(expectedBoard);
  }

  @Test
  void test02() {
    SurroundedRegions solution = new SurroundedRegions();

    char[][] board = {
        {'O'}
    };
    char[][] expectedBoard = {
        {'O'}
    };
    solution.solve(board);

    Assertions.assertThat(board).isDeepEqualTo(expectedBoard);
  }

  @Test
  void test03() {
    SurroundedRegions solution = new SurroundedRegions();

    char[][] board = {
        {'X', 'O'},
        {'X', 'O'}
    };
    char[][] expectedBoard = {
        {'X', 'O'},
        {'X', 'O'}
    };
    solution.solve(board);

    Assertions.assertThat(board).isDeepEqualTo(expectedBoard);
  }

  @Test
  void test04() {
    SurroundedRegions solution = new SurroundedRegions();

    char[][] board = {
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'O', 'X'},
        {'X', 'X', 'O', 'X'},
        {'X', 'O', 'X', 'X'}
    };
    char[][] expectedBoard = {
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'X', 'X', 'X'},
        {'X', 'O', 'X', 'X'}
    };
    solution.solve(board);

    Assertions.assertThat(board).isDeepEqualTo(expectedBoard);
  }

}