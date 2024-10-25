/**
 * Dado um array de inteiros nums ordenado em ordem não decrescente remova os elementos duplicados in-place
 * de modo que cada elemento único apareça uma única vez. A ordem relativa dos elementos deve ser mantida a mesma.
 * Então retorne o número de elementos exclusivos em nums.
 *
 * Considere o número de elementos únicos de nums como k. Para ser aceito, você precisa fazer o seguinte:
 *
 * - Altere o array nums de modo que os primeiros k elementos de nums contenham os elementos únicos na
 * ordem em que estavam presentes em nums inicialmente.
 * Os elementos restantes de nums não são importantes, assim como o tamanho de nums.
 *
 * - Retorne k.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 3 * 10⁴
 *
 * -100 <= nums[i] <= 100
 *
 * nums está ordenado em ordem não descrescente.
 *
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let k = 0;
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] != nums[k]) {
      nums[++k] = nums[i];
    }
  }

  return k + 1;
};
