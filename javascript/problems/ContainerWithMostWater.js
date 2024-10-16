/**
 * Você recebe um array de inteiros height de tamanho n.
 * Existem n linhas verticais desenhadas de modo que os dois pontos finais da i-ésima linha são
 * (i, 0) e (i, altura[i]).
 *
 * Encontre duas retas que, juntamente com o eixo x, formem um recipiente, de modo que o recipiente
 * contenha mais água.
 *
 * Retorne a quantidade máxima de água que um recipiente pode armazenar.
 *
 * Observe que você não pode inclinar o recipiente.
 *
 * Restrições:
 *
 * n == height.length
 *
 * 2 <= n <= 10⁵
 *
 * 0 <= height[i] <= 10⁴
 *
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
  let left = 0;
  let right = height.length - 1;
  let maxArea = 0;

  while (left < right) {
    let shorterHeight = Math.min(height[left], height[right]);
    maxArea = Math.max(maxArea, shorterHeight * (right - left));

    if (height[left] < height[right]) left++;
    else right--;
  }

  return maxArea;
};
