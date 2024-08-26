package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockIVTest {

  @Test
  void test01() {
    BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();

    int k = 1;
    int[] prices = {10};
    int actualAnswer = solution.maxProfit(k, prices);

    assertThat(actualAnswer).isEqualTo(0);
  }

  @Test
  void test02() {
    BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();

    int k = 2;
    int[] prices = {2, 4, 1};
    int actualAnswer = solution.maxProfit(k, prices);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test03() {
    BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();

    int k = 2;
    int[] prices = {3, 2, 6, 5, 0, 3};
    int actualAnswer = solution.maxProfit(k, prices);

    assertThat(actualAnswer).isEqualTo(7);
  }

}