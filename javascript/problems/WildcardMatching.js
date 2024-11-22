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
  const sLen = s.length;
  const pLen = p.length;
  const cache = createCache(sLen + 1, pLen + 1);
  cache[0][0] = true;
  for (let pi = 0; pi < pLen; pi++) {
    if (p[pi] === "*") cache[0][pi + 1] = cache[0][pi];
  }
  for (let si = 0; si < sLen; si++) {
    for (let pi = 0; pi < pLen; pi++) {
      if (p[pi] === "*") {
        cache[si + 1][pi + 1] = cache[si + 1][pi] || cache[si][pi + 1];
      } else if (matches(s, p, si, pi)) {
        cache[si + 1][pi + 1] = cache[si][pi];
      }
    }
  }

  return cache[sLen][pLen];
}

const matches = (str, pat, si, pi) => {
  return pat[pi] === "?" || str[si] === pat[pi];
}

const createCache = (lines, columns) => {
  const cache = new Array(lines);
  for (let i = 0; i < lines; i++) {
    cache[i] = new Array(columns).fill(false);
  }

  return cache;
}

/**
 * First Solution.
 */
const firstSolution = function (s, p) {
  return matchesFirstSolution(s, p, 0, 0, new Map());
};

const matchesFirstSolution = (str, pat, si, pi, cache) => {
  const key = si + "-" + pi;
  if (cache.has(key)) return cache.get(key);
  if (pi === pat.length) {
    cache.set(key, si === str.length);
  } else {
    let value;
    switch (pat[pi]) {
      case "?":
        value = si < str.length ? matchesFirstSolution(str, pat, si + 1, pi + 1, cache) : false;
        break;
      case "*":
        value = si < str.length
            ? matchesFirstSolution(str, pat, si, pi + 1, cache) || matchesFirstSolution(str, pat, si + 1, pi, cache)
            : matchesFirstSolution(str, pat, si, pi + 1, cache);
        break;
      default:
        value = si < str.length && str[si] === pat[pi]
            ? matchesFirstSolution(str, pat, si + 1, pi + 1, cache)
            : false;
    }
    cache.set(key, value);
  }
  return cache.get(key);
};
