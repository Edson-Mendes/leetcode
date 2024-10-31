/**
 * Há um array de inteiros nums classificados em ordem crescente (com valores distintos).
 *
 * Antes de ser passado para sua função, nums é possivelmente rotacionado em um índice de
 * pivô desconhecido k (1 <= k < nums.length) de modo que a matriz resultante é
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (indexado em 0).
 * Por exemplo, [0,1,2,4,5,6,7] pode ser girado no índice de pivô 3 e se tornar [4,5,6,7,0,1,2].
 *
 * Dado o array nums após a possível rotação e um alvo inteiro,
 * retorna o índice do alvo se estiver em nums, ou -1 se não estiver em nums.
 *
 * Você deve escrever um algoritmo com complexidade de tempo de execução O(log n).
 *
 * Restrições:
 *
 * 1 <= nums.length <= 5000
 *
 * -10⁴ <= nums[i] <= 10⁴
 *
 * Todos os valores de nums são únicos
 *
 * nums está em ordem crescente e pode estar rotacionado.
 *
 * -10⁴ <= target <= 10⁴
 *
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target) {
  let left = 0;
  let right = nums.length - 1;

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (nums[mid] === target) return mid;
    if (nums[left] <= nums[mid]) {
      if (nums[left] <= target && target < nums[mid]) right = mid - 1;
      else left = mid + 1;
    } else {
      if (nums[mid] < target && target <= nums[right]) left = mid + 1;
      else right = mid - 1;
    }
  }

  return -1;
};
