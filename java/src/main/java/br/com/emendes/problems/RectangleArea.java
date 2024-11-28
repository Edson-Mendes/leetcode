package br.com.emendes.problems;

/**
 * Dado as coordenadas de dois retângulos num plano 2D, retorne a área total coberta
 * pelos retângulos.
 * <p>
 * O primeiro retângulo é definido pelo seu canto inferior esquerdo (ax1, ay1)
 * e seu canto superior direito (ax2, ay2).
 * <p>
 * O segundo retângulo é definido pelo seu canto inferior esquerdo (bx1, by1)
 * e seu canto superior direito (bx2, by2).
 * <p>
 * Restrições:<br>
 * -10⁴ <= ax1 <= ax2 <= 10⁴<br>
 * -10⁴ <= ay1 <= ay2 <= 10⁴<br>
 * -10⁴ <= bx1 <= bx2 <= 10⁴<br>
 * -10⁴ <= by1 <= by2 <= 10⁴
 */
public class RectangleArea {

  public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int x1 = Math.max(ax1, bx1);
    int x2 = Math.min(ax2, bx2);
    int y1 = Math.max(ay1, by1);
    int y2 = Math.min(ay2, by2);
    int overlapX = x1 < x2 ? x2 - x1 : 0;
    int overlapY = y1 < y2 ? y2 - y1 : 0;

    return (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) - (overlapX * overlapY);
  }

}
