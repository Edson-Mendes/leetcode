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
  s = ")" + s;
  const dp = [];
  let maxLength = 0;

  for (let i = 1; i < s.length; i++) {
    let previousLength = dp[i - 1] || 0;
    if (s[i] === ")" && s[i - previousLength - 1] === "(") {
      dp[i] = previousLength + (dp[i - previousLength - 2] || 0) + 2;
      maxLength = Math.max(maxLength, dp[i]);
    }
  }

  return maxLength;
};

var firstSolution = function (s) {
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

console.log(longestValidParentheses("") === 0);
console.log(longestValidParentheses("(())((()") === 4);
console.log(longestValidParentheses(")()())") === 4);
console.log(longestValidParentheses("()((()))(())(()())()") === 20);
console.log(longestValidParentheses("((()((()))") === 8);
console.log(longestValidParentheses("((()(())") === 6);
