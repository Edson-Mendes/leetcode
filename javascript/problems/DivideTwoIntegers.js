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
  const MIN = -2147483648;
  const MAX = 2147483647;
  let isMinValue = dividend === MIN;

  if (isMinValue && divisor === 1) return MIN;
  if (isMinValue && divisor === -1) return MAX;
  if (divisor === MIN) return isMinValue ? 1 : 0;
  let isNegative = (dividend > 0) ^ (divisor > 0);
  let quocient = 0;

  let absoluteDividend;
  let absoluteDivisor = divisor < 0 ? ~divisor + 1 : divisor;

  if (isMinValue) {
    absoluteDividend = MAX - absoluteDivisor + 1;
    quocient++;
  } else {
    absoluteDividend = dividend < 0 ? ~dividend + 1 : dividend;
  }

  while (absoluteDividend >= absoluteDivisor) {
    let shift = 0;
    while (
      absoluteDivisor << shift > 0 &&
      absoluteDividend >= absoluteDivisor << shift
    )
      shift++;

    quocient += 1 << (shift - 1);
    absoluteDividend -= absoluteDivisor << (shift - 1);
  }

  return isNegative ? ~quocient + 1 : quocient;
};
