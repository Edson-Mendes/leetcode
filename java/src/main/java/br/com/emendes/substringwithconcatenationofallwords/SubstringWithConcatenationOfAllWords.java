package br.com.emendes.substringwithconcatenationofallwords;

import java.util.*;

/**
 * Você recebe uma string s e um array de strings words. Todas as Strings de words têm o mesmo comprimento.
 * Uma substring concatenada em s é uma substring que contém todas as strings de qualquer permutação de words concatenadas.<br><br>
 * <p>
 * Por exemplo, se palavras = ["ab","cd","ef"],
 * então "abcdef", "abefcd", "cdabef", "cdefab", "efabcd" e "efcdab" são todas strings concatenadas.
 * "acdbef" não é uma substring concatenada porque não é a concatenação de nenhuma permutação de palavras.<br><br>
 * <p>
 * Retorne os índices iniciais de todas as substrings concatenadas em s. Você pode retornar a resposta em qualquer ordem.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= s.length <= 10⁴<br>
 * 1 <= words.length <= 5000<br>
 * 1 <= words[i].length <= 30<br>
 * s e words[i] consistem de letras inglesas minúsculas.<br>
 */
public class SubstringWithConcatenationOfAllWords {

  private int wordLength;

  /**
   * Solução usando HashMap para armazenar as Strings de words.
   * Executou em 139 ms.
   */
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> answer = new ArrayList<>();
    int sLength = s.length();
    wordLength = words[0].length();
    int wordsArrayLength = words.length;
    int substringSize = wordLength * wordsArrayLength;

    if (sLength < substringSize) return answer;

    Set<Map.Entry<String, Integer>> wordCountEntry = generateMap(words).entrySet();

    for (int index = 0; index + substringSize <= sLength; index++) {
      if (check(index, index + substringSize, s, cloneMapFromEntry(wordCountEntry))) {
        answer.add(index);
      }
    }

    return answer;
  }

  /**
   * Verifica se uma substring válida começa no índice {@code index}.
   */
  private boolean check(int index, int lastIndex, String s, Map<String, Integer> wordsMap) {
    int startIndex = index;

    while (startIndex < lastIndex) {
      String word = s.substring(startIndex, startIndex + wordLength);
      Integer value = wordsMap.get(word);
      if (value == null || value == 0) return false;
      wordsMap.put(word, value - 1);
      startIndex += wordLength;
    }
    return true;
  }

  /**
   * Clona um Map.Entry em um novo Map com novos valores.
   */
  private Map<String, Integer> cloneMapFromEntry(Set<Map.Entry<String, Integer>> entries) {
    Map<String, Integer> mapCopy = new HashMap<>();

    entries.forEach(entry -> {
      String key = entry.getKey();
      Integer value = entry.getValue();

      mapCopy.put(key, value);
    });

    return mapCopy;
  }

  /**
   * Generate map of all String in array words.
   *
   * @param words String array.
   */
  private Map<String, Integer> generateMap(String[] words) {
    Map<String, Integer> map = new HashMap<>();

    for (String word : words) {
      map.merge(word, 1, Integer::sum);
    }

    return map;
  }

}

