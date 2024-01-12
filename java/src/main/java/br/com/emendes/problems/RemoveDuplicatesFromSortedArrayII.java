package br.com.emendes.problems;

/**
 * Dado um array de inteiros nums ordenado em ordem crescente,
 * remova algumas duplicatas in-place, de modo que cada elemento exclusivo apareça no máximo duas vezes.
 * A ordem relativa dos elementos deve ser mantida a mesma.<br><br>
 * <p>
 * Como é impossível alterar o comprimento do array em algumas linguagens,
 * você deve colocar o resultado na primeira parte do array nums.
 * Mais formalmente, se houver k elementos após a remoção das duplicatas,
 * então os primeiros k elementos de nums deverão conter o resultado final.
 * Não importa o que você deixa além dos primeiros k elementos.<br><br>
 * <p>
 * Retorne k depois de colocar o resultado final nos primeiros k espaços de nums.<br><br>
 * <p>
 * Não aloque espaço extra para outro array.
 * Você deve fazer isso modificando o array de entrada local com memória extra O(1).<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 3 * 10⁴<br>
 * -10⁴ <= nums[i] <= 10⁴<br>
 * nums está ordenado em ordem não decrescente.
 */
public class RemoveDuplicatesFromSortedArrayII {

  public int removeDuplicates(int[] nums) {
    int counter = 1;
    int k = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        counter++;
      } else {
        counter = 1;
      }
      if (counter <= 2) {
        nums[k] = nums[i];
        k++;
      }
    }

    return k;
  }

}
