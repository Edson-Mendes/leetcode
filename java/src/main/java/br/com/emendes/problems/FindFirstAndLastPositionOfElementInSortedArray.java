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
   * O(log n) para buscar as ponta esquerda.<br>
   * O(log n) para buscar as ponta direita.<br>
   * Então complexidade de tempo O(3 * log n), logo O(log n).
   */
  public int[] searchRange(int[] nums, int target){
    int numsLength = nums.length;
    int[] answer = {-1, -1};

    if(numsLength == 0) return answer;

    int index = Arrays.binarySearch(nums, target);

    if (index < 0) return answer;

    answer[0] = startsAt(nums, target, index);
    answer[1] = endsAt(nums, target, index);

    return answer;
  }

  /**
   * Busca o índice que contém target mais a esquerda do array nums.
   * @param nums array ordenado.
   * @param target valor a ser buscado.
   * @param seenAt algum índice do array nums que contém target.
   * @return O índice mais a esquerda que contém target.
   */
  private int startsAt(int[] nums, int target, int seenAt) {
    int end = seenAt - 1;
    int start = 0;
    int mid;
    int leftIndex = seenAt;

    while (start <= end) {
      mid = (end - start)/2 + start;
      if (nums[mid] == target) {
        leftIndex = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return leftIndex;
  }

  /**
   * Busca o índice que contém target mais a direita do array nums.
   * @param nums array ordenado.
   * @param target valor a ser buscado.
   * @param seenAt algum índice do array nums que contém target.
   * @return O índice mais a direita que contém target.
   */
  private int endsAt(int[] nums, int target, int seenAt) {
    int end = nums.length - 1;
    int start = seenAt + 1;
    int mid;
    int rightIndex = seenAt;

    while (start <= end) {
      mid = (end - start)/2 + start;
      if (nums[mid] == target) {
        rightIndex = mid;
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return rightIndex;
  }

}
