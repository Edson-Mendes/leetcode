/**
 * Você recebe uma string s e um array de strings words. Todas as strings em words tem o mesmo comprimento.
 *
 * Uma string concatenada é uma string que contém exatamente todas as strings de qualquer permutação de
 * words concatenadas.
 *
 * Por exemplo, se words = ["ab", "cd", "ef"], então "abcdef", "abefcd", "cdabef", "cdefab", "efabcd" e "efcdab"
 * são todas as possibilidades de concatenação de words.
 *
 * Retorna uma matriz dos índices iniciais de todas as substrings concatenadas em s.
 * Você pode retornar a resposta em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= s.length <= 10⁴
 *
 * 1 <= words.length <= 5000
 *
 * 1 <= words[i].length <= 30
 *
 * s e words[i] consistem de letras minúsculas.
 *
 * @param {string} s
 * @param {string[]} words
 * @return {number[]}
 */
var findSubstring = function (s, words) {
  const inc = words[0].length;
  const totalWords = words.length;
  const substringLength = inc * totalWords;
  const map = new Map();
  const substringIndexes = [];

  for (const element of words) {
    let value = map.get(element);
    value = value ? value + 1 : 1;
    map.set(element, value);
  }

  for (let index = 0; index <= s.length - substringLength; index++) {
    if (findSubstringAt(index, map, s, inc, totalWords))
      substringIndexes.push(index);
  }

  return substringIndexes;
};

const findSubstringAt = (index, map, s, inc, remaining) => {
  if (remaining === 0) return true;
  let curr = s.substring(index, index + inc);
  let corresponding = map.get(curr);
  let isFound = false;
  if (corresponding > 0) {
    map.set(curr, corresponding - 1);
    isFound = findSubstringAt(index + inc, map, s, inc, remaining - 1);
    map.set(curr, corresponding);
  }

  return isFound;
};
