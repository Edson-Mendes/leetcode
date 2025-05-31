package br.com.emendes.problems;

/**
 * Dado um inteiro n, retorne true se é potência de dois. Caso contrário, retorne false.
 * <br><br>
 * Um inteiro n é potência de dois, se existe um inteiro x de modo que n == 2^x.
 * <br><br>
 * Restrições:<br>
 * -2³¹ <= n <= 2³¹ - 1
 * <br><br>
 * Follow-up: Você consegue resolver sem loops/recursão.
 */
public class PowerOfTwo {

  public boolean isPowerOfTwo(int n) {
    return n > 0 && Integer.bitCount(n) == 1;
  }

  public boolean firstSolution(int n) {
    if (n <= 0) return false;
    while (n % 2 != 1) {
      n /= 2;
    }

    return n == 1;
  }

}
