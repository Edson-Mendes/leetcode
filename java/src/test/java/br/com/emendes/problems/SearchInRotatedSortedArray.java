package br.com.emendes.problems;

/**
 * Existe um array de inteiros nums ordenado em ordem crescente (com valores distintos).<br><br>
 * <p>
 * Antes de ser passado para sua função, nums possivelmente é girado em um índice pivô desconhecido k
 * (1 <= k < nums.length) de modo que a matriz resultante seja
 * [nums[k], nums[k+1], ... , nums[n-1], nums[0], nums[1], ..., nums[k-1]] (indexado a 0).<br><br>
 * <p>
 * Por exemplo, [0,1,2,4,5,6,7] pode ser girado no índice de pivô 3 e se tornar [4,5,6,7,0,1,2].<br><br>
 * <p>
 * Dado o array nums após a rotação possível e um target inteiro,
 * retorne o índice do alvo se estiver em nums ou -1 se não estiver em nums.<br><br>
 * <p>
 * Você deve escrever um algoritmo com complexidade de tempo de execução O(log n).<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 5000<br>
 * -10⁴ <= nums[i] <= 10⁴<br>
 * Todos os valores em nums são únicos.<br>
 * nums é um array ascendente que possivelmente é rotacionada.<br>
 * -10⁴ <= target <= 10⁴
 */
public class SearchInRotatedSortedArray {

  public int search(int[] nums, int target) {
    if (nums.length == 1) {
      return nums[0] == target ? 0 : -1;
    }
    int move = calculateMoveAmount(nums);

    return adaptedBinarySearch(nums, target, move);
  }

  /**
   * Busca binária adaptada para rotacionamento.
   *
   * @param nums   array que deve estar ordenado e pode ter sido rotacionado para a direita.
   * @param target valor a ser buscado no array nums.
   * @param move   quantidade de vezes que nums foi deslocado para a direita.
   */
  private int adaptedBinarySearch(int[] nums, int target, int move) {
    int numsLength = nums.length;
    int end = numsLength - 1;
    int start = 0;
    int mid;
    int realMid;

    while (start <= end) {
      mid = (end - start) / 2 + start;
      realMid = mid + move;

      if (realMid >= numsLength) {
        realMid = realMid - numsLength;
      }

      if (target == nums[realMid]) return realMid;
      if (target < nums[realMid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  /**
   * Calcula quantas vezes o array nums foi rotacionado.
   */
  private int calculateMoveAmount(int[] nums) {
    int numsLength = nums.length;
    int start = 0;
    while (start + 1 < numsLength && nums[start] < nums[start + 1]) {
      start++;
    }

    if (start + 1 == numsLength) return 0;

    return start + 1;
  }

}
