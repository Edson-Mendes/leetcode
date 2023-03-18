package br.com.emendes.removeduplicatesfromsortedarray;

/**
 * Dado um array inteiro nums ordenado em ordem crescente,
 * remova as duplicatas do array de forma que cada elemento único apareça apenas uma vez.
 * A ordem relativa dos elementos deve ser mantida a mesma.<br><br>
 * <p>
 * Como é impossível alterar o comprimento do array em algumas linguagens,
 * você deve colocar o resultado na primeira parte do array nums.
 * Mais formalmente, se houver k elementos após a remoção das duplicatas,
 * os primeiros k elementos de nums devem conter o resultado final.
 * Não importa o que você deixa além dos primeiros k elementos.<br><br>
 * <p>
 * Retorne k após colocar o resultado final nos primeiros k slots de nums.<br><br>
 * <p>
 * Não aloque espaço extra para outro array.
 * Você deve fazer isso modificando a matriz de entrada no local com memória extra O(1).<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 3 * 10^4<br>
 * -100 <= nums[i] <= 100<br>
 * nums é ordenado em ordem crescente.
 */
public class RemoveDuplicatesFromSortedArray {

  // Complexidade de tempo O(n)
  // Complexidade de espaço O(1)
  public int removeDuplicates(int[] nums) {
    int numsLength = nums.length;

    int currIndex = 1;
    int lastIndex = 0;

    while (currIndex < numsLength) {
      if (nums[lastIndex] != nums[currIndex]) {
        nums[++lastIndex] = nums[currIndex];
      }

      currIndex++;
    }

    return lastIndex + 1;
  }

}
