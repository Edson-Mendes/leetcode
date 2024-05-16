package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Dado uma string s e um dicionário de strings wordDict, adicione espaços em s para construir uma sentença onde cada
 * palavra esteja em wordDict. Retorne todas as sentenças possíveis em qualquer ordem.<br>
 * <br>
 * Observe que a mesma palavra do dicionário pode ser reutilizada multiplas vezes na segmentação.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= s.length <= 20</li>
 *   <li>1 <= wordDict.length <= 1000</li>
 *   <li>1 <= wordDict[i].length <= 10</li>
 *   <li>s e wordDict[i] consistem de letras inglesas minúsculas.</li>
 *   <li>Todas as strings em wordDict são únicas</li>
 *   <li>A entrada é gerada de modo que o comprimento da resposta não exceda 10⁵.</li>
 * </ul>
 */
public class WordBreakII {

  private Set<String> dict;
  private List<String> answer;

  public List<String> wordBreak(String s, List<String> wordDict) {
    dict = new HashSet<>(wordDict);
    answer = new ArrayList<>();

    wordBreakSolver(s, new ArrayList<>());
    return answer;
  }

  private void wordBreakSolver(String word, List<String> sentenceList) {
    if (word.isEmpty()) {
      answer.add(String.join(" ", sentenceList));
      return;
    }

    for (int i = 1; i <= word.length(); i++) {
      String prefix = word.substring(0, i);
      if (dict.contains(prefix)) {
        sentenceList.add(prefix);
        wordBreakSolver(word.substring(i), sentenceList);
        sentenceList.remove(sentenceList.size() - 1);
      }
    }
  }

}
