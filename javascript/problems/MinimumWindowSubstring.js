/**
 * Dado duas strings s e t de comprimentos m e n respectivamente, retorne a substring de janela mínima
 * de s de modo que todos os elementos em t (incluindo duplicatas) estejam inclusos na janela. Se não existe
 * tal substring, retorne uma string vazia.
 *
 * Os casos de testes serão gerados de modo que a resposta seja única.
 *
 * Restrições:
 *
 * m == s.length
 *
 * n = t.length
 *
 * 1 <= m, n <= 10⁵
 *
 * s e t consistem de letras maiúsculas.
 */
const minWindow = function (s, t) {
  const counter = new Array(128).fill(0);
  for (let index = 0; index < t.length; index++) counter[t.charCodeAt(index)]++;
  let required = t.length;
  let start = -1;
  let end = s.length;
  for (let l = 0, r = 0; r < s.length; r++) {
    if (--counter[s.charCodeAt(r)] >= 0) required--;
    while (required === 0) {
      if (r - l + 1 < end - start) {
        start = l;
        end = r + 1;
      }
      if (++counter[s.charCodeAt(l)] > 0) required++;
      l++;
    }
  }

  return start === -1 ? "" : s.substring(start, end);
};

const firstSolution = function (s, t) {
  let answer = [0, 1000000];
  const tMap = toMap(t);
  let counter = t.length;
  let l = 0;
  let i = 0;
  const queue = [];
  while (i < s.length && !tMap[s[i]]) i++;
  l = i;
  while (i < s.length) {
    if (tMap[s[i]] !== undefined) {
      if (i !== l) queue.push(i);
      if (tMap[s[i]]-- > 0) counter--;
      while (counter === 0) {
        if (answer[1] - answer[0] + 1 > i - l + 1) answer = [l, i];
        if (++tMap[s[l]] > 0) counter++;
        l = queue.shift();
      }
    }
    i++;
  }
  return answer[1] === 1000000 ? "" : s.substring(answer[0], answer[1] + 1);
};

const toMap = (string) => {
  const map = {};
  for (const character of string) {
    if (map[character]) {
      map[character]++;
    } else map[character] = 1;
  }
  return map;
};
