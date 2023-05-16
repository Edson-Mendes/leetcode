package br.com.emendes.problems;

public class RegularExpressionMatching {

  private Boolean[][] results;

  public boolean isMatch(String s, String p) {
    char[] text = s.toCharArray();
    char[] pattern = p.toCharArray();
    int textLength = text.length;
    int patternLength = pattern.length;

    results = new Boolean[textLength + 1][patternLength + 1];

    return isMatchUtil(0, 0, textLength, patternLength, text, pattern);
  }

  /**
   * @param ti índice atual do array text.
   * @param pi [indice atual do array pattern.
   */
  private boolean isMatchUtil(int ti, int pi, int textLength, int patternLength, char[] text, char[] pattern) {
    // Verifica se tal subresult foi calculado, e retorna se SIM.
    if (results[ti][pi] != null)
      return results[ti][pi];

    boolean ans;
    if (pi == patternLength) {
      ans = ti == textLength;
    } else {
      // Verifica se text[iText] combina com pattern[iPattern].
      boolean firstMatch = (ti < textLength &&
          (text[ti] == pattern[pi]  || pattern[pi] == '.'));

      // Caso o próximo caracter de pattern seja '*' então deve-se verificar os submatches.
      if (pi + 1 < patternLength && pattern[pi + 1] == '*') {
        ans = isMatchUtil(ti, pi + 2, textLength, patternLength, text, pattern) ||
            firstMatch && isMatchUtil(ti + 1, pi, textLength, patternLength, text, pattern);
      } else {
        // caso não tenha '*' verifica se text e pattern conferem até o momento e se conferem nos próximos índices.
        ans = firstMatch && isMatchUtil(ti + 1, pi + 1, textLength, patternLength, text, pattern);
      }
    }

    results[ti][pi] = ans;
    return ans;
  }

}
