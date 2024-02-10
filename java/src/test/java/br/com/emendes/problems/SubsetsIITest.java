package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SubsetsIITest {

  @Test
  void test01() {
    SubsetsII solution = new SubsetsII();
    int[] nums = {1};

    List<List<Integer>> actualAnswer = solution.subsetsWithDup(nums);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2).contains(List.of(), List.of(1));
  }

  @Test
  void test02() {
    SubsetsII solution = new SubsetsII();
    int[] nums = {1, 1};

    List<List<Integer>> actualAnswer = solution.subsetsWithDup(nums);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(3)
        .contains(List.of(), List.of(1), List.of(1, 1));
  }

  @Test
  void test03() {
    SubsetsII solution = new SubsetsII();
    int[] nums = {1, 1, 1};

    List<List<Integer>> actualAnswer = solution.subsetsWithDup(nums);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(4)
        .contains(List.of(), List.of(1), List.of(1, 1), List.of(1, 1, 1));
  }

  @Test
  void test04() {
    SubsetsII solution = new SubsetsII();
    int[] nums = {1, 2, 2};

    List<List<Integer>> actualAnswer = solution.subsetsWithDup(nums);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(6)
        .contains(List.of(), List.of(1), List.of(1, 2), List.of(1, 2, 2), List.of(2), List.of(2, 2));
  }

  @Test
  void test05() {
    SubsetsII solution = new SubsetsII();
    int[] nums = {4, 4, 4, 1, 4};

    List<List<Integer>> actualAnswer = solution.subsetsWithDup(nums);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(10)
        .contains(List.of(), List.of(1), List.of(1, 4), List.of(1, 4, 4), List.of(1, 4, 4, 4), List.of(1, 4, 4, 4, 4),
            List.of(4), List.of(4, 4), List.of(4, 4, 4), List.of(4, 4, 4, 4));
  }

}