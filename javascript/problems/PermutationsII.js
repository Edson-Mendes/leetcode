/**
 * Dado um array de inteiros nums, que pode conter duplicatas,
 * retorne todas as permutações possíveis em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 8
 *
 * -10 <= nums[i] <= 10
 *
 * @param {number[]} nums
 * @return {number[][]}
 */
const permuteUnique = function (nums) {
  const permutations = [];
  const values = toMap(nums);
  generatePermutations(values, nums.length, [], permutations);

  return permutations;
};

const generatePermutations = (values, length, permutation, permutations) => {
  if (permutation.length === length) {
    permutations.push([...permutation]);
    return;
  }
  for (const pair of values) {
    if (pair[1] > 0) {
      permutation.push(pair[0]);
      values.set(pair[0], pair[1] - 1);
      generatePermutations(values, length, permutation, permutations);
      values.set(pair[0], pair[1]);
      permutation.pop();
    }
  }
};

const toMap = (arr) => {
  const map = new Map();
  for (const element of arr) {
    let value = map.get(element);
    if (value) map.set(element, value + 1);
    else map.set(element, 1);
  }

  return map;
};
