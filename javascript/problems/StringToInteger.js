/**
 * Implemente a função myAtoi(string s), que converte uma string em um inteiro 32-bits com sinal.
 *
 * O algoritmo para myAtoi(string s) é dado a seguir:
 *
 * 1. Whitespace: ignorar qualquer whitespace inicial.
 *
 * 2. Sinal: Determina o sinal checando se o próximo caracter é '-' ou '+',
 * se um sinal não estiver presente então assumir que é positivo.
 *
 * 3. Conversão: Ler o inteiro pulando zeros iniciais até que um caracter não dígito seja encontrado ou o
 * fim da string seja alcançado. Se nenhum dígito for lido, então retorne 0.
 *
 * 4. Arredondamento: Se o inteiro estiver fora do intervalo de um inteiro 32-bits com sinal deve ser arredondado.
 * Assim valores menores que -2³¹ devem ser arrendodado para -2³¹ e valor maiores que 2³¹ - 1 devem ser arredondados
 * para 2³¹ - 1.
 *
 * Restrições:
 *
 * 0 <= s.length <= 200
 *
 * s consiste de letras (maiúsculas e minúsculas), dígitos, ' ', '+', '-' e '.'.
 *
 * @param {string} s
 * @return {number}
 */
var myAtoi = function (s) {
  let result = 0;
  let signal = 1;
  let i = 0;
  const MIN = 2147483648;
  const MAX = 2147483647;

  while (i < s.length && s[i] === " ") {
    i++;
  }
  if (s[i] === "-" || s[i] === "+") {
    signal = s[i] === "-" ? -1 : 1;
    i++;
  }
  while (i < s.length && s[i] >= "0" && s[i] <= "9") {
    result = result * 10 + +s[i];
    i++;
    if (result > MIN && signal === -1) return MIN * -1;
    if (result > MAX && signal === 1) return MAX;
  }

  return result * signal;
};
