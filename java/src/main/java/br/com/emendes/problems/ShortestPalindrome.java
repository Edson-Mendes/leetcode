package br.com.emendes.problems;

/**
 * Você recebe um string s. Você pode converter s em um palíndromo adicionando caracteres na frente de s.<br>
 * <br>
 * Retorne o menor palíndromo que você pode encontrar realizando essa transformação.<br>
 * <br>
 * Restrições:<br>
 * 0 <= s.length <= 5 * 10⁴<br>
 * s consistem de letras minúsculas.
 */
public class ShortestPalindrome {

  public String shortestPalindrome(String s) {
    if (s.isEmpty()) return s;
    StringBuilder word = new StringBuilder(s);
    StringBuilder wordReversed = word.reverse();

    int start = 0;
    while (!s.startsWith(wordReversed.substring(start))) {
      start++;
    }

    return wordReversed.substring(0, start) + s;
  }

  /**
   * First solution.
   */
  public String firstSolution(String s) {
    int right = s.length() - 1;
    while (!isPalindrome(s, right)) {
      right--;
    }
    StringBuilder prefix = new StringBuilder();
    for (int i = s.length() - 1; i > right; i--) {
      prefix.append(s.charAt(i));
    }

    return prefix + s;
  }

  private boolean isPalindrome(String s, int right) {
    int left = 0;
    while (left <= right && s.charAt(left) == s.charAt(right)) {
      left++;
      right--;
    }

    return left > right;
  }

}
