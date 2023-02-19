package br.com.emendes.lettercombinationsofaphonenumber;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class LetterCombinationsOfAPhoneNumberTest {

  @Test
  @DisplayName("Given String \"23\" must return List#size equals 9")
  void test1() {
    String input = "23";

    LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();

    List<String> actualAnswer = solution.letterCombinations(input);

    System.out.println(actualAnswer);

    Assertions.assertThat(actualAnswer).hasSize(9);
  }

  @Test
  @DisplayName("Given String \"\" must return List#size equals 0")
  void test2() {
    String input = "";

    LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();

    List<String> actualAnswer = solution.letterCombinations(input);

    System.out.println(actualAnswer);

    Assertions.assertThat(actualAnswer).isEmpty();
  }

  @Test
  @DisplayName("Given String \"2\" must return List#size equals 3")
  void test3() {
    String input = "2";

    LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();

    List<String> actualAnswer = solution.letterCombinations(input);

    System.out.println(actualAnswer);

    Assertions.assertThat(actualAnswer).hasSize(3);
  }

  @Test
  @DisplayName("Given String \"9999\" must return List#size equals 256")
  void test4() {
    String input = "9999";

    LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();

    List<String> actualAnswer = solution.letterCombinations(input);

    System.out.println(actualAnswer);

    Assertions.assertThat(actualAnswer).hasSize(256);
  }

}