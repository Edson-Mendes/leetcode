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
    const key = word.split("").sort().join("");
    if (anagrams[key]) {
      anagrams[key].push(word);
    } else {
      anagrams[key] = [word];
    }
  }

  return Object.values(anagrams);
};
