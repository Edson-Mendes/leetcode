package br.com.emendes.problems;

import java.util.LinkedList;

/**
 * Dado um String de entrada s, reverta a ordem das palavras.<br>
 * <br>
 * Uma palavra é definida como uma sequência de caracteres non-space (sem ser o espaço em branco).
 * As palavras em s são separadas por ao menos um espaço em branco.<br>
 * <br>
 * Retorne uma string das palavras de s em ordem reversa concatenadas por um espaço em branco.<br>
 * <br>
 * Observe que s pode conter leading ou trainling espaços ou multiplos espaços entre duas palavras.
 * A string retornada deve ter apenas um espaço separando as palavras. Não inclua nenhum espaço extra.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= s.length <= 10⁴</li>
 *   <li>s contém letra inglesas (maiúsculas e minúsculas), digitos e espaços ' '.</li>
 *   <li>Existe ao menos 1 palavra em s.</li>
 * </ul>
 */
public class ReverseWordsInAString {

  public String reverseWords(String s) {
    char[] words = s.toCharArray();
    char[] answer = new char[s.length() + 1];
    int i = s.length() - 1;
    int y = 0;

    while (i >= 0) {
      while (i >= 0 && words[i] == ' ') i--;

      int j = i - 1;
      while (j >= 0 && words[j] != ' ') j--;

      if (i >= 0) {
        int k = j + 1;
        while (k <= i) {
          answer[y++] = words[k++];
        }
        answer[y++] = ' ';
        i = j - 1;
      }
    }

    return String.valueOf(answer, 0, y - 1);
  }

  public String firstSolution(String s) {
    LinkedList<String> words = new LinkedList<>();
    int start = -1;
    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (curr == ' ') {
        if (start != -1) {
          words.addFirst(s.substring(start, i));
          start = -1;
        }
      } else if (start == -1) {
        start = i;
      }
    }
    if (start != -1) {
      words.addFirst(s.substring(start));
    }

    return String.join(" ", words);
  }

}
