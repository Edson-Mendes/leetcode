package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberIITest {

  @Test
  void test01() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {10};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {10, 8};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test03() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {8, 10};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test04() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {2, 3, 2};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test05() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {1, 2, 3, 1};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test06() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {1, 2, 3};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test07() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {2, 5, 1, 0, 3, 4, 2, 0, 3};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(13);
  }

  @Test
  void test08() {
    HouseRobberII solution = new HouseRobberII();

    int[] nums = {5, 5, 1, 0, 3, 4, 2, 0, 3};
    int actualAnswer = solution.rob(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(13);
  }

}