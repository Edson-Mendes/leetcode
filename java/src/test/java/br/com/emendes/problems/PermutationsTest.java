package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PermutationsTest {

  @Test
  @DisplayName("must return list with 1 elements when input is [1]")
  void test1() {
    Permutations solution = new Permutations();

    int[] nums = {1};
    List<List<Integer>> actualAnswer = solution.permute(nums);

    Assertions.assertThat(actualAnswer).hasSize(1);
  }

  @Test
  @DisplayName("must return list with 2 elements when input is [1,2]")
  void test2() {
    Permutations solution = new Permutations();

    int[] nums = {1,2};
    List<List<Integer>> actualAnswer = solution.permute(nums);

    Assertions.assertThat(actualAnswer).hasSize(2);
  }

  @Test
  @DisplayName("must return list with 6 elements when input is [1,2,3]")
  void test3() {
    Permutations solution = new Permutations();

    int[] nums = {1,2,3};
    List<List<Integer>> actualAnswer = solution.permute(nums);

    Assertions.assertThat(actualAnswer).hasSize(6);
  }

  @Test
  @DisplayName("must return list with 24 elements when input is [1,2,3,4]")
  void test4() {
    Permutations solution = new Permutations();

    int[] nums = {1,2,3,4};
    List<List<Integer>> actualAnswer = solution.permute(nums);

    Assertions.assertThat(actualAnswer).hasSize(24);
  }

  @Test
  @DisplayName("must return list with 120 elements when input is [1,2,3,4,5]")
  void test5() {
    Permutations solution = new Permutations();

    int[] nums = {1,2,3,4,5};
    List<List<Integer>> actualAnswer = solution.permute(nums);

    Assertions.assertThat(actualAnswer).hasSize(120);
  }

  @Test
  @DisplayName("must return list with 720 elements when input is [1,2,3,4,5,6]")
  void test6() {
    Permutations solution = new Permutations();

    int[] nums = {1,2,3,4,5,6};
    List<List<Integer>> actualAnswer = solution.permute(nums);

    Assertions.assertThat(actualAnswer).hasSize(720);
  }


}