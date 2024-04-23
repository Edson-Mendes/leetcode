package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado um string s, particione s de maneira que toda substring partição seja um palíndromo.
 * Retorne todo o particionamento palíndromo possível de s.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= s.length <= 16</li>
 *   <li>s contém apenas letras minúsculas inglesas</li>
 * </ul>
 */
public class PalindromePartitioning {

  private List<List<String>> partitions;
  private String word;

  public List<List<String>> partition(String s) {
    partitions = new ArrayList<>();
    word = s;
    partitionHelper(0, new ArrayList<>());
    return partitions;
  }

  private void partitionHelper(int start, List<String> partition) {
    if (start == word.length()) {
      partitions.add(new ArrayList<>(partition));
      return;
    }

    for (int i = start; i < word.length(); i++) {
      if (isPalindrome(start, i)) {
        partition.add(word.substring(start, i + 1));
        partitionHelper(i + 1, partition);
        partition.remove(partition.size() - 1);
      }
    }
  }

  private boolean isPalindrome(int start, int end) {
    while (start < end) {
      if (word.charAt(start++) != word.charAt(end--)) return false;
    }
    return true;
  }

}
