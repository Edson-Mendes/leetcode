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
  return matches(s, p, 0, 0);
};

const matches = (str, pat, si, pi) => {
  if (pi === pat.length) {
    return si === str.length;
  }
  const pattern = pat[pi];
  if (pattern === "?") {
    return si < str.length ? matches(str, pat, si + 1, pi + 1) : false;
  }
  if (pattern === "*") {
    return si < str.length
      ? matches(str, pat, si, pi + 1) || matches(str, pat, si + 1, pi)
      : matches(str, pat, si, pi + 1);
  }
  return si < str.length && str[si] === pat[pi]
    ? matches(str, pat, si + 1, pi + 1)
    : false;
};
