package br.com.emendes.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Podemos embaralhar uma string s para obter uma string t usando o seguinte algoritmo:
 * <br>
 * <ol>
 * <li>Se o comprimento da string for 1, pare.</li>
 * <li>Se o comprimento da string for > 1, faça o seguinte:</li>
 *      <ul>
 *        <li>
 *          Divida a string em duas substrings não vazias em um índice aleatório, ou seja,
 *          se a string for s, divida-a em x e y, onde s = x + y.
 *        </li>
 *        <li>
 *          Decida aleatoriamente trocar as duas substrings ou mantê-las na mesma ordem. ou seja, após esta etapa,
 *        s pode se tornar s = x + y ou s = y + x
 *        </li>
 *        <li>
 *          Aplique a etapa 1 recursivamente em cada uma das duas substrings x e y.
 *        </li>
 *      </ul>
 * </ol>
 * <p>
 * Dadas duas strings s1 e s2 do mesmo comprimento, retorne verdadeiro se s2 for uma string embaralhada de s1,
 * caso contrário, retorne falso.<br>
 * <br>
 * Restrições:<br>
 * s1.length == s2.length<br>
 * 1 <= s1.length <= 30<br>
 * s1 e s2 consistem de letras inglêsas minúsculas.
 */
public class ScrambleString {

  private Map<String, Boolean> memo = new HashMap<>();

  public boolean isScramble(String s1, String s2) {
    if (s1.equals(s2)) return true;

    String hashKey = s1 + "+" + s2;
    if (memo.containsKey(hashKey))
      return memo.get(hashKey);

    int[] count = new int[128];

    for (int i = 0; i < s1.length(); i++) {
      count[s1.charAt(i)]++;
      count[s2.charAt(i)]--;
    }

    for (int freq : count) {
      if (freq != 0) {
        memo.put(hashKey, false);
        return false;
      }
    }

    for (int i = 1; i < s1.length(); i++) {
      if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
          isScramble(s1.substring(i), s2.substring(i))) {
        memo.put(hashKey, true);
        return true;
      }
      if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i)) &&
          isScramble(s1.substring(i), s2.substring(0, s2.length() - i))) {
        memo.put(hashKey, true);
        return true;
      }

    }
    memo.put(hashKey, false);
    return false;
  }

}
