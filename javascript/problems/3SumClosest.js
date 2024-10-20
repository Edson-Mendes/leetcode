/**
 * Dado um array de inteiros nums de comprimento n e um inteiro target, encontre três inteiros em nums de modo que
 * a soma seja perto de target.
 *
 * Retorne a soma dos três inteiros
 *
 * Você pode supor que cada entrada teria exatamente uma solução.
 *
 * Retrições:
 *
 * 3 <= nums.length <= 500
 *
 * -1000 <= nums[i] <= 1000
 *
 * -10⁴ <= target <= 10⁴
 *
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function (nums, target) {
  nums.sort((a, b) => a - b);
  let closestSum = nums[0] + nums[1] + nums[2];

  const findClosestSum = (i) => {
    let left = i + 1;
    let right = nums.length - 1;
    while (left < right) {
      let currSum = nums[i] + nums[left] + nums[right];

      if (Math.abs(target - currSum) < Math.abs(target - closestSum))
        closestSum = currSum;
      if (currSum > target) right--;
      else left++;
    }
  };

  for (let i = 0; i < nums.length - 2; i++) {
    if (closestSum === target) break;
    findClosestSum(i);
  }

  return closestSum;
};

test([-1, 2, 1, -4], 1, 2);
test([0, 0, 0], 0, 0);
test([-100, -98, -2, -1], -101, -101);

function test(nums, target, expected) {
  const actual = threeSumClosest(nums, target);
  console.log("--------------------------------");
  console.log(
    `nums: ${nums}, target: ${target}, actual: ${actual}, expected: ${expected}`
  );
  console.log("Pass? ", actual === expected);
  console.log("--------------------------------");
}
