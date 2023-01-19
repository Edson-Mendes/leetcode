package br.com.emendes.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * Dada uma string s, encontre o comprimento da maior
 * substring sem repetir caracteres.
 */
public class LongestSubstringWithoutRepeatingCharacters {

  /**
   * Primeira solução que eu criei, acredito que execute em O(n²), então não está bom!
   */
  public int lengthOfLongestSubstring(String s) {
    char[] stringAsCharArray = s.toCharArray();
    int arrayLength = stringAsCharArray.length;
    int longest = 0;
    int currentSize = 0;
    int index = 0;
    Map<Character, Integer> actualCharacters = new HashMap<>();

    while (index < arrayLength) {
      Integer indexFound = actualCharacters.get(stringAsCharArray[index]);
      if (indexFound == null) {
        actualCharacters.put(stringAsCharArray[index], index);
        currentSize++;
        index++;
      } else {
        index = indexFound + 1;
        if (currentSize > longest) {
          longest = currentSize;
        }
        currentSize = 0;
        actualCharacters = new HashMap<>();
      }
    }
    if (currentSize > longest) {
      longest = currentSize;
    }

    return longest;
  }

}
