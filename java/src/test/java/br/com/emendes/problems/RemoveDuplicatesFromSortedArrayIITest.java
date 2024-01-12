package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayIITest {

  @Test
  void test01() {
    RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

    int[] nums = {1};
    int actualAnswer = solution.removeDuplicates(nums);

    Assertions.assertThat(actualAnswer).isOne();
    Assertions.assertThat(nums).containsSequence(1);
  }

  @Test
  void test02() {
    RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

    int[] nums = {1, 1, 1, 2, 2, 3};
    int actualAnswer = solution.removeDuplicates(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(5);
    Assertions.assertThat(nums).containsSequence(1, 1, 2, 2, 3);
  }

  @Test
  void test03() {
    RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

    int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    int actualAnswer = solution.removeDuplicates(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(7);
    Assertions.assertThat(nums).containsSequence(0, 0, 1, 1, 2, 3, 3);
  }

  @Test
  void test04() {
    RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

    int[] nums = {1, 2, 2, 2, 3, 3, 4, 5, 5, 5};
    int actualAnswer = solution.removeDuplicates(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(8);
    Assertions.assertThat(nums).containsSequence(1, 2, 2, 3, 3, 4, 5, 5);
  }

  @Test
  void test05() {
    RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();

    int[] nums = {1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5, 5, 5};
    int actualAnswer = solution.removeDuplicates(nums);

    Assertions.assertThat(actualAnswer).isEqualTo(8);
    Assertions.assertThat(nums).containsSequence(1, 2, 2, 3, 3, 4, 5, 5);
  }

}