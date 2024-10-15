/**
 * Dado um inteiro x de 32-bits com sinal, retorne x com os dígitos invertidos. Se inverter x causar um valor
 * fora do intervalo de inteiro de 32-bits com sinal, então retorne 0.
 *
 * Assuma que o ambiente não permita o armazenamento de inteiros 64-bits com sinal ou sem.
 *
 * Restrições:
 *
 * -2³¹ <= x <= 2³¹ - 1
 *
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
  const MIN = -214748364;
  const MAX = 214748364;
  const MIN_LAST_DIGIT = -8;
  const MAX_LAST_DIGIT = 7;
  const round = x < 0 ? Math.ceil : Math.floor;
  let reversedX = 0;
  while (x) {
    let digit = x % 10;
    x = round(x / 10);
    if (reversedX > MAX || (reversedX === MAX && digit > MAX_LAST_DIGIT))
      return 0;
    if (reversedX < MIN || (reversedX === MIN && digit < MIN_LAST_DIGIT))
      return 0;

    reversedX = reversedX * 10 + digit;
  }

  return reversedX;
};
