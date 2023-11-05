package br.com.emendes.problems;

/**
 * É dado a você um array de inteiros nums. Você está posicionado no primeiro index do array,
 * e cada elemento do array representa o comprimento máximo do salto naquela distância.<br>
 * Retorne true se você pode alcançar o último index, ou false caso contrário.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁴<br>
 * 0 <= nums[i] <= 10⁵
 */
public class JumpGame {

  public boolean canJump(int[] nums) {
    if (nums.length == 1) return true;

    boolean[] cannotJump = new boolean[nums.length];

    return jump(0, nums, cannotJump);
  }

  private boolean jump(int index, int[] nums, boolean[] cannotJump) {
    if (index >= nums.length - 1) return true;
    if (cannotJump[index]) return false;
    if (nums[index] == 0) {
      cannotJump[index] = true;
      return false;
    }

    for (int jumpLength = nums[index]; jumpLength > 0; jumpLength--) {
      boolean canJump = jump(index + jumpLength, nums, cannotJump);
      if (canJump) return true;
    }

    cannotJump[index] = true;
    return false;
  }

}
