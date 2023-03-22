package br.com.emendes.dividetwointegers;

/**
 * Dado dois inteiros dividend e divisor, divida os dois inteiros sem usar multiplicação, divisão ou operador mod.<br><br>
 *
 * A divisão inteira deve truncar em direção a zero, o que significa perder sua parte fracionária.
 * Por exemplo, 8,345 seria truncado para 8 e -2,7335 seria truncado para -2.<br><br>
 *
 * Retorne o quociente depois de dividir o dividendo pelo divisor.<br><br>
 *
 * Nota: Suponha que estamos lidando com um ambiente que só pode armazenar inteiros dentro
 * do intervalo de inteiros com sinal de 32 bits: [−2^31, 2^31 − 1].
 * Para este problema, se o quociente for estritamente maior que 2^31 - 1, retorne 2^31 - 1 e,
 * se o quociente for estritamente menor que -2^31, retorne -2^31.<br><br>
 *
 * Restrições:<br>
 * -2^31 <= dividend, divisor <= 2^31 - 1<br>
 * divisor != 0
 */
public class DivideTwoIntegers {

  // Solução em 1773 ms, muito ruim.
  public int divide(int dividend, int divisor) {
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
      answer+=increment;
    }

    return answer;
  }

}
