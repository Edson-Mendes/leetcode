package br.com.emendes.problems;

import java.util.*;

/**
 * Dado um array de Strings strs, agrupe os anagramas juntos. Você pode retornar a resposta em qualquer ordem.<br>
 * <p>
 * Um anagrama é uma palavra formada pelo rearranjo das letras de uma diferente palavra ou frase,
 * tipicamente usando todas a letras originais exatamente uma vez.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= strs.length <= 10⁴<br>
 * 0 <= strs[i].length <= 100<br>
 * strs[i] consiste de letras inglesas minúsculas.
 */
public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagrams = new HashMap<>();
    for (String word : strs) {
      int[] counter = new int[26];
      for (int i = 0; i < word.length(); i++) {
        counter[word.charAt(i) - 97]++;
      }
      String key = Arrays.toString(counter);
      List<String> anagram = anagrams.computeIfAbsent(key, k -> new ArrayList<>());
      anagram.add(word);
    }

    return new ArrayList<>(anagrams.values());
  }

  public List<List<String>> firstSolution(String[] strs) {
    Map<String, List<String>> answer = new HashMap<>();

    for (String str : strs) {
      char[] strCharArray = str.toCharArray();
      Arrays.sort(strCharArray);
      String strOrderly = String.valueOf(strCharArray);

      List<String> anagrams = answer.computeIfAbsent(strOrderly, key -> new ArrayList<>());

      anagrams.add(str);
    }

    return new ArrayList<>(answer.values());
  }

}
