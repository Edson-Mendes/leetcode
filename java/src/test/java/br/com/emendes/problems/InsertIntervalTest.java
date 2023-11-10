package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertIntervalTest {

  @Test
  void test01() {
    InsertInterval solution = new InsertInterval();

    int[][] intervals = new int[0][];
    int[] newInterval = {1, 2};

    int[][] actualAnswer = solution.insert(intervals, newInterval);

    Assertions.assertThat(actualAnswer).hasDimensions(1, 2);
  }

  @Test
  void test02() {
    InsertInterval solution = new InsertInterval();

    int[][] intervals = {{1, 3}, {6, 8}, {9, 10}, {12, 15}, {18, 20}};
    int[] newInterval = {4, 5};

    int[][] actualAnswer = solution.insert(intervals, newInterval);

    Assertions.assertThat(actualAnswer).hasDimensions(6, 2);
  }

  @Test
  void test03() {
    InsertInterval solution = new InsertInterval();

    int[][] intervals = {{1, 3}, {6, 8}, {9, 10}, {12, 15}, {18, 20}};
    int[] newInterval = {3, 5};

    int[][] actualAnswer = solution.insert(intervals, newInterval);

    Assertions.assertThat(actualAnswer).hasDimensions(5, 2);
  }

  @Test
  void test04() {
    InsertInterval solution = new InsertInterval();

    int[][] intervals = {{1, 3}, {6, 8}, {9, 10}, {12, 15}, {18, 20}};
    int[] newInterval = {3, 6};

    int[][] actualAnswer = solution.insert(intervals, newInterval);

    Assertions.assertThat(actualAnswer).hasDimensions(4, 2);
  }

  @Test
  void test05() {
    InsertInterval solution = new InsertInterval();

    int[][] intervals = {{1, 3}, {6, 9}};
    int[] newInterval = {2, 5};

    int[][] actualAnswer = solution.insert(intervals, newInterval);

    Assertions.assertThat(actualAnswer).hasDimensions(2, 2);
  }

  @Test
  void test06() {
    InsertInterval solution = new InsertInterval();

    int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
    int[] newInterval = {4, 8};

    int[][] actualAnswer = solution.insert(intervals, newInterval);

    Assertions.assertThat(actualAnswer).hasDimensions(3, 2);
  }

}