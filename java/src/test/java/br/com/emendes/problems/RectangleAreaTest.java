package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleAreaTest {

  @Test
  void test01() {
    RectangleArea solution = new RectangleArea();
    int actualAnswer = solution.computeArea(3, 4, 8, 8, 9, 1, 12, 3);

    assertThat(actualAnswer).isEqualTo(26);
  }

  @Test
  void test02() {
    RectangleArea solution = new RectangleArea();
    int actualAnswer = solution.computeArea(9, 1, 12, 3, 3, 4, 8, 8);

    assertThat(actualAnswer).isEqualTo(26);
  }

  @Test
  void test03() {
    RectangleArea solution = new RectangleArea();
    int actualAnswer = solution.computeArea(3, 4, 8, 8, 4, 5, 7, 7);

    assertThat(actualAnswer).isEqualTo(20);
  }

  @Test
  void test04() {
    RectangleArea solution = new RectangleArea();
    int actualAnswer = solution.computeArea(4, 5, 7, 7, 3, 4, 8, 8);

    assertThat(actualAnswer).isEqualTo(20);
  }

  @Test
  void test05() {
    RectangleArea solution = new RectangleArea();
    int actualAnswer = solution.computeArea(3, 4, 8, 8, 7, 3, 12, 6);

    assertThat(actualAnswer).isEqualTo(33);
  }

}