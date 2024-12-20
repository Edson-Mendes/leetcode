package br.com.emendes.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationsIITest {

  @Test
  @DisplayName("must return list with 3 items when input is [1,1,2]")
  void test1() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1, 1, 2};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    assertThat(actualAnswer).hasSize(3);
  }

  @Test
  @DisplayName("must return list with 1 items when input is [1]")
  void test2() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    assertThat(actualAnswer).hasSize(1);
  }

  @Test
  @DisplayName("must return list with 1 items when input is [1,1,1,1]")
  void test3() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1, 1, 1, 1};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    assertThat(actualAnswer).hasSize(1);
  }

  @Test
  @DisplayName("must return list with 1 items when input is [1,1,2,2]")
  void test4() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1, 1, 2, 2};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    assertThat(actualAnswer).hasSize(6);
  }

  @Test
  @DisplayName("must return list with 20 items when input is [0,1,0,0,9]")
  void test5() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {0, 1, 0, 0, 9};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    assertThat(actualAnswer).hasSize(20);
  }

}