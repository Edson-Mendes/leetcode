package br.com.emendes.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Dado um array de intervalos não sobrepostos, onde intervals[i] = [startI, endI] representa o ínicio e fim do
 * iessímo intervalo e o array esta ordenado em ordem crescente por startI.
 * Também é dado um intervalo newInterval = [start, end] que representa o ínicio e fim de outro intervalo.<br><br>
 * <p>
 * Insira newInterval em intervals de maneira que intervals continue ordenado em ordem crescente por startI,
 * e intervals ainda não tenha intervalos sobrepostos (mescle intervalos sobrepostos se necessário).<br><br>
 * <p>
 * Retorne intervals depois da inserção.<br><br>
 * <p>
 * Restrições:<br>
 * 0 <= intervals.length <= 10⁴<br>
 * intervals[i].length == 2<br>
 * 0 <= starti <= endi <= 10⁵<br>
 * intervals está ordenado por startI em ordem crescente.<br>
 * newInterval.length == 2<br>
 * 0 <= start <= end <= 10⁵
 */
public class InsertInterval {

  public int[][] insert(int[][] intervals, int[] newInterval) {
    if (intervals.length == 0) {
      return new int[][]{newInterval};
    }

    int index = Arrays.binarySearch(intervals, newInterval, Comparator.comparingInt(interval -> interval[0]));
    if (index < 0) {
      index = (index + 1) * -1;
    }

    List<int[]> intervalList = new LinkedList<>(Arrays.asList(intervals));
    intervalList.add(index, newInterval);

    return merge(intervalList.toArray(int[][]::new));
  }

  private int[][] merge(int[][] intervals) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int[] interval : intervals) {
      min = Math.min(min, interval[0]);
      max = Math.max(max, interval[0]);
    }

    int[] range = new int[max - min + 1];
    for (int[] interval : intervals) {
      range[interval[0] - min] = Math.max(interval[1] - min, range[interval[0] - min]);
    }

    int start = 0;
    int end = 0;
    List<int[]> result = new LinkedList<>();
    for (int i = 0; i < range.length; i++) {
      if (range[i] == 0) {
        continue;
      }
      if (i <= end) {
        end = Math.max(range[i], end);
      } else {
        result.add(new int[]{start + min, end + min});
        start = i;
        end = range[i];
      }
    }
    result.add(new int[]{start + min, end + min});
    return result.toArray(new int[result.size()][]);
  }

}
