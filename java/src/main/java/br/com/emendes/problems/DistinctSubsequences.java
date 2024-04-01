package br.com.emendes.problems;

/**
 * Dado duas strings s e t, retorne o número de subsequencias distintas de s iguais a t.<br>
 * <br>
 * Os casos de testes são gerados de maneira que a resposta cabe em um inteiro assinado de 32-bits.<br>
 * <br>
 * Restrições:<br>
 * 1 <= s.length, t.length <= 1000<br>
 * s e t consistem de letras inglesas.
 */
public class DistinctSubsequences {

  private Integer[][] buffer;
  private String s;
  private String t;

  public int numDistinct(String s, String t) {
    if (t.length() > s.length()) return 0;
    if (t.length() == s.length()) return t.equals(s) ? 1 : 0;

    buffer = new Integer[t.length()][s.length()];
    this.s = s;
    this.t = t;
    preFillBuffer();

    return numDistinctHelper(0, 0);
  }

  private int numDistinctHelper(int ti, int sj) {
    if (buffer[ti][sj] != null) return buffer[ti][sj];

    int tLength = t.length() - ti;
    int sLength = s.length() - sj;
    if (tLength > sLength) return 0;
    boolean areEquals = t.charAt(ti) == s.charAt(sj);

    if (tLength == sLength) {
      return areEquals ? numDistinctHelper(ti + 1, sj + 1) : 0;
    }

    if (areEquals) {
      return numDistinctHelper(ti, sj + 1) + numDistinctHelper(ti + 1, sj + 1);
    }
    return numDistinctHelper(ti, sj + 1);
  }

  private void preFillBuffer() {
    int sLast = s.length() - 1;
    int tLast = t.length() - 1;
    char tLastChar = t.charAt(tLast);
    for (int i = 0; i < tLast; i++) {
      buffer[i][sLast] = 0;
    }

    buffer[tLast][sLast] = s.charAt(sLast) == tLastChar ? 1 : 0;

    for (int j = sLast - 1; j >= 0; j--) {
      buffer[tLast][j] = s.charAt(j) == tLastChar ? 1 + buffer[tLast][j + 1] : buffer[tLast][j + 1];
    }
  }

}
