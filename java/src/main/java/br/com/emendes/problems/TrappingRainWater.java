package br.com.emendes.problems;

/**
 * Dado n inteiros não negativos representando a elevação em um mapa onde a largura de cada barra é 1,
 * calcule quanda água pode ser armazenada depois de chover.<br><br>
 * <p>
 * Restrições:<br>
 * n == height.length<br>
 * 1 <= n <= 2 * 10⁴<br>
 * 0 <= height[i] <= 10⁵<br>
 */
public class TrappingRainWater {

  private int[] height;

  public int trap(int[] height) {
    if (height.length < 3) return 0;

    int answer = 0;

    this.height = height;
    int iLeft = 0;
    int iRight = height.length - 1;
    int iLesser;
    int iCurr;

    iLesser = lesser(iLeft, iRight);
    int trapped = maxWaterTrapped(iLeft, iRight, iLesser);
    boolean isLeft = iLeft == iLesser;
    if (isLeft)
      iCurr = 1;
    else
      iCurr = iRight - 1;

    while (iCurr > iLeft && iCurr < iRight) {
      if (height[iCurr] > height[iLesser]) {
        if (isLeft){
          trapped -= maxWaterTrapped(iCurr-1, iRight, iLesser);
          iLeft = iCurr;
        }
        else {
          trapped -= maxWaterTrapped(iLeft, iCurr+1, iLesser);
          iRight = iCurr;
        }
        iLesser = lesser(iLeft, iRight);
        isLeft = iLeft == iLesser;
        answer += trapped;
        trapped = maxWaterTrapped(iLeft, iRight, iLesser);
        iCurr = isLeft ? iLeft : iRight;
      } else {
        trapped -= height[iCurr];
      }

      if (isLeft)
        iCurr++;
      else
        iCurr--;
    }

    answer += trapped;

    return answer;
  }

  /**
   * Retorna o ponto menor entre height[iLeft] e height[iRight].
   */
  private int lesser(int iLeft, int iRight) {
    return height[iLeft] <= height[iRight] ? iLeft : iRight;
  }

  /**
   * Calcula a quantidade max possível de água presa entre iLeft e iRight.
   *
   * @param iLeft  index de um ponto a esquerda de iRight.
   * @param iRight index de um ponto a direita de iLeft.
   * @param iLesser index que corresponde ao menor ponto entre height[iLeft] e height[iRight].
   * @return Max quantidade de água presa.
   */
  private int maxWaterTrapped(int iLeft, int iRight, int iLesser) {
    return (iRight - iLeft - 1) * height[iLesser];
  }

}
