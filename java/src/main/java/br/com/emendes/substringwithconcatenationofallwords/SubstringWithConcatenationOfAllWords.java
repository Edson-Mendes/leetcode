package br.com.emendes.substringwithconcatenationofallwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  /**
   * Pessíma solução, cheia de gambiarra, não consigo nem explicar o que eu fiz<br>
   * Executou em 402 ms.
   */
  public List<Integer> firstSolution(String s, String[] words) {
    List<Integer> answer = new ArrayList<>();

    int wordsStringLength = words[0].length();
    int substringLength = words.length * wordsStringLength;
    int sLength = s.length();

    if (sLength < substringLength) return answer;

    // Gerar HashMap com as String em words.
    Map<String, Integer> wordsMap = generateMap(words);

    int startSubstring = 0;
    int counter = words.length;
    int currIndex = 0;
    int lastIndex = sLength - wordsStringLength + 1;

    while (currIndex < lastIndex) {
      String word = s.substring(currIndex, currIndex + wordsStringLength);

      if (existsOnMap(word, wordsMap)) {
        counter--;
        if (counter == 0) {
          answer.add(startSubstring);
          counter = words.length;
          startSubstring = startSubstring + 1;
          currIndex = startSubstring;
          wordsMap = generateMap(words);
        } else {
          currIndex += wordsStringLength;
        }
      } else {
        startSubstring = startSubstring + 1;
        currIndex = startSubstring;
        counter = words.length;
        wordsMap = generateMap(words);
      }
    }

    return answer;
  }

  /**
   * Verify if exists word on map
   * @param word to be found on map
   * @param map which contains all words.
   * @return true if map contains word and value is greater than zero. False otherwise.
   */
  private boolean existsOnMap(String word, Map<String, Integer> map) {
    Integer value = map.get(word);
    if (value == null || value == 0) return false;
    map.put(word, value - 1);
    return true;
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

