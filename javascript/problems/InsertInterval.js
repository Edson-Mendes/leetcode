/**
 * Você recebe um array intervals de intervalos não sobrepostos onde
 * intervals[i] = [starti, endi], representam o início e o fim do iéssimo intervalo e
 * intervals está ordenado de modo crescente por starti.
 * Você também recebe um intervalo newInterval = [start, end] que representa o início e o fim
 * de outro intervalo.
 *
 * insira newInterval em intervals de modo que intervals continue ordenado em ordem crescente por starti
 * e intervals continue em intervalos sobrepostos (mescle intervalos sobrepostos se necessário)
 *
 * retorne intervals depois da inserção.
 *
 * Note que você não precisa modificar intervals in-place. Você pode fazer um novo array e retorná-lo.
 *
 * Restrições:
 *
 * 0 <= intervals.length <= 10⁴
 *
 * intervals[i].length == 2
 *
 * 0 <= starti <= endi <= 10⁵
 *
 * intervals está ordenado por starti em ordem crescente.
 *
 * newInterval.length == 2
 *
 * 0 <= start <= end <= 10⁵
 *
 * @param {number[][]} intervals
 * @param {number[]} newInterval
 * @return {number[][]}
 */
const insert = function (intervals, newInterval) {
  const mergedIntervals = [];
  let i = 0;
  let last = -1;
  while (intervals[i] && newInterval[0] > intervals[i][0]) {
    mergedIntervals.push(intervals[i]);
    i++;
    last++;
  }
  if (mergedIntervals.length === 0 || newInterval[0] > mergedIntervals[last][1]) {
    mergedIntervals.push(newInterval);
    last++;
  } else {
    mergedIntervals[last][1] = Math.max(newInterval[1], mergedIntervals[last][1]);
  }
  while (intervals[i]) {
    if (intervals[i][0] > mergedIntervals[last][1]) {
      mergedIntervals.push(intervals[i]);
      last++;
    } else {
      mergedIntervals[last][1] = Math.max(
        intervals[i][1],
        mergedIntervals[last][1]
      );
    }
    i++;
  }

  return mergedIntervals;
};
