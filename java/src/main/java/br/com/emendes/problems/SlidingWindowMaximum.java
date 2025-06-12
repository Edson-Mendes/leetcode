package br.com.emendes.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Você recebe um array de inteiros nums, há uma sliding window de tamanho k que se move
 * da extrema-esquerda para a extrema-direita do conjunto. Você só pode ver os números k na window.
 * Cada vez que a janela deslizante se move uma posição para a direita.
 * <br><br>
 * Retorne o max sliding window.
 * <br><br>
 * Restrições:<br>
 * 1 <= nums.length <= 10⁵<br>
 * -10⁴ <= nums[i] <= 10⁴<br>
 * 1 <= k <= nums.length
 */
public class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {
    Queue<Integer> queue = new PriorityQueue<>();
    Map<Integer, Integer> toRemove = new HashMap<>();
    int[] maxSlidingWindow = new int[nums.length - k + 1];
    int index = 0;
    for (int i = 0; i < k; i++) {
      queue.add(-nums[i]);
    }
    maxSlidingWindow[index++] = -queue.peek();
    for (int i = k; i < nums.length; i++) {
      queue.add(-nums[i]);
      toRemove.merge(-nums[i - k], 1, (o, n) -> ++o);
      cleanQueueHead(queue, toRemove);
      maxSlidingWindow[index++] = -queue.peek();
    }
    return maxSlidingWindow;
  }

  private void cleanQueueHead(Queue<Integer> queue, Map<Integer, Integer> map) {
    while (map.containsKey(queue.peek()) && map.get(queue.peek()) > 0) {
      map.computeIfPresent(queue.peek(), (k, v) -> --v);
      queue.poll();
    }
  }

}
