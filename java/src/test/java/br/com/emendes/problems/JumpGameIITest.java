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

}