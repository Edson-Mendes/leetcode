package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LargestNumberTest {

  @Test
  void test01() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {1};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("1");
  }

  @Test
  void test02() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {10, 2};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("210");
  }

  @Test
  void test03() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {3, 30, 34, 5, 9};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("9534330");
  }

  @Test
  void test04() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {3, 31, 34, 5, 9, 2};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("95343312");
  }

  @Test
  void test05() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {5, 550, 5, 5};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("555550");
  }

  @Test
  void test06() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {33, 3331, 3334};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("3334333331");
  }

  @Test
  void test07() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {34323, 3432};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("343234323");
  }

  @Test
  void test08() {
    LargestNumber solution = new LargestNumber();

    int[] nums = {343233, 3432};
    String actualAnswer = solution.largestNumber(nums);

    assertThat(actualAnswer).isNotNull().isEqualTo("3432343233");
  }

}