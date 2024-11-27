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
  const wordToAnagrams = new Map();
  for (const word of strs) {
    const key = word.split("").sort().join("");
    const value = wordToAnagrams.get(key);
    if (value) {
      value.push(word);
    } else {
      wordToAnagrams.set(key, [word]);
    }
  }

  const anagrams = [];
  for (const group of wordToAnagrams.values()) {
    anagrams.push(group);
  }

  return anagrams;
};
