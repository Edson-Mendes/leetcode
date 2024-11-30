/**
 * Dado um array inteiro nums, encontre o subarray com a maior soma e retorne sua soma.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 10⁵
 *
 * -10⁴ <= nums[i] <= 10⁴
 *
 * Follow up: Se você descobriu a solução O(n),
 * tente codificar outra solução usando a abordagem de dividir para conquistar, que é mais sutil.
 *
 * @param {number[]} nums
 * @return {number}
 */
const maxSubArray = function (nums) {
  let maxSum = nums[0];
  let sum = nums[0];
  for (let i = 1; i < nums.length; i++) {
    let currSum = sum + nums[i];
    sum = currSum > nums[i] ? currSum : nums[i];
    maxSum = Math.max(maxSum, sum);
  }

  return maxSum;
};
