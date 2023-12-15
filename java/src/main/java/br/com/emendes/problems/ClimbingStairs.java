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

  public int climbStairs(int n) {
    int previous = 0;
    int secondPrevious = 1;

    for (int i = 1; i <= n; i++) {
      int current = previous + secondPrevious;
      previous = secondPrevious;
      secondPrevious = current;
    }

    return secondPrevious;
  }

}
