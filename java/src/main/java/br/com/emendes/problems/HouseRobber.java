package br.com.emendes.problems;

/**
 * Você é um ladrão profissional planejando roubar casas ao longo de uma rua.
 * Cada casa tem um valor em dinheiro escondido,
 * a única restrição que impede você de roubar cada uma delas é que as casas adjacentes
 * têm sistemas de segurança conectados e ele contatará automaticamente a polícia
 * se duas casas adjacentes forem arrombadas na mesma noite.<br>
 * <br>
 * Dado um array de inteiros nums representando a quantia de dinheiro de cada casa,
 * retorne a máxima quantia de dinheiro você pode roubar hoje a noite sem alertar a polícia.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= nums.length <= 100<br>
 * -> 0 <= nums[i] <= 400
 */
public class HouseRobber {

  public int rob(int[] nums) {
    if (nums.length == 1) return nums[0];
    if (nums.length == 2) return Math.max(nums[0], nums[1]);

    int[][] dp = new int[nums.length][2];

    dp[0][0] = nums[0];
    dp[0][1] = 1;
    dp[1][0] = Math.max(nums[0], nums[1]);
    dp[1][1] = dp[1][0] == nums[1] ? 1 : 0;

    for (int i = 2; i < nums.length; i++) {
      if (nums[i] == 0) {
        dp[i][0] = dp[i - 1][0];
        continue;
      }
      if (dp[i - 1][1] == 0) {
        dp[i][0] = dp[i - 1][0] + nums[i];
        dp[i][1] = 1;
      } else if (dp[i - 1][0] > dp[i - 2][0] + nums[i]) {
        dp[i][0] = dp[i - 1][0];
      } else {
        dp[i][0] = dp[i - 2][0] + nums[i];
        dp[i][1] = 1;
      }
    }

    return dp[nums.length - 1][0];
  }

}
