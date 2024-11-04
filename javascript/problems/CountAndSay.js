/**
 * A sequência de contagem e fala é uma sequência de sequências de dígitos definida pela fórmula recursiva:
 *
 * - countAndSay(1) = "1"
 *
 * - countAndSay(n) é a codificação de comprimento de execução de countAndSay(n - 1).
 *
 * A codificação de comprimento de execução (RLE) é um método de compactação de strings que funciona
 * substituindo caracteres idênticos consecutivos (repetidos 2 ou mais vezes)
 * pela concatenação do caractere e o número que marca a contagem dos caracteres (comprimento da execução).
 * Por exemplo, para comprimir a string "3322251", substituímos "33" por "23", substituímos "222" por "32",
 * substituímos "5" por "15" e substituímos "1" por "11". Assim, a string comprimida se torna "23321511".
 *
 * Dado um número inteiro positivo n, retorne o enésimo elemento da sequência de contagem e declaração.
 *
 * Restrições:
 *
 * 1 <= n <= 30
 *
 * Acompanhamento: Você conseguiria resolver isso iterativamente?
 *
 * @param {number} n
 * @return {string}
 */
var countAndSay = function (n) {
  return say("1", 1, n);
};

const say = (input, current, total) => {
  if (current === total) return input;
  let count = 1;
  let next = "";
  for (let i = 0; i < input.length; i++) {
    if (input[i] === input[i + 1]) {
      count++;
    } else {
      next = next + count + input[i];
      count = 1;
    }
  }
  return say(next, current + 1, total);
};
