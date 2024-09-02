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
    int answer = 0;

    for (int i = 0; i < 32; i++) {
      int bit = (left >> i) & 1;
      if (bit == 1) {
        int remainder = left % (1 << (i + 1));
        int diff = (1 << (i + 1)) - remainder;
        if (right - left < diff) {
          answer |= (1 << i);
        }
      }
    }

    return answer;
  }

}
