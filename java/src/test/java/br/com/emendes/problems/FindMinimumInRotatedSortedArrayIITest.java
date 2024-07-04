package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMinimumInRotatedSortedArrayIITest {

  @Test
  void test01() {
    FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    int[] nums = {10};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    int[] nums = {10, 2};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test03() {
    FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    int[] nums = {2, 10};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    int[] nums = {2, 2};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test05() {
    FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    int[] nums = {2, 2};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test06() {
    FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    int[] nums = {1, 3, 5};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test07() {
    FindMinimumInRotatedSortedArrayII solution = new FindMinimumInRotatedSortedArrayII();

    int[] nums = {2, 2, 2, 0, 1};
    int actualAnswer = solution.findMin(nums);

    assertThat(actualAnswer).isEqualTo(0);
  }

}