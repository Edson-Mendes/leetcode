/**
 * Dado um array de inteiros heights representando a altura da barra do histograma
 * onde a largura de cada barra é 1, retorne a area do maior retângulo no histograma.
 *
 * Restrições:
 *
 * 1 <= heights.length <= 10⁵
 *
 * 0 <= heights[i] <= 10⁴
 */
const largestRectangleArea = function (heights) {
  let maxArea = 0;
  const stack = [];
  let stackIndex = -1;
  for (let index = 0; index < heights.length; index++) {
    let prev = stack[stackIndex] ?? [0, 0];
    let i = index;
    while (heights[index] < prev[1]) {
      maxArea = Math.max(maxArea, (index - prev[0]) * prev[1]);
      stack.pop();
      stackIndex--;
      i = prev[0];
      prev = stack[stackIndex] ?? [0, 0];
    }
    stack.push([i, heights[index]]);
    stackIndex++;
  }

  while (stack.length !== 0) {
    const pair = stack.pop();
    maxArea = Math.max(maxArea, (heights.length - pair[0]) * pair[1]);
  }

  return maxArea;
};
