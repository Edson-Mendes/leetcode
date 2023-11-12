package br.com.emendes.problems;

/**
 * Dado uma String s que consiste de palavras e espaços, retorne o comprimento da última palavra da String s.<br><br>
 *
 * Uma palavra é uma substring que consiste apenas caracteres que não são espaço.<br><br>
 *
 * Restrições:<br>
 * 1 <= length <= 10⁴<br>
 * s consiste apenas de letras inglesas e espaços ' '.<br>
 * Existe pelo menos uma palavra em s.
 */
public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {
    int length = s.length();
    int index = length - 1;

    while (s.charAt(index) == ' ') {
      index--;
      length--;
    }

    while (index >= 0 && s.charAt(index) != ' ') {
      index--;
    }

    return length - (index + 1);
  }

}
