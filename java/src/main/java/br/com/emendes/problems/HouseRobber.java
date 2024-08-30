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

    int prev1 = Math.max(nums[0], nums[1]);
    int prev2 = nums[0];

    for (int i = 2; i < nums.length; i++) {
      int dp = Math.max(prev1, prev2 + nums[i]);
      prev2 = prev1;
      prev1 = dp;
    }

    return prev1;
  }

  public int firstSolution(int[] nums) {
    if (nums.length == 1) return nums[0];

    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
    }

    return dp[nums.length - 1];
  }

}
