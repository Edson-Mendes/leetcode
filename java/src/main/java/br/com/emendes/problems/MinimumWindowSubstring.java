package br.com.emendes.problems;

/**
 * Dados duas Strings s e t de comprimentos m e n respectivamente, retorne o minimum window substring de s
 * de modo que cada caractere em t (incluindo duplicatas) seja incluído na janela.
 * Se não existir tal substring, retorne uma String vazia ("").<br><br>
 * <p>
 * O casos de testes são gerados de modo que a resposta seja única.<br><br>
 * <p>
 * Restrições:<br>
 * m == s.length<br>
 * n == t.length<br>
 * 1 <= m, n <= 10⁵<br>
 * s e t consistem de letras maiúsculas e minúculas inglesas.
 */
public class MinimumWindowSubstring {

  public String minWindow(String s, String t) {
    int startAns = -1;
    int endAns = -1;

    int m = s.length();
    int n = t.length();

    for (int i = 0; m - i >= n; i++) {
      boolean[] check = new boolean[n];
      int counter = 0;
      int j;
      for (j = i; j < m && counter < n; j++) {
        char c = s.charAt(j);
        int position = t.indexOf(c);
        while (position != -1 && check[position]) {
          position = t.indexOf(c, position + 1);
        }
        if (position != -1) {
          check[position] = true;
          counter++;
        }
      }

      if (counter == n && (startAns == -1 || endAns - startAns > j - i)) {
        startAns = i;
        endAns = j;
      }
    }

    return startAns == -1 ? "" : s.substring(startAns, endAns);
  }

}
