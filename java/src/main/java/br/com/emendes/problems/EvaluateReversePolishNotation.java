package br.com.emendes.problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * Você recebe um array de strings tokens que representa uma expressão aritmética no modo Reverse Polish Notation.<br>
 * <br>
 * Calcule a expressão. Retorne um inteiro que representa o valor da expressão.<br>
 * <br>
 * Note que:
 * <ul>
 *   <li>Os operadores válidos são '+', '-', '*', e '/'.</li>
 *   <li>Cada operando pode ser um inteiro ou outra expressão.</li>
 *   <li>A divisão entre dois inteiros sempre trunca em direção a zero.</li>
 *   <li>Não haverá divisão por zero.</li>
 *   <li>A entrada representa uma expressão aritmética válida em Reverse Polish Notation.</li>
 *   <li>A resposta e todos os cálculos intermediários podem ser representados em um número inteiro de 32 bits.</li>
 * </ul>
 * <br>
 * Restrições:
 * <ul>
 *   <li>1 <= tokens.length <= 10⁴</li>
 *   <li>tokens[i] pode ser um operando '+', '-', '*', e '/' ou um inteiro no intervalo [-200, 200]</li>
 * </ul>
 */
public class EvaluateReversePolishNotation {

  public int evalRPN(String[] tokens) {
    Map<String, BinaryOperator<Long>> operations = Map.of(
        "+", (a, b) -> a + b,
        "-", (a, b) -> a - b,
        "*", (a, b) -> a * b,
        "/", (a, b) -> a / b);
    Deque<Long> values = new ArrayDeque<>();

    for (String token : tokens) {
      if (operations.containsKey(token)) {
        Long b = values.pop();
        Long a = values.pop();
        values.push(operations.get(token).apply(a, b));
      } else {
        values.push(Long.valueOf(token));
      }
    }

    return values.pop().intValue();
  }

  /**
   * First solution.
   */
  public int firstSolution(String[] tokens) {
    Deque<Integer> values = new ArrayDeque<>();

    for (String token : tokens) {
      if (isOperator(token)) {
        int secondValue = values.pop();
        int firstValue = values.pop();
        int result = evaluate(firstValue, secondValue, token);
        values.push(result);
      } else {
        values.push(toInteger(token));
      }
    }

    return values.pop();
  }

  private int evaluate(int v1, int v2, String op) {
    return switch (op) {
      case "+" -> v1 + v2;
      case "-" -> v1 - v2;
      case "*" -> v1 * v2;
      case "/" -> v1 / v2;
      default -> 0;
    };
  }

  private Integer toInteger(String integerAsString) {
    return Integer.valueOf(integerAsString);
  }

  private boolean isOperator(String token) {
    char firstCharacter = token.charAt(0);
    return token.length() == 1 && firstCharacter >= 42 &&
           firstCharacter <= 47;
  }

}
