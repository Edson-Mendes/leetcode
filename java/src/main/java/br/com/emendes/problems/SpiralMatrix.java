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

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> answer = new ArrayList<>();

    int me = matrix.length - 1;
    int ne = matrix[0].length - 1;
    int totalElements = matrix.length * matrix[0].length;
    int elementsCount = 0;
    int ms = 0;
    int ns = 0;
    while (elementsCount < totalElements) {
      for (int j = ns; j <= ne; j++) {
        answer.add(matrix[ms][j]);
        elementsCount++;
      }
      for (int i = ms + 1; i <= me && elementsCount < totalElements; i++, elementsCount++) {
        answer.add(matrix[i][ne]);
      }
      for (int j = ne - 1; j >= ns && elementsCount < totalElements; j--, elementsCount++) {
        answer.add(matrix[me][j]);
      }
      for (int i = me - 1; i >= ms + 1 && elementsCount < totalElements; i--, elementsCount++) {
        answer.add(matrix[i][ns]);
      }
      ms++;
      ns++;
      me--;
      ne--;
    }

    return answer;
  }

}
