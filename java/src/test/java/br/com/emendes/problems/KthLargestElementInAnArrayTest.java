package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthLargestElementInAnArrayTest {

  @Test
  void test01() {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    int[] nums = {10};
    int k = 1;
    int actualKthLargest = solution.findKthLargest(nums, k);

    assertThat(actualKthLargest).isEqualTo(10);
  }

  @Test
  void test02() {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 1;
    int actualKthLargest = solution.findKthLargest(nums, k);

    assertThat(actualKthLargest).isEqualTo(6);
  }

  @Test
  void test03() {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 2;
    int actualKthLargest = solution.findKthLargest(nums, k);

    assertThat(actualKthLargest).isEqualTo(5);
  }

  @Test
  void test04() {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 6;
    int actualKthLargest = solution.findKthLargest(nums, k);

    assertThat(actualKthLargest).isEqualTo(1);
  }

  @Test
  void test05() {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    int k = 1;
    int actualKthLargest = solution.findKthLargest(nums, k);

    assertThat(actualKthLargest).isEqualTo(6);
  }

  @Test
  void test06() {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    int k = 2;
    int actualKthLargest = solution.findKthLargest(nums, k);

    assertThat(actualKthLargest).isEqualTo(5);
  }

  @Test
  void test07() {
    KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    int k = 3;
    int actualKthLargest = solution.findKthLargest(nums, k);

    assertThat(actualKthLargest).isEqualTo(5);
  }

}