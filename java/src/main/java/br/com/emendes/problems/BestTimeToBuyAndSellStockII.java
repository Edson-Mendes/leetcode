package br.com.emendes.problems;

/**
 * Você recebe um array de prices, onde prices[i] é o preço de ações no dia iTH.<br>
 * <br>
 * Em cada dia, você pode decidir comprar e/ou vender as ações. Você só pode deter no máximo uma ação por vez.
 * No entanto, você pode comprá-lo e vendê-lo imediatamente no mesmo dia.<br>
 * <br>
 * Encontre e retorne o lucro máximo que você pode alcançar..<br>
 * <br>
 * Restrições:<br>
 * 1 <= prices.length <= 3 * 10⁴<br>
 * 0 <= prices[i] <= 10⁴
 */
public class BestTimeToBuyAndSellStockII {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int buy = 10_000;

    for (int sell : prices) {
      if (buy <= sell) {
        maxProfit += sell - buy;
      }
      buy = sell;
    }

    return maxProfit;
  }

  /**
   * First Solution.
   */
  public int firstSolution(int[] prices) {
    int maxProfit = 0;
    int hold = prices[0];
    int profit = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] - hold > profit) {
        profit = prices[i] - hold;
      } else {
        hold = prices[i];
        maxProfit += profit;
        profit = 0;
      }
    }

    return maxProfit + profit;
  }

}
