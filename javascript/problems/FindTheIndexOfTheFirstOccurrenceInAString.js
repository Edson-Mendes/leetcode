/**
 * Dado duas string needle e haystack, retorne o índice da primeira ocorrência de needle em haystack, ou -1 se
 * needle não for parte de haystack.
 *
 * Restrições:
 *
 * 1 <= haystack.length, needle.length <= 10⁴
 *
 * haystack e needle consistem apenas de letras minúsculas.
 *
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
  for (let i = 0; i + needle.length <= haystack.length; i++) {
    if (matches(haystack, i, needle)) return i;
  }
  return -1;
};

const matches = (str1, index, str2) => {
  for (const element of str2) {
    if (str1[index] !== element) return false;
    index++;
  }
  return true;
};

var firstSolution = function (haystack, needle) {
  return haystack.indexOf(needle);
};
