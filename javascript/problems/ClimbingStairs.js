/**
 * Você está subindo uma escada. São necessários n degraus para chegar ao topo.
 *
 * Cada vez você pode subir 1 ou 2 degraus. De quantas maneiras diferentes você pode chegar ao topo?
 *
 * Restrições:
 *
 * 1 <= n <= 45
 *
 * @param {number} n
 * @return {number}
 */
const climbStairs = function (n) {
  return climbStairsHelper(0, n, []);
};

const climbStairsHelper = (step, lastStep, cache) => {
  if (step + 1 === lastStep) return 1;
  if (step + 2 === lastStep) return 2;
  if (cache[step]) return cache[step];

  cache[step] =
    climbStairsHelper(step + 1, lastStep, cache) +
    climbStairsHelper(step + 2, lastStep, cache);
  return cache[step];
};
