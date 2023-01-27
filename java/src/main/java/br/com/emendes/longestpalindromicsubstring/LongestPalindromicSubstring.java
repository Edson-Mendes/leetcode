package br.com.emendes.longestpalindromicsubstring;

public class LongestPalindromicSubstring {

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

    System.out.println(solution.badSolution(s));
  }

}
