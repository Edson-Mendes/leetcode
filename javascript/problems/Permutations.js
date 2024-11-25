/**
 * Dado um array nums de inteiros distintos, retorne todas as permutações possíveis.
 * Voçê pode retornar a solução em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 6
 *
 * -10 <= nums[i] <= 10
 *
 * Todos os números de nums são distintos
 *
 * @param {number[]} nums
 * @return {number[][]}
 */
const permute = function (nums) {
  const permutations = [];
  generatePermutations(0, nums, permutations);

  return permutations;
};

const generatePermutations = (index, permutation, permutations) => {
  if (index === permutation.length) {
    permutations.push([...permutation]);
    return;
  }
  for (let i = index; i < permutation.length; i++) {
    swap(permutation, index, i);
    generatePermutations(index + 1, permutation, permutations);
    swap(permutation, i, index);
  }
};

const swap = (arr, i1, i2) => {
  let temp = arr[i1];
  arr[i1] = arr[i2];
  arr[i2] = temp;
};

/**
 * First solution.
 */
const firstSolution = function (nums) {
  const permutations = [];
  generatePermutations2(nums, [], permutations);

  return permutations;
};

const generatePermutations2 = (nums, permutation, permutations) => {
  console.log(permutation);

  if (permutation.length === nums.length) {
    permutations.push([...permutation]);
    return;
  }
  for (let index = 0; index < nums.length; index++) {
    const element = nums[index];
    if (element !== ".") {
      permutation.push(element);
      nums[index] = ".";
      generatePermutations2(nums, permutation, permutations);
      nums[index] = element;
      permutation.pop();
    }
  }
};
