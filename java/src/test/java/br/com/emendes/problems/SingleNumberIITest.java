package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberIITest {

  @Test
  void test01() {
    SingleNumberII solution = new SingleNumberII();

    int[] nums = {10};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    SingleNumberII solution = new SingleNumberII();

    int[] nums = {8, 10, 8, 8};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test03() {
    SingleNumberII solution = new SingleNumberII();

    int[] nums = {7, 8, 9, 8, 9, 8, 7, 7, 9, 10};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test04() {
    SingleNumberII solution = new SingleNumberII();

    int[] nums = {10, 7, 7, 8, 7, 9, 8, 9, 8, 9};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test05() {
    SingleNumberII solution = new SingleNumberII();

    int[] nums = {7, 7, 8, 7, 9, 10, 8, 9, 8, 9};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

}