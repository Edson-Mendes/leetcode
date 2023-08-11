package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JumpGameIITest {

  @Test
  @DisplayName("must return 2 when input is [2,3,1,1,4]")
  void test1() {
    JumpGameII solution = new JumpGameII();

    int[] nums = {2, 3, 1, 1, 4};
    int actualSolution = solution.jump(nums);

    Assertions.assertThat(actualSolution).isEqualTo(2);
  }

  @Test
  @DisplayName("must return 2 when input is [2,3,0,1,4]")
  void test2() {
    JumpGameII solution = new JumpGameII();

    int[] nums = {2, 3, 0, 1, 4};
    int actualSolution = solution.jump(nums);

    Assertions.assertThat(actualSolution).isEqualTo(2);
  }

  @Test
  @DisplayName("must return 2 when input is [2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]")
  void test3() {
    JumpGameII solution = new JumpGameII();

    int[] nums = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    int actualSolution = solution.jump(nums);

    Assertions.assertThat(actualSolution).isEqualTo(9);
  }

  @Test
  @DisplayName("must return 2 when input is [3,5,1,2,3,1,2,3,4,1]")
  void test4() {
    JumpGameII solution = new JumpGameII();

    int[] nums = {3, 5, 1, 2, 3, 1, 2, 3, 4, 1};
    int actualSolution = solution.jump(nums);

    Assertions.assertThat(actualSolution).isEqualTo(4);
  }

  @Test
  @DisplayName("must return 2 when input is [0]")
  void test5() {
    JumpGameII solution = new JumpGameII();

    int[] nums = {0};
    int actualSolution = solution.jump(nums);

    Assertions.assertThat(actualSolution).isZero();
  }

  @Test
  @DisplayName("must return 2 when input is [7,0,9,6,9,6,1,7,9,0,1,2,9,0,3]")
  void test6() {
    JumpGameII solution = new JumpGameII();

    int[] nums = {7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3};
    int actualSolution = solution.jump(nums);

    Assertions.assertThat(actualSolution).isEqualTo(2);
  }

}