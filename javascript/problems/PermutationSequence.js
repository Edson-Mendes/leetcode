/**
 * O conjunto [1, 2, 3, ..., n] contendo um total de n! permutações únicas.
 *
 * Listando e rotulando todas as permutações em ordem, obtemos a seguinte sequência para n = 3:
 * "123", "132", "213", "231", "312" e "321".
 *
 * Dado n e k, retorne a késsima permutação.
 *
 * Restrições:
 *
 * 1 <= n <= 9
 *
 * 1 <= k <= n!
 *
 * @param {number} n
 * @param {number} k
 * @return {string}
 */
const getPermutation = function (n, k) {
  const FACTORIAL = [1, 1, 2, 6, 24, 120, 720, 5_040, 40_320, 362_880];
  const numbers = [];
  let kSequence = "";
  k--;
  for (let value = 1; value <= n; value++) {
    numbers.push(value);
  }
  for (let i = n - 1; i >= 0; i--) {
    const index = Math.floor(k / FACTORIAL[i]);
    k = k % FACTORIAL[i];
    kSequence += numbers[index];
    numbers.splice(index, 1);
  }

  return kSequence;
};
