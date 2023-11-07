package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {

  @Test
  void test01() {
    MergeIntervals solution = new MergeIntervals();

    int[][] intervals = {{1, 3}};
    int[][] actualAnswer = solution.merge(intervals);

    Assertions.assertThat(actualAnswer.length).isEqualTo(1);
  }

  @Test
  void test02() {
    MergeIntervals solution = new MergeIntervals();

    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    int[][] actualAnswer = solution.merge(intervals);

    Assertions.assertThat(actualAnswer.length).isEqualTo(3);
  }

  @Test
  void test03() {
    MergeIntervals solution = new MergeIntervals();

    int[][] intervals = {{1, 4}, {5, 6}};
    int[][] actualAnswer = solution.merge(intervals);

    Assertions.assertThat(actualAnswer.length).isEqualTo(2);
  }

  @Test
  void test04() {
    MergeIntervals solution = new MergeIntervals();

    int[][] intervals = {{2, 3}, {4, 6}, {5, 7}, {3, 4}};
    int[][] actualAnswer = solution.merge(intervals);

    Assertions.assertThat(actualAnswer.length).isEqualTo(1);
  }

}