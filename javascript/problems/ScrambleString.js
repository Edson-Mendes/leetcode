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
  if (hasDifferentLetters(s1, s2)) return false;
  return isScrambleHelper(s1, 0, s1.length, s2, 0, s2.length, {});
};

const isScrambleHelper = (s1, s1Start, s1End, s2, s2Start, s2End, cache) => {
  if (s1End - s1Start === 1) return s1[s1Start] === s2[s2Start];
  const key = [s1Start, s1End, s2Start, s2End];
  if (cache[key] !== undefined) return cache[key];

  for (
    let i = s1Start + 1, j = s2Start + 1, a = s2End - 1;
    i < s1End;
    i++, j++, a--
  ) {
    const result =
      (isScrambleHelper(s1, s1Start, i, s2, s2Start, j, cache) &&
        isScrambleHelper(s1, i, s1End, s2, j, s2End, cache)) ||
      (isScrambleHelper(s1, i, s1End, s2, s2Start, a, cache) &&
        isScrambleHelper(s1, s1Start, i, s2, a, s2End, cache));
    if (result) {
      cache[key] = true;
      return true;
    }
  }

  cache[key] = false;
  return false;
};

const hasDifferentLetters = (s1, s2) => {
  const lettersCount = new Array(26).fill(0);
  for (const ch of s1) {
    lettersCount[ch.charCodeAt(0) - 97]++;
  }
  for (const ch of s2) {
    if (--lettersCount[ch.charCodeAt(0) - 97] < 0) return true;
  }
  return false;
};

console.log(isScramble("great", "rgeat"));
console.log(isScramble("abcde", "caebd"));
console.log(isScramble("ccabcbabcbabbbbcbb", "bbbbabccccbbbabcba"));
