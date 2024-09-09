package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumSizeSubarraySumTest {

  @Test
  void test01() {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    int target = 10;
    int[] nums = {10};
    int actualAnswer = solution.minSubArrayLen(target, nums);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    int target = 8;
    int[] nums = {10};
    int actualAnswer = solution.minSubArrayLen(target, nums);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test03() {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    int target = 10;
    int[] nums = {8};
    int actualAnswer = solution.minSubArrayLen(target, nums);

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test04() {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    int target = 7;
    int[] nums = {2, 3, 1, 2, 4, 3};
    int actualAnswer = solution.minSubArrayLen(target, nums);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test05() {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    int target = 4;
    int[] nums = {1, 4, 4};
    int actualAnswer = solution.minSubArrayLen(target, nums);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test06() {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    int target = 11;
    int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
    int actualAnswer = solution.minSubArrayLen(target, nums);

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test07() {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    int target = 11;
    int[] nums = {12, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5};
    int actualAnswer = solution.minSubArrayLen(target, nums);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

}