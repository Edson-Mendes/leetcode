package br.com.emendes.problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumProductSubarrayTest {

  @ParameterizedTest
  @ValueSource(ints = {10, 0, -10})
  void test01(int value) {
    MaximumProductSubarray solution = new MaximumProductSubarray();

    int[] nums = {value};
    int actualAnswer = solution.maxProduct(nums);

    assertThat(actualAnswer).isEqualTo(value);
  }

  @Test
  void test02() {
    MaximumProductSubarray solution = new MaximumProductSubarray();

    int[] nums = {2, -2};
    int actualAnswer = solution.maxProduct(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test03() {
    MaximumProductSubarray solution = new MaximumProductSubarray();

    int[] nums = {-2, 2};
    int actualAnswer = solution.maxProduct(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    MaximumProductSubarray solution = new MaximumProductSubarray();

    int[] nums = {2, 3, -2, 4};
    int actualAnswer = solution.maxProduct(nums);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test05() {
    MaximumProductSubarray solution = new MaximumProductSubarray();

    int[] nums = {-2, 0, -1};
    int actualAnswer = solution.maxProduct(nums);

    assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test06() {
    MaximumProductSubarray solution = new MaximumProductSubarray();

    int[] nums = {0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0};
    int actualAnswer = solution.maxProduct(nums);

    assertThat(actualAnswer).isEqualTo(1_000_000_000);
  }

}