package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um array de inteiros 1-indexed que está ordenado em ordem crescente, encontre dois números que sua soma de o
 * valor de target.<br>
 * <br>
 * Retorne os índices dos dois números, lembrando que o array é 1-indexed.<br>
 * <br>
 * Os casos de testes são gerados de modo que tenha uma única solução. Você não pode usar o mesmo elemento duas vezes.<br>
 * <br>
 * Sua solução deve usar apenas espaço extra constante.<br>
 * Restrições:
 * <ul>
 *   <li>2 <= numbers.length <= 3 * 10⁴</li>
 *   <li>-1000 <= numbers[i] <= 1000</li>
 *   <li>numbers está ordenado em ordem crescente.</li>
 *   <li>-1000 <= target <= 1000</li>
 *   <li>Os testes são gerados de modo a ter somento uma solução.</li>
 * </ul>
 */
public class TwoSumIIInputArrayIsSorted {

  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (numbers[left] + numbers[right] != target) {
      if (numbers[left] + numbers[right] > target) {
        right--;
      } else {
        left++;
      }
    }
    return new int[]{left + 1, right + 1};
  }

  public int[] firstSolution(int[] numbers, int target) {
    int[] answer = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      int secondNumber = target - numbers[i];
      if (secondNumber == numbers[i] && secondNumber == numbers[i + 1]) {
        answer[0] = i + 1;
        answer[1] = i + 2;
        break;
      }
      int secondIndex = Arrays.binarySearch(numbers, secondNumber);
      if (secondIndex >= 0) {
        answer[0] = i + 1;
        answer[1] = secondIndex + 1;
        break;
      }
    }

    return answer;
  }

}
