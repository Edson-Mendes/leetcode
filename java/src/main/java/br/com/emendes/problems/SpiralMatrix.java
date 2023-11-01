package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Dado uma matriz m x n, retorne todos os elementos da matrix em ordem espiral.<br><br>
 * <p>
 * Restrições:<br>
 * m == matrix.length<br>
 * n == matrix[i].length<br>
 * 1 <= m, n <= 10<br>
 * -100 <= matrix[i][j] <= 100
 */
public class SpiralMatrix {

  private int elementsCount = 0;
  private List<Integer> answer;

  public List<Integer> spiralOrder(int[][] matrix) {
    answer = new ArrayList<>();

    int mEnd = matrix.length - 1;
    int nEnd = matrix[0].length - 1;
    int totalElements = matrix.length * matrix[0].length;
    elementsCount = 0;
    int m = 0;
    int n = 0;
    while (elementsCount < totalElements) {
      addLine(m, n, nEnd, matrix);
      if (elementsCount >= totalElements) break;
      addColumn(nEnd, m + 1, mEnd, matrix);
      if (elementsCount >= totalElements) break;
      addLine(mEnd, nEnd - 1, n, matrix);
      if (elementsCount >= totalElements) break;
      addColumn(n, mEnd-1, m + 1, matrix);
      m++;
      n++;
      mEnd--;
      nEnd--;
    }

    return answer;
  }

  private void addLine(int i, int jStart, int jEnd, int[][] matrix) {
    if (jStart < jEnd) {
      for (int j = jStart; j <= jEnd; j++) {
        answer.add(matrix[i][j]);
        elementsCount++;
      }
    } else {
      for (int j = jStart; j >= jEnd; j--) {
        answer.add(matrix[i][j]);
        elementsCount++;
      }
    }
  }

  private void addColumn(int j, int iStart, int iEnd, int[][] matrix) {
    if (iStart < iEnd) {
      for (int i = iStart; i <= iEnd; i++) {
        answer.add(matrix[i][j]);
        elementsCount++;
      }
    } else {
      for (int i = iStart; i >= iEnd; i--) {
        answer.add(matrix[i][j]);
        elementsCount++;
      }
    }
  }

}
