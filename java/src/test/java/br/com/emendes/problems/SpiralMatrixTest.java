package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SpiralMatrixTest {

  @Test
  void test01() {
    SpiralMatrix solution = new SpiralMatrix();

    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    List<Integer> actualIntegers = solution.spiralOrder(matrix);

    Assertions.assertThat(actualIntegers).isNotNull().hasSize(matrix.length * matrix[0].length)
        .contains(1, 2, 3, 4, 5, 6, 7, 8, 9);
  }

  @Test
  void test02() {
    SpiralMatrix solution = new SpiralMatrix();

    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    List<Integer> actualIntegers = solution.spiralOrder(matrix);

    Assertions.assertThat(actualIntegers).isNotNull().hasSize(matrix.length * matrix[0].length)
        .contains(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
  }

}