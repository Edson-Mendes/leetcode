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
  const end = nums.length - 1;
  let jumps = 0;
  let index = 0;
  let verifyIndex = 1;
  while (index < end) {
    const lastIndex = index + nums[index];
    if (lastIndex < end) {
      let choosedIndex = verifyIndex;
      let distance = choosedIndex + nums[choosedIndex];
      for (let i = choosedIndex + 1; i <= lastIndex; i++) {
        if (i + nums[i] > distance) {
          distance = i + nums[i];
          choosedIndex = i;
        }
      }
      verifyIndex = lastIndex + 1;
      index = choosedIndex;
    } else index = end;
    jumps++;
  }

  return jumps;
};
