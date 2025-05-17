/**
 * Um n-bit gray code sequence é uma sequência de 2^n inteiros onde:
 *
 * - Cada inteiro está no intervalo [0, 2^n - 1]
 *
 * - O primeiro inteiro é 0
 *
 * - Um inteiro não aparece mais do que uma vez
 *
 * - A representação binária de cada par adjacente difere em exatos 1 bit
 *
 * - A representação binária do primeiro e último inteiros difere em exatos 1 bit
 *
 * Dado um inteiro n, retorne qualquer n-bit gray code sequence.
 *
 * Restrições:
 *
 * - 1 <= n <= 16
 */
const grayCode = function (n) {
  const sequence = [];
  for (let i = 0; i < 1 << n; i++) sequence.push(i ^ (i >> 1));
  return sequence;
};

const secondSolution = function (n) {
  if (n == 0) return [0];
  const prevSeq = grayCode(n - 1);
  const d = 1 << (n - 1);
  return [...prevSeq, ...prevSeq.reverse().map((v) => v ^ d)];
};

const firstSolution = function (n) {
  let total = Math.pow(2, n) - 1;
  const sequence = [0];
  const memo = new Set();
  memo.add(0);
  grayCodeHelper(sequence, memo, total);

  return sequence;
};

const grayCodeHelper = (sequence, memo, count) => {
  if (count === 0) return;
  const last = sequence[sequence.length - 1];
  let i = 1;
  while (memo.has(last ^ i)) {
    i <<= 1;
  }
  sequence.push(last ^ i);
  memo.add(last ^ i);
  grayCodeHelper(sequence, memo, count - 1);
};

console.log(grayCode(3));
