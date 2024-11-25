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
  nums.sort((a, b) => a - b);
  generatePermutations(nums, [], [], permutations);

  return permutations;
};

const generatePermutations = (nums, used, permutation, permutations) => {
  if (permutation.length === nums.length) {
    permutations.push([...permutation]);
    return;
  }
  for (let index = 0; index < nums.length; index++) {
    if (used[index]) continue;
    if (nums[index] === nums[index - 1] && !used[index - 1]) continue;
    used[index] = true;
    permutation.push(nums[index]);
    generatePermutations(nums, used, permutation, permutations);
    permutation.pop();
    used[index] = false;
  }
};

/**
 * First Solution.
 */
const firstSolution = function (nums) {
  const permutations = [];
  const values = toMap(nums);
  generatePermutations2(values, nums.length, [], permutations);

  return permutations;
};

const generatePermutations2 = (values, length, permutation, permutations) => {
  if (permutation.length === length) {
    permutations.push([...permutation]);
    return;
  }
  for (const pair of values) {
    if (pair[1] > 0) {
      permutation.push(pair[0]);
      values.set(pair[0], pair[1] - 1);
      generatePermutations2(values, length, permutation, permutations);
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
