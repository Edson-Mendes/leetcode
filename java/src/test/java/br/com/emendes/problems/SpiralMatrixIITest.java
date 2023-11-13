package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralMatrixIITest {

  @Test
  void test01() {
    SpiralMatrixII solution = new SpiralMatrixII();

    int[][] actualAnswer = solution.generateMatrix(1);

    Assertions.assertThat(actualAnswer.length).isEqualTo(1);
    Assertions.assertThat(actualAnswer[0].length).isEqualTo(1);
    Assertions.assertThat(actualAnswer[0][0]).isEqualTo(1);
  }

  @Test
  void test02() {
    SpiralMatrixII solution = new SpiralMatrixII();

    int[][] actualAnswer = solution.generateMatrix(2);

    int[][] expectedAnswer = {{1, 2}, {4, 3}};

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo(expectedAnswer);
  }

  @Test
  void test03() {
    SpiralMatrixII solution = new SpiralMatrixII();

    int[][] actualAnswer = solution.generateMatrix(3);

    int[][] expectedAnswer = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo(expectedAnswer);
  }

}