package br.com.emendes.problems;

/**
 * Você está subindo uma escada. São necessários n passos para chegar ao topo.<br><br>
 *
 * Cada vez você pode subir 1 ou 2 degraus. De quantas maneiras distintas você pode chegar ao topo?<br><br>
 *
 * Restrições:<br>
 * 1 <= n <= 45
 */
public class ClimbingStairs {

  private int ways;

  public int climbStairs(int n) {
    ways = 0;

    climb(0, n);
    return ways;
  }

  private void climb(int steps, int total) {
    if (steps == total) {
      ways++;
      return;
    }
    if (steps + 1 <= total) climb(steps + 1, total);
    if (steps + 2 <= total) climb(steps + 2, total);
  }

}
