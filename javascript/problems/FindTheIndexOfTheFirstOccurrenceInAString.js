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
  return haystack.indexOf(needle);
};
