package br.com.emendes.problems;

/**
 * Você recebe um array de inteiros prices onde prices[i] é o preço de uma stock no dia iTH,
 * e um inteiro k.<br>
 * <br>
 * Encontre o máximo lucro você pode alcançar. Você pode concluir no máximo k transações:
 * i.e. você pode comprar no máximo k vezes e vender no máximo k vezes.<br>
 * <br>
 * Nota: Você não pode realizar várias transações simultaneamente
 * (ou seja, você deve vender as ações antes de comprá-las novamente).<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= k <= 100<br>
 * -> 1 <= prices.length <= 1000<br>
 * -> 0 <= prices[i] <= 1000
 */
public class BestTimeToBuyAndSellStockIV {

  public int maxProfit(int k, int[] prices) {
    int length = prices.length;
    if (length < 2) return 0;

    int[][] dp = new int[k + 1][length];
    for (int i = 1; i <= k; i++) {
      int effectiveBuyPrice = prices[0];
      for (int j = 1; j < length; j++) {
        dp[i][j] = Math.max(dp[i][j - 1], prices[j] - effectiveBuyPrice);
        effectiveBuyPrice = Math.min(effectiveBuyPrice, prices[j] - dp[i - 1][j]);
      }
    }

    return dp[k][length - 1];
  }

}
