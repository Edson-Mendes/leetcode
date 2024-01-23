package br.com.emendes.problems;

/**
 * Dada uma matriz de rows x cols preenchida com 0's e 1's, encontre o maior retângulo contendo apenas 1's e retorne a sua area.
 * <br><br>
 * Restrições:<br>
 * rows == matrix.length<br>
 * cols == matrix[i].length<br>
 * 1 <= row, cols <= 200<br>
 * matrix[i][j] é 0 ou 1.
 */
public class MaximalRectangle {

  public int maximalRectangle(char[][] matrix) {
    int[][] histograms = generateHistogram(matrix);
    int answer = 0;

    for (int[] histogram : histograms) {
      answer = Math.max(answer, largestRectangleArea(histogram));
    }

    return answer;
  }

  private int[][] generateHistogram(char[][] matrix) {
    int rowLength = matrix.length;
    int colLength = matrix[0].length;
    int[][] histogram = new int[matrix.length][matrix[0].length];

    for (int j = 0; j < colLength; j++) {
      histogram[0][j] = Character.getNumericValue(matrix[0][j]);
    }
    for (int i = 1; i < rowLength; i++) {
      for (int j = 0; j < colLength; j++) {
        char value = matrix[i][j];
        if (value == '1') {
          histogram[i][j] = histogram[i-1][j] + Character.getNumericValue(value);
        }
      }
    }

    return histogram;
  }

  private int largestRectangleArea(int[] height) {
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
