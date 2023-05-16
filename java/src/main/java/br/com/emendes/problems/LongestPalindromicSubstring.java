package br.com.emendes.problems;

/**
 * Dada uma string s, retorne a substring palindrômica mais longa em s.
 */
public class LongestPalindromicSubstring {

  // Solução utilizando uma tabela de boolean para armazenar se substrings são palíndromos ou não.
  // Está solução executou em 78 ms, ainda tem alguma solução melhor
  public String longestPalindrome(String s) {
    char[] tempS = s.toCharArray();
    int sLength = s.length();
    boolean[][] results = new boolean[sLength][sLength];

    int answerLength = 1;
    int answerStart = 0;

    int end;
    int init;
    int currentLength;
    int i;

    // preenche a matriz para substrings de tamanho = 1 e verifica para o tamanho = 2.
    for (i = 0; i < sLength - 1; i++) {
      results[i][i] = true;
      if (tempS[i] == tempS[i + 1]) {
        results[i][i + 1] = true;
        answerStart = i;
        answerLength = 2;
      }
    }

    // Verifica as substring de tamanho > 2 && tamanho < sLength
    for (currentLength = 3; currentLength <= sLength; currentLength++) {

      // init -> index do INÍCIO da substring que será verificada.
      // end -> index do FIM da substring que será verificada.
      for (init = 0; init < sLength - currentLength + 1; ++init) {
        end = init + currentLength - 1;

        // Verifica se a substring anterior é um palindromo e se o char init e char end são iguais
        // Se SIM, encontramos uma nova substring que é um palindromo.
        if (results[init + 1][end - 1] && tempS[init] == tempS[end]) {
          results[init][end] = true;

          if (currentLength > answerLength) {
            answerStart = init;
            answerLength = currentLength;
          }
        }
      }
    }

    return s.substring(answerStart, answerStart + answerLength);
  }

  // Solução usando força bruta.
  public String badSolution(String s) {
    StringBuilder sAux = new StringBuilder(s);
    int sLength = s.length();
    int x;
    int y;

    String answer = sAux.substring(0, 1);
    int ansLength = 1; // comprimento da atual resposta.

    for (x = 0; (x < sLength) && (sLength - x > ansLength); x++) {
      for (y = x + ansLength + 1; y <= sLength; y++) {
        StringBuilder tempSubstring = new StringBuilder(sAux.subSequence(x, y));
        String substring = tempSubstring.toString();
        String reverseSubstring = tempSubstring.reverse().toString();
        if (substring.equals(reverseSubstring)) {
          answer = substring;
          ansLength = answer.length();
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    String s = "qkajbumzdzkiplmbcpnhbzweoevrvbptpozhtrfntszvnwbdahvkykmezrwruhvvslngruvwqebudtfxgpbmwefczwrecpqje" +
        "gxkqknpobzkemmtruidulnxgntjxcmxtwmlxhzmbqfqylwvzjyojhfawwuupiipvxjiyxkqvsxbhgzzegfkdihizvjoxzrmeorikzsdy" +
        "phbujaqmykrfblneqmwwxsoonzsgvligqxrrumspylfvquklbanjhkudlprwoycpxdsueokruoofyubirbhbyfuvgllijywuqmkcsfjtt" +
        "bnmelrylivkefllepgxnoeummujbaoyvryukyoumvuxezegpwgmwsupjuaarvbtbfmisrifjadqjypmzipvjysgakvjhfeaqwpsqijvqib" +
        "shctuabwqqsjwotjopahoaptmxkwerkjkmwiodgblhtnhykzjuaoluoyokroxuvqtkpggfanzabgjejdfsgybhxbscubdpufywbxguthe" +
        "skuhixasnksoayjngvhfoxxclykfobrwxjwgefarzczvptlfrgrtrjcemaeihpukhbeoezgvrwxgyhpkkfvmfvquwtswkdwqqgrgasopladd" +
        "nteulqofmjhewpghkibbrewnhdllfppctgkfkoedoiwqocnpvfviochrokrgrzthrvyhqfsrzyyvqwkhuzsrkfaympcdodkwaojnghzytkhf";

    System.out.println(solution.longestPalindrome(s));
  }

}
