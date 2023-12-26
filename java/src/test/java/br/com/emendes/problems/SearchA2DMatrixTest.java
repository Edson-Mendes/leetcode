package br.com.emendes.problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class SearchA2DMatrixTest {

  @Test
  void test01() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}};
    int target = 1;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}};
    int target = -10;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}};
    int target = 10;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}, {2}};
    int target = 1;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}, {2}};
    int target = 2;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test06() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}, {5}};
    int target = 2;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test07() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}, {5}};
    int target = -2;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test08() {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1}, {5}};
    int target = 20;

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isFalse();
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 7, 10, 20, 60})
  void test09(int target) {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isTrue();
  }

  @ParameterizedTest
  @ValueSource(ints = {-3, 2, 12, 21, 33, 61})
  void test10(int target) {
    SearchA2DMatrix solution = new SearchA2DMatrix();

    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

    boolean actualAnswer = solution.searchMatrix(matrix, target);

    assertThat(actualAnswer).isFalse();
  }

}