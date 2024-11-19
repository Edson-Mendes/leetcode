package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstMissingPositiveTest {

  @Test
  void test01() {
    FirstMissingPositive solution = new FirstMissingPositive();

    int[] nums = {1};
    int actualAnswer = solution.firstMissingPositive(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test02() {
    FirstMissingPositive solution = new FirstMissingPositive();

    int[] nums = {-10};
    int actualAnswer = solution.firstMissingPositive(nums);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test03() {
    FirstMissingPositive solution = new FirstMissingPositive();

    int[] nums = {1, 2, 0};
    int actualAnswer = solution.firstMissingPositive(nums);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test04() {
    FirstMissingPositive solution = new FirstMissingPositive();

    int[] nums = {3, 4, -1, 1};
    int actualAnswer = solution.firstMissingPositive(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test05() {
    FirstMissingPositive solution = new FirstMissingPositive();

    int[] nums = {7, 8, 9, 11, 12};
    int actualAnswer = solution.firstMissingPositive(nums);

    assertThat(actualAnswer).isEqualTo(1);
  }

}