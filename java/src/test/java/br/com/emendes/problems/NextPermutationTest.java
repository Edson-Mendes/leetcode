package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NextPermutationTest {

  @Test
  void test1() {
    NextPermutation solution = new NextPermutation();

    int[] nums = {1, 2, 3};
    solution.nextPermutation(nums);

    int[] expectedNums = {1, 3, 2};

    Assertions.assertThat(nums).containsExactly(expectedNums);
  }

  @Test
  void test2() {
    NextPermutation solution = new NextPermutation();

    int[] nums = {3, 2, 1};
    solution.nextPermutation(nums);

    int[] expectedNums = {1, 2, 3};

    Assertions.assertThat(nums).containsExactly(expectedNums);
  }

  @Test
  void test3() {
    NextPermutation solution = new NextPermutation();

    int[] nums = {1, 1, 5};
    solution.nextPermutation(nums);

    int[] expectedNums = {1, 5, 1};

    Assertions.assertThat(nums).containsExactly(expectedNums);
  }

  @Test
  void test4() {
    NextPermutation solution = new NextPermutation();

    int[] nums = {6};
    solution.nextPermutation(nums);

    int[] expectedNums = {6};

    Assertions.assertThat(nums).containsExactly(expectedNums);
  }

  @Test
  void test5() {
    NextPermutation solution = new NextPermutation();

    int[] nums = {1, 3, 2};
    solution.nextPermutation(nums);

    int[] expectedNums = {2, 1, 3};

    Assertions.assertThat(nums).containsExactly(expectedNums);
  }

  @Test
  void test6() {
    NextPermutation solution = new NextPermutation();

    int[] nums = {2, 3, 1};
    solution.nextPermutation(nums);

    int[] expectedNums = {3, 1, 2};

    Assertions.assertThat(nums).containsExactly(expectedNums);
  }

}