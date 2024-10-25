/**
 * Dado um array de inteiros nums e um inteiro val, remova todas as ocorrências de val em nums in-plice.
 * A ordem dos elementos pode ser alterada. Em seguida, retorne o número de elementos em nums que não são iguais a val.
 *
 * Considere o número de elementos em nums que não são iguais a val ser k, para ser aceito, você precisa fazer o seguinte:
 *
 * - Altere o array nums de modo que os primeiros k elementos de nums contenham os elementos que não são iguais a val.
 * Os elementos restantes de nums não são importantes, assim como o tamanho de nums.
 *
 * - Retorne k.
 *
 * Restrições:
 *
 * 0 <= nums.length <= 100
 *
 * 0 <= nums[i] <= 50
 *
 * 0 <= val <= 100
 *
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function (nums, val) {
  let k = 0;
  for (const element of nums) {
    if (element !== val) {
      nums[k++] = element;
    }
  }
  return k;
};
