package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

  @Test
  void test01() {
    RotateArray solution = new RotateArray();

    int k = 1;
    int[] nums = {10};
    solution.rotate(nums, k);

    Assertions.assertThat(nums).isNotNull().containsExactly(10);
  }

  @Test
  void test02() {
    RotateArray solution = new RotateArray();

    int k = 456;
    int[] nums = {10};
    solution.rotate(nums, k);

    Assertions.assertThat(nums).isNotNull().containsExactly(10);
  }

  @Test
  void test03() {
    RotateArray solution = new RotateArray();

    int k = 1;
    int[] nums = {1, 2};
    solution.rotate(nums, k);

    Assertions.assertThat(nums).isNotNull().containsExactly(2, 1);
  }

  @Test
  void test04() {
    RotateArray solution = new RotateArray();

    int k = 4;
    int[] nums = {1, 2};
    solution.rotate(nums, k);

    Assertions.assertThat(nums).isNotNull().containsExactly(1, 2);
  }

  @Test
  void test05() {
    RotateArray solution = new RotateArray();

    int k = 3;
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    solution.rotate(nums, k);

    Assertions.assertThat(nums).isNotNull().containsExactly(5, 6, 7, 1, 2, 3, 4);
  }

  @Test
  void test06() {
    RotateArray solution = new RotateArray();

    int k = 2;
    int[] nums = {-1, -100, 3, 99};
    solution.rotate(nums, k);

    Assertions.assertThat(nums).isNotNull().containsExactly(3, 99, -1, -100);
  }

}