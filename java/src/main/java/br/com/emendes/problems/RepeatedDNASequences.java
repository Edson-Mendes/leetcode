package br.com.emendes.problems;

import java.util.*;

/**
 * A sequência de DNA é composta por uma série de nucleotídeos abreviados como 'A', 'C', 'G' e 'T'.<br>
 * <br>
 * - Por exemplo, "ACGAATTCCG" é uma sequência de DNA.<br>
 * <br>
 * Ao estudar o DNA, é útil identificar sequências repetidas dentro do DNA.<br>
 * <br>
 * Dada uma string s que representa uma sequência de DNA, retorne todas as sequências de 10 letras (substrings) que
 * ocorrem mais de uma vez em uma molécula de DNA. Você pode retornar a resposta em qualquer ordem.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= s.length <= 10⁵<br>
 * -> s[i] pode ser 'A', 'C', 'G', ou 'T'.
 */
public class RepeatedDNASequences {

  public List<String> findRepeatedDnaSequences(String s) {
    Set<String> repeatedDnaSequences = new HashSet<>();
    Set<String> sequences = new HashSet<>();
    int length = s.length();

    for (int i = 0; i + 10 <= length; i++) {
      String sequence = s.substring(i, i + 10);

      if (!sequences.add(sequence)) {
        repeatedDnaSequences.add(sequence);
      }
    }

    return new ArrayList<>(repeatedDnaSequences);
  }

  public List<String> firstSolution(String s) {
    List<String> repeatedDNASequences = new ArrayList<>();
    Map<String, Boolean> sequences = new HashMap<>();
    int length = s.length();

    for (int i = 0; i + 10 <= length; i++) {
      String sequence = s.substring(i, i + 10);
      sequences.compute(sequence, (k, v) -> {
        if (v == null) return Boolean.FALSE;
        if (!v) {
          repeatedDNASequences.add(sequence);
        }
        return Boolean.TRUE;
      });
    }

    return repeatedDNASequences;
  }

}
