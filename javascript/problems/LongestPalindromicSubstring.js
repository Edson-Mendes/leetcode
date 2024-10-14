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
  let start = 0;
  let end = 0;

  const expandAroundCenter = (s, left, right) => {
    while (left > -1 && right < s.length && s[left] === s[right]) {
      left--;
      right++;
    }

    return right - left - 1;
  };

  for (let i = 0; i < s.length; i++) {
    let len1 = expandAroundCenter(s, i, i);
    let len2 = expandAroundCenter(s, i, i + 1);

    let len = Math.max(len1, len2);

    if (len > end - start + 1) {
      start = i - Math.floor((len - 1) / 2);
      end = i + Math.floor(len / 2);
    }
  }

  return s.substring(start, end + 1);
};

var firstSolution = function (s) {
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
