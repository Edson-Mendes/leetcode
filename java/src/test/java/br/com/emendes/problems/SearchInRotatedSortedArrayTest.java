package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {

  @Test
  void test1() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {4, 5, 6, 7, 0, 1, 2};
    int inputTarget = 0;
    int expectedAnswer = 4;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  void test2() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {4, 5, 6, 7, 0, 1, 2};
    int inputTarget = 3;
    int expectedAnswer = -1;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  void test3() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {1};
    int inputTarget = 0;
    int expectedAnswer = -1;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  void test4() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {1};
    int inputTarget = 1;
    int expectedAnswer = 0;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  void test5() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {1, 2};
    int inputTarget = 0;
    int expectedAnswer = -1;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  void test6() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {1, 2};
    int inputTarget = 1;
    int expectedAnswer = 0;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  void test7() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {1, 2};
    int inputTarget = 2;
    int expectedAnswer = 1;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  void test8() {
    SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    int[] inputNums = {9, 1, 2, 3, 4, 5, 6, 7, 8};
    int inputTarget = 9;
    int expectedAnswer = 0;

    int actualAnswer = solution.search(inputNums, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}