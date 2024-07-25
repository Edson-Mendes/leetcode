package br.com.emendes.problems;

/**
 * Dado um inteiro n, retorne o número de trailing zeros n!.<br>
 * <br>
 * Note que n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.<br>
 * <br>
 * Restrições:<br>
 * 0 <= n <= 10⁴<br>
 * <br>
 * Follow up: Você poderia escrever uma solução que funcione em complexidade de tempo logarítmica?
 */
public class FactorialTrailingZeroes {

  public int trailingZeroes(int n) {
    int totalTrailingZeroes = 0;
    int quotient = 5;
    while (n >= quotient) {
      totalTrailingZeroes += n / quotient;
      quotient *= 5;
    }

    return totalTrailingZeroes;
  }

}
