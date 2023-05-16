package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado n pares de parênteses, escreva uma função que gere todas as combinações bem formadas de parênteses.<br><br>
 * Restrições:<br>
 * 1 <= n <= 8;
 */
public class GenerateParentheses {

  private List<String> answer;

  // Solução em 1 ms.
  public List<String> generateParenthesis(int n) {
    answer = new ArrayList<>();

    generate(n - 1, n, 1, "(");

    return answer;
  }

  private void generate(int leftRemaining, int rightRemaining, int openParentheses, String currentParentheses) {
    // Caso base
    if (leftRemaining == 0 && rightRemaining == 0) answer.add(currentParentheses);

    if (leftRemaining != 0) {
      generate(leftRemaining - 1, rightRemaining,
          openParentheses + 1, currentParentheses + "(");
    }

    if (openParentheses != 0) {
      generate(leftRemaining, rightRemaining - 1,
          openParentheses - 1, currentParentheses + ")");
    }

  }

}
