/**
 * Você recebe um grande número inteiro representado como um array de inteiros digits,
 * onde cada digits[i] é o i-ésimo dígito do inteiro.
 * Os dígitos são ordenados do mais significativo para o menos significativo, da esquerda para a direita.
 * O inteiro grande não contém nenhum 0 à esquerda.
 *
 * Incrementa o inteiro grande em um e retorna a matriz de dígitos resultante.
 *
 * Restrições:
 *
 * 1 <= digits.length <= 100
 *
 * 0 <= digits[i] <= 9
 *
 * digits não contém nenhum 0 à esquerda.
 *
 * @param {number[]} digits
 * @return {number[]}
 */
const plusOne = function (digits) {
  const newDigits = [];
  let carry = 1;
  for (let index = digits.length - 1; index >= 0; index--) {
    newDigits.push((digits[index] + carry) % 10);
    carry = digits[index] + carry === 10 ? 1 : 0;
  }
  if (carry === 1) newDigits.push(1);

  return newDigits.reverse();
};
