/**
 * Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M.
 *
 * I = 1, V = 5, X = 10, L = 50, C = 100, D = 500 e M = 1000
 *
 * Por exemplo, 2 é escrito como II em numeral romano, apenas dois uns somados. 12 é escrito como XII,
 * que é simplesmente X + II. O número 27 é escrito como XXVII, que é XX + V + II.
 *
 * Os algarismos romanos são geralmente escritos do maior para o menor, da esquerda para a direita.
 * No entanto, o numeral para quatro não é IIII. Em vez disso, o número quatro é escrito como IV.
 * Como o um está antes do cinco, nós o subtraímos, resultando em quatro.
 * O mesmo princípio se aplica ao número nove, que é escrito como IX.
 * Há seis instâncias em que a subtração é usada:
 *
 * I pode ser colocado antes de V (5) e X (10) para formar 4 e 9.
 *
 * X pode ser colocado antes de L (50) e C (100) para formar 40 e 90.
 *
 * C pode ser colocado antes de D (500) e M (1000) para formar 400 e 900.
 *
 * Dado um numeral romano, converta-o em um inteiro.
 *
 * Restrições:
 *
 * 1 <= s.length <= 15
 *
 * s contém apenas os caracteres ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 *
 * É garantido que s é um numeral romano válido no intervalo [1, 3999].
 *
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  const values = {
    I: 1,
    IV: 4,
    V: 5,
    IX: 9,
    X: 10,
    XL: 40,
    L: 50,
    XC: 90,
    C: 100,
    CD: 400,
    D: 500,
    CM: 900,
    M: 1000,
  };

  let i = 0;
  let integer = 0;
  while (i < s.length) {
    let key = s[i++];
    if (key === "I" && (s[i] === "V" || s[i] === "X")) key += s[i++];
    if (key === "X" && (s[i] === "L" || s[i] === "C")) key += s[i++];
    if (key === "C" && (s[i] === "D" || s[i] === "M")) key += s[i++];

    integer += values[key];
  }

  return integer;
};
