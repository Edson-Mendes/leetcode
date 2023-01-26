package br.com.emendes.palindromenumber;

/**
 * Dado um inteiro x, retorne verdadeiro se x for um palíndromo e falso caso contrário.
 */
public class PalindromeNumber {

  // Solução inicial, não executou em um bom tempo (16ms).
  public boolean isPalindrome(int x) {
    if (x < 0) return false; // Número negativo não pode ser palíndromo por causa do sinal.

    char[] number = String.valueOf(x).toCharArray();
    int leftIndex = 0;
    int rightIndex = number.length - 1;

    while (leftIndex < rightIndex) {
      if(number[leftIndex] != number[rightIndex]) return false;

      leftIndex++;
      rightIndex--;
    }

    return true;
  }

  public static void main(String[] args) {
    PalindromeNumber solution = new PalindromeNumber();

    int x = 101;

    System.out.println(solution.isPalindrome(x));
  }

}
