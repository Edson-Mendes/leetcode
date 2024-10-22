/**
 * Dado um string s com apenas os caracteres '(', ')', '[', ']', '{' e '}' determine se a string de entrada é válida.
 *
 * Uma entrada é válida se:
 *
 * 1 - Colchetes abertos devem ser fechados pelo mesmo tipo.
 *
 * 2 - Colchetes abertos devem ser fechados na ordem correta.
 *
 * 3 - Cada colchete fechado tem um colchete aberto correspondente do mesmo tipo.
 *
 * Restrições:
 *
 * 1 <= s.length <= 10⁴
 *
 * s consiste apenas de parênteses '()[]{}'.
 *
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  const stack = [];
  const map = { ")": "(", "]": "[", "}": "{" };
  for (const element of s) {
    if (element === "(" || element === "[" || element === "{") {
      stack.push(element);
    } else if (map[element] !== stack.pop()) {
      return false;
    }
  }

  return stack.length === 0;
};
