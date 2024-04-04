package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

  @Test
  void test01() {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    int[] prices = {1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    int[] prices = {1, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test03() {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    int[] prices = {5, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test04() {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    int[] prices = {5, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test05() {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    int[] prices = {7, 1, 5, 3, 6, 4};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test06() {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    int[] prices = {7, 6, 4, 3, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test07() {
    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    int[] prices = {2, 10, 0, 1, 1, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(8);
  }

}