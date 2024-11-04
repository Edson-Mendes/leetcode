/**
 * Dado um array de inteiros distintos candidates e um inteiro target, retorne uma lista de todos as
 * combinações únicas de candidates onde a soma dos elementos escolhidos seja igual a target.
 * Você pode retornar as combinações em qualquer ordem.
 *
 * O mesmo número pode ser escolhido entre os candidatos um número ilimitado de vezes. Duas combinações
 * são únicas se a frequência de pelo menos um dos números escolhidos for diferente.
 *
 * Os casos de teste são gerados de modo que o número de combinações únicas que somam o alvo seja menor
 * que 150 combinações para a entrada fornecida.
 *
 * Restrições:
 *
 * 1 <= candidates.length <= 30
 *
 * 2 <= candidates[i] <= 40
 *
 * Todos os elementos de candidates são distintos.
 *
 * 1 <= target <= 40
 *
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function (candidates, target) {
  const combinations = [];
  generateCombinations(candidates, 0, target, [], 0, combinations);

  return combinations;
};
 
const generateCombinations = (candidates, index, target, combination, sum, combinations) => {
  if (sum === target) {
    combinations.push([...combination]);
    return;
  }
  if (sum > target) return;
  for (; index < candidates.length; index++) {
    combination.push(candidates[index]);
    generateCombinations(candidates, index, target, combination, sum + candidates[index], combinations);
    combination.pop();
  }
};
