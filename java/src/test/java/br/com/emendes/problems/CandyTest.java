package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CandyTest {

  @Test
  void test01() {
    Candy solution = new Candy();

    int[] ratings = {0};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test02() {
    Candy solution = new Candy();

    int[] ratings = {100};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isOne();
  }

  @Test
  void test03() {
    Candy solution = new Candy();

    int[] ratings = {1, 1};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test04() {
    Candy solution = new Candy();

    int[] ratings = {2, 1};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test05() {
    Candy solution = new Candy();

    int[] ratings = {2, 3};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test06() {
    Candy solution = new Candy();

    int[] ratings = {1, 0, 2};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test07() {
    Candy solution = new Candy();

    int[] ratings = {1, 2, 2};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test08() {
    Candy solution = new Candy();

    int[] ratings = {2, 2, 2, 0};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test09() {
    Candy solution = new Candy();

    int[] ratings = {2, 3, 2, 0};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test10() {
    Candy solution = new Candy();

    int[] ratings = {6, 5, 4, 3, 3, 3};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(12);
  }

  @Test
  void test11() {
    Candy solution = new Candy();

    int[] ratings = {1, 2, 87, 87, 87, 2, 1};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(13);
  }

  @Test
  void test12() {
    Candy solution = new Candy();

    int[] ratings = {1, 2, 3, 4, 5};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(15);
  }

  @Test
  void test13() {
    Candy solution = new Candy();

    int[] ratings = {8, 9, 10, 11, 12, 4, 3, 2, 1};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(25);
  }

  @Test
  void test14() {
    Candy solution = new Candy();

    int[] ratings = {8, 9, 10, 11, 12, 8, 7, 6, 5, 4, 3, 2, 1};
    int actualAnswer = solution.candy(ratings);

    Assertions.assertThat(actualAnswer).isEqualTo(55);
  }

}