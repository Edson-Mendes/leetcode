package br.com.emendes.nextpermutation;

import java.util.Arrays;

/**
 * Uma permutação de um array de números inteiros é um arranjo de seus membros em uma sequência ou ordem linear.<br><br>
 * <p>
 * Por exemplo, para arr = [1,2,3], as seguintes são todas as permutações de
 * arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].<br><br>
 * <p>
 * A próxima permutação de um array de inteiros é a próxima permutação lexicograficamente maior de seu inteiro.
 * Mais formalmente, se todas as permutações do array forem classificadas em um contêiner de acordo com
 * sua ordem lexicográfica, a próxima permutação dessa matriz será a permutação que a segue no contêiner classificado.
 * Se tal disposição não for possível, a matriz deve ser reorganizada na ordem mais baixa possível
 * (ou seja, classificada em ordem crescente).<br>
 *
 *  <ul>
 *    <li>Da mesma forma, a próxima permutação de arr = [2,3,1] é [3,1,2].</li>
 *    <li>Por exemplo, a próxima permutação de arr = [1,2,3] é [1,3,2].</li>
 *    <li>Enquanto a próxima permutação de arr = [3,2,1] é [1,2,3] porque [3,2,1] não tem um rearranjo lexicográfico maior.</li>
 *  </ul><br>
 * <p>
 *  Dada um array de inteiros nums, encontre a próxima permutação de nums.<br><br>
 * <p>
 *  The replacement must be in place and use only constant extra memory.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= nums.length <= 100<br>
 * 0 <= nums[i] <= 100<br>
 */
public class NextPermutation {

  public void nextPermutation(int[] nums) {
    int numsLength = nums.length;

    int index = findFirstExchange(nums);

    if (index == -1) {
      reverse(nums);
      return;
    }

    int indexBetween = findValueBetween(nums[index], nums[index + 1], index + 2, numsLength, nums);

    if (indexBetween == -1) {
      swap(nums, index, index + 1);
    } else {
      swap(nums, index, indexBetween);
    }

    Arrays.sort(nums, index + 1, numsLength);
  }

  /**
   * Busca o index do menor valor que seja maior que {@code value1} e menor {@code value2} entre os indexes
   * {@code startIndex} (inclusivo) e {@code numsLength} (exclusivo) no array {@code nums}.
   * Retorna 2_147_483_647 caso não exista tal valor.
   */
  private int findValueBetween(int value1, int value2, int startIndex, int numsLength, int[] nums) {
    int index = -1;
    while (startIndex < numsLength) {
      if (nums[startIndex] > value1 && nums[startIndex] < value2) {
        index = startIndex;
      }

      startIndex++;
    }

    return index;
  }

  /**
   * Troca dois valores de possição no dado array.
   */
  private void swap(int[] nums, int index1, int index2) {
    int aux = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = aux;
  }

  /**
   * Reverte a ordem dos valores de um array de inteiros.
   */
  private void reverse(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int aux;

    while (left < right) {
      aux = nums[left];
      nums[left] = nums[right];
      nums[right] = aux;
      left++;
      right--;
    }
  }

  /**
   * Encontra o index do valor que se trocado pelo valor do (index - 1) o valor total aumenta.
   * Retorna -1 caso não encontre possibilidade de troca.
   */
  private int findFirstExchange(int[] nums) {
    int index;
    int numsLength = nums.length;

    for (index = numsLength - 1; index > 0; index--) {
      if (nums[index] > nums[index - 1]) return index - 1;
    }
    return -1;
  }

}
