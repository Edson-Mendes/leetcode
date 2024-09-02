package br.com.emendes.problems;

import java.util.ArrayDeque;
import java.util.Queue;

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

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1') {
          numberOfIslands++;
          bfs(i, j, grid);
        }
      }
    }

    return numberOfIslands;
  }

  private static final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  private void bfs(int i, int j, char[][] grid) {
    Queue<int[]> queue = new ArrayDeque<>();
    queue.offer(new int[]{i, j});
    grid[i][j] = 'v';
    while (!queue.isEmpty()) {
      int[] position = queue.poll();
      for (int[] direction : directions) {
        int x = position[0] + direction[0];
        int y = position[1] + direction[1];
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1') continue;
        queue.offer(new int[]{x, y});
        grid[x][y] = 'v';
      }
    }
  }

  /**
   * First solution.
   */
  public int firstSolution(char[][] grid) {
    int numberOfIslands = 0;
    int m = grid.length;
    int n = grid[0].length;
    boolean[][] visited = new boolean[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          numberOfIslands++;
          dfs(i, j, grid, visited);
        }
      }
    }

    return numberOfIslands;
  }

  private void dfs(int i, int j, char[][] grid, boolean[][] visited) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
    if (grid[i][j] == '0' || visited[i][j]) return;

    visited[i][j] = true;
    dfs(i + 1, j, grid, visited);
    dfs(i - 1, j, grid, visited);
    dfs(i, j + 1, grid, visited);
    dfs(i, j - 1, grid, visited);
  }

}
