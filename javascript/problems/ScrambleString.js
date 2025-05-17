/**
 * Nós podemos scramble uma string s para ter uma string t usando o seguinte algoritmo:
 *
 * 1. Se o comprimento da string for 1, pare.
 *
 * 2. Se o comprimento da string for > 1, faça o seguinte:
 * - Divida a string em duas substrings não vazias em um índice aleatório. (i.e. se a string for s,
 * divida em x e y de modo que s = x + y)
 * - Aleatóriamente decida se troca as substrings de ordem ou se mantém a mesma ordem.
 * - Aplique o passo 1 recursivamente em cada substring x e y.
 *
 * Dado duas strings s1 e s2 de mesmo comprimento, retorne true se s2 é uma scrambled string de s1,
 * e false caso contrário.
 *
 * Restrições:
 *
 * s1.length == s2.length
 *
 * 1 <= s1.length <= 30
 *
 * s1 e s2 consistem de letras minúsculas.
 */
const isScramble = function (s1, s2) {
  if (s1 === s2) return true;
  const key = s1 + "+" + s2;
  if (cache[key] !== undefined) return cache[key];
  if (hasDifferentLetters(s1, s2)) return false;

  for (let i = 1; i < s1.length; i++) {
    const s1Left = s1.substring(0, i);
    const s1Right = s1.substring(i);
    const result =
      (isScramble(s1Left, s2.substring(0, i)) &&
        isScramble(s1Right, s2.substring(i))) ||
      (isScramble(s1Left, s2.substring(s2.length - i)) &&
        isScramble(s1Right, s2.substring(0, s2.length - i)));
    if (result) {
      cache[key] = true;
      return true;
    }
  }
  cache[key] = false;
  return false;
};

const cache = {};

const hasDifferentLetters = (s1, s2) => {
  const lettersCount = new Array(26).fill(0);
  for (let i = 0; i < s1.length; i++) {
    lettersCount[s1.charCodeAt(i) - 97]++;
    lettersCount[s2.charCodeAt(i) - 97]--;
  }
  for (const v of lettersCount) {
    if (v < 0) return true;
  }
  return false;
};
