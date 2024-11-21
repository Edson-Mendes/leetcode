/**
 * Dado dois inteiros não negativos num1 e num2 representados como strings,
 * retorne o produto de num1 e num2, também representado como string.
 *
 * Nota: Você não deve usar qualquer biblioteca de BigInt imbutido e nem converter as entradas
 * para inteiros.
 *
 * Restrições:
 *
 * 1 <= num1.length, num2.length <= 200
 *
 * num1 e num2 consistem apenas de digitos.
 *
 * Ambos num1 e num2 não possuem zero iniciais exceto pelo próprio zero.
 *
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
const multiply = function (num1, num2) {
  if (num1 === "0" || num2 === "0") return "0";
  let zeros = 0;
  let cache = new Map();
  let result = "0";
  for (let i = num2.length - 1; i >= 0; i--) {
    result = sum(result, mult(num1, +num2[i], zeros++, cache));
  }

  return result;
};

const mult = (num1, multiplier, zeros, cache) => {
  if (!cache.has(multiplier)) {
    let carry = 0;
    let result = [];
    for (let i = num1.length - 1; i >= 0; i--) {
      let operation = +num1[i] * multiplier + carry;
      result.push(operation % 10);
      carry = Math.floor(operation / 10);
    }
    if (carry > 0) result.push(carry);
    result.reverse();
    result = result.join("");
    cache.set(multiplier, result);
  }

  return cache.get(multiplier) + "0".repeat(zeros);
};

const sum = (a, b) => {
  let i = a.length - 1;
  let j = b.length - 1;
  let carry = 0;
  let result = [];
  while (i >= 0 && j >= 0) {
    let operation = +a[i] + +b[j] + carry;
    result.push(operation % 10);
    carry = Math.floor(operation / 10);
    i--;
    j--;
  }
  while (i >= 0) {
    let operation = +a[i] + carry;
    result.push(operation % 10);
    carry = Math.floor(operation / 10);
    i--;
  }
  while (j >= 0) {
    let operation = +b[j] + carry;
    result.push(operation % 10);
    carry = Math.floor(operation / 10);
    j--;
  }
  if (carry > 0) result.push(carry);
  result.reverse();
  return result.join("");
};
