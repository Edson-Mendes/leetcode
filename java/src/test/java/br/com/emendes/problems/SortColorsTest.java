package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SortColorsTest {

  @Test
  void test01() {
    SortColors solution = new SortColors();

    int[] nums = {0};
    solution.sortColors(nums);

    Assertions.assertThat(nums).containsExactly(0);
  }

  @Test
  void test02() {
    SortColors solution = new SortColors();

    int[] nums = {1, 0};
    solution.sortColors(nums);

    Assertions.assertThat(nums).containsExactly(0, 1);
  }

  @Test
  void test03() {
    SortColors solution = new SortColors();

    int[] nums = {2, 0, 2, 1, 1, 0};
    solution.sortColors(nums);

    Assertions.assertThat(nums).containsExactly(0, 0, 1, 1, 2, 2);
  }

  @Test
  void test04() {
    SortColors solution = new SortColors();

    int[] nums = {2, 0, 1};
    solution.sortColors(nums);

    Assertions.assertThat(nums).containsExactly(0, 1, 2);
  }

}