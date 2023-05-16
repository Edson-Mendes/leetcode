package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveElementTest {

  @Test
  @DisplayName("Must return 0 when nums = [] and val = 2")
  void test1() {
    int[] inputNums = {};
    int inputVal = 2;

    RemoveElement solution = new RemoveElement();

    int actualAnswer = solution.removeElement(inputNums, inputVal);

    Assertions.assertThat(actualAnswer).isZero();
    Assertions.assertThat(inputNums).isEmpty();
  }

  @Test
  @DisplayName("Must return 2 when nums = [3,2,2,3] and val = 2")
  void test2() {
    int[] inputNums = {3,2,2,3};
    int inputVal = 2;

    RemoveElement solution = new RemoveElement();

    int actualAnswer = solution.removeElement(inputNums, inputVal);

    int[] expectedNums = {3,3};

    Assertions.assertThat(actualAnswer).isEqualTo(2);

    Arrays.sort(inputNums, 0, actualAnswer);

    for (int i = 0; i < actualAnswer; i++) {
      Assertions.assertThat(inputNums[i]).isEqualTo(expectedNums[i]);
    }
  }

  @Test
  @DisplayName("Must return 2 when nums = [0,1,2,2,3,0,4,2] and val = 2")
  void test3() {
    int[] inputNums = {0,1,2,2,3,0,4,2};
    int inputVal = 2;

    RemoveElement solution = new RemoveElement();

    int actualAnswer = solution.removeElement(inputNums, inputVal);

    int[] expectedNums = {0,0,1,3,4};

    Assertions.assertThat(actualAnswer).isEqualTo(5);

    Arrays.sort(inputNums, 0, actualAnswer);

    for (int i = 0; i < actualAnswer; i++) {
      Assertions.assertThat(inputNums[i]).isEqualTo(expectedNums[i]);
    }
  }

  @Test
  @DisplayName("Must return 0 when nums = [0,1,2,2,3,0,4,2] and val = 5")
  void test4() {
    int[] inputNums = {0,1,2,2,3,0,4,2};
    int inputVal = 5;

    RemoveElement solution = new RemoveElement();

    int actualAnswer = solution.removeElement(inputNums, inputVal);

    int[] expectedNums = {0,0,1,2,2,2,3,4};

    Assertions.assertThat(actualAnswer).isEqualTo(8);

    Arrays.sort(inputNums, 0, actualAnswer);

    for (int i = 0; i < actualAnswer; i++) {
      Assertions.assertThat(inputNums[i]).isEqualTo(expectedNums[i]);
    }
  }

}