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
 * Dado duas palavras, beginWord e endWord, e um dicionário wordList, retorne todas as sequências de transformação
 * mais curtas de beginWord para endWord, ou uma lista vazia se nenhuma sequência existir. Cada sequência deve ser
 * retornada como uma lista de palavras [beginWord, s1, s2, ..., sk].<br>
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
public class WordLadderII {

  private List<List<String>> answer;
  private Map<String, Integer> cache;

  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    answer = new ArrayList<>();
    cache = new HashMap<>();
    findMinSequenceSize(wordList, beginWord, endWord);

    if (!cache.containsKey(endWord)) {
      return answer;
    }
    findLaddersDFS(endWord, beginWord, cache.keySet(), new ArrayList<>());
    return answer;
  }

  private void findLaddersDFS(String word, String beginWord, Set<String> possibleWords, List<String> sequence) {
    sequence.add(0, word);
    if (word.equals(beginWord)) {
      answer.add(new ArrayList<>(sequence));
    } else {
      for (String nextWord : possibleWords) {
        if (cache.get(nextWord) < cache.get(word) && isDifferByOne(nextWord, word)) {
          findLaddersDFS(nextWord, beginWord, possibleWords, sequence);
        }
      }
    }
    sequence.remove(0);
  }

  private void findMinSequenceSize(List<String> wordList, String beginWord, String endWord) {
    Queue<Pair> pairQueue = new ArrayDeque<>();
    pairQueue.add(new Pair(beginWord, 1));
    Set<String> visited = new HashSet<>();
    visited.add(beginWord);

    while (!pairQueue.isEmpty()) {
      Pair pair = pairQueue.remove();
      cache.put(pair.word, pair.level);
      if (pair.word.equals(endWord)) {
        return;
      }
      for (String nextWord : wordList) {
        if (!visited.contains(nextWord) && isDifferByOne(nextWord, pair.word)) {
          pairQueue.add(new Pair(nextWord, pair.level + 1));
          visited.add(nextWord);
        }
      }
    }
  }

  private boolean isDifferByOne(String nextWord, String word) {
    int count = 0;

    for (int i = 0; i < word.length() && count < 2; i++) {
      if (nextWord.charAt(i) != word.charAt(i)) count++;
    }

    return count == 1;
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
