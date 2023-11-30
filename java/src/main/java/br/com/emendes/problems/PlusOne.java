package br.com.emendes.problems;

/**
 * <p>É dado a você um inteiro grande representado com um array de inteiros (digits), onde cada digits[i] é o
 * iessímo dígito do inteiro. Os dígitos são ordenados do mais significante para o menos significante da
 * esquerda para a direita. O inteiro grande não possui nenhum 0 inicial.</p>
 * <br>
 * <p>Incremente o inteiro grande em um e retorne o array de digitos resultante.</p>
 * <br>
 * Restrições:<br>
 * 1 <= digits.length <= 100<br>
 * 0 <= digits[i] <= 9<br>
 * digits não possui nenhum 0 inicial.
 */
public class PlusOne {

  public int[] plusOne(int[] digits) {
    int digitsLength = digits.length;
    int remaining = 1;
    for (int i = digitsLength - 1; i >= 0; i--) {
      int sum = digits[i] + remaining;
      digits[i] = sum % 10;
      remaining = sum / 10;
    }
    if (remaining == 0) return digits;

    int[] answer = new int[digitsLength + 1];
    answer[0] = 1;
    System.arraycopy(digits, 0, answer, 1, digitsLength);

    return answer;
  }

}
