/**
 * A string "PAYPALISHIRING" é escrito no padrão zigzag em um dado número de linhas desse jeito:
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * e então lido linha por linha: "PAHNAPLSIIGYIR"
 *
 * Escreva o código que recebe uma string e o número de linhas e converta para o modo zigzag.
 *
 * Restrições:
 * 1 <= s.length <= 1000
 *
 * s consiste de letras (maiúsculas e minúsculas), ',' e '.'.
 *
 * 1 <= numsRows <= 1000
 *
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function (s, numRows) {
  if (numRows === 1) return s;
  let rows = new Array(numRows).fill("");
  let r = 0;
  let inc = 1;
  numRows--;

  for (const element of s) {
    rows[r] += element;
    r += inc;
    if (r === 0 || r >= numRows) {
      inc *= -1;
    }
  }
  return rows.join("");
};
