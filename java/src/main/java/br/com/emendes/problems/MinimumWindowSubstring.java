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
    int m = s.length();
    int n = t.length();

    if (n > m) return "";

    int startAns = -1;
    int endAns = -1;

    int[] charCounterS = new int[123];
    int[] charCounterT = new int[123];
    int counter = 0;


    for (int i = 0; i < n; i++) {
      charCounterT[t.charAt(i)]++;
    }

    int left = 0;
    int right = 0;
    while (right < m) {
      char character = s.charAt(right);
      if (charCounterT[character] > 0) {
        if (charCounterS[character] < charCounterT[character]) {
          counter++;
        }
        charCounterS[character]++;
      }
      right++;
      while (counter == n) {
        if (startAns == -1 || endAns - startAns > right - left) {
          startAns = left;
          endAns = right;
        }

        character = s.charAt(left);
        if (charCounterT[character] > 0) {
          charCounterS[character]--;
          if (charCounterS[character] < charCounterT[character]) {
            counter--;
          }
        }
        left++;
      }
    }

    return startAns == -1 ? "" : s.substring(startAns, endAns);
  }

}
