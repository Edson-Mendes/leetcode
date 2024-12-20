/**
 * Você recebe um array 0-indexed de inteiros nums e comprimento n. Você está posicionado inicialmente
 * em nums[0].
 *
 * Cada elemento nums[i] representa o máximo comprimento de um salto a frente de índice i.
 * Em outras palavras, se você está em nums[i] saltar para qualquer nums[i + j] onde:
 *
 * - 0 <= j <= nums[i] e
 *
 * - i + j < n
 *
 * Retorne o mínimo número de saltos para alcançar nums[n - 1].
 * Os casos de testes são gerados de modo que você possa alcançar nums[n - 1].
 *
 * Restrições:
 *
 * 1 <= nums.length <= 10⁴
 *
 * 0 <= nums[i] <= 1000
 *
 * É garantido que você possa alcançar nums[n - 1].
 *
 * @param {number[]} nums
 * @return {number}
 */
const jump = function (nums) {
  const lastIndex = nums.length - 1;
  let endJump = 0;
  let farthest = 0;
  let jumps = 0;
  for (let index = 0; index < lastIndex; index++) {
    farthest = Math.max(farthest, nums[index] + index);
    if (farthest >= lastIndex) {
      jumps++;
      break;
    }
    if (index == endJump) {
      jumps++;
      endJump = farthest;
    }
  }

  return jumps;
};

const firstSolution = function (nums) {
  const end = nums.length - 1;
  let jumps = 0;
  let index = 0;
  let nextIndex = 1;
  while (index < end) {
    const lastIndex = index + nums[index];
    if (lastIndex < end) {
      let choosedIndex = nextIndex++;
      let distance = choosedIndex + nums[choosedIndex];
      while (nextIndex <= lastIndex) {
        if (nextIndex + nums[nextIndex] > distance) {
          distance = nextIndex + nums[nextIndex];
          choosedIndex = nextIndex;
        }
        nextIndex++;
      }
      index = choosedIndex;
    } else index = end;
    jumps++;
  }

  return jumps;
};
