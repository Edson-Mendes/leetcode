package br.com.emendes.problems;

/**
 * Você recebe uma altura de matriz inteira de comprimento n.
 * Existem n linhas verticais desenhadas de modo que as duas extremidades da i-ésima linha sejam (i, 0) e (i, altura[i]).
 * <br><br>
 * Encontre duas linhas que, junto com o eixo x, formem um recipiente, de modo que o recipiente contenha mais água.
 */
public class ContainerWithMostWater {

  // Solução usando a segunda dica do problema.
  // DICA: Tente usar dois ponteiros. Defina um ponteiro para a esquerda e outro para a direita da matriz.
  // Sempre mova o ponteiro que aponta para a linha inferior.
  //
  // Solução em O(n).
  public int maxArea(int[] height) {
    int leftIndex = 0;
    int rightIndex = height.length - 1;
    int currentArea;
    int answer = 0;

    while (leftIndex < rightIndex) {
      if (height[leftIndex] < height[rightIndex]) {
        currentArea = height[leftIndex] * (rightIndex - leftIndex);
        leftIndex++;
      } else {
        currentArea = height[rightIndex] * (rightIndex - leftIndex);
        rightIndex--;
      }
      if (answer < currentArea) {
        answer = currentArea;
      }
    }

    return answer;
  }

  // Solução de força bruta, acredito que a complexida de tempo seja O(n²).
  // Como esperado, essa solução recebeu Time Limit Exceeded.
  public int badSolution(int[] height) {
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
