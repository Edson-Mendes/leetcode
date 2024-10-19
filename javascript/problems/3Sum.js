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

  const findTriplets = (i) => {
    let left = i + 1;
    let right = nums.length - 1;
    while (left < right) {
      let sum = nums[left] + nums[right] + nums[i];

      if (sum > 0) {
        right--;
      } else if (sum < 0) {
        left++;
      } else {
        result.push([nums[i], nums[left], nums[right]]);
        left++;
        right--;
      }
      while (left < right && left > i + 1 && nums[left] === nums[left - 1]) {
        left++;
      }
      while (left < right && nums[right] === nums[right + 1]) {
        right--;
      }
    }
  };

  for (let i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;
    findTriplets(i);
  }

  return result;
};
