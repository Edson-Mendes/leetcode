package br.com.emendes.problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dado um array de inteiros de tamanho n, encontre todos os elementos que aparecem mais de | n/3 | vezes.
 * <br><br>
 * Restrições:
 * 1 <= nums.length <= 5 * 10⁴<br>
 * -10⁹ <= nums[i] <= 10⁹
 * <br><br>
 * Follow-up: Você pode resolver o problema em tempo linear e O(1) de espaço?
 */
public class MajorityElementII {

  public List<Integer> majorityElement(int[] nums) {
    Map<Integer, Integer> counterElements = new HashMap<>();
    final int limit = nums.length / 3;
    for (int key : nums) {
      counterElements.compute(key, (k, v) -> v == null ? 1 : v + 1);
    }
    return counterElements.entrySet().stream()
        .filter(entry -> entry.getValue() > limit)
        .map(Map.Entry::getKey)
        .toList();
  }

}
