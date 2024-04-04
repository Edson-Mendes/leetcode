package br.com.emendes.problems;

/**
 * Você recebe um array de prices, onde prices[i] é o preço de um estoque no dia iTH.<br>
 * <br>
 * Você quer maximizaar seu lucro escolhendo um único dia para comprar um estoque e escolher outro dia diferente no
 * futuro para vender o estoque.<br>
 * <br>
 * Retorne o máximo lucro você pode atingir com essa transação. Se voĉe não pode alcançar nenhum lucro, retorne 0.<br>
 * <br>
 * Restrições:<br>
 * 1 <= prices.length <= 10⁵<br>
 * 0 <= prices[i] <= 10⁴
 */
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int buy = 0;
    int sell = 1;
    int answer = 0;

    while (sell < prices.length) {
      if (prices[sell] > prices[buy]) {
        if (prices[sell] - prices[buy] > answer) {
          answer = prices[sell] - prices[buy];
        }
      } else {
        buy = sell;
      }
      sell++;
    }

    return answer;
  }

}
