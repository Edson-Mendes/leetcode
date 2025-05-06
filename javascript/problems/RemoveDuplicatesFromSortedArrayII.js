/**
 * Dado um array de inteiros nums ordenado em ordem crescente, remova algumas duplicatas in-place
 * de modo que cada único elemento apareça no máximo 2 vezes. A ordem relativa dos elementos deve ser mantida
 * a mesma.
 *
 * Já que é impossível mudar o comprimento de um array em algumas linguagens, em vez disso,
 * você deve colocar o resultado na primeira parte do array nums.
 * Mais formalmente, se houver k elementos após a remoção das duplicatas,
 * os primeiros k elementos de nums devem conter o resultado final.
 * Não importa o que você deixe além dos primeiros k elementos.
 *
 * Retorna k após colocar o resultado final nos primeiros k slots de nums.
 *
 * Não aloque espaço extra para outro array. Você deve fazer isso modificando a matriz
 * de entrada no local com O(1) de memória extra.
 *
 * Restrições:
 *
 * 1 <= nums.length <= 3 * 10⁴
 *
 * -10⁴ <= nums[i] <= 10⁴
 *
 * nums está ordenado em ordem crescente.
 */
const removeDuplicates = function (nums) {
  let prev = nums[0];
  let k = 1;
  let count = 1;
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] === prev) {
      count++;
      if (count < 3) nums[k++] = nums[i];
    } else {
      prev = nums[i];
      count = 1;
      nums[k++] = nums[i];
    }
  }

  return k;
};
