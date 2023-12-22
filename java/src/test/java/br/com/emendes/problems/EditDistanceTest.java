package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EditDistanceTest {

  @Test
  void test01() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("", "lorem");

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test02() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("lorem", "");

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test03() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("", "");

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test04() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("horse", "ros");

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test05() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("abcdefghijklmnopqrstuvxwyz", "zyw");

    Assertions.assertThat(actualAnswer).isEqualTo(25);
  }

  @Test
  void test06() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("rrros", "ros");

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test07() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("dinitrophenylhydrazine", "acetylphenylhydrazine");

    Assertions.assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test08() {
    EditDistance solution = new EditDistance();

    int actualAnswer = solution.minDistance("sunday", "saturday");

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

}