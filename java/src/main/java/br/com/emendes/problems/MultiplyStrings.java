package br.com.emendes.problems;

/**
 * Dado dois inteiros não negativos num1 e num2 representados como Strings, retorne o produto de num1 por num2,
 * também representado como String.<br><br>
 *
 * Note: Você não deve usar nenhum BigInteger embutido nem converter as entradas para Integer.<br><br>
 *
 * Restrições:<br>
 * 1 <= num1.length, num2.length <= 200<br>
 * num1 and num2 apenas de digitos.<br>
 * Ambos num1 e num2 não contém zero iniciais, exceto o próprio valor 0.
 */
public class MultiplyStrings {

  public String multiply(String num1, String num2) {
    if (num1.equals("0") || num2.equals("0")) return "0";

    StringBuilder answer = new StringBuilder("0");
    StringBuilder multiplying = new StringBuilder(num1);

    int zerosToAppend = 0;

    int numIndex = num2.length() - 1;

    while (numIndex > -1) {
      int digit = num2.charAt(numIndex) - 48;

      StringBuilder currMultiply = multiplyByDigit(multiplying, digit);

      appendingZeros(currMultiply, zerosToAppend);

      answer = sum(answer, currMultiply);

      numIndex--;
      zerosToAppend++;
    }

    return answer.toString();
  }

  private StringBuilder multiplyByDigit(StringBuilder multiplying, int digit) {
    int index = multiplying.length() - 1;
    int carry = 0;

    StringBuilder multiply = new StringBuilder();

    while (index > -1) {
      int multiplyingDigit = multiplying.charAt(index) - 48;

      int result = (multiplyingDigit * digit) + carry;

      carry = result / 10;

      multiply.append(result % 10);

      index--;
    }

    if (carry > 0) {
      multiply.append(carry);
    }

    return multiply.reverse();
  }

  public String solution1(String num1, String num2) {
    if (num1.equals("0") || num2.equals("0")) return "0";

    StringBuilder answer = new StringBuilder("0");
    StringBuilder multiplying = new StringBuilder(num1);

    int zerosToAppend = 0;

    int numIndex = num2.length() - 1;

    while (numIndex > -1) {
      StringBuilder currMultiply = new StringBuilder("0");
      int digit = num2.charAt(numIndex) - 48;

      while (digit > 0) {
        currMultiply = sum(currMultiply, multiplying);
        digit--;
      }
      appendingZeros(currMultiply, zerosToAppend);

      answer = sum(answer, currMultiply);

      numIndex--;
      zerosToAppend++;
    }

    return answer.toString();
  }

  private void appendingZeros(StringBuilder answer, int zerosToAppend) {
    while (zerosToAppend > 0) {
      answer.append(0);
      zerosToAppend--;
    }
  }

  private StringBuilder sum(StringBuilder num1, StringBuilder num2) {
    int num1Index = num1.length() - 1;
    int num2Index = num2.length() - 1;
    int carry = 0;

    StringBuilder sum = new StringBuilder();

    while (num1Index > -1 && num2Index > -1) {
      int digit1 = num1.charAt(num1Index) - 48;
      int digit2 = num2.charAt(num2Index) - 48;

      int digitSum = digit1 + digit2 + carry;
      carry = digitSum / 10;

      sum.append(digitSum % 10);

      num1Index--;
      num2Index--;
    }

    int index;
    StringBuilder remaider;

    if (num1Index == -1) {
      index = num2Index;
      remaider = num2;
    } else {
      index = num1Index;
      remaider = num1;
    }

    while (index > -1) {
      int digit = remaider.charAt(index) - 48;

      int digitSum = digit + carry;
      carry = digitSum / 10;

      sum.append(digitSum % 10);
      index--;
    }

    if (carry == 1) {
      sum.append(carry);
    }

    return sum.reverse();
  }

}
