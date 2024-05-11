package br.com.emendes.problems;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Dado uma string s e um dicionário de strings wordDict, retorne true se s pode ser segmentado em uma sequência
 * separada por espaços de uma ou mais palavras do dicionário.<br>
 * <br>
 * Observe que a mesma palavra no dicionário pode ser reutilizada várias vezes na segmentação.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= s.length <= 300</li>
 *   <li>1 <= wordDict.length <= 1000</li>
 *   <li>1 <= wordDict[i].length <= 20</li>
 *   <li>s e wordDict[i] consistem de letras inglesas minúsculas</li>
 *   <li>Todas as strings em wordDict são únicas.</li>
 * </ul>
 */
public class WordBreak {

  public boolean wordBreak(String s, List<String> wordDict) {
    Set<String> wordSet = new HashSet<>(wordDict);
    int maxLength = getMaxLength(wordDict);
    int length = s.length();
    boolean[] dp = new boolean[length + 1];
    dp[0] = true;

    for (int i = 1; i <= length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (i - j > maxLength) break;
        if (dp[j] && wordSet.contains(s.substring(j, i))) {
          dp[i] = true;
          break;
        }
      }
    }

    return dp[length];
  }

  private int getMaxLength(List<String> wordDict) {
    return wordDict.stream().mapToInt(String::length).max().getAsInt();
  }

  // ------------------ First Solution ------------------
  private Set<String> dict;
  private Map<String, Boolean> cache;

  /**
   * First Solution.
   */
  public boolean firstSolution(String s, List<String> wordDict) {
    dict = wordDict.stream().collect(Collectors.toSet());
    cache = new HashMap<>();
    return canSegment(s);
  }

  private boolean canSegment(String word) {
    if (cache.containsKey(word)) return cache.get(word);
    if (dict.contains(word)) {
      cache.put(word, Boolean.TRUE);
      return true;
    }

    for (int i = word.length() - 1; i > 0; i--) {
      String left = word.substring(0, i);
      String right = word.substring(i);
      if (canSegment(left) && canSegment(right)) {
        cache.put(word, Boolean.TRUE);
        return true;
      }
    }

    cache.put(word, Boolean.FALSE);
    return false;
  }

}
