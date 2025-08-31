package br.com.emendes.problems;

/**
 * Dado um inteiro n, conte o total de números de digitos 1 aparecendo em todos os inteiros não-negativos
 * menores ou iguais a n.<br>
 * <br>
 * Restrições:<br>
 * 0 <= n <= 10⁹
 */
public class NumberOfDigitOne {

  public int countDigitOne(int n) {
    int[] numbers = toIntArray(String.valueOf(n));
    Integer[][] cache = new Integer[numbers.length][numbers.length];
    return dfs(0, 0, numbers, true, cache);
  }

  private int dfs(int position, int accOnes, int[] numbers, boolean isLimited, Integer[][] cache) {
    if (position == numbers.length)
      return accOnes;

    if (!isLimited && cache[position][accOnes] != null) {
      return cache[position][accOnes];
    }

    int max = isLimited ? numbers[position] : 9;
    int totalPosition = 0;
    for (int digit = 0; digit <= max; digit++) {
      int acc = (digit == 1 ? 1 : 0);
      totalPosition += dfs(position + 1, accOnes + acc, numbers, isLimited && digit == max, cache);
    }

    if (!isLimited)
      cache[position][accOnes] = totalPosition;

    return totalPosition;
  }

  private int[] toIntArray(String valueAsString) {
    int[] intArray = new int[valueAsString.length()];
    for (int i = 0; i < valueAsString.length(); i++) {
      intArray[i] = valueAsString.charAt(i) - '0';
    }
    return intArray;
  }

}
