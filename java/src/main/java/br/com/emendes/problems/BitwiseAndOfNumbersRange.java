package br.com.emendes.problems;

/**
 * Dado dois inteiros left e right que representam um intervalo [left, right],
 * retorne a operação AND bit-a-bit de todos os números no intervalo, inclusive.<br>
 * <br>
 * Restrições:<br>
 * -> 0 <= left <= right <= 2³¹ - 1
 */
public class BitwiseAndOfNumbersRange {

  public int rangeBitwiseAnd(int left, int right) {
    int i = 0;
    while (left != right) {
      left >>= 1;
      right >>= 1;
      i++;
    }

    return left << i;
  }

}
