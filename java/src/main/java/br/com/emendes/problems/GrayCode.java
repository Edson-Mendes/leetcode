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
    int total = 1 << n;

    for (int i = 0; i < total; i++) {
      answer.add(i ^ (i/2));
    }

    return answer;
  }

}
