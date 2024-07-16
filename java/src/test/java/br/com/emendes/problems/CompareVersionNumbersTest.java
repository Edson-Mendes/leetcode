package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CompareVersionNumbersTest {

  @Test
  void test01() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1", "1");

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test02() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1", "2");

    Assertions.assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test03() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("2", "1");

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test04() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.0.0", "1.0.0");

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test05() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.1.0", "1.0.0");

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test06() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.0.0", "1.1.0");

    Assertions.assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test07() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.0.0.0", "1.0");

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test08() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.0.0.1", "1.0");

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test09() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.0", "1.0.0.1");

    Assertions.assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test10() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.2", "1.10");

    Assertions.assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test11() {
    CompareVersionNumbers solution = new CompareVersionNumbers();

    int actualAnswer = solution.compareVersion("1.01", "1.001");

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

}