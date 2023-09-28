package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NQueensTest {

  @Test
  void test01() {
    NQueens solution = new NQueens();

    List<List<String>> actualAnswer = solution.solveNQueens(1);

    Assertions.assertThat(actualAnswer).hasSize(1).contains(List.of("Q"));
  }

  @Test
  void test02() {
    NQueens solution = new NQueens();

    List<List<String>> actualAnswer = solution.solveNQueens(2);

    Assertions.assertThat(actualAnswer).isEmpty();
  }

  @Test
  void test03() {
    NQueens solution = new NQueens();

    List<List<String>> actualAnswer = solution.solveNQueens(3);

    Assertions.assertThat(actualAnswer).isEmpty();
  }

  @Test
  void test04() {
    NQueens solution = new NQueens();

    List<List<String>> actualAnswer = solution.solveNQueens(4);

    Assertions.assertThat(actualAnswer).hasSize(2)
        .contains(List.of(".Q..", "...Q", "Q...", "..Q."), List.of("..Q.", "Q...", "...Q", ".Q.."));
  }

}