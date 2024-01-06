package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationsTest {

  @Test
  void test01() {
    Combinations solution = new Combinations();

    List<List<Integer>> actualAnswer = solution.combine(1, 1);

    Assertions.assertThat(actualAnswer).hasSize(1).contains(List.of(1));
  }

  @Test
  void test02() {
    Combinations solution = new Combinations();

    List<List<Integer>> actualAnswer = solution.combine(4, 2);

    Assertions.assertThat(actualAnswer)
        .hasSize(6)
        .contains(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4));
  }

}