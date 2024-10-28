/**
 * Dado um array de inteiros distintos e ordenado e um inteiro target, retorne o índice do target encontrado.
 * se não, retorne o índice onde o target deveria estar.
 *
 * Você deve escrever um algortimos com complexidade de tempo O(log n).
 *
 * Restrições:
 *
 * 1 <= nums.length <= 10⁴
 *
 * -10⁴ <= nums[i] <= 10⁴
 *
 * nums contém valores distintos e ordenados em ordem crescente.
 *
 * -10⁴ <= target <= 10⁴
 *
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function (nums, target) {
  let left = 0;
  let right = nums.length - 1;
  let mid;
  while (left <= right) {
    mid = Math.floor((left + right) / 2);
    if (nums[mid] === target) return mid;
    if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
  }

  return target < nums[mid] ? mid : mid + 1;
};
