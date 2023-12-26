package br.com.emendes.problems;

/**
 * É dado a você uma matriz de inteiro m x n chamada matrix com duas propriedades a seguir:<br>
 * - cada linha é ordenada em ordem não decrescente<br>
 * - O primeiro inteiro de cada linha é maior que o último inteiro da linha anterior.<br><br>
 * <p>
 * Dado um inteiro target, retorne true se target está na matriz ou false caso contrário.<br>
 * Você deve escrever a solução com complexidade de tempo O(log(m*n)).<br><br>
 * <p>
 * Restrições:<br>
 * m == matrix.length<br>
 * n == matrix[i].length<br>
 * 1 <= m, n <= 100<br>
 * -10⁴ <= matrix[i][j], target <= 10⁴
 */
public class SearchA2DMatrix {

  public boolean searchMatrix(int[][] matrix, int target) {
    int row = findRow(matrix, target);

    if (row == -1) return false;

    return searchRow(matrix, target, row);
  }

  private boolean searchRow(int[][] matrix, int target, int row) {
    int start = 0;
    int end = matrix[row].length - 1;

    while (start <= end) {
      int mid = (end + start) / 2;
      if (matrix[row][mid] == target)
        return true;
      if (target < matrix[row][mid])
        end = mid - 1;
      else
        start = mid + 1;
    }

    return false;
  }

  private int findRow(int[][] matrix, int target) {
    int n = matrix[0].length;
    int end = matrix.length - 1;
    int start = 0;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (target >= matrix[mid][0] && target <= matrix[mid][n - 1]) return mid;

      if (target < matrix[mid][0]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return -1;
  }

}
