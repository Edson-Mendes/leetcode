package br.com.emendes.problems;

/**
 * Suponha um array de comprimento n ordenado em ordem ascendente é rotacionado entre 1 e n vezes.
 * por exemplo, o array nums = {0, 1, 2, 3, 4, 5, 6, 7} pode se tornar:
 * <ul>
 *   <li>{4, 5, 6, 7, 0, 1, 2, 3} se rotacionado 4 vezes.</li>
 *   <li>{0, 1, 2, 3, 4, 5, 6, 7} se rotacionado 8 vezes.</li>
 * </ul>
 * <p>
 * Note que rotacionando um array {a[0], a[1], a[2], ..., a[n-1]} 1 vez resulta no array
 * {a[n-1], a[0], a[1], a[2], ..., a[n-2]}.<br>
 * <br>
 * Dado um array nums de elementos únicos ordenado e rotacionado, retorne o menor elemento desse array.<br>
 * <br>
 * Você deve escrever um algoritmo que execute com complexidade de tempo O(log n).<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>n == nums.length</li>
 *   <li>1 <= n <= 5000</li>
 *   <li>-5000 <= nums[i] <= 5000</li>
 *   <li>Todos os elementos de nums são únicos</li>
 *   <li>nums está ordenado e rotacionado entre 1 e n vezes.</li>
 * </ul>
 */
public class FindMinimumInRotatedSortedArray {

  public int findMin(int[] nums) {
    int i = 0;
    while (i < nums.length && nums[i] > previous(i, nums)) {
      i++;
    }
    return nums[i];
  }

  private int previous(int i, int[] nums) {
    return i - 1 < 0 ? nums[nums.length - 1] : nums[i - 1];
  }

}
