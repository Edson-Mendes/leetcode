package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

  @Test
  void test01() {
    ClimbingStairs solution = new ClimbingStairs();

    int actualAnswer = solution.climbStairs(1);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    ClimbingStairs solution = new ClimbingStairs();

    int actualAnswer = solution.climbStairs(2);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test03() {
    ClimbingStairs solution = new ClimbingStairs();

    int actualAnswer = solution.climbStairs(3);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test04() {
    ClimbingStairs solution = new ClimbingStairs();

    int actualAnswer = solution.climbStairs(6);

    Assertions.assertThat(actualAnswer).isEqualTo(13);
  }

  @Test
  void test05() {
    ClimbingStairs solution = new ClimbingStairs();

    int actualAnswer = solution.climbStairs(10);

    Assertions.assertThat(actualAnswer).isEqualTo(89);
  }

  @Test
  void test06() {
    ClimbingStairs solution = new ClimbingStairs();

    int actualAnswer = solution.climbStairs(45);

    Assertions.assertThat(actualAnswer).isEqualTo(1_836_311_903);
  }

}