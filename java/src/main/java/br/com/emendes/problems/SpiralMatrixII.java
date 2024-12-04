package br.com.emendes.problems;

/**
 * Dado um inteiro positivo n, gere uma matriz n x n preenchido com elementos de 1 até n² em ordem espiral.
 * <br><br>
 * Restrições:<br>
 * 1 <= n <= 20
 */
public class SpiralMatrixII {

  public int[][] generateMatrix(int n) {
    int[][] answer = new int[n][n];
    int maxElements = n * n;
    int counter = 1;

    int iStart = 0;
    int iEnd = n - 1;
    int jStart = 0;
    int jEnd = iEnd;

    while (counter <= maxElements) {
      for (int j = jStart; j <= jEnd; j++) {
        answer[iStart][j] = counter++;
      }
      iStart++;
      for (int i = iStart; i <= iEnd; i++) {
        answer[i][jEnd] = counter++;
      }
      jEnd--;
      for (int j = jEnd; j >= jStart; j--) {
        answer[iEnd][j] = counter++;
      }
      iEnd--;
      for (int i = iEnd; i >= iStart; i--) {
        answer[i][jStart] = counter++;
      }
      jStart++;
    }

    return answer;
  }

}
