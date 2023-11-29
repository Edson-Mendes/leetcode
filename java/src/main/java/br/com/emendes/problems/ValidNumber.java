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
    boolean seenNum = false;
    boolean seenDot = false;
    boolean seenE = false;

    for (int i = 0; i < s.length(); ++i) {
      switch (s.charAt(i)) {
        case '.':
          if (seenDot || seenE)
            return false;
          seenDot = true;
          break;
        case 'e', 'E':
          if (seenE || !seenNum)
            return false;
          seenE = true;
          seenNum = false;
          break;
        case '+', '-':
          if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
            return false;
          seenNum = false;
          break;
        case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
          seenNum = true;
          break;
        default:
          return false;
      }
    }

    return seenNum;
  }

}
