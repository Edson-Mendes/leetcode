/**
 * Dado uma coleção de números candidatos (candidates) e um número alvo (target), encontre todos as únicas
 * combinações em candidates onde os números candidato somam igual a target.
 *
 * Cada número em candidates pode ser usado uma única vez na combinação.
 *
 * Nota: A solução não deve conter combinações duplicadas.
 *
 * Restrições:
 *
 * 1 <= candidates.length <= 100
 *
 * 1 <= candidates[i] <= 50
 *
 * 1 <= target <= 30
 *
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
const combinationSum2 = function (candidates, target) {
  const combinations = [];
  candidates.sort((a, b) => a - b);
  combine(target, 0, candidates, [], combinations);

  return combinations;
};

const combine = (target, index, candidates, combination, combinations) => {
  if (target === 0) {
    combinations.push([...combination]);
    return;
  }
  if (index === candidates.length || candidates[index] > target) return;
  combination.push(candidates[index]);
  combine(target - candidates[index], index + 1, candidates, combination, combinations);
  combination.pop();
  combine(target, nextDifferent(index, candidates), candidates, combination, combinations);
};

const nextDifferent = (index, array) => {
  let nextIndex = index + 1;
  while (array[index] === array[nextIndex]) {
    nextIndex++;
  }

  return nextIndex;
};
