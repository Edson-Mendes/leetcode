package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

  @Test
  void test01() {
    MergeSortedArray solution = new MergeSortedArray();
    int[] nums1 = new int[0];
    int m = 0;
    int[] nums2 = new int[0];
    int n = 0;

    solution.merge(nums1, m, nums2, n);

    Assertions.assertThat(nums1).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    MergeSortedArray solution = new MergeSortedArray();
    int[] nums1 = {1, 2, 3, 4, 5};
    int m = 5;
    int[] nums2 = new int[0];
    int n = 0;

    solution.merge(nums1, m, nums2, n);

    Assertions.assertThat(nums1).isNotNull().hasSize(5).containsSequence(1, 2, 3, 4, 5);
  }

  @Test
  void test03() {
    MergeSortedArray solution = new MergeSortedArray();
    int[] nums1 = {0, 0, 0, 0, 0};
    int m = 0;
    int[] nums2 = {1, 2, 3, 4, 5};
    int n = 5;

    solution.merge(nums1, m, nums2, n);

    Assertions.assertThat(nums1).isNotNull().hasSize(5).containsSequence(1, 2, 3, 4, 5);
  }

  @Test
  void test04() {
    MergeSortedArray solution = new MergeSortedArray();
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;

    solution.merge(nums1, m, nums2, n);

    Assertions.assertThat(nums1).isNotNull().hasSize(6).containsSequence(1, 2, 2, 3, 5, 6);
  }

  @Test
  void test05() {
    MergeSortedArray solution = new MergeSortedArray();
    int[] nums1 = {1, 3, 5, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 4, 6};
    int n = 3;

    solution.merge(nums1, m, nums2, n);

    Assertions.assertThat(nums1).isNotNull().hasSize(6).containsSequence(1, 2, 3, 4, 5, 6);
  }

}