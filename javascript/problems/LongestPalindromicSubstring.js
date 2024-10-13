/**
 * Dado um string s, retorne o maior palíndromo substring em s.
 *
 * Restrições:
 *
 * 1 <= s.length <= 1000
 *
 * s consiste de letras e dígitos.
 *
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function (s) {
  let cache = Array(s.length)
    .fill()
    .map(() => Array(s.length).fill(undefined));
  let left = 0;
  let right = 0;
  for (let i = 0; i < s.length; i++) {
    for (let j = s.length - 1; j > i; j--) {
      if (dp(s, i, j, cache) && j - i + 1 > right - left + 1) {
        left = i;
        right = j;
      }
    }
  }

  return s.substring(left, right + 1);
};

const dp = (s, i, j, cache) => {
  if (j < i) return true;
  if (i === j) cache[i][j] = true;
  if (cache[i][j] !== undefined) return cache[i][j];
  cache[i][j] = s[i] === s[j] && dp(s, i + 1, j - 1, cache);
  return cache[i][j];
};

console.log(longestPalindrome("Aaa"));
