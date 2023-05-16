package br.com.emendes.problems;

/**
 * Dado dois inteiros dividend e divisor, divida os dois inteiros sem usar multiplicação, divisão ou operador mod.<br><br>
 * <p>
 * A divisão inteira deve truncar em direção a zero, o que significa perder sua parte fracionária.
 * Por exemplo, 8,345 seria truncado para 8 e -2,7335 seria truncado para -2.<br><br>
 * <p>
 * Retorne o quociente depois de dividir o dividendo pelo divisor.<br><br>
 * <p>
 * Nota: Suponha que estamos lidando com um ambiente que só pode armazenar inteiros dentro
 * do intervalo de inteiros com sinal de 32 bits: [−2^31, 2^31 − 1].
 * Para este problema, se o quociente for estritamente maior que 2^31 - 1, retorne 2^31 - 1 e,
 * se o quociente for estritamente menor que -2^31, retorne -2^31.<br><br>
 * <p>
 * Restrições:<br>
 * -2^31 <= dividend, divisor <= 2^31 - 1<br>
 * divisor != 0
 */
public class DivideTwoIntegers {

  // Solução em 1 ms seguindo todas as restrições.
  public int divide(int dividend, int divisor) {
    boolean isMinValue = dividend == Integer.MIN_VALUE;

    if (isMinValue && divisor == -1) {
      return Integer.MAX_VALUE;
    }

    if (divisor == Integer.MIN_VALUE) return isMinValue ? 1 : 0;

    boolean isNegative = (dividend > 0) ^ (divisor > 0);

    int answer = 0;

    int absoluteDividend;
    int absoluteDivisor = divisor < 0 ? ~divisor + 1 : divisor;

    if (isMinValue) {
      absoluteDividend = Integer.MAX_VALUE - absoluteDivisor + 1;
      answer = 1;
    } else {
      absoluteDividend = dividend < 0 ? ~dividend + 1 : dividend;
    }


    while (absoluteDividend >= absoluteDivisor) {
      int shift = 0;
      while ((absoluteDivisor << shift) > 0 && absoluteDividend >= (absoluteDivisor << shift)) {
        shift++;
      }
      answer += (1 << (shift - 1));
      absoluteDividend -= absoluteDivisor << (shift - 1);
    }
    return isNegative ? ~answer + 1 : answer;
  }

  // Solução em 1 ms, porém utiliza inteiro 64 bits.
  public int secondSolution(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }

    boolean isNegative = (dividend > 0) ^ (divisor > 0);

    int answer = 0;

    long absoluteDividend = dividend < 0 ? ~((long) dividend) + 1 : dividend;
    long absoluteDivisor = divisor < 0 ? ~((long) divisor) + 1 : divisor;

    while (absoluteDividend >= absoluteDivisor) {
      int shift = 0;
      while (absoluteDividend >= (absoluteDivisor << shift)) {
        shift++;
      }
      answer += (1 << (shift - 1));
      absoluteDividend -= absoluteDivisor << (shift - 1);
    }
    return isNegative ? ~answer + 1 : answer;
  }

  // Solução em 1773 ms, muito ruim.
  public int firstSolution(int dividend, int divisor) {
    if (divisor == 1) return dividend;

    if (divisor == -1) {
      if (dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;

      return ~dividend + 1;
    }

    if (divisor == Integer.MIN_VALUE) {
      if (dividend == Integer.MIN_VALUE) return 1;

      return 0;
    }

    int answer = 0;
    int increment;

    if (dividend < 0 ^ divisor < 0) {
      increment = -1;
    } else {
      increment = 1;
    }

    // Garantir que dividend seja negativo.
    if (dividend > 0) dividend = ~dividend + 1;
    // Garantir que divisor seja positivo.
    if (divisor < 0) divisor = ~divisor + 1;

    int negativeDivisor = ~divisor + 1;

    while (dividend <= negativeDivisor) {
      dividend += divisor;
      answer += increment;
    }

    return answer;
  }

}
