package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um array nums de inteiros não ordenados, retorne o comprimento da maior sequência de elementos consecutivos.<br>
 * <br>
 * Você deve escrever um algoritmo que executa em O(n) de complexidade de tempo.<br>
 * <br>
 * Restrições:<br>
 * 0 <= nums.length <= 10⁵<br>
 * -10⁹ <= nums[i] <= 10⁹
 */
public class LongestConsecutiveSequence {

  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;
    Arrays.sort(nums);
    int previousValue = nums[0];
    int sequenceLength = 1;
    int maxSequenceLength = 1;
    for (int i = 1; i < nums.length; i++) {
      if (previousValue == nums[i]) continue;
      if (previousValue + 1 == nums[i]) {
        sequenceLength++;
      } else {
        maxSequenceLength = Math.max(maxSequenceLength, sequenceLength);
        sequenceLength = 1;
      }
      previousValue = nums[i];
    }

    return Math.max(maxSequenceLength, sequenceLength);
  }

}
