/**
 * Tem um array de inteiros nums ordenado em ordem crescente (não necessáriamente de valores únicos).
 *
 * Antes de ser passado para sua função, nums é rotacionado em um indice pivo desconhecido
 * k (0 <= k < nums.length) de modo que o array fica
 * [nums[k], nums[k+1],..., nums[n-1], nums[0], nums[1],...,nums[k-1]].
 *
 * Dado um array nums depois da rotação e um inteiro target, retorne true se target esta em nums,
 * ou false caso contrário.
 *
 * Você deve reduzir as etapas gerais da operação o máximo possível.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 5000
 *
 * -10⁴ <= nums[i] <= 10⁴
 *
 * É garantido que nums esta rotacionado em algum pivo.
 *
 * -10⁴ <= target <= 10⁴
 *
 * Follow-up: Esse problema é similar a Search in Rotated Sorted Array, mas nums pode conter duplicatas.
 * Poderia isso afetar a complexidade de tempo? Como e Por quê?
 */
const search = function (nums, target) {
  let left = 0;
  let right = nums.length - 1;
  while (left <= right) {
    if (nums[left] === nums[right]) {
      if (target === nums[left]) return true;
      left++;
      right--;
    } else {
      let mid = Math.floor((right + left) / 2);
      if (target === nums[mid]) return true;
      if (nums[left] <= nums[mid]) {
        if (target >= nums[left] && target < nums[mid]) right = mid - 1;
        else left = mid + 1;
      } else if (target > nums[mid] && target <= nums[right]) left = mid + 1;
      else right = mid - 1;
    }
  }

  return false;
};
