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
  heights.push(0);
  for (let i = 0; i < heights.length; i++) {
    while (stack.length && heights[i] < heights[stack[stack.length - 1]]) {
      const height = heights[stack.pop()];
      const width = stack.length === 0 ? i : i - stack[stack.length - 1] - 1;
      maxArea = Math.max(maxArea, height * width);
    }
    stack.push(i);
  }
  return maxArea;
};
