/**
 * Dado dois inteiros dividend e divisor, divida-os sem usar multiplicação, divisão ou operador mod.
 *
 * A divisão deve truncar em direção a 0, o que significa perder a parte fracionária.
 * Por exemplo, 8,345 ficaria trucando em 8, e -2,7335 ficaria -2.
 *
 * Retorne o quociente da divisão de dividend por divisor.
 *
 * Nota: Assuma que está lidando com um ambiente que pode armazenar inteiros 32-bits com sinal [-2³¹, 2³¹ - 1].
 * Para este problema se o quociente for maior que 2³¹ - 1 deve ser reduzido para 2³¹ - 1, e se o quociente for
 * menor que -2³¹, então returna -2³¹.
 *
 * Restrições:
 *
 * -2³¹ <= dividend, divisor <= 2³¹ - 1
 *
 * divisor != 0
 *
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function (dividend, divisor) {
  if (dividend === -2147483648) {
    if (divisor === -1) return 2147483647;
    if (divisor === 1) return -2147483648;
  }
  if (dividend === -2147483648 && divisor === -2147483648) return 1;
  if (isDivisorGreater(dividend, divisor)) return 0;
  let isNegative =
    (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
  dividend = dividend > 0 ? ~dividend + 1 : dividend;
  divisor = divisor > 0 ? ~divisor + 1 : divisor;
  let increment = ~divisor + 1;

  let quocient = 0;
  console.log(
    `dividend: ${dividend} | divisor: ${divisor} | isNegative: ${isNegative} | increment: ${increment}`
  );

  while (dividend <= divisor) {
    quocient++;
    dividend += increment;
  }

  return isNegative ? ~quocient + 1 : quocient;
};

const isDivisorGreater = (dividend, divisor) => {
  if (dividend > 0) dividend = ~dividend + 1;
  if (divisor > 0) divisor = ~divisor + 1;

  return divisor < dividend;
};
