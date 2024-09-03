package br.com.emendes.problems;

import java.util.Arrays;

/**
 * Dado um inteiro n, retorne a quantidade de números primos que são estritamente menores que n.<br>
 * <br>
 * Restrições:<br>
 * -> 0 <= n <= 5 * 10⁶
 */
public class CountPrimes {

  public int countPrimes(int n) {
    if (n < 3) return 0;

    int count = 0;
    for (boolean isPrime : sieveEratosthenes(n)) {
      if (isPrime) count++;
    }
    return count;
  }

  private boolean[] sieveEratosthenes(int n) {
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;
    for (int i = 2; i * i < n; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j < n; j += i) {
          isPrime[j] = false;
        }
      }
    }
    return isPrime;
  }

}
