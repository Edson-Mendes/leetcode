package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {

  @Test
  void test01() {
    SingleNumber solution = new SingleNumber();

    int[] nums = {1};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test02() {
    SingleNumber solution = new SingleNumber();

    int[] nums = {2, 2, 1};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test03() {
    SingleNumber solution = new SingleNumber();

    int[] nums = {4, 1, 2, 1, 2};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test04() {
    SingleNumber solution = new SingleNumber();

    int[] nums = {4, 1, 2, 1, 2};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test05() {
    SingleNumber solution = new SingleNumber();

    int[] nums = {8, 6, 4, 2, 2, 1, 1, 6, 8};
    int actualAnswer = solution.singleNumber(nums);

    assertThat(actualAnswer).isEqualTo(4);
  }

}