package br.com.emendes.problems;

/**
 * Existe um array de inteiros nums ordenados em ordem não decrescente (não necessáriamente com valores distintos).<br><br>
 * <p>
 * Antes de passar pela sua função, nums é rotacionado em um índice pivô desconhecido.
 * Por exemplo, [0,1,2,4,4,4,5,6,6,7] pode ser rotacionado no índice pivô 5 e se tornar [4,5,6,6,7,0,1,2,4,4].<br><br>
 * <p>
 * Dado o array nums depois de rotacionado e um inteiro target, retorne true se target está em nums,
 * ou false caso contrário.<br><br>
 * <p>
 * Você deve diminuir ao máximo as etapas gerais da operação.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 5000<br>
 * -10⁴ <= nums[i] <= 10⁴<br>
 * É garantido que nums seja rotacionado em algum pivô.<br>
 * -10⁴ <= target <= 10⁴
 */
public class SearchInRotatedSortedArrayII {

  public boolean search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) return true;
      if (nums[left] == nums[mid] && nums[right] == nums[mid]) {
        left++;
        right--;
      } else if (nums[left] <= nums[mid]) {
        if (target >= nums[left] && target < nums[mid]) {
          right = mid - 1;
        } else left = mid + 1;
      } else {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else right = mid - 1;
      }
    }
    return false;
  }

}
