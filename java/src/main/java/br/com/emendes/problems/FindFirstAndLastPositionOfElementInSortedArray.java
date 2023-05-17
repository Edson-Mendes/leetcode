package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dada uma matriz de números inteiros classificados em ordem não decrescente,
 * encontre a posição inicial e final de um determinado valor de destino.<br><br>
 *
 * Se o destino não for encontrado na matriz, retorne [-1, -1].<br><br>
 *
 * Você deve escrever um algoritmo com complexidade de tempo de execução O(log n).<br><br>
 *
 * Restrições:<br>
 * 0 <= nums.length <= 10⁵<br>
 * -10⁹ <= nums[i] <= 10⁹<br>
 * nums é uma array não decrescente.<br>
 * -10⁹ <= target <= 10⁹<br>
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

  /**
   * Complexidade de tempo:<br>
   * O(log n) para buscar target no array nums.<br>
   * O(n) para buscar as pontas esquerda e direira.<br>
   * Então complexidade de tempo O(n + log n)
   */
  public int[] searchRange(int[] nums, int target){
    int numsLength = nums.length;
    int[] answer = {-1, -1};

    if(numsLength == 0) return answer;

    int index = Arrays.binarySearch(nums, target);

    if (index < 0) return answer;

    int left = index - 1;
    int right = index + 1;

    while (left > -1 && nums[left] == target) {
      left--;
    }
    while (right < numsLength && nums[right] == target) {
      right++;
    }

    answer[0] = left + 1;
    answer[1] = right - 1;

    return answer;
  }

}
