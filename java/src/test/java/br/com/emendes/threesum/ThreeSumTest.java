package br.com.emendes.threesum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {

  @Test
  @DisplayName("Must return [[-1,-1,2]] when input is [-1,-1,2,-1,2,-1]")
  void test1() {
    ThreeSum solution = new ThreeSum();
    int[] input = {-1,-1,2,-1,2,-1};
    List<List<Integer>> actualAnswer = solution.threeSum(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(1);
    System.out.println(actualAnswer.get(0));
  }

  @Test
  @DisplayName("Must return [[-1,-1,2],[-1,0,1][ when input is [-1,0,1,2,-1,-4]")
  void test2() {
    ThreeSum solution = new ThreeSum();
    int[] input = {-1,0,1,2,-1,-4};
    List<List<Integer>> actualAnswer = solution.threeSum(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(2);
    System.out.println(actualAnswer.get(0));
    System.out.println(actualAnswer.get(1));
  }

  @Test
  @DisplayName("Must return [] when input is [0,1,1]")
  void test3() {
    ThreeSum solution = new ThreeSum();
    int[] input = {0,1,1};
    List<List<Integer>> actualAnswer = solution.threeSum(input);

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  @DisplayName("Must return [[-1,-1,2]] when input is [-1,-1,2,-1,2,-1]")
  void test4() {
    ThreeSum solution = new ThreeSum();
    int[] input = {-1,-1,2,-1,2,-1};
    List<List<Integer>> actualAnswer = solution.threeSum(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(1);
    System.out.println(actualAnswer.get(0));
  }

}