/**
 * Dado uma string contendo apenas caracteres '(' e ')', retorne o comprimento da maior substring de parênteses
 * bem formado.
 *
 * Restrições:
 *
 * 0 <= s.length <= 3 * 10⁴
 *
 * s[i] é '(', or ')'.
 *
 * @param {string} s
 * @return {number}
 */
var longestValidParentheses = function (s) {
  const open = [];
  const previousLength = [];
  let maxLength = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === "(") open.push(i);
    else if (open.length) {
      let start = open.pop();
      let currLength = i - start + 1 + (previousLength[start] || 0);
      maxLength = Math.max(maxLength, currLength);
      previousLength[i + 1] = currLength;
    }
  }

  return maxLength;
};
