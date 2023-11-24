package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsTest {

  @Test
  void test01() {
    UniquePaths solution = new UniquePaths();

    int m = 1;
    int n = 1;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    UniquePaths solution = new UniquePaths();

    int m = 2;
    int n = 1;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test03() {
    UniquePaths solution = new UniquePaths();

    int m = 1;
    int n = 2;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test04() {
    UniquePaths solution = new UniquePaths();

    int m = 2;
    int n = 3;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test05() {
    UniquePaths solution = new UniquePaths();

    int m = 3;
    int n = 7;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(28);
  }

  @Test
  void test06() {
    UniquePaths solution = new UniquePaths();

    int m = 3;
    int n = 2;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test07() {
    UniquePaths solution = new UniquePaths();

    int m = 51;
    int n = 9;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(1_916_797_311);
  }

  @Test
  void test08() {
    UniquePaths solution = new UniquePaths();

    int m = 3;
    int n = 3;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test09() {
    UniquePaths solution = new UniquePaths();

    int m = 4;
    int n = 4;
    int actualAnswer = solution.uniquePaths(m, n);

    Assertions.assertThat(actualAnswer).isEqualTo(20);
  }

}