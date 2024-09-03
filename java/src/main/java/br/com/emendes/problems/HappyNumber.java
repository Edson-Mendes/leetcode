package br.com.emendes.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Escreva um algoritmo para determinar se um número n é happy.<br>
 * <br>
 * Um número happy é um número definido pelo seguintes processos:<br>
 * <br>
 * -> Começa com qualquer inteiro positivo, substitua o número pela soma dos quadrados dos seus dígitos.<br>
 * -> Repita o processo até que o número seja igual a 1 (onde permanecerá),
 * ou faça um loop infinito em um ciclo que não inclui 1.<br>
 * -> Os números para os quais esse processo termina em 1 são felizes.<br>
 * <br>
 * Retorne true se o número é happy ou false caso contrário.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= n <= 2³¹ - 1
 */
public class HappyNumber {

  public boolean isHappy(int n) {
    int slow = nextNumber(n);
    int fast = nextNumber(slow);

    while (slow != fast) {
      slow = nextNumber(slow);
      fast = nextNumber(nextNumber(fast));
    }

    return slow == 1;
  }

  public boolean firstSolution(int n) {
    Set<Integer> usedNumbers = new HashSet<>();
    while (n != 1 && !usedNumbers.contains(n)) {
      usedNumbers.add(n);
      n = nextNumber(n);
    }
    return n == 1;
  }

  private int nextNumber(int n) {
    int nextNumber = 0;
    while (n != 0) {
      int digit = n % 10;
      nextNumber += digit * digit;
      n /= 10;
    }

    return nextNumber;
  }

}
