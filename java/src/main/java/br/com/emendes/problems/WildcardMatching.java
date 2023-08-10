package br.com.emendes.problems;

/**
 * Dado uma String (s) de entrada e um pattern (p), implemente wildcard pattern matching com suporte
 * para '?' e '*' onde:<br>
 * <p>
 * '?' combina com qualquer caracter.<br>
 * '*' combina com qualquer sequência de caracteres (incluindo a sequência vazia).<br><br>
 * <p>
 * A correspondência deve cobrir toda a String de entrada (não parcial).<br><br>
 * <p>
 * Restrições:<br>
 * 0 <= s.length, p.length <= 2000<br>
 * s contém apenas letras inglesas minúsculas.<br>
 * p contém apenas letras inglesas minúsculas, '?' or '*'.
 */
public class WildcardMatching {

  private Boolean[][] results;
  private int sLength;
  private int pLength;

  public boolean isMatch(String s, String p) {
    sLength = s.length();
    pLength = p.length();

    results = new Boolean[sLength + 1][pLength + 1];

    return isMatchUtil(0, 0, s.toCharArray(), p.toCharArray());
  }

  private boolean isMatchUtil(int si, int pi, char[] string, char[] pattern) {
    if (results[si][pi] != null)
      return results[si][pi];

    // Se pattern foi totalmente verificado, retorna se a string foi toda verificada ou não.
    if (pi == pLength) return si == sLength;

    boolean ans;
    if (pattern[pi] == '*') {
      // Como o current pattern é '*', verifica se (si) corresponde com (pi + 1) ou se
      // (si + 1) corresponde com (pi).
      ans = isMatchUtil(si, pi + 1, string, pattern) || (si < sLength && isMatchUtil(si + 1, pi, string, pattern));
    } else {
      boolean isCurrentIndexesMatch = si < sLength && (string[si] == pattern[pi] || pattern[pi] == '?');

      if (isCurrentIndexesMatch) {
        // índices atuais correspondem, então deve-se testar os próximos.
        ans = isMatchUtil(si + 1, pi + 1, string, pattern);
      } else {
        ans = false;
      }
    }

    results[si][pi] = ans;
    return ans;
  }

}
