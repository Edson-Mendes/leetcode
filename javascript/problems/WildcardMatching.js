/**
 * Dado uma string de entrada s e um pattern p, implemente wildcard pattern matching
 * com suporte a '?' e '*' onde:
 *
 * - '?' corresponde a qualquer caracter único.
 *
 * - '*' corresponte a qualquer sequência de caracteres (incluindo a sequência vazia).
 *
 * A correspondência deve cobrir toda a string de entrada.
 *
 * Restrições:
 *
 * 0 <= s.length, p.length <= 2000
 *
 * s contêm apenas apenas letras minúsculas.
 *
 * p contêm letras minúsculas, '?' ou '*'.
 *
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
const isMatch = function (s, p) {
  return matches(s, p, 0, 0, new Map());
};

const matches = (str, pat, si, pi, cache) => {
  const key = si + "-" + pi;
  if (cache.has(key)) return cache.get(key);
  if (pi === pat.length) {
    cache.set(key, si === str.length);
  } else {
    let value;
    switch (pat[pi]) {
      case "?":
        value = si < str.length ? matches(str, pat, si + 1, pi + 1, cache) : false;
        break;
      case "*":
        value = si < str.length
            ? matches(str, pat, si, pi + 1, cache) || matches(str, pat, si + 1, pi, cache)
            : matches(str, pat, si, pi + 1, cache);
        break;
      default:
        value = si < str.length && str[si] === pat[pi]
            ? matches(str, pat, si + 1, pi + 1, cache)
            : false;
    }
    cache.set(key, value);
  }
  return cache.get(key);
};
