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

  @Test
  @DisplayName("Must return [[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]] when input is [-1,0,1,2,-1,-4,-2,-3,3,0,4]")
  void test5() {
    ThreeSum solution = new ThreeSum();
    int[] input = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
    List<List<Integer>> actualAnswer = solution.threeSum(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(9);
    System.out.println(actualAnswer.get(0));
  }

  @Test
  @DisplayName("Must return 43 lists given below input")
  void test6() {
    ThreeSum solution = new ThreeSum();
    int[] input = {34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};
    List<List<Integer>> actualAnswer = solution.threeSum(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(43);
    System.out.println(actualAnswer.get(0));
  }

  @Test
  @DisplayName("Must return [[0,0,0]] when input is [0,0,0]")
  void test7() {
    ThreeSum solution = new ThreeSum();
    int[] input = {0,0,0};
    List<List<Integer>> actualAnswer = solution.threeSum(input);

    Assertions.assertThat(actualAnswer).isNotNull().isNotEmpty().hasSize(1);
    System.out.println(actualAnswer.get(0));
  }

}