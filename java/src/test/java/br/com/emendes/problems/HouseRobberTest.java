package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HouseRobberTest {

  @Test
  void test01() {
    HouseRobber solution = new HouseRobber();

    int[] nums = {10};
    int actualAnswer = solution.rob(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    HouseRobber solution = new HouseRobber();

    int[] nums = {10, 10};
    int actualAnswer = solution.rob(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test03() {
    HouseRobber solution = new HouseRobber();

    int[] nums = {10, 8};
    int actualAnswer = solution.rob(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test04() {
    HouseRobber solution = new HouseRobber();

    int[] nums = {8, 10};
    int actualAnswer = solution.rob(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test05() {
    HouseRobber solution = new HouseRobber();

    int[] nums = {1, 2, 3, 1};
    int actualAnswer = solution.rob(nums);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test06() {
    HouseRobber solution = new HouseRobber();

    int[] nums = {2, 7, 9, 3, 1};
    int actualAnswer = solution.rob(nums);

    assertThat(actualAnswer).isEqualTo(12);
  }

  @Test
  void test07() {
    HouseRobber solution = new HouseRobber();

    int[] nums = {10, 1, 0, 10, 2, 10, 10};
    int actualAnswer = solution.rob(nums);

    assertThat(actualAnswer).isEqualTo(30);
  }

}