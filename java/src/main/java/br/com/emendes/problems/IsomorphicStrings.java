package br.com.emendes.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado duas strings s e t, determine se eles são isomórficas.<br>
 * <br>
 * Duas strings s e t são isomórficas se os caracteres em s podem ser substituídas para ter t.<br>
 * <br>
 * Todas as ocorrências de um caractere devem ser substituídas por outro caractere,
 * preservando a ordem dos caracteres. Não é possível mapear dois caracteres para o mesmo caractere,
 * mas um caractere pode mapear a si mesmo.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= s.length <= 5 * 10⁴<br>
 * -> t.length == s.length<br>
 * -> s e t consistem de qualquer caracter ASCII.
 */
public class IsomorphicStrings {

  public boolean isIsomorphic(String s, String t) {
    int[] sIndex = new int[200];
    int[] tIndex = new int[200];

    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (sIndex[sChar] != tIndex[tChar])
        return false;
      sIndex[sChar] = i + 1;
      tIndex[tChar] = i + 1;
    }

    return true;
  }

  public boolean firstSolution(String s, String t) {
    Map<Character, Character> mappedCharacters = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (mappedCharacters.containsKey(sChar)) {
        if (mappedCharacters.get(sChar) != tChar)
          return false;
      } else if (mappedCharacters.containsValue(tChar)) {
        return false;
      }
      mappedCharacters.putIfAbsent(sChar, tChar);
    }

    return true;
  }

}
