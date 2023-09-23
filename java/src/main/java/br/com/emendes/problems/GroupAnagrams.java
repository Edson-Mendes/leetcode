package br.com.emendes.problems;

import java.util.*;

/**
 * Dado um array de Strings strs, agrupe os anagramas juntos. Você pode retornar a resposta em qualquer ordem.<br>
 *
 * Um anagrama é uma palavra formada pelo rearranjo das letras de uma diferente palavra ou frase,
 * tipicamente usando todas a letras originais exatamente uma vez.<br><br>
 *
 * Restrições:<br>
 * 1 <= strs.length <= 10⁴<br>
 * 0 <= strs[i].length <= 100<br>
 * strs[i] consiste de letras inglesas minúsculas.
 */
public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> answer = new HashMap<>();

    for (String str : strs) {
      char[] strCharArray = str.toCharArray();
      Arrays.sort(strCharArray);
      String strOrderly = String.valueOf(strCharArray);

      List<String> anagrams = answer.get(strOrderly);

      if (anagrams == null) {
        anagrams = new ArrayList<>();
        answer.put(strOrderly, anagrams);
      }

      anagrams.add(str);
    }

    return new ArrayList<>(answer.values());
  }

}
