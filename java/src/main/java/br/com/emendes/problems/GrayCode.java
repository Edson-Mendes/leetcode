package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Uma sequencia n-bit gray code é uma sequencia de inteiros 2^n onde:<br>
 * <br>
 * <ul>
 *   <li>Todos os inteiros estão no intervalo [0, 2^n - 1] inclusive</li>
 *   <li>O primeiro inteiro é 0</li>
 *   <li>Um inteiro não aparece mais do que uma vez na sequencia</li>
 *   <li>A representação binária de cada par adjacente diferencia por exatamente um bit</li>
 *   <li>A representação binária do primeiro e último inteiros diferenciam por exatamente um bit</li>
 * </ul>
 * <p>
 * Dado um inteiro n, retorne qualquer sequencia de n-bit gray code válido.<br>
 * <br>
 * Restrições:<br>
 * 1 <= n <= 16
 */
public class GrayCode {

  public List<Integer> grayCode(int n) {
    List<Integer> answer = new ArrayList<>();
    answer.add(0);
    answer.add(1);
    int counter = 2;
    int total = 1 << n;
    int[] array = new int[total];
    array[0] = 1;

    int i = -1;
    int j = 1;
    int curr = 1;
    int exp = 1;

    while (counter < total) {
      while (i > -1) {
        int next = array[i] * -1;
        curr += next;
        answer.add(curr);
        array[j] = next;
        j++;
        i--;
        counter++;
      }
      if (counter < total) {
        array[j] = 1 << exp++;
        curr += array[j];
        answer.add(curr);
        i = j - 1;
        j++;
        counter++;
      }
    }

    return answer;
  }

}
