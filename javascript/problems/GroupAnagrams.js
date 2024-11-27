/**
 * Dado um array de strings strs, agrupe os anagramas.
 * Você pode retornar a resposta em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= strs.length <= 10⁴
 *
 * 0 <= strs[i].length <= 100
 *
 * strs[i] consiste de letras minúsculas.
 *
 * @param {string[]} strs
 * @return {string[][]}
 */
const groupAnagrams = function (strs) {
  const anagrams = {};
  for (const word of strs) {
    const counter = new Array(26).fill(0);
    for (const character of word) {
      counter[character.charCodeAt(0) - 97]++;
    }
    const key = counter.join(",");
    if (!anagrams[key]) anagrams[key] = [];
    anagrams[key].push(word);
  }

  return Object.values(anagrams);
};

const firstSolution = function (strs) {
  const anagrams = {};
  for (const word of strs) {
    const key = word.split("").sort().join("");
    if (anagrams[key]) {
      anagrams[key].push(word);
    } else {
      anagrams[key] = [word];
    }
  }

  return Object.values(anagrams);
};
