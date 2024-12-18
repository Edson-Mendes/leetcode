/**
 * Dado duas strings word1 e word2, retorne o número mínimo de operações
 * necessárias para converter word1 em word2.
 *
 * Você tem as seguintes operações possíveis:
 *
 * - Inserir um caracter.
 *
 * - Deletar um caracter.
 *
 * - Substituir um caracter.
 *
 * Restrições:
 *
 * 0 <= word1.length, word2.length <= 500
 *
 * word1 e word2 consistem de letras minúsculas.
 *
 * @param {string} word1
 * @param {string} word2
 * @return {number}
 */
const minDistance = function (word1, word2) {
  const l1 = word1.length;
  const l2 = word2.length;
  const cache = new Array(l1 + 1);
  for (let i = 0; i <= l1; i++) {
    cache[i] = [];
    cache[i][0] = i;
  }
  for (let j = 1; j <= l2; j++) {
    cache[0][j] = j;
  }
  for (let i = 1; i <= l1; i++) {
    for (let j = 1; j <= l2; j++) {
      if (word1[i - 1] === word2[j - 1]) 
        cache[i][j] = cache[i - 1][j - 1];
      else
        cache[i][j] = Math.min(cache[i - 1][j], cache[i][j - 1], cache[i - 1][j - 1]) + 1;
    }
  }

  return cache[l1][l2];
};

console.log(minDistance("horse", "ros"));

