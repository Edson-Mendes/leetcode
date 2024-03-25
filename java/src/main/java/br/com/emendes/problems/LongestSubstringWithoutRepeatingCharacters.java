package br.com.emendes.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Dada uma string s, encontre o comprimento da maior
 * substring sem repetir caracteres.
 */
public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    int answer = 0;
    int[] buffer = new int[127];

    int counter = 0;
    int right = 0;
    int left = 0;
    while (right < s.length()) {
      char character = s.charAt(right);
      if (buffer[character] == 0) {
        buffer[character] = 1;
        counter++;
        if (counter > answer) {
          answer = counter;
        }
      } else {
        while (s.charAt(left) != character) {
          buffer[s.charAt(left)] = 0;
          left++;
          counter--;
        }
        left++;
      }
      right++;
    }

    return answer;
  }

  /**
   * Melhor solução que cheguei até o momento, executou em 5 ms.
   */
  public int secondSolution(String s) {
    char[] stringAsCharArray = s.toCharArray();
    int arrayLength = stringAsCharArray.length;
    int longest = 0;
    int currentSize = 0;
    int index = 0;
    int indexStart = 0;
    Integer indexFound;
    Map<Character, Integer> actualCharacters = new HashMap<>();

    while (index < arrayLength) {
      indexFound = actualCharacters.get(stringAsCharArray[index]);
      if (indexFound == null) {
        currentSize++;
      } else {
        removeIndexes(stringAsCharArray, indexStart, indexFound, actualCharacters);
        if (currentSize > longest) {
          longest = currentSize;
        }
        currentSize = currentSize - (indexFound - indexStart);
        indexStart = indexFound + 1;
      }
      actualCharacters.put(stringAsCharArray[index], index);
      index++;
    }

    if (currentSize > longest) {
      longest = currentSize;
    }

    return longest;
  }

  private void removeIndexes(char[] stringAsCharArray, int indexStart, int indexEnd, Map<Character, Integer> map) {
    for (; indexStart < indexEnd; indexStart++) {
      map.remove(stringAsCharArray[indexStart]);
    }
  }

  /**
   * Primeira solução que eu criei, acredito que execute em O(n²), então não está bom!
   */
  public int solucaoRuim(String s) {
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
