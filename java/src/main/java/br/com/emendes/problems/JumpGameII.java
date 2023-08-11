package br.com.emendes.problems;

/**
 * Você recebe um array nums indexado por 0 de números inteiros de comprimento n.
 * Você está posicionado inicialmente em nums[0].<br>
 *
 * Cada elemento nums[i] representa o máximo comprimento de um salto pra frente a partir do index i.
 * Em outras palavras, se você está em nums[i], você pode saltar para qualquer nums[i + j] onde:<br><br>
 *
 * 0 <= j <= nums[i] and<br>
 * i + j < n<br><br>
 *
 * Retorne o número mínimo de saltos para alcançar nums[n - 1]. Os casos de testes são gerados de forma que
 * você alcance nums[n - 1].<br><br>
 *
 * Restrições:<br>
 * 1 <= nums.length <= 10⁴<br>
 * 0 <= nums[i] <= 1000<br>
 * É garantido que você possa alcançar nums[n - 1]
 */
public class JumpGameII {

  public int jump(int[] nums) {
    if (nums.length == 1) return 0;
    if (nums[0] >= nums.length - 1) return 1;

    int jumps = 0;
    int lastIndex = nums.length - 1;

    int iNextCalculation = 1;
    int iActualPosition = 0; // index da posição atual.
    while (iActualPosition < lastIndex) {
      int maxLengthJump = 0;
      int iMaxLengthJump = iNextCalculation;

      if (iActualPosition + nums[iActualPosition] >= lastIndex) return jumps + 1;

      while (iNextCalculation <= iActualPosition + nums[iActualPosition] && iNextCalculation < nums.length) {
        int lengthJump = (iNextCalculation - iActualPosition) + nums[iNextCalculation];

        if (lengthJump > maxLengthJump) {
          maxLengthJump = lengthJump;
          iMaxLengthJump = iNextCalculation;
        }
        iNextCalculation++;
      }
      iActualPosition = iMaxLengthJump;
      jumps++;
    }

    return jumps;
  }

  // --- First Solution ---
  private Integer[] cacheMinJumps;
  private int lastIndex;

  public int jumpFirstSolution(int[] nums) {
    cacheMinJumps = new Integer[nums.length];
    lastIndex = nums.length - 1;

    return minJumps(0, nums);
  }

  private int minJumps(int currI, int[] nums) {
    if (currI == lastIndex) return 0;

    if (cacheMinJumps[currI] != null) return cacheMinJumps[currI];

    int jumps = 1_000_000;
    for (int index = currI + 1; index <= currI + nums[currI] && index <= lastIndex; index++) {
      int calculatedJumps = 1 + minJumps(index, nums);
      if (calculatedJumps < jumps)
        jumps = calculatedJumps;
    }

    cacheMinJumps[currI] = jumps;
    return jumps;
  }

}
