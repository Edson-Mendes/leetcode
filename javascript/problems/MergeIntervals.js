/**
 * Dado um array de intervalos onde intervals[i] = [starti, endi], mescle todos os intervalos sobrepostos
 * e retornar uma matriz de intervalos não sobrepostos que cobrem todos os intervalos na entrada.
 *
 * Restrições:
 *
 * 1 <= intervals.length <= 10⁴
 *
 * intervals[i].length == 2
 *
 * 0 <= starti <= endi <= 10⁴
 *
 * @param {number[][]} intervals
 * @return {number[][]}
 */
const merge = function (intervals) {
  intervals.sort((a, b) => {
    const aMinusB = a[0] - b[0];
    if (aMinusB === 0) return a[1] - b[1];
    return aMinusB;
  });

  const mergedIntervals = [];
  let index = -1;
  for (const interval of intervals) {
    if (mergedIntervals.length === 0 || interval[0] > mergedIntervals[index][1]) {
      mergedIntervals.push(interval);
      index++;
    } else {
      mergedIntervals[index][1] = Math.max(mergedIntervals[index][1], interval[1]);
    }
  }

  return mergedIntervals;
};
