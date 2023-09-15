package br.com.emendes.problems;

/**
 * Você recebe uma matriz 2D de n x n representando uma imagem, rotacione a imagem por 90 graus (sentido horario).<br>
 * <p>
 * Você tem que rotacionar a imagem in-place, quer dizer que você deve modivicar a matriz de entrada diretamente.<br>
 * NÃO aloque outra matriz 2D para rotacionar.<br><br>
 * <p>
 * Restrições:<br>
 * n == matrix.length == matrix[i].length<br>
 * 1 <= n <= 20<br>
 * -1000 <= matrix[i][j] <= 1000
 */
public class RotateImage {

  private int mLength;
  private int[][] matrix;

  public void rotate(int[][] matrix) {
    if (matrix.length == 1) return;

    mLength = matrix.length;
    this.matrix = matrix;

    transpose();
    invert();
  }

  private void transpose() {
    for (int i = 0; i < mLength; i++) {
      for (int j = i + 1; j < mLength; j++) {
        swap(i, j, j, i);
      }
    }
  }

  private void invert() {
    for (int row = 0; row < mLength; row++) {
      for (int i = 0, j = mLength - 1; i < j; i++, j--) {
        swap(row, i, row, j);
      }
    }
  }

  private void swap(int ai, int aj, int bi, int bj) {
    int aux = matrix[ai][aj];
    matrix[ai][aj] = matrix[bi][bj];
    matrix[bi][bj] = aux;
  }

}
