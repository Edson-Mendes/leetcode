package br.com.emendes.swapnodesinpairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static br.com.emendes.swapnodesinpairs.SwapNodesInPairs.*;

class SwapNodesInPairsTest {

  @Test
  @DisplayName("Must return [2,1,4,3] when input is [1,2,3,4]")
  void test1() {
    ListNode inputList = ListNode.of(1, 2, 3, 4);

    Assertions.assertThat(inputList).hasToString("1 2 3 4");

    SwapNodesInPairs solution = new SwapNodesInPairs();

    ListNode actualAnswer = solution.swapPairs(inputList);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("2 1 4 3");
  }

  @Test
  @DisplayName("Must return [1] when input is [1]")
  void test2() {
    ListNode inputList = ListNode.of(1);

    Assertions.assertThat(inputList).hasToString("1");

    SwapNodesInPairs solution = new SwapNodesInPairs();

    ListNode actualAnswer = solution.swapPairs(inputList);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1");
  }

  @Test
  @DisplayName("Must return null when input is null")
  void test3() {
    SwapNodesInPairs solution = new SwapNodesInPairs();

    ListNode actualAnswer = solution.swapPairs(null);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  @DisplayName("Must return [2,1,4,3,5] when input is [1,2,3,4,5]")
  void test4() {
    ListNode inputList = ListNode.of(1, 2, 3, 4, 5);

    Assertions.assertThat(inputList).hasToString("1 2 3 4 5");

    SwapNodesInPairs solution = new SwapNodesInPairs();

    ListNode actualAnswer = solution.swapPairs(inputList);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("2 1 4 3 5");
  }

}