package br.com.emendes.findtheindexofthefirstoccurrenceinastring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

  @Test
  @DisplayName("Must return 2 when haystack = \"hello\" and needle = \"ll\"")
  void test1() {
    String haystackInput = "hello";
    String needleInput = "ll";

    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    int actualAnswer = solution.strStr(haystackInput, needleInput);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  @DisplayName("Must return 2 when haystack = \"mississippi\" and needle = \"issip\"")
  void test2() {
    String haystackInput = "mississippi";
    String needleInput = "issip";

    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    int actualAnswer = solution.strStr(haystackInput, needleInput);

    Assertions.assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  @DisplayName("Must return 2 when haystack = \"a\" and needle = \"a\"")
  void test3() {
    String haystackInput = "a";
    String needleInput = "a";

    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    int actualAnswer = solution.strStr(haystackInput, needleInput);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  @DisplayName("Must return 2 when haystack = \"abcdef\" and needle = \"abcdefghij\"")
  void test4() {
    String haystackInput = "abcdef";
    String needleInput = "abcdefghij";

    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    int actualAnswer = solution.strStr(haystackInput, needleInput);

    Assertions.assertThat(actualAnswer).isEqualTo(-1);
  }

  @Test
  @DisplayName("Must return 2 when haystack = \"sadbutsad\" and needle = \"sad\"")
  void test5() {
    String haystackInput = "sadbutsad";
    String needleInput = "sad";

    FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    int actualAnswer = solution.strStr(haystackInput, needleInput);

    Assertions.assertThat(actualAnswer).isEqualTo(0);
  }

}