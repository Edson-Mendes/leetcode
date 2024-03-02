/**
 * Dado um array <i>nums</i> de números inteiros e um inteiro <i>target</i>,
 * retorne os índices dos dois números de forma que eles somem para o <i>target</i>.
 *
 * Você pode assumir que cada entrada teria exatamente uma solução.
 *
 * Restrições:
 *
 * 2 <= nums.length <= 10⁴
 *
 * -10⁹ <= nums[i] <= 10⁹
 *
 * -10⁹ <= target <= 10⁹
 *
 * Existe apenas uma solução válida
 *
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  for (let i = 0; i < nums.length - 1; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] == target) return [i, j];
    }
  }
};

console.log(twoSum([2, 7, 11, 15], 9));
console.log(twoSum([3, 2, 4], 6));
