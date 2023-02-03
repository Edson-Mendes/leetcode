package br.com.emendes.reverseinteger;

/**
 * Dado um inteiro x de 32 bits com sinal, retorne x com seus dígitos invertidos.
 * Se a reversão de x fizer com que o valor saia do intervalo de inteiros de 32 bits assinados [-2³¹, 2³¹ - 1], retorne 0.
 * <br><br>
 * Suponha que o ambiente não permita que você armazene números inteiros de 64 bits (com ou sem sinal).
 */
public class ReverseInteger {

  // Solução que quebra a regra de não usar inteiros 64 bits.
  public int reverse(int x) {
    boolean isNegative = x < 0;

    long reverseX = 0;
    int digit;
    if (isNegative) x *= -1;

    while (x > 0) {
      digit = x % 10;
      reverseX = (reverseX * 10) + digit;
      x = x/10;
    }

    if(isNegative) reverseX *= -1;

    if (reverseX > 2_147_483_647 || reverseX < -2_147_483_648) return 0;

    return (int) reverseX;
  }

}
