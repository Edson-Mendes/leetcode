package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockIITest {

  @Test
  void test01() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {1, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test03() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {5, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test04() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {5, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test05() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {7, 1, 5, 3, 6, 4};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test06() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {7, 6, 4, 3, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test07() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {2, 10, 0, 1, 1, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(9);
  }

  @Test
  void test08() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {1, 2, 3, 4, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test09() {
    BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();

    int[] prices = {8, 2, 5, 3, 3, 3, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(5);
  }

}