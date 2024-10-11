/**
 * Escreva uma função para encontrar o maior prefixo comum em um array de strings.
 * 
 * Se não existir um prefixo comum, retorne uma string vazia.
 * 
 * Restrições:
 * 
 * 1 <= strs.length <= 200.
 * 
 * 0 <= strs[i].length <= 200.
 * 
 * strs[i] consiste apenas letras minúsculas.
 * 
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let commonPrefix = "";
    let first = strs[0];
    for (const i in first) {
      for (let index = 1; index < strs.length; index++) {
        if (strs[index][i] != first[i]) return commonPrefix;
      }
      commonPrefix += first[i];
    }

    return commonPrefix;
};