/**
 * Dada uma string contendo dígitos de 2 a 9, inclusive,
 * retorne todas as combinações de letras possíveis que o número poderia representar.
 * Retorne a resposta em qualquer ordem.
 *
 * Um mapeamento de dígitos para letras (assim como nos botões do telefone) é dado abaixo.
 * Note que 1 não mapeia para nenhuma letra.
 *
 * 2 -> abc, 3 -> def, 4 -> ghi, 5 -> jkl, 6 -> mno, 7 -> pqrs, 8 -> tuv, 9 -> wxyz
 *
 * Restrições:
 *
 * 0 <= digits.length <= 4
 *
 * digits[i] é um dígito no intervalo ['2', '9'].
 *
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function (digits) {
  if (digits.length === 0) return [];
  const map = {};
  map["2"] = ["a", "b", "c"];
  map["3"] = ["d", "e", "f"];
  map["4"] = ["g", "h", "i"];
  map["5"] = ["j", "k", "l"];
  map["6"] = ["m", "n", "o"];
  map["7"] = ["p", "q", "r", "s"];
  map["8"] = ["t", "u", "v"];
  map["9"] = ["w", "x", "y", "z"];
  const combinations = [];

  const findCombination = (i, combination) => {
    if (i === digits.length) {
      combinations.push(combination.join(""));
      return;
    }
    const possibilities = map[digits[i]];
    for (const digit of possibilities) {
      combination.push(digit);
      findCombination(i + 1, combination);
      combination.pop();
    }
  };

  findCombination(0, []);

  return combinations;
};
