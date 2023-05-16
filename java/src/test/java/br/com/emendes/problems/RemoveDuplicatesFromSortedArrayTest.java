package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

  @Test
  @DisplayName("Must return 1 when nums is {1}")
  void test1() {
    int[] inputNums = {1};

    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    int actualAnswer = solution.removeDuplicates(inputNums);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  @DisplayName("Must return 1 when nums is {1,1,1,1,1}")
  void test2() {
    int[] inputNums = {1, 1, 1, 1, 1};

    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    int actualAnswer = solution.removeDuplicates(inputNums);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  @DisplayName("Must return 5 when nums is {0,0,1,1,1,2,2,3,3,4}")
  void test3() {
    int[] inputNums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    int actualAnswer = solution.removeDuplicates(inputNums);

    Assertions.assertThat(actualAnswer).isEqualTo(5);

    int[] expectedNums = {0, 1, 2, 3, 4};
    for (int i = 0; i < actualAnswer; i++) {
      assert inputNums[i] == expectedNums[i];
    }
  }

  @Test
  @DisplayName("Must return 2 when nums is {1,1,2}")
  void test4() {
    int[] inputNums = {1,1,2};

    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    int actualAnswer = solution.removeDuplicates(inputNums);

    Assertions.assertThat(actualAnswer).isEqualTo(2);

    int[] expectedNums = {1,2};
    for (int i = 0; i < actualAnswer; i++) {
      assert inputNums[i] == expectedNums[i];
    }
  }

}