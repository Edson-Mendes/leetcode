package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MajorityElementIITest {

  @Test
  void test01() {
    MajorityElementII solution = new MajorityElementII();
    int[] nums = {1};
    List<Integer> actualAnswer = solution.majorityElement(nums);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains(1);
  }

  @Test
  void test02() {
    MajorityElementII solution = new MajorityElementII();
    int[] nums = {3, 2, 3};
    List<Integer> actualAnswer = solution.majorityElement(nums);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains(3);
  }

  @Test
  void test03() {
    MajorityElementII solution = new MajorityElementII();
    int[] nums = {1, 2};
    List<Integer> actualAnswer = solution.majorityElement(nums);

    assertThat(actualAnswer).isNotNull().hasSize(2).contains(1, 2);
  }

  @Test
  void test04() {
    MajorityElementII solution = new MajorityElementII();
    int[] nums = {3, 2, 1, 3, 2, 3};
    List<Integer> actualAnswer = solution.majorityElement(nums);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains(3);
  }

  @Test
  void test05() {
    MajorityElementII solution = new MajorityElementII();
    int[] nums = {1, 2, 3, 4, 5};
    List<Integer> actualAnswer = solution.majorityElement(nums);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

}