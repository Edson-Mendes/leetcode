/**
 * Dado uma matrix de rows x cols preenchida com 0s e 1s, encontre o maior retângulo
 * contendo apenas 1s e retorne sua area.
 *
 * Restrições:
 *
 * rows == matrix.length
 *
 * cols == matrix[i].length
 *
 * 1 <= row, cols <= 200
 *
 * matrix[i][j] é '0' ou '1'.
 */
const maximalRectangle = function (matrix) {
  let maxArea = 0;
  let arr = new Array(matrix[0].length).fill(0);
  for (const row of matrix) {
    for (let i = 0; i < row.length; i++) {
      arr[i] = row[i] === "0" ? 0 : arr[i] + 1;
    }
    maxArea = Math.max(maxArea, largestRectangleInHistogram(arr));
  }
  return maxArea;
};

const largestRectangleInHistogram = (array) => {
  let maxArea = 0;
  const stack = [];
  array.push(0);
  for (let i = 0; i < array.length; i++) {
    while (stack.length && array[i] < array[stack[stack.length - 1]]) {
      const height = array[stack.pop()];
      const width = stack.length === 0 ? i : i - stack[stack.length - 1] - 1;
      maxArea = Math.max(maxArea, height * width);
    }
    stack.push(i);
  }
  array.pop();
  return maxArea;
};
