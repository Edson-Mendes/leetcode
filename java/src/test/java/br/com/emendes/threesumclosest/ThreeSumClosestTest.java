package br.com.emendes.threesumclosest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ThreeSumClosestTest {

  @Test
  @DisplayName("Must return 1 given array [-1,2,1,-4]")
  void test1() {
    int[] inputArray = {-1,2,1,-4};
    int inputTarget = 1;
    int expectedAnswer = 2;

    ThreeSumClosest solution = new ThreeSumClosest();
    int actualAnswer = solution.threeSumClosest(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 0 given array [0,0,0]")
  void test2() {
    int[] inputArray = {0,0,0};
    int inputTarget = 1;
    int expectedAnswer = 0;

    ThreeSumClosest solution = new ThreeSumClosest();
    int actualAnswer = solution.threeSumClosest(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return -4 given array [-8,-5,-5,-4,-2,-1,-1]")
  void test3() {
    int[] inputArray = {-8,-5,-5,-4,-2,-1,-1};
    int inputTarget = 10;
    int expectedAnswer = -4;

    ThreeSumClosest solution = new ThreeSumClosest();
    int actualAnswer = solution.threeSumClosest(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 6 given array [2,2,2]")
  void test4() {
    int[] inputArray = {2,2,2};
    int inputTarget = 2;
    int expectedAnswer = 6;

    ThreeSumClosest solution = new ThreeSumClosest();
    int actualAnswer = solution.threeSumClosest(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return 2 given array [1,1,1,0]")
  void test5() {
    int[] inputArray = {1,1,1,0};
    int inputTarget = -100;
    int expectedAnswer = 2;

    ThreeSumClosest solution = new ThreeSumClosest();
    int actualAnswer = solution.threeSumClosest(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}