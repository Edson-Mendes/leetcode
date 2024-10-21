/**
 * Dado um array nums de n inteiros, retorne um array com todas os quadruplets únicos
 * [nums[a], nums[b], nums[c], nums[d]] de modo que:
 *
 * 0 <= a, b, c, d < n
 *
 * a, b, c e d são distintos.
 *
 * nums[a] + nums[b] + nums[c] = nums[d] == target
 *
 * Você pode retornar a resposta em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 200
 *
 * -10⁹ <= nums[i] <= 10⁹
 *
 * -10⁹ <= target <= 10⁹
 *
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function (nums, target) {
  let combinations = [];
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length - 3; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;
    for (let j = i + 1; j < nums.length - 2; j++) {
      if (j > i + 1 && nums[j] === nums[j - 1]) continue;
      let left = j + 1;
      let right = nums.length - 1;
      while (left < right) {
        let sum = nums[left] + nums[right] + nums[i] + nums[j];

        if (sum > target) {
          right--;
        } else if (sum < target) {
          left++;
        } else {
          combinations.push([nums[i], nums[j], nums[left], nums[right]]);
          left++;
          right--;
        }
        while (left < right && left > j + 1 && nums[left] === nums[left - 1]) {
          left++;
        }
        while (left < right && nums[right] === nums[right + 1]) {
          right--;
        }
      }
    }
  }

  return combinations;
};

var firstSolution = function (nums, target) {
  let combinations = [];
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length - 3; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;
    for (let j = i + 1; j < nums.length - 2; j++) {
      if (j > i + 1 && nums[j] === nums[j - 1]) continue;
      for (let k = j + 1; k < nums.length - 1; k++) {
        if (k > j + 1 && nums[k] === nums[k - 1]) continue;
        const last = target - (nums[i] + nums[j] + nums[k]);
        if (contains(nums, k + 1, nums.length - 1, last))
          combinations.push([nums[i], nums[j], nums[k], last]);
      }
    }
  }

  return combinations;
};

const contains = (nums, left, right, target) => {
  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (nums[mid] === target) return true;
    if (nums[mid] > target) right = mid - 1;
    else left = mid + 1;
  }

  return false;
};
