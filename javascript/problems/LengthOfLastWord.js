/**
 * Dado uma string s que consiste de letras e espaços em branco, retorne o
 * comprimento da última palavra da string.
 *
 * Uma palavra é uma substring contendo caracteres sem espaço em branco.
 *
 * Restrições:
 *
 * 1 <= s.length <= 10⁴
 *
 * s consiste de letras e espaços em branco ' '.
 *
 * Existe ao menos uma palavra em s.
 *
 * @param {string} s
 * @return {number}
 */
const lengthOfLastWord = function (s) {
  let index = s.length - 1;
  let lengthLastWord = 0;
  while (index >= 0 && s[index] === " ") index--;
  while (index >= 0 && s[index] !== " ") {
    index--;
    lengthLastWord++;
  }

  return lengthLastWord;
};
