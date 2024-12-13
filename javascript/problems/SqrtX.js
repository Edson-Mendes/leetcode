/**
 * Dado um inteiro não negativo, retorne a raiz quadrada de x arredondado para o número inteiro mais próximo.
 * O inteiro retornado também deve ser não negativo.
 *
 * Você não deve usar nenhuma função ou operador expoente integrado, como:
 * pow(x, 0.5) em c++ ou x ** 0.5 in python.
 *
 * Restrições:
 *
 * 0 <= x <= 2³¹ - 1
 *
 * @param {number} x
 * @return {number}
 */
const mySqrt = function (x) {
  let left = 0;
  let right = 46341;
  while (true) {
    const mid = Math.floor((right + left) / 2);
    if (mid * mid < x) {
      if ((mid + 1) * (mid + 1) > x) return mid;
      left = mid + 1;
    } else if (mid * mid > x) {
      if ((mid - 1) * (mid - 1) < x) return mid - 1;
      right = mid - 1;
    } else return mid;
  }
};
