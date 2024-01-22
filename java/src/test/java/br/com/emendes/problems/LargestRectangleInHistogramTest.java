package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestRectangleInHistogramTest {

  @Test
  void test01() {
    LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    int[] height = {0};
    int actualAnswer = solution.largestRectangleArea(height);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    int[] height = {5};
    int actualAnswer = solution.largestRectangleArea(height);

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test03() {
    LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    int[] height = {2, 1, 5, 6, 2, 3};
    int actualAnswer = solution.largestRectangleArea(height);

    Assertions.assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test04() {
    LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    int[] height = {2, 4};
    int actualAnswer = solution.largestRectangleArea(height);

    Assertions.assertThat(actualAnswer).isEqualTo(4);
  }

}