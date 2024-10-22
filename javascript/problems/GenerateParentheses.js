/**
 * Dado n pares de parênteses, escreva uma função para gerar todas as combinações de parênteses bem formados.
 *
 * Restrições:
 *
 * 1 <= n <= 8
 *
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function (n) {
  let combinations = [];
  generate(n, n, combinations, []);

  return combinations;
};

const generate = (open, close, combinations, sequence) => {
  if (!open && !close) {
    combinations.push(sequence.join(""));
    return;
  }
  if (open > 0) {
    sequence.push("(");
    generate(open - 1, close, combinations, sequence);
    sequence.pop();
  }
  if (close > open) {
    sequence.push(")");
    generate(open, close - 1, combinations, sequence);
    sequence.pop();
  }
};
