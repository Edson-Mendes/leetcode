package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CombinationSumIIITest {

  @Test
  void test01() {
    CombinationSumIII solution = new CombinationSumIII();

    List<List<Integer>> actualAnswer = solution.combinationSum3(2, 1);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    CombinationSumIII solution = new CombinationSumIII();

    List<List<Integer>> actualAnswer = solution.combinationSum3(2, 2);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test03() {
    CombinationSumIII solution = new CombinationSumIII();

    List<List<Integer>> actualAnswer = solution.combinationSum3(2, 3);

    assertThat(actualAnswer).isNotNull().hasSize(1);
    List<Integer> actualCombination = actualAnswer.get(0);
    assertThat(actualCombination).isNotNull().contains(1, 2);
  }

  @Test
  void test04() {
    CombinationSumIII solution = new CombinationSumIII();

    List<List<Integer>> actualAnswer = solution.combinationSum3(3, 7);

    assertThat(actualAnswer).isNotNull().hasSize(1);
    List<Integer> actualCombination = actualAnswer.get(0);
    assertThat(actualCombination).isNotNull().contains(1, 2, 4);
  }

  @Test
  void test05() {
    CombinationSumIII solution = new CombinationSumIII();

    List<List<Integer>> actualAnswer = solution.combinationSum3(3, 9);

    assertThat(actualAnswer).isNotNull().hasSize(3);

    List<Integer> actualCombination = actualAnswer.get(0);
    assertThat(actualCombination).isNotNull().contains(1, 2, 6);

    actualCombination = actualAnswer.get(1);
    assertThat(actualCombination).isNotNull().contains(1, 3, 5);

    actualCombination = actualAnswer.get(2);
    assertThat(actualCombination).isNotNull().contains(2, 3, 4);
  }

  @Test
  void test06() {
    CombinationSumIII solution = new CombinationSumIII();

    List<List<Integer>> actualAnswer = solution.combinationSum3(2, 10);

    assertThat(actualAnswer).isNotNull().hasSize(4);

    List<Integer> actualCombination = actualAnswer.get(0);
    assertThat(actualCombination).isNotNull().contains(1, 9);

    actualCombination = actualAnswer.get(1);
    assertThat(actualCombination).isNotNull().contains(2, 8);

    actualCombination = actualAnswer.get(2);
    assertThat(actualCombination).isNotNull().contains(3, 7);

    actualCombination = actualAnswer.get(3);
    assertThat(actualCombination).isNotNull().contains(4, 6);
  }

}