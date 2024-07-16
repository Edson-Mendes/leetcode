package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumGapTest {

  @Test
  void test01() {
    MaximumGap solution = new MaximumGap();

    int[] nums = {10};
    int actualAnswer = solution.maximumGap(nums);

    assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test02() {
    MaximumGap solution = new MaximumGap();

    int[] nums = {10, 2};
    int actualAnswer = solution.maximumGap(nums);

    assertThat(actualAnswer).isEqualTo(8);
  }

  @Test
  void test03() {
    MaximumGap solution = new MaximumGap();

    int[] nums = {10, 2};
    int actualAnswer = solution.maximumGap(nums);

    assertThat(actualAnswer).isEqualTo(8);
  }

  @Test
  void test04() {
    MaximumGap solution = new MaximumGap();

    int[] nums = {3, 6, 9, 1};
    int actualAnswer = solution.maximumGap(nums);

    assertThat(actualAnswer).isEqualTo(3);
  }

}