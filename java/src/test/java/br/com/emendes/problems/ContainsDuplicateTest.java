package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

  @Test
  void test01() {
    ContainsDuplicate solution = new ContainsDuplicate();

    int[] nums = {10};
    boolean actualAnswer = solution.containsDuplicate(nums);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test02() {
    ContainsDuplicate solution = new ContainsDuplicate();

    int[] nums = {10, 10};
    boolean actualAnswer = solution.containsDuplicate(nums);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test03() {
    ContainsDuplicate solution = new ContainsDuplicate();

    int[] nums = {1, 2, 3, 4};
    boolean actualAnswer = solution.containsDuplicate(nums);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    ContainsDuplicate solution = new ContainsDuplicate();

    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    boolean actualAnswer = solution.containsDuplicate(nums);

    assertThat(actualAnswer).isTrue();
  }

}