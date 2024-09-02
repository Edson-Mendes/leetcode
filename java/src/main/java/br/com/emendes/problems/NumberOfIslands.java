package br.com.emendes.problems;

/**
 * Dado um grid 2D de m x n que representa um mapa de '1' (land) e '0' (water), retorne o número de ilhas.<br>
 * <br>
 * Uma ilha é cercada por água e é formado conectando lands adjacentes (horizontal ou vertical).
 * Você pode considerar que as 4 bordas do grip são cercados por água.<br>
 * <br>
 * Restrições:<br>
 * -> m == grid.length<br>
 * -> n = grid[i].length<br>
 * -> 1 <= m, n <= 300<br>
 * -> grid[i][j] é '0' ou '1'.
 */
public class NumberOfIslands {

  public int numIslands(char[][] grid) {
    int numberOfIslands = 0;
    int m = grid.length;
    int n = grid[0].length;
    boolean[][] visited = new boolean[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          numberOfIslands++;
          checkSurrounds(i, j, grid, visited);
        }
      }
    }

    return numberOfIslands;
  }

  private void checkSurrounds(int i, int j, char[][] grid, boolean[][] visited) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
    if (grid[i][j] == '0' || visited[i][j]) return;

    visited[i][j] = true;
    checkSurrounds(i + 1, j, grid, visited);
    checkSurrounds(i - 1, j, grid, visited);
    checkSurrounds(i, j + 1, grid, visited);
    checkSurrounds(i, j - 1, grid, visited);
  }

}
