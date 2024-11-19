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
  let length = height.length;
  const leftElevation = [];
  const rightElevation =[];
  leftElevation[0] = 0;
  rightElevation[length - 1] = 0;
  let trappedWater = 0;

  for (let index = 1; index < length; index++) {
    leftElevation[index] = Math.max(leftElevation[index - 1], height[index - 1]);
  }
  for (let index = length - 2; index > -1; index--) {
    rightElevation[index] = Math.max(rightElevation[index + 1], height[index + 1]);
  }
  for (let index = 0; index < length; index++) {
    let elevation = Math.min(leftElevation[index], rightElevation[index]);
    trappedWater += elevation <= height[index] ? 0 : elevation - height[index];
  }

  return trappedWater;
};
