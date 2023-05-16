package br.com.emendes.problems;

/**
 * Dado um numeral romano, converta-o para um número inteiro.
 * <br><br>
 * Restrições:
 * 1 <= s.length <= 15
 * s contém apenas
 */
public class RomanToInteger {

  // Solução em 4 ms.
  public int romanToInt(String s) {
    char[] roman = s.toCharArray();
    int sLength = roman.length;
    int index = 0;
    int answer = 0;

    while (index < sLength) {
      answer += switch (roman[index]) {
        case 'I' -> {
          if (index + 1 < sLength) {
            if (roman[index + 1] == 'V') {
              index += 2;
              yield 4;
            }
            if (roman[index + 1] == 'X') {
              index += 2;
              yield 9;
            }
          }
          index++;
          yield 1;
        }
        case 'V' -> {
          index++;
          yield 5;
        }
        case 'X' -> {
          if (index + 1 < sLength) {
            if (roman[index + 1] == 'L') {
              index += 2;
              yield 40;
            }
            if (roman[index + 1] == 'C') {
              index += 2;
              yield 90;
            }
          }
          index++;
          yield 10;
        }
        case 'L' -> {
          index++;
          yield 50;
        }
        case 'C' -> {
          if (index + 1 < sLength) {
            if (roman[index + 1] == 'D') {
              index += 2;
              yield 400;
            }
            if (roman[index + 1] == 'M') {
              index += 2;
              yield 900;
            }
          }
          index++;
          yield 100;
        }
        case 'D' -> {
          index++;
          yield 500;
        }
        case 'M' -> {
          index++;
          yield 1000;
        }
        default -> 0;
      };
    }

    return answer;
  }

}
