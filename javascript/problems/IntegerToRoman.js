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
  let romanNum = "";
  while (num >= 1000) {
    romanNum += "M";
    num -= 1000;
  }
  if (num >= 900) {
    romanNum += "CM";
    num -= 900;
  }
  if (num >= 500) {
    romanNum += "D";
    num -= 500;
  }
  if (num >= 400) {
    romanNum += "CD";
    num -= 400;
  }
  while (num >= 100) {
    romanNum += "C";
    num -= 100;
  }
  if (num >= 90) {
    romanNum += "XC";
    num -= 90;
  }
  if (num >= 50) {
    romanNum += "L";
    num -= 50;
  }
  if (num >= 40) {
    romanNum += "XL";
    num -= 40;
  }
  while (num >= 10) {
    romanNum += "X";
    num -= 10;
  }
  if (num >= 9) {
    romanNum += "IX";
    num -= 9;
  }
  if (num >= 5) {
    romanNum += "V";
    num -= 5;
  }
  if (num >= 4) {
    romanNum += "IV";
    num -= 4;
  }
  while (num >= 1) {
    romanNum += "I";
    num -= 1;
  }

  return romanNum;
};
