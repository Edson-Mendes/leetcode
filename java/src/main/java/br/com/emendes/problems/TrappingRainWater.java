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

  private int iLeft;
  private int iRight;
  private int heightLength;
  private int[] height;

  public int trap(int[] height) {
    // Precisa ter pelo menos 3 pontos para armazenar água.
    if (height.length < 3) return 0;

    iLeft = 0;
    heightLength = height.length;
    iRight = 1;
    this.height = height;

    int answer = 0;

    find2Bigger();
    answer += waterTrapped(iLeft, iRight);

    while (iLeft > 0) {
      int onTheLeft = findBiggestOnTheLeft(iLeft);
      answer += waterTrapped(onTheLeft, iLeft);
      iLeft = onTheLeft;
    }

    while (iRight < heightLength - 1) {
      int onTheRight = findBiggestOnTheRight(iRight);
      answer += waterTrapped(iRight, onTheRight);
      iRight = onTheRight;
    }

    return answer;
  }

  /**
   * Busca os dois maiores pontos no array height.
   */
  private void find2Bigger() {
    int i = 2;
    int iAux;

    while (i < heightLength) {
      if (height[i] > height[iRight]) {
        iAux = iRight;
        iRight = i;
        if (height[iAux] > height[iLeft]) {
          iLeft = iAux;
        }
      } else if (height[i] > height[iLeft]) {
        iAux = iRight;
        iRight = i;
        iLeft = iAux;
      }
      i++;
    }
  }

  /**
   * Calcula quanta água está presa entre iLeft e iRight.
   *
   * @param iLeft  index de um ponto a esquerda de iRight.
   * @param iRight index de um ponto a direita de iLeft.
   * @return Quantidade de água presa.
   */
  private int waterTrapped(int iLeft, int iRight) {
    int i = iLeft + 1;
    int iLesser = height[iLeft] <= height[iRight] ? iLeft : iRight;

    int max = ((Math.abs(iRight - iLeft)) - 1) * height[iLesser];

    while (i < iRight) {
      max -= height[i];
      i++;
    }
    return max;
  }

  /**
   * Busca o index do maior ponto a esquerda do index fornecido.
   */
  private int findBiggestOnTheLeft(int index) {
    int i = 1;
    int iBiggest = 0;

    while (i < index) {
      if (height[i] > height[iBiggest]) {
        iBiggest = i;
      }
      i++;
    }

    return iBiggest;
  }

  /**
   * Busca o index do maior ponto a direita do index fornecido.
   */
  private int findBiggestOnTheRight(int index) {
    int i = index + 2;
    int iBiggest = index + 1;

    while (i < heightLength) {
      if (height[i] >= height[iBiggest]) {
        iBiggest = i;
      }
      i++;
    }

    return iBiggest;
  }

}
