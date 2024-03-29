package br.com.emendes.problems;

/**
 * Dado um inteiro x, retorne verdadeiro se x for um palíndromo e falso caso contrário.
 */
public class PalindromeNumber {

  // Solução um pouco melhor, executou em 11ms, mas ainda tem solução melhor.
  public boolean isPalindrome(int x) {
    if (x < 0 || (x != 0 && x % 10 == 0)) return false;

    long reversedX = 0;
    long tempX = x;

    while (x / 10 != 0) {
      reversedX = (reversedX * 10) + x % 10;
      x = x / 10;
    }
    reversedX = (reversedX * 10) + x % 10;
    return tempX == reversedX;
  }

  // Solução inicial, não executou em um bom tempo (16ms).
  public boolean oldSolution(int x) {
    if (x < 0) return false; // Número negativo não pode ser palíndromo por causa do sinal.

    char[] number = String.valueOf(x).toCharArray();
    int leftIndex = 0;
    int rightIndex = number.length - 1;

    while (leftIndex < rightIndex) {
      if (number[leftIndex] != number[rightIndex]) return false;

      leftIndex++;
      rightIndex--;
    }

    return true;
  }

  public static void main(String[] args) {
    PalindromeNumber solution = new PalindromeNumber();

    int x = 1111111111;

    System.out.println(solution.isPalindrome(x));
  }

}
