package br.com.emendes.problems;

/**
 * Um número válido pode ser dividido nesses componentes (em ordem):<br><br>
 * <p>
 * 1. Um número decimal ou inteiro.<br>
 * 2. (Opcional) um 'e' ou 'E', seguido por um inteiro.<br><br>
 * <p>
 * Um número decimal pode ser dividido nesses componentes (em ordem):<br><br>
 * 1. (Opcional) Um caracter sinal '-' ou '+'.<br>
 * 2. Um dos formatos a seguir.<br>
 * - Um ou mais digitos seguidos por um ponto '.'.<br>
 * - Um ou mais digitos seguidos por um ponto '.', seguido por um ou mais digitos.<br>
 * - Um ponto '.' seguido por um ou mais digitos.<br><br>
 * <p>
 * Um inteiro pode ser dividido nos seguintes componentes (em ordem):<br><br>
 * 1. (Opcional) Um caracter sinal '-' ou '+'.<br>
 * 2. Um ou mais digitos.<br><br>
 * <p>
 * Por exemplo, os seguintes são números válidos "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3",
 * "3e+7", "+6e-1", "53.5e93", "-123.456e789", enquanto os seguintes não são números válidos "abc", "1a", "1e", "e3",
 * "99e2.5", "--6", "-+3", "95a54e53".<br><br>
 * <p>
 * Dado uma String s, retorne true caso s seja um número válido.<br><br>
 * <p>
 * Restrições:<br>
 * 1 <= s.length <= 20<br>
 * s consiste de letras inglesas (maiúsculas ou minúsculas), digitos (0-9), positivo '+', negativo '-', ou ponto '.'.
 */
public class ValidNumber {

  public boolean isNumber(String s) {
    char[] sArray = s.toCharArray();
    int sLength = s.length();

    int charValue = s.charAt(0);
    boolean mustBeNumber = false;
    boolean previousIsNumber = false;
    boolean previousIsSignal = false;
    boolean hasDot = false;

    if (charValue >= 48 && charValue <= 57) previousIsNumber = true;// first character is a number.
    else if (charValue == 43 || charValue == 45) {
      previousIsSignal = true;
    } else if (charValue == 46) {
      mustBeNumber = true;
      hasDot = true;
    } else return false;

    for (int i = 1; i < sLength; i++) {
      switch (sArray[i]) {
        case 48, 49, 50, 51, 52, 53, 54, 55, 56, 57:
          mustBeNumber = false;
          previousIsNumber = true;
          previousIsSignal = false;
          break;
        case 46:
          if (hasDot) return false;
          if (previousIsSignal) {
            mustBeNumber = true;
            previousIsSignal = false;
          }
          hasDot = true;
          previousIsNumber = false;
          break;
        case 69, 101:
          if (mustBeNumber || previousIsSignal) return false;
          if (!previousIsNumber && isSecondPreviousNotANumber(i - 2, sArray)) return false;
          return isInteger(i + 1, sArray);
        default:
          return false;
      }
    }

    return !mustBeNumber && !previousIsSignal;
  }

  private boolean isInteger(int index, char[] s) {
    int length = s.length;
    if (index >= length) return false;
    int value = s[index];

    if (value == 43 || value == 45) {
      index++;
      if (index == length || (s[index] < 48 || s[index] > 57)) return false;
      index++;
    }

    while (index < length) {
      value = s[index];
      if (value < 48 || value > 57) return false;
      index++;
    }

    return true;
  }

  private boolean isSecondPreviousNotANumber(int index, char[] s) {
    if (index < 0) return false;
    int value = s[index];
    return value < 48 || value > 57;
  }

}
