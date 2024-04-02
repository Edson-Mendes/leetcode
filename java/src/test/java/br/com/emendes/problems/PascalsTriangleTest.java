package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PascalsTriangleTest {

  @Test
  void test01() {
    PascalsTriangle solution = new PascalsTriangle();

    List<List<Integer>> actualAnswer = solution.generate(1);

    assertThat(actualAnswer).isNotNull().hasSize(1).containsExactly(List.of(1));
  }

  @Test
  void test02() {
    PascalsTriangle solution = new PascalsTriangle();

    List<List<Integer>> actualAnswer = solution.generate(2);

    assertThat(actualAnswer).isNotNull().hasSize(2)
        .containsExactly(List.of(1), List.of(1, 1));
  }

  @Test
  void test03() {
    PascalsTriangle solution = new PascalsTriangle();

    List<List<Integer>> actualAnswer = solution.generate(3);

    assertThat(actualAnswer).isNotNull().hasSize(3)
        .containsExactly(List.of(1), List.of(1, 1), List.of(1, 2, 1));
  }

  @Test
  void test04() {
    PascalsTriangle solution = new PascalsTriangle();

    List<List<Integer>> actualAnswer = solution.generate(4);

    assertThat(actualAnswer).isNotNull().hasSize(4)
        .containsExactly(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1));
  }

  @Test
  void test05() {
    PascalsTriangle solution = new PascalsTriangle();

    List<List<Integer>> actualAnswer = solution.generate(5);

    assertThat(actualAnswer).isNotNull().hasSize(5)
        .containsExactly(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));
  }

}