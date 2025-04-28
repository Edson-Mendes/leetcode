/**
 * Dado um array nums com n objetos coloridos com vermelho, branco ou azul, ordene-os in-place de modo
 * que objetos da mesma cor estejam adjacêntes, com as corres na ordem vermelho, branco e azul.
 *
 * Nós iremos usar os inteiros 0, 1 e 2 para representar as cores vermelho, branco e azul, respectivamente.
 *
 * Você deve revolver esse problema sem usar bibliotecas de ordenação.
 *
 * Restrições:
 *
 * n == nums.length
 *
 * 1 <= n <= 300
 *
 * nums[i] é 0, 1 ou 2
 *
 * Follow-up: Você poderia resolver esse problema percorrendo apenas uma vez o array e
 * com espaço extra constante?
 */
const sortColors = function (nums) {
  let left = 0;
  let right = nums.length - 1;
  let index = 0;

  while (index <= right) {
    if (nums[index] === 2) {
      swap(nums, right, index);
      right--;
    } else {
      if (nums[index] === 0) {
        swap(nums, left, index);
        left++;
      }
      index++;
    }
  }
};

const swap = (arr, i, j) => {
  const memo = arr[i];
  arr[i] = arr[j];
  arr[j] = memo;
};
