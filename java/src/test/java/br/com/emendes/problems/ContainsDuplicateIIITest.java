package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateIIITest {

  @Test
  void test01() {
    ContainsDuplicateIII solution = new ContainsDuplicateIII();

    int[] nums = {1, 2, 3, 1};
    int indexDiff = 3;
    int valueDiff = 0;
    boolean actualAnswer = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    ContainsDuplicateIII solution = new ContainsDuplicateIII();

    int[] nums = {1, 5, 9, 1, 5, 9};
    int indexDiff = 2;
    int valueDiff = 3;
    boolean actualAnswer = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    ContainsDuplicateIII solution = new ContainsDuplicateIII();

    int[] nums = {-100, -95, -90, -85, -80, -75, -70, -65, -60, -55, -50, -45, -40, -35, -30, -25, -20, -15, -10, -5, 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
    int indexDiff = 10;
    int valueDiff = 4;
    boolean actualAnswer = solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);

    assertThat(actualAnswer).isFalse();
  }

}