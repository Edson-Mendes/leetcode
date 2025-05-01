package br.com.emendes.problems;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado uma string s representando uma expressão válida, implemente uma calculadora básica
 * para resolvê-la, e retorne o resultado da solução.
 * <br><br>
 * Nota: Você não deve usar nenhuma função integrada que calcule strings como expressões matemáticas.
 * <br><br>
 * Restrições:<br>
 * 1 <= s.length <= 3 * 10⁵<br>
 * s consiste de digitos, '+', '-', '(', ')' e ' '.<br>
 * s representa uma expressão válida.<br>
 * '+' não é usado como operação unária (+1 e +(2 + 3) são inválidas).<br>
 * '-' pode ser usado como operação unária (-1 e -(2 + 3) são válidas).<br>
 * Não terá dois operadores consecutivos na entrada.<br>
 * Todos os números e calculos entram em inteiros 32-bits.
 */
public class BasicCalculator {

  public int calculate(String s) {
    int result = 0;
    int number = 0;
    int sign = 1;
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(sign);

    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        number = (number * 10) + (c - '0');
      } else if (c == '(') stack.push(sign);
      else if (c == ')') stack.pop();
      else if (c == '+' || c == '-') {
        result += number * sign;
        sign = (c == '+' ? 1 : -1) * stack.peek();
        number = 0;
      }
    }

    return result + (number * sign);
  }

}
