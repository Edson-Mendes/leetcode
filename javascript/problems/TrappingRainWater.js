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
  let trappedWater = 0;
  let left = 0;
  let right = height.length - 1;
  let currHeight = 1;
  while (left < right) {
    while (left < right && height[left] < currHeight) {
      left++;
    }
    while (right > left && height[right] < currHeight) {
      right--;
    }
    for (let index = left + 1; index < right; index++) {
      if (height[index] < currHeight) trappedWater++;
    }
    currHeight++;
  }

  return trappedWater;
};
