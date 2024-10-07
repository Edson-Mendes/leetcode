package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {

  @Test
  void test01() {
    ContainsDuplicateII solution = new ContainsDuplicateII();

    int[] nums = {1, 2, 3, 1};
    int k = 3;
    boolean actualAnswer = solution.containsNearbyDuplicate(nums, k);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    ContainsDuplicateII solution = new ContainsDuplicateII();

    int[] nums = {1, 0, 1, 1};
    int k = 1;
    boolean actualAnswer = solution.containsNearbyDuplicate(nums, k);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test03() {
    ContainsDuplicateII solution = new ContainsDuplicateII();

    int[] nums = {1, 2, 3, 1, 2, 3};
    int k = 2;
    boolean actualAnswer = solution.containsNearbyDuplicate(nums, k);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    ContainsDuplicateII solution = new ContainsDuplicateII();

    int[] nums = {1, 2, 3, 1, 2, 3};
    int k = 3;
    boolean actualAnswer = solution.containsNearbyDuplicate(nums, k);

    Assertions.assertThat(actualAnswer).isTrue();
  }

}