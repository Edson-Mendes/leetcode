/**
 * Dado um array de inteiros nums ordenado em ordem crescente, encontre as posições inicial e final de um
 * dado target.
 *
 * Se target não for encontrado no array, retorne [-1, -1].
 *
 * Você deve escrever uma algoritmo que execute com complexidade de tempo O(log n).
 *
 * Restrições:
 *
 * 0 <= nums.length <= 10⁵
 *
 * -10⁹ <= nums[i] <= 10⁹
 *
 * nums está em ordem crescente
 *
 * -10⁹ <= target <= 10⁹
 *
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function (nums, target) {
  let index = binarySearch(nums, target);
  let start = -2;
  let end = 0;
  if (index !== -1) {
    start = index;
    end = index;
    while (start >= 0 && nums[start] === nums[index]) start--;
    while (end < nums.length && nums[end] === nums[index]) end++;
  }

  return [start + 1, end - 1];
};

const binarySearch = (nums, target) => {
  let left = 0;
  let right = nums.length;
  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (nums[mid] === target) return mid;
    if (target > nums[mid]) left = mid + 1;
    else right = mid - 1;
  }

  return -1;
};
