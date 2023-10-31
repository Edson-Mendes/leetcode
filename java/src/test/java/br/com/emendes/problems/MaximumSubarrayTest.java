package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumSubarrayTest {

  @Test
  void test01() {
    MaximumSubarray solution = new MaximumSubarray();
    int[] nums = {5};

    int actualAnswer = solution.maxSubArray(nums);

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test02() {
    MaximumSubarray solution = new MaximumSubarray();
    int[] nums = {5, -4};

    int actualAnswer = solution.maxSubArray(nums);

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test03() {
    MaximumSubarray solution = new MaximumSubarray();
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    int actualAnswer = solution.maxSubArray(nums);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test04() {
    MaximumSubarray solution = new MaximumSubarray();
    int[] nums = {5, 4, -1, 7, 8};

    int actualAnswer = solution.maxSubArray(nums);

    assertThat(actualAnswer).isEqualTo(23);
  }

  @Test
  void test05() {
    MaximumSubarray solution = new MaximumSubarray();
    int[] nums = {-2, -1};

    int actualAnswer = solution.maxSubArray(nums);

    assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test06() {
    MaximumSubarray solution = new MaximumSubarray();
    int[] nums = {-5, -2, -1, -3, -4};

    int actualAnswer = solution.maxSubArray(nums);

    assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test07() {
    MaximumSubarray solution = new MaximumSubarray();
    int[] nums = {1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4};

    int actualAnswer = solution.maxSubArray(nums);

    assertThat(actualAnswer).isEqualTo(6);
  }

}