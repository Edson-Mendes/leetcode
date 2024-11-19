/**
 * Dado n inteiros não negativos que representam um map de elevações onde a largura de cada barra é 1,
 * calcule quanta água pode ser armazenada depois de uma chuva.
 *
 * Restrições:
 *
 * n == height.length
 *
 * 1 <= n <= 2 * 10⁴
 *
 * 0 <= height[i] <= 10⁵
 *
 * @param {number[]} height
 * @return {number}
 */
const trap = function (height) {
  let left = 0;
  let right = height.length - 1;
  let leftElevation = height[left];
  let rightElevation = height[right];
  let trappedWater = 0;

  while (left < right) {
    if (leftElevation < rightElevation) {
      trappedWater += leftElevation - height[left];
      leftElevation = Math.max(leftElevation, height[++left]);
    } else {
      trappedWater += rightElevation - height[right];
      rightElevation = Math.max(rightElevation, height[--right]);
    }
  }

  return trappedWater;
}

const firstSolution = function (height) {
  let length = height.length;
  const leftElevation = [];
  const rightElevation = [];
  leftElevation[0] = height[0];
  rightElevation[length - 1] = height[length - 1];
  let trappedWater = 0;

  for (let index = 1; index < length; index++) {
    leftElevation[index] = Math.max(leftElevation[index - 1], height[index]);
  }
  for (let index = length - 2; index >= 0; index--) {
    rightElevation[index] = Math.max(rightElevation[index + 1], height[index]);
  }
  for (let index = 0; index < length; index++) {
    trappedWater += Math.min(leftElevation[index], rightElevation[index])- height[index];
  }

  return trappedWater;
};
