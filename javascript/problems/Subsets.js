/**
 * Dado um array nums de inteiros de elementos únicos, retorne todos os possíveis subsets.
 *
 * A solução não deve conter subsets duplicados. Retorne a solução em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 10
 *
 * -10 <= nums[i] <= 10
 *
 * Todos os elementos de nums são únicos.
 * @param {number[]} nums
 * @return {number[][]}
 */
const subsets = function (nums) {
  const subsets = [];
  genereteSubsets(nums, 0, [], subsets);

  return subsets;
};

const genereteSubsets = (array, index, subset, subsets) => {
  subsets.push([...subset]);

  for (; index < array.length; index++) {
    subset.push(array[index]);
    genereteSubsets(array, index + 1, subset, subsets);
    subset.pop();
  }
};
