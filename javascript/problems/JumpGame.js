/**
 * Você recebe um array de inteiros nums. Você esta possicionado no primeiro índice do array,
 * e cada elemento do array representa o máximo comprimento do seu pulo a partir daquela possição.
 *
 * Retorne true se você pode alcançar o último índice, ou false caso contrário.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 10⁴
 *
 * 0 <= nums[i] <= 10⁵
 *
 * @param {number[]} nums
 * @return {boolean}
 */
const canJump = function (nums) {
  let reach = 0;
  const end = nums.length - 1;
  for (let index = 0; index < nums.length && index <= reach && reach < end; index++) {
    reach = Math.max(reach, index + nums[index]);
  }

  return reach >= end;
};

const firstSolution = function (nums) {
  if (nums.length === 1) return true;
  let index = nums.length - 2;
  let jump = 1;
  while (index > 0) {
    if (nums[index] >= jump) jump = 1;
    else jump++;
    index--;
  }

  return nums[0] >= jump;
};
