package br.com.emendes.problems;

/**
 * Implemente pow(x, n), que calcule x elevado a n.<br><br>
 * <p>
 * Restrições:<br>
 * -100.0 < x < 100.0<br>
 * -2³¹ <= n <= 2³¹-1<br>
 * n é inteiro.<br>
 * Ou x não é zero ou n > 0.<br>
 * -10⁴ <= x^n <= 10⁴
 */
public class PowXN {

  public double myPow(double x, int n) {
    if (x == 0) return 0;
    if (n == 0) {
      if (x < 0) return -1;
      else return 1;
    }

    long nSignal = (n < 0) ? -1L : 1L;
    long nUnsigned = nSignal * n;

    int times = 0;
    long exponent = nUnsigned;

    while (exponent > 1) {
      exponent = exponent / 2;
      times++;
    }

    double answer = 1;

    if (times > 0) {
      nUnsigned -= (long) pow(2, times);
      answer = toDouble(x, times);
    }

    answer *= pow(x, nUnsigned);

    return (nSignal == -1) ? 1 / answer : answer;
  }

  private double toDouble(double x, int times) {
    for (int i = 0; i < times; i++) {
      x = x * x;
    }

    return x;
  }

  private double pow(double base, long exponent) {
    if (exponent == 0) return 1;
    double value = base;
    for (int i = 1; i < exponent; i++) {
      value *= base;
    }

    return value;
  }

}
