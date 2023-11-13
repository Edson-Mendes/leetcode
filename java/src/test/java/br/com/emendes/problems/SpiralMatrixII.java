package br.com.emendes.problems;

/**
 * Dado um inteiro positivo n, gere uma matriz n x n preenchida com elementos de 1 até n² em ordem espiral.<br><br>
 *
 * Restrições:<br>
 * 1 <= n <= 20
 */
public class SpiralMatrixII {

  public int[][] generateMatrix(int n) {
    int[][] answer = new int[n][n];
    int maxElements = n*n;
    int counter = 0;

    int iStart = 0;
    int iEnd = n - 1;
    int jStart = 0;
    int jEnd = iEnd;

    while (counter < maxElements) {
      for (int j = jStart; j <= jEnd; j++) {
        answer[iStart][j] = ++counter;
      }
      for (int i = iStart + 1; i <= iEnd && counter < maxElements; i++) {
        answer[i][jEnd] = ++counter;
      }
      for (int j = jEnd - 1; j >= jStart && counter < maxElements; j--) {
        answer[iEnd][j] = ++counter;
      }
      for (int i = iEnd - 1; i >= iStart + 1 && counter < maxElements; i--) {
        answer[i][jStart] = ++counter;
      }
      iStart++;
      jStart++;
      iEnd--;
      jEnd--;
    }

    return answer;
  }

}
