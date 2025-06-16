package br.com.emendes.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado uma string s e um inteiro k, retorne o comprimento da maior substring de s de modo que
 * a frequência de cada caracter nessa substring é maior ou igual a k.
 * <br><br>
 * Se nenhum substring existir, retorne 0.
 * <br><br>
 * Restrições:<br>
 * 1 <= s.length <= 10⁴<br>
 * s consiste apenas de letras minúsculas.<br>
 * 1 <= k <= 10⁵
 */
public class LongestSubstringWithAtLeastKRepeatingCharacters {

  public int longestSubstring(String s, int k) {
    if (k > s.length()) return 0;
    int[] memo = new int[123];
    for (int i = 0; i < s.length(); i++) {
      memo[s.charAt(i)]++;
    }

    return longestSubstringHelper(s, k, 0, s.length() - 1, memo, new HashMap<>());
  }

  private int longestSubstringHelper(String s, int k, int i, int j, int[] letters, Map<String, Integer> cache) {
    if (i > j) return 0;
    String key = s.substring(i, j + 1);
    if (cache.containsKey(key)) return cache.get(key);
    int value;
    if (allLettersAreValid(letters, k)) {
      value = j - i + 1;
    } else {
      char left = s.charAt(i);
      char right = s.charAt(j);
      if (letters[left] < k) {
        letters[left]--;
        value = longestSubstringHelper(s, k, i + 1, j, letters, cache);
        letters[left]++;
      } else if (letters[right] < k) {
        letters[right]--;
        value = longestSubstringHelper(s, k, i, j - 1, letters, cache);
        letters[right]++;
      } else {
        letters[left]--;
        int leftAnswer = longestSubstringHelper(s, k, i + 1, j, letters, cache);
        letters[left]++;
        letters[right]--;
        int rightAnswer = longestSubstringHelper(s, k, i, j - 1, letters, cache);
        letters[right]++;
        value = Math.max(leftAnswer, rightAnswer);
      }
    }
    cache.put(key, value);
    return value;
  }

  private boolean allLettersAreValid(int[] memo, int k) {
    for (int i = 97; i < 123; i++)
      if (memo[i] < k && memo[i] != 0) return false;
    return true;
  }

}
