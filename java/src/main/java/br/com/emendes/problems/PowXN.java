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

    if (n < 0) return 1 / pow(x, -n);
    return pow(x, n);
  }

  public double pow(double x, int n) {
    if (n == 0) return 1;

    double res = pow(x, n / 2);
    if (n % 2 != 0) {
      return res * res * x;
    }
    return res * res;
  }

}
