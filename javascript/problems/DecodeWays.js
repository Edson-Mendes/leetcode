/**
 * Você interceptou uma mensagem secreta codificada como uma string de números.
 * A mensagem é decodificada da seguinte forma:
 *
 * "1" -> A, "2" -> B, ..., "26" -> Z
 *
 * No entanto, enquando decodificava a mensagem, você percebe que existe diferente maneiras que
 * você pode decodificar por que alguns códigos estão contidos em outros códigos ("2" e "5" vs "25").
 *
 * Por exemplo, "11106" pode ser decodificada em:
 *
 * - "AAJF" agrupando (1, 1, 10, 6)
 *
 * - "KJF" agrupando (11, 10, 6)
 *
 * - O agrupamento (1, 11, 06) é inválido por que "06" não é um código válido (apenas "6" é válido).
 *
 * Nota: pode haver sequências de caracteres impossíveis de decodificar.
 *
 * Dado um string s contendo apenas dígitos, retorne o número de maneiras de decodificação.
 * Se a string inteira não puder ser decodificada de modo válido, retorne 0.
 *
 * Os casos de testes são gerados de modo que a saída caiba em um inteiro 32-bits
 *
 * Restrições:
 *
 * 1 <= s.length <= 100
 *
 * s contém apenas dígitos e pode conter zeros iniciais.
 */
const numDecodings = function (s) {
  return countDecodings(s, 0, []);
};

const countDecodings = (word, index, cache) => {
  if (index === word.length) return 1;
  if (cache[index] != undefined) return cache[index];
  else if (word[index] == 0) cache[index] = 0;
  else if (index + 1 < word.length && (word[index] == 1 || (word[index] == 2 && word[index + 1] < 7)))
    cache[index] = countDecodings(word, index + 1, cache) + countDecodings(word, index + 2, cache);
  else cache[index] = countDecodings(word, index + 1, cache);
  return cache[index];
};
