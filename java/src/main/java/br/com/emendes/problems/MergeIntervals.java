package br.com.emendes.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    Map<Integer, int[]> intervalMap = mergeIntervals(intervals);
    int[][] answer = mapToArray(intervalMap);
    int intervalLengthBefore = intervals.length;

    while (answer.length < intervalLengthBefore) {
      intervalLengthBefore = answer.length;

      intervalMap = mergeIntervals(answer);
      answer = mapToArray(intervalMap);
    }

    return answer;
  }

  private int[][] mapToArray(Map<Integer, int[]> intervalMap) {
    Set<int[]> intervalSet = new HashSet<>(intervalMap.values());

    int[][] newIntervals = new int[intervalSet.size()][2];
    int i = 0;
    for (int[] interval : intervalSet) {
      newIntervals[i] = interval;
      i++;
    }

    return newIntervals;
  }

  private Map<Integer, int[]> mergeIntervals(int[][] intervals) {
    Map<Integer, int[]> intervalMap = new HashMap<>();

    for (int[] interval : intervals) {
      int[] overlappingInterval = intervalMap.get(interval[0]);
      if (overlappingInterval != null) {
        merge(overlappingInterval, interval);
        for (int i = interval[1]; i > interval[0]; i--) {
          intervalMap.put(i, overlappingInterval);
        }
      } else {
        overlappingInterval = intervalMap.get(interval[1]);
        if (overlappingInterval != null) {
          merge(overlappingInterval, interval);
          for (int i = interval[0]; i < interval[1]; i++) {
            intervalMap.put(i, overlappingInterval);
          }
        } else {
          int[] newInterval = {interval[0], interval[1]};
          for (int i = interval[0]; i <= interval[1]; i++) {
            intervalMap.put(i, newInterval);
          }
        }
      }
    }

    return intervalMap;
  }

  private void merge(int[] overlappingInterval, int[] interval) {
    if (interval[0] < overlappingInterval[0]) {
      overlappingInterval[0] = interval[0];
    }
    if (interval[1] > overlappingInterval[1]) {
      overlappingInterval[1] = interval[1];
    }
  }

}
