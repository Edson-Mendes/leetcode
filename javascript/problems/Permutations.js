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
  generatePermutations(nums, [], permutations);

  return permutations;
};

const generatePermutations = (nums, permutation, permutations) => {
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
      generatePermutations(nums, permutation, permutations);
      nums[index] = element;
      permutation.pop();
    }
  }
};
