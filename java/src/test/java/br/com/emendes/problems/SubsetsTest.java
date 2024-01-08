package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class SubsetsTest {

  @Test
  void test01() {
    Subsets solution = new Subsets();

    int[] nums = {0};
    List<List<Integer>> actualAnswer = solution.subsets(nums);

    Assertions.assertThat(actualAnswer).hasSize(2)
        .contains(Collections.EMPTY_LIST, List.of(0));
  }

  @Test
  void test02() {
    Subsets solution = new Subsets();

    int[] nums = {1, 2, 3};
    List<List<Integer>> actualAnswer = solution.subsets(nums);

    Assertions.assertThat(actualAnswer).hasSize(8)
        .contains(Collections.EMPTY_LIST, List.of(1), List.of(2), List.of(3)
            , List.of(1, 2), List.of(1, 3), List.of(2, 3), List.of(1, 2, 3));
  }

}