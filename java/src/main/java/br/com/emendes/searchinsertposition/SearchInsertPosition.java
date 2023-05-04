package br.com.emendes.searchinsertposition;

import java.util.Arrays;

/**
 * Dado um array de inteiros distintos ordenados {@code nums} e um inteiro {@code target},
 * se {@code target} for encontrado, retorne seu índice, caso contrário, retorne o índice onde estaria se fosse inserido
 * de maneira ordenada.<br>
 * Você deve escrever um algoritmo com complexidade de tempo de O(log n)<br><br>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁴<br>
 * -10⁴ <= nums[i] <= 10⁴<br>
 * nums contém inteiros distintos em ordem crescente<br>
 * -10⁴ <= target <= 10⁴
 */
public class SearchInsertPosition {

  // Solução com complexidade de tempo O(log N)
  // Usando Arrays.sort
  public int searchInsert(int[] nums, int target) {
    int answer = Arrays.binarySearch(nums, target);
    return answer < 0 ? (answer + 1) * (-1) : answer;
  }

  // Solução com complexidade de tempo O(log N)
  // Implementando uma busca binária.
  public int solution2(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int index;

    while (start <= end) {
      index = start + (end - start)/2;

      if (nums[index] == target) return index;
      if (nums[index] < target ) {
        start = index + 1;
      } else {
        end = index - 1;
      }
    }

    return start;
  }

}
