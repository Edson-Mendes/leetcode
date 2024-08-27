package br.com.emendes.problems;

/**
 * Escreva um função que recebe um binário representando um inteiro positivo e
 * retorne o número de bits igual a 1 (sets bits também conhecido como Hamming weight).<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= n 2³¹ - 1<br>
 * <br>
 * Follow up: Se essa função for chamada muitas vezes, como você otimizaria?
 */
public class NumberOf1Bits {

  public int hammingWeight(int n) {
    int hammingWeight = 0;
    for (int i = 0; i < 31; i++) {
      int bit = (n >> i) & 1;
      if (bit == 1) hammingWeight++;
    }

    return hammingWeight;
  }

}
