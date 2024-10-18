/**
 * Dado um array de inteiros nums, retorne todos os triplets [nums[i], nums[j], nums[k]] de modo que i != j,
 * j != k e i != k, e nums[i] + nums[j] + nums[k] == 0.
 *
 * Note que a solução não deve conter triplets duplicados.
 *
 * Restrições:
 *
 * 3 <= nums.length <= 3000
 *
 * -10⁵ <= nums[i] <= 10⁵
 *
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
  const result = [];
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;
    const sum = -nums[i];
    let left = i + 1;
    let right = nums.length - 1;
    while (left < right) {
      if (left > i + 1 && nums[left] === nums[left - 1]) {
        left++;
        continue;
      }
      if (right < nums.length - 1 && nums[right] === nums[right + 1]) {
        right--;
        continue;
      }
      if (nums[left] + nums[right] === sum) {
        result.push([nums[i], nums[left], nums[right]]);
        left++;
        right--;
      } else if (nums[left] + nums[right] > sum) {
        right--;
      } else {
        left++;
      }
    }
  }

  return result;
};
