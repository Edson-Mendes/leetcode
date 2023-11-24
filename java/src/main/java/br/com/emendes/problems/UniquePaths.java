package br.com.emendes.problems;

/**
 * Existe um robo em um grid m x n. O robo está inicialmente localizado na canto superior esquerdo (grid[0][0]).
 * O robo tenta se mover para o canto inferior direito (grid[m-1][n-1].
 * O robo pode apenas se mover para baixo ou para esquerda.<br><br>
 *
 * Dado dois inteiros m e n, retorne o número de caminhos únicos que o robo pode
 * tomar para alcançar o canto inferior direito.<br><br>
 *
 * Os casos de teste são gerados de forma que a resposta seja menor ou igual a 2 * 10⁹.<br><br>
 *
 * Restrições:<br>
 * 1 <= m, n <= 100
 */
public class UniquePaths {

  public int uniquePaths(int m, int n) {
    if (m == 1 || n == 1) return 1;

    return calculateTotalUniquePaths(0, 0, m, n);
  }

  private int calculateTotalUniquePaths(int currM, int currN, int m, int n) {
    if (currM + 1 < m && currN + 1 < n) {
      return calculateTotalUniquePaths(currM + 1, currN, m, n) +
          calculateTotalUniquePaths(currM, currN + 1, m, n);
    }

    return 1;
  }

}
