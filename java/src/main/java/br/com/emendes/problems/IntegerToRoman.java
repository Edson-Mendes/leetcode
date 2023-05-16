package br.com.emendes.problems;

/**
 * Dado um número inteiro, converta-o em um numeral romano.
 * <br><br>
 * Restrições:<br>
 * 1 <= num <= 3999
 */
public class IntegerToRoman {

  public String intToRoman(int num) {
    int digit;
    digit = num / 1000;
    StringBuilder answer = new StringBuilder("");

//    addRepresentationOfThousands(digit, answer);
    switch (digit) {
      case 1 -> answer.append("M");
      case 2 -> answer.append("MM");
      case 3 -> answer.append("MMM");
      default -> {}
    }
    digit = num % 1000;
    digit = digit / 100;

//    addRepresentationOfHundred(digit, answer);
    switch (digit) {
      case 1 -> answer.append("C");
      case 2 -> answer.append("CC");
      case 3 -> answer.append("CCC");
      case 4 -> answer.append("CD");
      case 5 -> answer.append("D");
      case 6 -> answer.append("DC");
      case 7 -> answer.append("DCC");
      case 8 -> answer.append("DCCC");
      case 9 -> answer.append("CM");
      default -> {}
    }

    digit = num % 100;
    digit = digit / 10;

//    addRepresentationOfTen(digit, answer);
    switch (digit) {
      case 1 -> answer.append("X");
      case 2 -> answer.append("XX");
      case 3 -> answer.append("XXX");
      case 4 -> answer.append("XL");
      case 5 -> answer.append("L");
      case 6 -> answer.append("LX");
      case 7 -> answer.append("LXX");
      case 8 -> answer.append("LXXX");
      case 9 -> answer.append("XC");
      default -> {}
    }

    digit = num % 10;

//    addRepresentationOfOne(digit, answer);
    switch (digit) {
      case 1 -> answer.append("I");
      case 2 -> answer.append("II");
      case 3 -> answer.append("III");
      case 4 -> answer.append("IV");
      case 5 -> answer.append("V");
      case 6 -> answer.append("VI");
      case 7 -> answer.append("VII");
      case 8 -> answer.append("VIII");
      case 9 -> answer.append("IX");
      default -> {}
    }

    return answer.toString();
  }

  private void addRepresentationOfOne(int digit, StringBuilder answer) {
    switch (digit) {
      case 1 -> answer.append("I");
      case 2 -> answer.append("II");
      case 3 -> answer.append("III");
      case 4 -> answer.append("IV");
      case 5 -> answer.append("V");
      case 6 -> answer.append("VI");
      case 7 -> answer.append("VII");
      case 8 -> answer.append("VIII");
      case 9 -> answer.append("IX");
      default -> {
      }
    }
  }

  private void addRepresentationOfTen(int digit, StringBuilder answer) {
    switch (digit) {
      case 1 -> answer.append("X");
      case 2 -> answer.append("XX");
      case 3 -> answer.append("XXX");
      case 4 -> answer.append("XL");
      case 5 -> answer.append("L");
      case 6 -> answer.append("LX");
      case 7 -> answer.append("LXX");
      case 8 -> answer.append("LXXX");
      case 9 -> answer.append("XC");
      default -> {
      }
    }
  }

  private void addRepresentationOfHundred(int digit, StringBuilder answer) {
    switch (digit) {
      case 1 -> answer.append("C");
      case 2 -> answer.append("CC");
      case 3 -> answer.append("CCC");
      case 4 -> answer.append("CD");
      case 5 -> answer.append("D");
      case 6 -> answer.append("DC");
      case 7 -> answer.append("DCC");
      case 8 -> answer.append("DCCC");
      case 9 -> answer.append("CM");
      default -> {
      }
    }
  }

  private void addRepresentationOfThousands(int digit, StringBuilder answer) {
    switch (digit) {
      case 1 -> answer.append("M");
      case 2 -> answer.append("MM");
      case 3 -> answer.append("MMM");
      default -> {
      }
    }
  }

}
