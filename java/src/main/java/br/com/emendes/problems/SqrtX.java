package br.com.emendes.problems;

/**
 * Dado um inteiro não negativo x, retorne a raiz quadrada de x arredondada para o número inteiro mais próximo.
 * O inteiro retornado deve ser não negativo também.<br><br>
 *
 * Você não deve usar nenhuma função ou operador imbutido.<br><br>
 *
 * Restrições:<br>
 * 0 <= x <= 2³¹ - 1
 */
public class SqrtX {

  public int mySqrt(int x) {
    int min = 0;
    int max = Math.min(x, 46_340);

    int answer = 0;

    while (min <= max) {
      int mid = (max - min)/2 + min;
      int midPower = mid * mid;

      if (midPower < x) {
        answer = mid;
        min = mid + 1;
      } else if (midPower == x) {
        return mid;
      } else {
        max = mid - 1;
      }
    }

    return answer;
  }

}
