package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MajorityElementTest {

  @Test
  void test01() {
    MajorityElement solution = new MajorityElement();
    int[] nums = {10};
    int actualAnswer = solution.majorityElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    MajorityElement solution = new MajorityElement();
    int[] nums = {3, 2, 3};
    int actualAnswer = solution.majorityElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test03() {
    MajorityElement solution = new MajorityElement();
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    int actualAnswer = solution.majorityElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    MajorityElement solution = new MajorityElement();
    int[] nums = {2, 2, 1, 1, 1, 2, 2, 3, 3, 2, 2, 2};
    int actualAnswer = solution.majorityElement(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

}