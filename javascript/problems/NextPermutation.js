/**
 * Uma permutação de um array de inteiros é o arranjo dos seus membros em um sequência ou ordem linear.
 *
 * Por exemplo, para arr = [1,2,3], todos os arranjos a seguir são permutações de arr:
 * [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 *
 * A próxima permutação de uma matriz de inteiros é a próxima permutação lexicograficamente maior do seu inteiro.
 * Mais formalmente, se todas as permutações da matriz forem classificadas em um contêiner de acordo com
 * sua ordem lexicográfica, então a próxima permutação dessa matriz é a permutação que a segue no contêiner classificado.
 * Se tal arranjo não for possível, a matriz deve ser reorganizada na ordem mais baixa possível
 * (ou seja, classificada em ordem crescente).
 *
 * Por exemplo, a próxima permutação de arr = [1,2,3] é [1,3,2].
 *
 * Da mesma forma, a próxima permutação de arr = [2,3,1] é [3,1,2].
 *
 * Enquanto a próxima permutação de arr = [3,2,1] é [1,2,3]
 * porque [3,2,1] não tem um rearranjo lexicográfico maior.
 *
 * Dado um conjunto de inteiros nums, encontre a próxima permutação de nums.
 *
 * A substituição deve estar no local e usar apenas memória extra constante.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 100
 *
 * 0 <= nums[i] <= 100
 *
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function (nums) {
  for (let i = nums.length - 1; i > 0; i--) {
    if (nums[i] > nums[i - 1]) {
      swap(i - 1, findNextGreater(i, nums[i - 1], nums), nums);
      reverse(i, nums);
      return;
    }
  }

  nums.reverse();
};

const findNextGreater = (index, value, nums) => {
  while (index < nums.length && nums[index] > value) {
    index++;
  }

  return index - 1;
};

const swap = (i, j, nums) => {
  let memo = nums[i];
  nums[i] = nums[j];
  nums[j] = memo;
};

const reverse = (left, nums) => {
  let right = nums.length - 1;
  while (left < right) {
    swap(left, right, nums);
    left++;
    right--;
  }
};
