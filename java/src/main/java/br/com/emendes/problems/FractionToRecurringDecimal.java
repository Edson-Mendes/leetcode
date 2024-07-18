package br.com.emendes.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Dado dois inteiros representando o numerador e o denominador de uma fração, retorne a fração no formato de string.<br>
 * <br>
 * Se a parte fracionária esta repetindo, coloque a parte repetida entre parênteses.<br>
 * <br>
 * Se multiplas respostas forem possíveis, retorne qualquer uma delas.<br>
 * <br>
 * É garantido que o comprimento da string de resposta seja inferior a 10⁴ para todas as entradas fornecidas.<br>
 * Restrições:
 * <ul>
 *   <li>-2³¹ <= numerator, denominator <= 2³¹ - 1</li>
 *   <li>denominator != 0</li>
 * </ul>
 */
public class FractionToRecurringDecimal {

  public String fractionToDecimal(int numerator, int denominator) {
    if (numerator == 0) return "0";

    StringBuilder answer = new StringBuilder();
    if (numerator < 0 ^ denominator < 0) answer.append('-');

    long num = Math.abs((long) numerator);
    long den = Math.abs((long) denominator);
    answer.append(num / den);

    num %= den;
    if (num != 0) {
      answer.append('.');
      Map<Long, Integer> cache = new HashMap<>();
      while (num != 0) {
        num *= 10;
        if (cache.containsKey(num)) {
          answer.insert(cache.get(num), "(");
          answer.append(")");
          break;
        }
        cache.put(num, answer.length());
        answer.append(num / den);
        num %= den;
      }
    }

    return answer.toString();
  }

}
