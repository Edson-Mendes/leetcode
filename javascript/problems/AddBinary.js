/**
 * Dadas duas strings binárias a e b, retorne sua soma como uma string binária.
 *
 * Restrições:
 *
 * 1 <= a.length, b.length <= 10⁴
 *
 * a e b consistem apenas de caracteres '0' ou '1'.
 *
 * Cada string não contém zeros a esquerda exceto o próprio zero.
 *
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
const addBinary = function (a, b) {
  const result = [];
  let carry = 0;
  let i = a.length - 1;
  let j = b.length - 1;
  while (i >= 0 || j >= 0 || carry === 1) {
    if (i >= 0) carry += +a[i--];
    if (j >= 0) carry += +b[j--];
    result.unshift(carry % 2);
    carry = carry > 1 ? 1 : 0;
  }
  return result.join("");
};
