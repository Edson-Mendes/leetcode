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
    long num = numerator;
    long den = denominator;
    StringBuilder answer = new StringBuilder();
    if ((num < 0 && den > 0) || (num > 0 && den < 0)) {
      answer.append('-');
    }
    num = Math.abs(num);
    den = Math.abs(den);
    answer.append(num / den);

    num %= den;
    if (num != 0) {
      answer.append('.');
      StringBuilder decimal = new StringBuilder();
      int index = 0;
      Map<Long, Integer> cache = new HashMap<>();
      while (num != 0) {
        num *= 10;

        if (cache.containsKey(num)) {
          int position = cache.get(num);
          decimal.insert(position, '(');
          decimal.append(')');
          break;
        }
        cache.put(num, index);
        long result = num / den;
        decimal.append(result);
        num %= den;
        index++;
      }
      answer.append(decimal);
    }

    return answer.toString();
  }

}
