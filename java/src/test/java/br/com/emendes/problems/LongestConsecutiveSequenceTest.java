package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestConsecutiveSequenceTest {

  @Test
  void test01() {
    LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    int[] nums = new int[0];
    int actualAnswer = solution.longestConsecutive(nums);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    int[] nums = {100, 4, 200, 1, 3, 2};
    int actualAnswer = solution.longestConsecutive(nums);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test03() {
    LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    int[] nums = {100};
    int actualAnswer = solution.longestConsecutive(nums);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test04() {
    LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    int actualAnswer = solution.longestConsecutive(nums);

    assertThat(actualAnswer).isEqualTo(9);
  }

}