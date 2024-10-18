/**
 * Dado uma string de entrada s e um pattern p, implemente  uma função de correspondência de expressão regular
 * com suporte a '.' e '*' onde:
 *
 * '.' corresponde a qualquer caracter.
 *
 * '*' corresponde a zero ou mais do elemento precedente.
 *
 * A correspondência deve cobrir toda a string de entrada.
 *
 * Restrições:
 *
 * 1 <= s.length <= 20
 *
 * 1 <= p.length <= 20
 *
 * s contém apenas letras minúsculas.
 *
 * p contém apenas letras minúsculas, '.' e '*'.
 *
 * É garantido que para cada aparição do caractere '*', haverá um caractere válido anterior para corresponder.
 *
 * @param {string} s
 * @param {string} p
 * @return {boolean}
 */
var isMatch = function (s, p) {
  const cache = {};

  const check = (si, pi) => {
    let key = si + "," + pi;
    if (cache[key] != undefined) {
      return cache[key];
    }
    let ans;
    if (pi === p.length) ans = si === s.length;
    else {
      let match = si < s.length && (p[pi] === "." || s[si] === p[pi]);
      if (p[pi + 1] === "*")
        ans = check(si, pi + 2) || (match && check(si + 1, pi));
      else ans = match && check(si + 1, pi + 1);
    }
    cache[key] = ans;
    return cache[key];
  };

  return check(0, 0);
};
