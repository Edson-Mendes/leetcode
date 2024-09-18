package br.com.emendes.problems;

/**
 * Você é um ladrão profissional e está planejando roubar casas ao longo de uma rua.
 * Cada casa tem um montante de dinheiro guardado. Todas as casas são arranjadas em círculo.
 * Isso quer dizer que a primeira casa é vizinha da última.
 * Enquanto isso, as casas adjacentes têm um sistema de segurança conectado e entrará em contato automaticamente
 * com a polícia se duas casas adjacentes forem arrombadas na mesma noite.<br>
 * <br>
 * Dado um array de inteiros nums representando a quantia de dinheiro de cada casa, retorne a quantia máxima de
 * dinheiro que você pode roubar hoje à noite sem alertar a polícia.<br>
 * <br>
 * Restrições:<br>
 * 1 <= nums.length <= 100<br>
 * 0 <= nums[i] <= 1000
 */
public class HouseRobberII {

  public int rob(int[] nums) {
    if (nums.length < 4) {
      int robbed = 0;
      for (int amount : nums) {
        robbed = Math.max(robbed, amount);
      }
      return robbed;
    }

    return Math.max(robI(nums, 0, nums.length - 1), robI(nums, 1, nums.length));
  }

  private int robI(int[] nums, int start, int end) {
    int prev2 = nums[start];
    int prev1 = Math.max(nums[start], nums[start + 1]);
    for (int i = start + 2; i < end; i++) {
      int curr = Math.max(prev2 + nums[i], prev1);
      prev2 = prev1;
      prev1 = curr;
    }

    return prev1;
  }

}
