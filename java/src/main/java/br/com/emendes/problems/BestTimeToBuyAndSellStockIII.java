package br.com.emendes.problems;

/**
 * Você recebe um array de prices, onde prices[i] é o preço de ações no dia iTH.<br>
 * <br>
 * Encontre o lucro máximo que você pode alcançar. Você pode concluir no máximo duas transações.<br>
 * <br>
 * Observação: você não pode participar de diversas transações simultaneamente
 * (ou seja, você deve vender as ações antes de comprá-las novamente).<br>
 * <br>
 * Restrições:<br>
 * 1 <= prices.length <= 10⁵<br>
 * 0 <= prices[i] <= 10⁵
 */
public class BestTimeToBuyAndSellStockIII {

  public int maxProfit(int[] prices) {
    if (prices.length == 1) return 0;

    int[] left = new int[prices.length];
    int[] right = new int[prices.length];

    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < min) min = prices[i];
      int profit = prices[i] - min;
      left[i] = Math.max(left[i - 1], profit);
    }
    int max = prices[prices.length - 1];
    for (int i = prices.length - 2; i > -1; i--) {
      if (prices[i] > max) max = prices[i];
      int profit = max - prices[i];
      right[i] = Math.max(right[i + 1], profit);
    }

    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      maxProfit = Math.max(maxProfit, left[i] + right[i]);
    }

    return maxProfit;
  }

  /**
   * First Solution.
   */
  public int firstSolution(int[] prices) {
    int sellOne = 0;
    int holdOne = Integer.MIN_VALUE;
    int sellTwo = 0;
    int holdTwo = Integer.MIN_VALUE;

    for (int price : prices) {
      sellTwo = Math.max(sellTwo, holdTwo + price);
      holdTwo = Math.max(holdTwo, sellOne - price);
      sellOne = Math.max(sellOne, holdOne + price);
      holdOne = Math.max(holdOne, -price);
    }

    return sellTwo;
  }

}
