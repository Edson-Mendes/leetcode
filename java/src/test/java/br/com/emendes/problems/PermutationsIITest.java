package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PermutationsIITest {

  @Test
  @DisplayName("must return list with 3 items when input is [1,1,2]")
  void test1() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1, 1, 2};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    Assertions.assertThat(actualAnswer).hasSize(3);
  }

  @Test
  @DisplayName("must return list with 1 items when input is [1]")
  void test2() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    Assertions.assertThat(actualAnswer).hasSize(1);
  }

  @Test
  @DisplayName("must return list with 1 items when input is [1,1,1,1]")
  void test3() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1,1,1,1};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    Assertions.assertThat(actualAnswer).hasSize(1);
  }

  @Test
  @DisplayName("must return list with 1 items when input is [1,1,2,2]")
  void test4() {
    PermutationsII solution = new PermutationsII();

    int[] nums = {1,1,2,2};

    List<List<Integer>> actualAnswer = solution.permuteUnique(nums);

    Assertions.assertThat(actualAnswer).hasSize(6);
  }

}