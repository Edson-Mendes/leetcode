package br.com.emendes.containerwithmostwater;

/**
 * Você recebe uma altura de matriz inteira de comprimento n.
 * Existem n linhas verticais desenhadas de modo que as duas extremidades da i-ésima linha sejam (i, 0) e (i, altura[i]).
 * <br><br>
 * Encontre duas linhas que, junto com o eixo x, formem um recipiente, de modo que o recipiente contenha mais água.
 */
public class ContainerWithMostWater {

  // Solução de força bruta, acredito que a complexida de tempo seja O(n²).
  // Como esperado, essa solução recebeu Time Limit Exceeded.
  public int maxArea(int[] height) {
    int answer = 0;
    int currentArea;

    int arrayLength = height.length;

    for (int i = 0; i < arrayLength - 1; i++) {
      for (int j = i + 1; j < arrayLength; j++) {
        if (height[i] < height[j]) {
          currentArea = height[i] * (j - i);
        } else {
          currentArea = height[j] * (j - i);
        }
        if (answer < currentArea) {
          answer = currentArea;
        }
      }
    }
    return answer;
  }

}
