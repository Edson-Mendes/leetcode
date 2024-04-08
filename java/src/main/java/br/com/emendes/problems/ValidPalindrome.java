package br.com.emendes.problems;

/**
 * Uma frase é um palíndromo se, depois de converter todas as letras maiúsculas em letras minúsculas e
 * remover todos os caracteres não alfanuméricos, ele lê o mesmo para frente e para trás.
 * Os caracteres alfanuméricos incluem letras e números.<br>
 * <br>
 * Dada uma string s, retorne true se for um palíndromo ou false caso contrário.<br>
 * <br>
 * Restrições:<br>
 * 1 <= s.length <= 2 * 10⁵<br>
 * s consiste apenas em caracteres ASCII imprimíveis.
 */
public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    boolean isPalindrome = true;

    while (left < right && isPalindrome) {
      char leftCharacter = s.charAt(left);
      if (isAlphanumeric(leftCharacter)) {
        leftCharacter = toLowercase(leftCharacter);
        while (left <= right && !isAlphanumeric(s.charAt(right))) {
          right--;
        }
        isPalindrome = left <= right && toLowercase(s.charAt(right)) == leftCharacter;
        right--;
      }
      left++;
    }

    return isPalindrome;
  }

  private char toLowercase(char character) {
    return character >= 65 && character <= 90 ? (char) (character + 32) : character;
  }

  private boolean isAlphanumeric(char character) {
    return (character >= 97 && character <= 122) ||
           (character >= 65 && character <= 90) ||
           (character >= 48 && character <= 57);
  }

}
