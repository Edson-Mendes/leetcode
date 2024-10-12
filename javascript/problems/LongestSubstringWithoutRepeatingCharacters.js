/**
 * Dado um string s, encontre a maior substring que sem repetir caracteres.
 *
 * Restrições:
 *
 * 0 <= s.length <= 5 * 10⁴
 *
 * s consiste de letras, digitos, símbolos e espaços.
 *
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
  const charToIndex = {};
  const indexToChar = {};
  let longestSubstring = 0;
  let start = -1;
  for (let i = 0; i < s.length; i++) {
    if (s[i] in charToIndex) {
      let index = charToIndex[s[i]];
      for (let j = index; j > start; j--) {
        let char = indexToChar[j];
        delete indexToChar[j];
        delete charToIndex[char];
      }
      start = index;
    }
    charToIndex[s[i]] = i;
    indexToChar[i] = s[i];
    longestSubstring = Math.max(longestSubstring, i - start);
  }

  return longestSubstring;
};