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
  const count = new Map();
  const substringIndexes = [];

  for (const element of words) {
    let value = count.get(element);
    value = value ? value + 1 : 1;
    count.set(element, value);
  }

  for (let i = 0; i <= s.length - substringLength; i++) {
    const seen = new Map();
    let j = i;
    while (j < i + substringLength) {
      const currSubstring = s.substring(j, j + inc);
      if (!count.has(currSubstring)) break;
      let value = seen.get(currSubstring);
      value = value ? value + 1 : 1;
      seen.set(currSubstring, value);
      if (value > count.get(currSubstring)) break;
      j += inc;
    }
    if (j === i + substringLength) {
      substringIndexes.push(i);
    }
  }

  return substringIndexes;
};
