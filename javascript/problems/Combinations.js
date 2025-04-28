/**
 * Dado dois inteiros n e k, retorne todas as possíveis combinações de k números escolhidos
 * do intervalo de [1. n].
 *
 * Você pode retornar a solução em qualquer ordem.
 *
 * Restrições:
 *
 * 1 <= n <= 20
 *
 * 1 <= k <= n
 */
const combine = function (n, k) {
  const combinations = [];
  generateCombinations(1, n, 0, k, [], combinations);

  return combinations;
};

const generateCombinations = (value, maxValue, counter, maxCounter, combination, combinations) => {
  if (counter === maxCounter) {
    combinations.push([...combination]);
    return;
  }
  while (value <= maxValue - (maxCounter - counter - 1)) {
    combination.push(value);
    generateCombinations(++value, maxValue, counter + 1, maxCounter, combination, combinations);
    combination.pop();

  }
};
