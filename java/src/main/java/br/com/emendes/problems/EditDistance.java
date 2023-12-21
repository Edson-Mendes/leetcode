package br.com.emendes.problems;

/**
 * Dado duas strings word1 e word2, retorne o número mínimo de operações necessárias
 * para converter word1 em word2.<br><br>
 * <p>
 * Você tem as seguintes operações permitidas sobre a string:<br>
 * - inserir um caracter.<br>
 * - deletar um caracter.<br>
 * - substituir um caracter.<br><br>
 * <p>
 * Restrições:<br>
 * 0 <= word1.length, word2.length <= 500<br>
 * word1 e word2 consistem de letras inglesas minúsculas.
 */
public class EditDistance {

  public int minDistance(String word1, String word2) {
    return minDistance(word1, word2, 0, 0);
  }

  private int minDistance(String word1, String word2, int i1, int i2) {
    if (word1.length() == i1) return word2.length() - i2;
    if (word2.length() == i2) return word1.length() - i1;

    if (word1.charAt(i1) == word2.charAt(i2)) return minDistance(word1, word2, i1 + 1, i2 + 1);

    int d = minDistance(word1, word2, i1 + 1, i2);
    int u = minDistance(word1, word2, i1 + 1, i2 + 1);
    int i = minDistance(word1, word2, i1, i2 + 1);

    return Math.min(Math.min(d, u), i) + 1;
  }

}
