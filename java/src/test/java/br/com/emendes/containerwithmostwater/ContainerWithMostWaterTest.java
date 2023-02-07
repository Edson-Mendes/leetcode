package br.com.emendes.containerwithmostwater;

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
  @DisplayName("Must return 1 when height[] is {1,1}")
  void test2() {
    ContainerWithMostWater solution = new ContainerWithMostWater();

    int[] input = {1,1};
    int expectedAnswer = 1;

    int actualAnswer = solution.maxArea(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}