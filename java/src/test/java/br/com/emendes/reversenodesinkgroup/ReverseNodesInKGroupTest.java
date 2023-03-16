package br.com.emendes.reversenodesinkgroup;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReverseNodesInKGroupTest {

  @Test
  @DisplayName("Must return [2,1,4,3,5] when head = [1,2,3,4,5] and k = 2")
  void test1() {
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1, 2, 3, 4, 5);
    int inputK = 2;

    Assertions.assertThat(inputList).hasToString("1 2 3 4 5");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("2 1 4 3 5");
  }

  @Test
  @DisplayName("Must return [3,2,1,4,5] when head = [1,2,3,4,5] and k = 3")
  void test2() {
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1, 2, 3, 4, 5);
    int inputK = 3;

    Assertions.assertThat(inputList).hasToString("1 2 3 4 5");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("3 2 1 4 5");
  }

  @Test
  @DisplayName("Must return [1] when head = [1] and k = 1")
  void test3() {
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1);
    int inputK = 1;

    Assertions.assertThat(inputList).hasToString("1");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1");
  }

  @Test
  @DisplayName("Must return [1,2] when head = [1,2] and k = 1")
  void test4() {
    int inputK = 1;
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1, 2);

    Assertions.assertThat(inputList).hasToString("1 2");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1 2");
  }

  @Test
  @DisplayName("Must return [2,1] when head = [1,2] and k = 2")
  void test5() {
    int inputK = 2;
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1, 2);

    Assertions.assertThat(inputList).hasToString("1 2");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("2 1");
  }

  @Test
  @DisplayName("Must return [1,2,3,4,5] when head = [1,2,3,4,5] and k = 6")
  void test6() {
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1, 2, 3, 4, 5);
    int inputK = 6;

    Assertions.assertThat(inputList).hasToString("1 2 3 4 5");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1 2 3 4 5");
  }

  @Test
  @DisplayName("Must return [3,2,1,6,5,4,9,8,7,10] when head = [1,2,3,4,5,6,7,8,9,10] and k = 3")
  void test7() {
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int inputK = 3;

    Assertions.assertThat(inputList).hasToString("1 2 3 4 5 6 7 8 9 10");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("3 2 1 6 5 4 9 8 7 10");
  }

  @Test
  @DisplayName("Must return [4,3,2,1] when head = [1,2,3,4] and k = 4")
  void test8() {
    ReverseNodesInKGroup.ListNode inputList = ReverseNodesInKGroup.ListNode.of(1, 2, 3, 4);
    int inputK = 4;

    Assertions.assertThat(inputList).hasToString("1 2 3 4");

    ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

    ReverseNodesInKGroup.ListNode actualAnswer = solution.reverseKGroup(inputList, inputK);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("4 3 2 1");
  }

}