package br.com.emendes.problems;

import java.util.Deque;
import java.util.LinkedList;

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
    int length = heights.length;
    Deque<Integer> stack = new LinkedList<>();

    int maxArea = 0;
    int i = 0;
    while (i < length) {
      if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
        stack.push(i);
        i++;
      } else {
        Integer top = stack.pop();
        int currArea = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);

        if (currArea > maxArea) {
          maxArea = currArea;
        }
      }
    }

    while (!stack.isEmpty()) {
      Integer top = stack.pop();
      int currArea = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);

      if (currArea > maxArea) {
        maxArea = currArea;
      }
    }

    return maxArea;
  }

}
