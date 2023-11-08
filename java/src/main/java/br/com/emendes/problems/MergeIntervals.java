package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

}
