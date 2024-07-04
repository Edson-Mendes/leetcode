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
 * Dado um array ordenado nums que pode conter elementos duplicados, retorne o valor mínimo do array.<br>
 * <br>
 * Você deve diminuir ao máximo as etapas gerais da operação.<br>
 * <br>
 * Restrições:
 * <ul>
 *   <li>n == nums.length</li>
 *   <li>1 <= n <= 5000</li>
 *   <li>-5000 <= nums[i] <= 5000</li>
 *   <li>nums está ordenado e rotacionado entre 1 e n vezes.</li>
 * </ul>
 */
public class FindMinimumInRotatedSortedArrayII {

  public int findMin(int[] nums) {
    int answer = Integer.MAX_VALUE;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      if (nums[left] < nums[right]) {
        answer = Math.min(answer, nums[left]);
        break;
      }
      if (nums[left] > nums[right]) {
        int mid = (left + right) / 2;
        if (nums[left] <= nums[mid]) {
          answer = Math.min(answer, nums[left]);
          left = mid + 1;
        } else {
          answer = Math.min(answer, nums[mid]);
          right = mid - 1;
        }
      } else {
        answer = Math.min(answer, nums[left]);
        left++;
        right--;
      }
    }

    return answer;
  }

}
