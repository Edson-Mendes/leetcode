package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockIIITest {

  @Test
  void test01() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test02() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {1, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test03() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {5, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test04() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {5, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test05() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {7, 1, 5, 3, 6, 4};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(7);
  }

  @Test
  void test06() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {7, 6, 4, 3, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test07() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {2, 10, 0, 1, 1, 1};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(9);
  }

  @Test
  void test08() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {1, 2, 3, 4, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test09() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {8, 2, 5, 3, 3, 3, 5};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test10() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {2, 4, 4, 3, 0, 3, 2, 2, 3, 6};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(8);
  }

  @Test
  void test11() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {1, 2, 1, 6, 3, 3, 6};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(8);
  }

  @Test
  void test12() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {1, 5, 1, 6, 3, 3, 6};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(9);
  }

  @Test
  void test13() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {1, 7, 2, 8, 3, 3, 6};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(12);
  }

  @Test
  void test14() {
    BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();

    int[] prices = {1, 4, 2, 10, 2, 2, 6};
    int actualAnswer = solution.maxProfit(prices);

    assertThat(actualAnswer).isEqualTo(13);
  }

}