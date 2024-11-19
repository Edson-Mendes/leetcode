/**
 * Dado um array de inteiros nums não ordenado. Retorne o menor inteiro positivo que não está presente em nums.
 *
 * Você deve implementar um algoritmo que executa em com complexidade de tempo de O(n) e
 * complexidade de espaço O(1).
 *
 * Restrições:
 *
 * 1 <= nums.length < 10⁵
 *
 * -2³¹ <= nums[i] <= 2³¹ - 1
 *
 * @param {number[]} nums
 * @return {number}
 */
const firstMissingPositive = function (nums) {
  for (let index = 0; index < nums.length; index++) {
    if (nums[index] < 0) nums[index] = 0;
  }
  const maxValue = nums.length;
  for (const key in nums) {
    const element = Math.abs(nums[key]);
    if (element >= 1 && element <= maxValue) {
      nums[element - 1] = nums[element - 1] === 0 ? -element : Math.abs(nums[element - 1]) * -1;
    }
  }
  let index = 1;
  while (index <= maxValue && nums[index - 1] < 0) {
    index++;
  }
  return index;
};
