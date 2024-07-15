package br.com.emendes.problems;

/**
 * Um elemento peak é um elemento estritamente maior que seus vizinhos.<br>
 * <br>
 * Dado um array de inteiros indexado em 0 nums, encontre o elemento peak, e retorne seu índice.
 * Se o array contém multiplos peaks, retorne o índece de qualquer peak.<br>
 * <br>
 * Você pode imaginar que nums[-1] = nums[n] = -infinito. Em outras palavras, um elemento é sempre considerado estritamente
 * maior que seus vizinhos fora do intervalo do array.<br>
 * <br>
 * Você deve escrever um algoritmo que execute com complexidade de tempo de O(log n).<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= nums.length <= 1000</li>
 *   <li>-2³¹ <= nums[i] <= 2³¹ - 1</li>
 *   <li>nums[i] != nums[i + 1] para todos os i válidos</li>
 * </ul>
 */
public class FindPeakElement {

  public int findPeakElement(int[] nums) {
    if (nums.length == 1 || nums[0] > nums[1]) return 0;
    if (nums.length == 2) {
      return 1;
    }
    for (int i = 1; i < nums.length - 1; i++) {
      if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
    }

    return nums.length - 1;
  }

}
