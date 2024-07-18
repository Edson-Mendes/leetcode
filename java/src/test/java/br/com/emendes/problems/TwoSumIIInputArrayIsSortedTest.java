package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumIIInputArrayIsSortedTest {

  @Test
  void test01() {
    TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();

    int[] numbers = {0, 1};
    int target = 1;
    int[] actualAnswer = solution.twoSum(numbers, target);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2);
  }

  @Test
  void test02() {
    TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();

    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    int[] actualAnswer = solution.twoSum(numbers, target);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2);
  }

  @Test
  void test03() {
    TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();

    int[] numbers = {2, 3, 4};
    int target = 6;
    int[] actualAnswer = solution.twoSum(numbers, target);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 3);
  }

  @Test
  void test04() {
    TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();

    int[] numbers = {2, 2, 7, 11, 15};
    int target = 4;
    int[] actualAnswer = solution.twoSum(numbers, target);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(1, 2);
  }

  @Test
  void test05() {
    TwoSumIIInputArrayIsSorted solution = new TwoSumIIInputArrayIsSorted();

    int[] numbers = {2, 7, 7, 11, 15};
    int target = 14;
    int[] actualAnswer = solution.twoSum(numbers, target);

    Assertions.assertThat(actualAnswer).isNotNull().containsExactly(2, 3);
  }

}