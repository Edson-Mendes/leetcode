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
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };
  let integer = 0;

  for (let i = 0; i < s.length; i++) {
    if (values[s[i]] < values[s[i + 1]]) integer -= values[s[i]];
    else integer += values[s[i]];
  }

  return integer;
};
