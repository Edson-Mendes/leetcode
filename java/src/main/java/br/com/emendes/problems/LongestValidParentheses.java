package br.com.emendes.problems;

/**
 * Dada uma string contendo apenas os caracteres '(' e ')', retorne o comprimento da maior substring que é um
 * parêntese válido (bem formado).<br><br>
 * <p>
 * Restrições:<br>
 * 0 <= s.length <= 3 * 10⁴<br>
 * s[i] é '(', or ')'.
 */
public class LongestValidParentheses {

  // Complexidade de tempo O(n)
  // Complexidade de espaço O(n)
  public int longestValidParentheses(String s) {
    int sLength = s.length();

    if (sLength < 2) return 0;

    int[] cache = new int[sLength];
    int answer = 0;

    if (s.charAt(0) == '(' && s.charAt(1) == ')') {
      cache[1] = 2;
      answer = 2;
    }

    for (int index = 2; index < sLength; index++) {
      char before = s.charAt(index - 1);
      char actual = s.charAt(index);
      if (actual == ')') {
        if (before == '(') {
          cache[index] = cache[index - 2] + 2;
          if (cache[index] > answer)
            answer = cache[index];
        } else {
          int i = index - cache[index - 1] - 1; //índice que deve conter um '(' para o index atual ser um parênteses válido.
          if (i > -1 && s.charAt(i) == '(') {
            i -= 1;
            cache[index] = cache[index - 1]  + 2;
            if (i > -1) {
              cache[index] += cache[i];
            }
            if (cache[index] > answer) {
              answer = cache[index];
            }
          }
        }
      }
    }

    return answer;
  }

}
