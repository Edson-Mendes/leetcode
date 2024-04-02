package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PascalsTriangleIITest {

  @Test
  void test01() {
    PascalsTriangleII solution = new PascalsTriangleII();

    List<Integer> actualAnswer = solution.getRow(0);

    assertThat(actualAnswer).isNotNull().hasSize(1)
        .containsExactly(1);
  }

  @Test
  void test02() {
    PascalsTriangleII solution = new PascalsTriangleII();

    List<Integer> actualAnswer = solution.getRow(1);

    assertThat(actualAnswer).isNotNull().hasSize(2)
        .containsExactly(1, 1);
  }

  @Test
  void test03() {
    PascalsTriangleII solution = new PascalsTriangleII();

    List<Integer> actualAnswer = solution.getRow(2);

    assertThat(actualAnswer).isNotNull().hasSize(3)
        .containsExactly(1, 2, 1);
  }

  @Test
  void test04() {
    PascalsTriangleII solution = new PascalsTriangleII();

    List<Integer> actualAnswer = solution.getRow(3);

    assertThat(actualAnswer).isNotNull().hasSize(4)
        .containsExactly(1, 3, 3, 1);
  }

  @Test
  void test05() {
    PascalsTriangleII solution = new PascalsTriangleII();

    List<Integer> actualAnswer = solution.getRow(4);

    assertThat(actualAnswer).isNotNull().hasSize(5)
        .containsExactly(1, 4, 6, 4, 1);
  }

}