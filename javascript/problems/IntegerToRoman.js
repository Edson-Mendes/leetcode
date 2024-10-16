/**
 * Sete símbolos diferentes representam algarismos romanos com os seguintes valores:
 *
 * I = 1, V = 5, X = 10, L = 50, C = 100, D = 500 e M = 1000
 *
 * Os algarismos romanos são formados anexando as conversões de valores de casas
 * decimais do mais alto para o mais baixo.
 * A conversão de um valor de casa decimal em um algarismo romano tem as seguintes regras:
 *
 * Se o valor não começar com 4 ou 9, selecione o símbolo do valor máximo que pode ser subtraído da entrada,
 * anexe esse símbolo ao resultado, subtraia seu valor e converta o restante em um algarismo romano.
 *
 * Se o valor começar com 4 ou 9, use a forma subtrativa representando um símbolo subtraído do símbolo seguinte,
 * por exemplo, 4 é 1 (I) menor que 5 (V): IV e 9 é 1 (I) menor que 10 (X): IX.
 * Somente as seguintes formas subtrativas são usadas: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) e 900 (CM).
 *
 * Somente potências de 10 (I, X, C, M) podem ser anexadas consecutivamente no máximo 3 vezes para representar
 * múltiplos de 10. Você não pode anexar 5 (V), 50 (L) ou 500 (D) várias vezes.
 * Se você precisar anexar um símbolo 4 vezes, use a forma subtrativa.
 *
 * Dado um número inteiro, converta-o em um numeral romano.
 *
 * Restrições:
 *
 * 1 <= num <= 3999
 *
 * @param {number} num
 * @return {string}
 */
var intToRoman = function (num) {
  const M = ["", "M", "MM", "MMM"];
  const C = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"];
  const X = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"];
  const I = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"];

  let m = Math.floor(num / 1000);
  let c = Math.floor((num % 1000) / 100);
  let x = Math.floor((num % 100) / 10);
  let i = Math.floor(num % 10);

  return M[m] + C[c] + X[x] + I[i];
};
