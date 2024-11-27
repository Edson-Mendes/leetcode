/**
 * Implemente pow(x, n), que calcule x elevado a n.
 *
 * Restrições:
 *
 * -100.0 < x < 100.0
 *
 * -2³¹ <= n <= 2³¹ - 1
 *
 * n é inteiro
 *
 * Ou x não é zero ou n > 0
 *
 * -10⁴ <= x^n <= 10⁴
 *
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
const myPow = function (x, n) {
  if (x === 1) return 1;
  if (x === -1) return n % 2 === 0 ? 1 : -1;
  if (x === 0) return 0;
  const isExponentNegative = n < 0;
  const result = pow(x, Math.abs(n));
  return isExponentNegative ? 1 / result : result;
};

const pow = (base, exponent) => {
  if (exponent === 0) return 1;
  const result = pow(base, Math.floor(exponent / 2));
  if (exponent % 2 !== 0) {
    return result * result * base;
  }
  return result * result;
};
