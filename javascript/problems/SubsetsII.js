/**
 *  Dado um array de inteiros que pode conter duplicatas, retorne todos os subsets possíveis.
 *
 * A solução não deve conter duplicatas. Retorne a solução em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 10
 *
 * -10 <= nums[i] <= 10
 */
const subsetsWithDup = function (nums) {
  nums.sort((a, b) => a - b);
  const subsets = [];
  generateSubsets(nums, 0, [], subsets);
  return subsets;
};

const generateSubsets = (nums, index, subset, subsets) => {
  subsets.push([...subset]);

  let prev = 1000;
  for (let i = index; i < nums.length; i++) {
    if (nums[i] != prev) {
      subset.push(nums[i]);
      generateSubsets(nums, i + 1, subset, subsets);
      subset.pop();
      prev = nums[i];
    }
  }
};
