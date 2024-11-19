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
  const length = nums.length;
  for (let index = 0; index < length; index++) {
    while (nums[index] > 0 && nums[index] <= length && nums[nums[index] - 1] !== nums[index]) {
      swap(index, nums[index] - 1, nums);
    }
  }
  for (let index = 0; index < length; index++) {
    if (nums[index] !== index + 1) return index + 1;
  }
  return length + 1;
}

const swap = (i1, i2, arr) => {
  let temp = arr[i1];
  arr[i1] = arr[i2];
  arr[i2] = temp;
}

const firstSolution = function (nums) {
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
