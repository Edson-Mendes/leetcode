package br.com.emendes.problems;

/**
 * Dado uma string s que representa uma expressão, calcule esta expressão e retorne seu valor.
 * <br><br>
 * A divisão de inteiro deve truncar para zero.
 * <br><br>
 * Você deve assumir que a expressão dada é sempre válida. Todos os valores intermediarios
 * estão no intervalo [-2³¹, 2³¹ - 1].
 * <br><br>
 * Nota: Você não tem permição para usar qualquer função imbutida que calcule strings como
 * expressões matemáticas.
 * <br><br>
 * Restrições:<br>
 * 1 <= s.length <= 3 * 10⁵<br>
 * s consiste de inteiros e os operadores '+', '-', '*' e '/' separados por um número de espaços<br>
 * s representa uma expressão válida<br>
 * Todos os inteiros da expressão são não negativos no intervalo [0, 2³¹ - 1]<br>
 * É garantido que a resposta cabe em um inteiro 32-bits.
 */
public class BasicCalculatorII {

  public int calculate(String s) {
    int operand1 = 0;
    int operand2 = 0;
    int sign = 1;
    int otherOperation = 0;
    int result = 0;
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        if (otherOperation == 0)
          operand1 = operand1 * 10 + (c - '0');
        else
          operand2 = operand2 * 10 + (c - '0');
      } else if (c != ' ') {
        if (otherOperation != 0) {
          operand1 = otherOperation == 1 ? operand1 * operand2 : operand1 / operand2;
          otherOperation = 0;
          operand2 = 0;
        }
        if (c == '+' || c == '-') {
          result += operand1 * sign;
          sign = c == '+' ? 1 : -1;
          operand1 = 0;
        } else {
          otherOperation = c == '*' ? 1 : -1;
        }
      }
    }
    if (otherOperation != 0) {
      operand1 = otherOperation == 1 ? operand1 * operand2 : operand1 / operand2;
    }
    return result + (operand1 * sign);
  }

}