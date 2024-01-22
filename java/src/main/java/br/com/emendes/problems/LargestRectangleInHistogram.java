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

  public int firstSolution(int[] heights) {
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

  public int largestRectangleArea(int[] height) {
    if (height == null || height.length == 0) {
      return 0;
    }
    int[] lessFromLeft = new int[height.length];
    int[] lessFromRight = new int[height.length];
    lessFromRight[height.length - 1] = height.length;
    lessFromLeft[0] = -1;

    for (int i = 1; i < height.length; i++) {
      int p = i - 1;

      while (p >= 0 && height[p] >= height[i]) {
        p = lessFromLeft[p];
      }
      lessFromLeft[i] = p;
    }

    for (int i = height.length - 2; i >= 0; i--) {
      int p = i + 1;

      while (p < height.length && height[p] >= height[i]) {
        p = lessFromRight[p];
      }
      lessFromRight[i] = p;
    }

    int maxArea = 0;
    for (int i = 0; i < height.length; i++) {
      maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
    }

    return maxArea;
  }

}
