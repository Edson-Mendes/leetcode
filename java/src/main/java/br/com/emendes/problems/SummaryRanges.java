package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Você recebe um array nums de inteiros únicos ordenados.<br>
 * O intervalo [a, b] é o conjunto de inteiros de 'a' até 'b' (incluso).<br>
 * Retorne a menor lista de intervalo ordenados que cobre exatamente todos os números do array.
 * Ou seja, cada elementro do array nums é coberto por exatos um intervalo, e não existe valor x
 * de modo que x está nos intervalos, mas não está em nums.
 * <br><br>
 * Cada intervalo [a, b] na lista deve ser estar na saída como:<br>
 * "a->b" se a != b<br>
 * "a" se a == b<br><br>
 * Restrições:<br>
 * 0 <= nums.length <= 20 <br>
 * -2³¹ <= nums[i] <= 2³¹ - 1<br>
 * Todos os valores em nums são únicos<br>
 * nums está ordenado em ordem crescente
 */
public class SummaryRanges {

  public List<String> summaryRanges(int[] nums) {
    if (nums.length == 0) return List.of();
    List<String> ranges = new ArrayList<>();
    int start = nums[0];
    int end = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int value = nums[i];
      if (value != end + 1) {
        ranges.add(createRange(start, end));
        start = value;
      }
      end = value;
    }
    ranges.add(createRange(start, end));

    return ranges;
  }

  private String createRange(int start, int end) {
    if (start == end) return String.valueOf(start);
    return String.format("%d->%d", start, end);
  }

}
