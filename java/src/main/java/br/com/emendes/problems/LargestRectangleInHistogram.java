package br.com.emendes.problems;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dado um array de inteiros heights representando uma barra de histogramas onde a largura de cada barra é 1,
 * retorne a area do maior retângulo do histograma.
 * <br><br>
 * Restrições:<br>
 * 1 <= heights.length <= 10⁵<br>
 * 0 <= heights[i] <= 10⁴
 */
public class LargestRectangleInHistogram {

  public int largestRectangleArea(int[] heights) {
    int answer = 0;
    Deque<Integer> stack = new ArrayDeque<>();
    int i = 0;
    while (i <= heights.length) {
      while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] > heights[i])) {
        final int height = heights[stack.pop()];
        final int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        answer = Math.max(answer, height * width);
      }
      stack.push(i++);
    }

    return answer;
  }

}
