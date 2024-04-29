package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GasStationTest {

  @Test
  void test01() {
    GasStation solution = new GasStation();

    int[] gas = {2};
    int[] cost = {3};
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test02() {
    GasStation solution = new GasStation();

    int[] gas = {3};
    int[] cost = {1};
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test03() {
    GasStation solution = new GasStation();

    int[] gas = {1, 2, 3, 4, 5};
    int[] cost = {3, 4, 5, 1, 2};
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test04() {
    GasStation solution = new GasStation();

    int[] gas = {2, 3, 4};
    int[] cost = {3, 4, 3};
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  void test05() {
    GasStation solution = new GasStation();

    int[] gas = {3, 0, 0, 4, 2, 5, 5, 5};
    int[] cost = {3, 4, 4, 0, 1, 5, 5, 2};
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test06() {
    GasStation solution = new GasStation();

    int[] gas = {
        31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
        41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
        13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
        23, 24, 25, 26, 27, 28, 29, 30
    };
    int[] cost = {
        36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
        46, 47, 48, 49, 50, 1, 2, 3, 4, 5, 6, 7,
        8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
        19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
        29, 30, 31, 32, 33, 34, 35
    };
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isEqualTo(15);
  }

  @Test
  void test07() {
    GasStation solution = new GasStation();

    int[] gas = {5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4};
    int[] cost = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2};
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test08() {
    GasStation solution = new GasStation();

    int[] gas = {5, 1, 2, 3, 4};
    int[] cost = {4, 4, 1, 5, 1};
    int actualAnswer = solution.canCompleteCircuit(gas, cost);

    assertThat(actualAnswer).isEqualTo(4);
  }

}