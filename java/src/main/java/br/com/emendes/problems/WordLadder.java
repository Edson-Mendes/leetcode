package br.com.emendes.problems;

import java.util.*;

/**
 * Uma sequência de transformação da palavra beginWord para a palavra endWord usando um dicionário wordList
 * é uma sequência de palavras beginWord -> s1 -> s2 -> ... -> sk de maneira que:
 * <ul>
 *   <li>
 *     Cada par adjacente de palavras difere por uma única letra.
 *   </li>
 *   <li>
 *     Todo si para 1 <= i <= k esta em wordList. Note que beginWord não precisa estar em wordList.
 *   </li>
 *   <li>
 *     sk == endWord
 *   </li>
 * </ul>
 * Dado duas palavras, beginWord e endWord, e um dicionário wordList, retorne o número de palavras
 * para a sequência de transformação mais curts de beginWord para endWord, ou zero se não existir sequência.<br>
 * <br>
 * Restrições:<br>
 * 1 <= beginWord.length <= 5<br>
 * endWord.length == beginWord.length<br>
 * 1 <= wordList.length <= 500<br>
 * wordList[i].length == beginWord.length<br>
 * beginWord, endWord, e wordList[i] consistem de letras inglesas minúsculas.<br>
 * beginWord != endWord<br>
 * Todas as palavras de wordList são únicas.<br>
 * O soma de todas as sequências de transformação mais curtas não excedem 10⁵.
 */
public class WordLadder {

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    int wordLength = beginWord.length();
    Set<String> wordSet = new HashSet<>(wordList);
    wordSet.remove(beginWord);
    Deque<Pair> levelQueue = new LinkedList<>();
    levelQueue.add(new Pair(beginWord, 1));

    while (!levelQueue.isEmpty()) {
      Pair pair = levelQueue.pop();
      String word = pair.word;
      int level = pair.level;

      if (word.equals(endWord)) return level;

      for (int i = 0; i < wordLength; i++) {
        char[] wordArray = word.toCharArray();
        for (char ch = 'a'; ch <= 'z'; ch++) {
          wordArray[i] = ch;
          String nextWord = String.valueOf(wordArray);
          if (wordSet.contains(nextWord)) {
            wordSet.remove(nextWord);
            levelQueue.add(new Pair(nextWord, level + 1));
          }
        }
      }
    }
    return 0;
  }

  static class Pair {

    String word;
    int level;

    public Pair(String word, int level) {
      this.word = word;
      this.level = level;
    }

  }

}
