package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMinimumInRotatedSortedArrayTest {

  @Test
  void test01() {
    FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    int[] nums = {10};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    int[] nums = {10, 2};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test03() {
    FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    int[] nums = {2, 10};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    int[] nums = {3, 4, 5, 1, 2};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test05() {
    FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test06() {
    FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    int[] nums = {11, 13, 15, 17};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(11);
  }

}