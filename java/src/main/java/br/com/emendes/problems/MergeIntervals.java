package br.com.emendes.problems;

import java.util.*;

/**
 * Dado um array intervals, onde intervals[i] = [startI, endI], mesclar todos os intervalos sobrepostos,
 * e retorne um array de intervalos não sobrepostos que cubra todos os intervalos da entrada.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= intervals.length <= 10⁴<br>
 * intervals[i].length == 2<br>
 * 0 <= startI <= endI <= 10⁴
 */
public class MergeIntervals {

  public int[][] merge(int[][] intervals) {
    if (intervals.length == 1) return intervals;

    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

    List<int[]> answer = new ArrayList<>();

    for (int[] interval : intervals) {
      if (answer.isEmpty() || interval[0] > answer.get(answer.size() - 1)[1]) {
        answer.add(interval);
      } else {
        int[] lastInterval = answer.get(answer.size() - 1);
        lastInterval[1] = Math.max(lastInterval[1], interval[1]);
      }
    }

    return answer.toArray(int[][]::new);
  }

  public int[][] otherSolution(int[][] intervals) {
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
