package br.com.emendes.problems;

/**
 * Dado uma array de points onde points[i] = [xi, yi] representa um ponto no plano X-Y, retorne o máximo número de pontos
 * que estão em um mesma linha reta.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= points.length <= 300</li>
 *   <li>points[i].length = 2</li>
 *   <li>-10⁴ <=  xi, yi <= 10⁴</li>
 *   <li>Todos os pontos são únicos</li>
 * </ul>
 */
public class MaxPointsOnALine {

  public int maxPoints(int[][] points) {
    if (points.length == 1) return 1;
    if (points.length == 2) return 2;
    int maxPoints = 2;
    for (int i = 0; i < points.length - 2; i++) {
      for (int j = i + 1; j < points.length - 1; j++) {
        int currMaxPoints = 2;
        for (int k = j + 1; k < points.length && maxPoints < currMaxPoints + (points.length - k); k++) {
          if (isSameLine(i, j, k, points)) {
            currMaxPoints++;
          }
        }
        maxPoints = Math.max(maxPoints, currMaxPoints);
      }
    }

    return maxPoints;
  }

  private boolean isSameLine(int i, int j, int k, int[][] points) {
    double x1 = points[i][0];
    double y1 = points[i][1];
    double x2 = points[j][0];
    double y2 = points[j][1];
    double x3 = points[k][0];
    double y3 = points[k][1];

    return points[i][0] == points[j][0] && points[i][0] == points[k][0] ||
           points[i][1] == points[j][1] && points[i][1] == points[k][1] ||
           (y2 - y1) / (x2 - x1) == (y3 - y1) / (x3 - x1);
  }

}
