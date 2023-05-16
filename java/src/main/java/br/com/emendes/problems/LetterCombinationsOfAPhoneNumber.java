package br.com.emendes.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a {@code String} containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent. Return the answer in any order.<br><br>
 * Restrições:<br>
 * 0 <= digits.length <= 4 <br>
 * digits[i] is a digit in the range ['2', '9']
 */
public class LetterCombinationsOfAPhoneNumber {

  List<String> strings;

  // Solução em 0ms
  public List<String> letterCombinations(String digits) {
    strings = new ArrayList<>();

    if (!digits.isEmpty()) {
      generateForIndex(0, digits);
    }

    return strings;
  }

  private void generateForIndex(int currentIndex, String digits) {
    if (currentIndex == digits.length()) {
      strings.add(digits);
      return;
    }

    char[] combination = digits.toCharArray();
    int nextIndex = currentIndex + 1;

    switch (combination[currentIndex]) {
      case '2' -> {
        combination[currentIndex] = 'a';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'b';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'c';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      case '3' -> {
        combination[currentIndex] = 'd';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'e';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'f';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      case '4' -> {
        combination[currentIndex] = 'g';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'h';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'i';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      case '5' -> {
        combination[currentIndex] = 'j';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'k';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'l';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      case '6' -> {
        combination[currentIndex] = 'm';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'n';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'o';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      case '7' -> {
        combination[currentIndex] = 'p';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'q';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'r';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 's';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      case '8' -> {
        combination[currentIndex] = 't';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'u';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'v';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      case '9' -> {
        combination[currentIndex] = 'w';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'x';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'y';
        generateForIndex(nextIndex, String.valueOf(combination));
        combination[currentIndex] = 'z';
        generateForIndex(nextIndex, String.valueOf(combination));
      }
      default -> {}
    }
  }

}
