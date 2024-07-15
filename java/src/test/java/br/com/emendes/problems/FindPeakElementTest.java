package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPeakElementTest {

  @Test
  void test01() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {10};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test02() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {10, 2};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test03() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {2, 10};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test04() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {10, 8, 6};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test05() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {8, 10, 6};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test06() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {8, 9, 10};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test07() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {1, 2, 3, 1};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test08() {
    FindPeakElement solution = new FindPeakElement();

    int[] nums = {1, 2, 1, 3, 5, 6, 4};
    int actualAnswer = solution.findPeakElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

}