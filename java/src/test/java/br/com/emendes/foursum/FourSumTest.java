package br.com.emendes.foursum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class FourSumTest {

  @Test
  @DisplayName("Must return empty List when input array is {1000000000,1000000000,1000000000,1000000000} and target -294967296")
  void test1() {
    int[] inputArray = {1_000_000_000, 1_000_000_000, 1_000_000_000, 1_000_000_000};
    int inputTarget = -294967296;

    FourSum solution = new FourSum();

    List<List<Integer>> actualAnswer = solution.fourSum(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isEmpty();
  }

  @Test
  @DisplayName("Must return List with 3 items when input array is {1,0,-1,0,-2,2} and target 0")
  void test2() {
    int[] inputArray = {1,0,-1,0,-2,2};
    int inputTarget = 0;

    FourSum solution = new FourSum();

    List<List<Integer>> actualAnswer = solution.fourSum(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(3);
  }

  @Test
  @DisplayName("Must return List with 1 item when input array is {2,2,2,2,2} and target 8")
  void test3() {
    int[] inputArray = {2,2,2,2,2};
    int inputTarget = 8;

    FourSum solution = new FourSum();

    List<List<Integer>> actualAnswer = solution.fourSum(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(1);
  }

  @Test
  @DisplayName("Must return List with 1 item when input array is {-2,-1,-1,1,1,2,2} and target 0")
  void test4() {
    int[] inputArray = {-2,-1,-1,1,1,2,2};
    int inputTarget = 0;

    FourSum solution = new FourSum();

    List<List<Integer>> actualAnswer = solution.fourSum(inputArray, inputTarget);

    Assertions.assertThat(actualAnswer).isNotEmpty().hasSize(2);
  }

}