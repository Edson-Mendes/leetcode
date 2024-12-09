/**
 * Dada uma string s, retorna se s é um número válido.
 *
 * Por exemplo, todos os seguintes são números válidos: "2", "0089", "-0.1", "+3.14", "4.", "-.9",
 * "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789", enquanto os seguintes não são números válidos:
 * "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53".
 *
 * Formalmente, um número válido é definido usando uma das seguintes definições:
 *
 * 1. Um número inteiro seguido por um expoente opcional.
 *
 * 2. Um número decimal seguido por um expoente opcional.
 *
 * Um número inteiro é definido com um sinal opcional '-' ou '+' seguido de dígitos.
 *
 * Um número decimal é definido com um sinal opcional '-' ou '+' seguido por uma das seguintes definições:
 *
 * 1. Dígitos seguidos de um ponto '.'.
 *
 * 2. Dígitos seguidos de um ponto '.' seguido de dígitos.
 *
 * 3. Um ponto '.' seguido de dígitos.
 *
 * Um expoente é definido com uma notação de expoente 'e' ou 'E' seguida por um número inteiro.
 *
 * Os dígitos são definidos como um ou mais dígitos.
 *
 * Restrições:
 *
 * 1 <= s.length <= 20
 *
 * s contém apenas letras (maiúsculas ou minúsculas), digitos (0-9), sinal de mais '+', sinal de menos '-',
 * ou ponto '.'
 *
 * @param {string} s
 * @return {boolean}
 */
const isNumber = function (s) {
  let eIndex = 0;
  while (eIndex < s.length && s[eIndex] !== "E" && s[eIndex] !== "e") {
    eIndex++;
  }

  return isDecimalNumber(s, 0, eIndex) && isIntegerNumber(s, eIndex);
};

const isDecimalNumber = (s, start, end) => {
  if (s[start] == "-" || s[start] === "+") start++;
  if (start === end || (s[start] === "." && start + 1 === end)) return false;
  let hasDot = false;
  while (start < end) {
    const element = s.charCodeAt(start);
    if (element === 46) {
      if (hasDot) return false;
      hasDot = true;
    } else if (element < 48 || element > 57) return false;
    start++;
  }

  return true;
};

const isIntegerNumber = (s, start) => {
  if (start === s.length) return true;
  if (s[start] === "E" || s[start] === "e") start++;
  if (s[start] == "-" || s[start] === "+") start++;
  if (start === s.length) return false;
  while (start < s.length) {
    const element = s.charCodeAt(start);
    if (element < 48 || element > 57) return false;
    start++;
  }

  return true;
};
