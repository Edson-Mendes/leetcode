package br.com.emendes.removeelement;

/**
 * Dado um array nums de inteiros e um inteiro val. remova todas as ocorrências de val em nums in-place.
 * A ordem relativa dos elementos pode ser alterada.<br><br>
 * <p>
 * Como é impossível alterar o comprimento do array em alguns idiomas,
 * você deve colocar o resultado na primeira parte do array nums.<br><br>
 * <p>
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
 * 0 <= nums.length <= 100<br>
 * 0 <= nums[i] <= 50<br>
 * 0 <= val <= 100<br>
 */
public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) return 0;

    int indexStart = 0;
    int indexEnd = nums.length - 1;
    int answer = nums.length;

    while (indexStart <= indexEnd) {
      if (nums[indexStart] == val) {
        answer--;
        while (indexStart < indexEnd && nums[indexEnd] == val) {
          indexEnd--;
          answer--;

        }
        if (indexStart < indexEnd) {
          nums[indexStart] = nums[indexEnd--];
        }
      }

      indexStart++;
    }

    return answer;
  }

}
