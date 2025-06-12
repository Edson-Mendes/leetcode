package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SlidingWindowMaximumTest {

  @Test
  void test01() {
    SlidingWindowMaximum solution = new SlidingWindowMaximum();
    int[] nums = {1};
    int[] actualAnswer = solution.maxSlidingWindow(nums, 1);

    assertThat(actualAnswer).isNotNull().containsExactly(1);
  }

  @Test
  void test02() {
    SlidingWindowMaximum solution = new SlidingWindowMaximum();
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int[] actualAnswer = solution.maxSlidingWindow(nums, 3);

    assertThat(actualAnswer).isNotNull().containsExactly(3, 3, 5, 5, 6, 7);
  }

  @Test
  void test03() {
    SlidingWindowMaximum solution = new SlidingWindowMaximum();
    int[] nums = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
    int[] actualAnswer = solution.maxSlidingWindow(nums, 3);

    assertThat(actualAnswer).isNotNull().containsExactly(1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4);
  }

  @Test
  void test04() {
    SlidingWindowMaximum solution = new SlidingWindowMaximum();
    int[] nums = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
    int[] actualAnswer = solution.maxSlidingWindow(nums, 16);

    assertThat(actualAnswer).isNotNull().containsExactly(4);
  }

}