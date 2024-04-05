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
