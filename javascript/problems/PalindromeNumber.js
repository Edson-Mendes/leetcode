/**
 * Dado um inteiro x, retorne true se x for um palíndromo, e false caso contrário.
 *
 * Restrições:
 *
 * -2³¹ <= x <= 2³¹ - 1
 *
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  if (x < 0) return false;
  let xCopy;
  let xReversed = 0;
  while (xCopy > 0) {
    xReversed = xReversed * 10 + (xCopy % 10);
    xCopy = Math.floor(xCopy / 10);
  }

  return x === xReversed;
};

var secondSolution = function (x) {
  let xString = x.toString();
  let right = xString.length - 1;
  let left = 0;
  while (left <= right) {
    if (xString[left++] != xString[right--]) return false;
  }
  return true;
};

var firstSolution = function (x) {
  let xString = x.toString();
  let xInverted = "";
  for (var i = xString.length - 1; i >= 0; i--) {
    xInverted += xString[i];
  }

  return xString === xInverted;
};
