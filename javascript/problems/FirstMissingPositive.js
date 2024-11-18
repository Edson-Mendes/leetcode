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
  const seen = [];
  let maxSmallest = nums.length + 1;
  for (let index = 0; index < maxSmallest; index++) {
    if (nums[index] < maxSmallest) seen[nums[index]] = true;
  }
  let smallest = 1;
  while (smallest < maxSmallest && seen[smallest]) {
    smallest++;
  }

  return smallest;
};
