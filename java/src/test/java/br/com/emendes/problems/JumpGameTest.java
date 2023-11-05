package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JumpGameTest {

  @Test
  void test01() {
    JumpGame solution = new JumpGame();

    int[] nums = {2, 3, 1, 1, 4};

    boolean actualAnswer = solution.canJump(nums);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    JumpGame solution = new JumpGame();

    int[] nums = {3, 2, 1, 0, 4};

    boolean actualAnswer = solution.canJump(nums);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    JumpGame solution = new JumpGame();

    int[] nums = {3};

    boolean actualAnswer = solution.canJump(nums);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    JumpGame solution = new JumpGame();

    int[] nums = {0};

    boolean actualAnswer = solution.canJump(nums);

    assertThat(actualAnswer).isTrue();
  }

}