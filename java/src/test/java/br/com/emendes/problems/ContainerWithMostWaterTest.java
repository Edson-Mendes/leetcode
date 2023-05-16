package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

  @Test
  @DisplayName("Must return 49 when height[] is {1,8,6,2,5,4,8,3,7}")
  void test1() {
    ContainerWithMostWater solution = new ContainerWithMostWater();

    int[] input = {1,8,6,2,5,4,8,3,7};
    int expectedAnswer = 49;

    int actualAnswer = solution.maxArea(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 240 when height[] is {10, 20, 5, 15, 20, 20, 15, 50, 20, 40, 10, 20, 30, 25, 10, 15}")
  void test2() {
    ContainerWithMostWater solution = new ContainerWithMostWater();

    int[] input = {10, 20, 5, 15, 20, 20, 15, 50, 20, 40, 10, 20, 30, 25, 10, 15};
    int expectedAnswer = 240;

    int actualAnswer = solution.maxArea(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}