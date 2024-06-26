package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseWordsInAStringTest {

  @Test
  void test01() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "lorem";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("lorem");
  }

  @Test
  void test02() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "   lorem  ";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("lorem");
  }

  @Test
  void test03() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "lorem ipsum";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("ipsum lorem");
  }

  @Test
  void test04() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "lorem    ipsum";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("ipsum lorem");
  }

  @Test
  void test05() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "    lorem ipsum     ";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("ipsum lorem");
  }

  @Test
  void test06() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "    lorem   ipsum     ";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("ipsum lorem");
  }

  @Test
  void test07() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "    lorem   ipsum     dolor";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("dolor ipsum lorem");
  }

  @Test
  void test08() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "lorem ipsum dolor";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("dolor ipsum lorem");
  }

  @Test
  void test09() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "lorem ipsum dolor     ";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("dolor ipsum lorem");
  }

  @Test
  void test10() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "lorem      ipsum dolor";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("dolor ipsum lorem");
  }

  @Test
  void test11() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "         lorem ipsum dolor";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("dolor ipsum lorem");
  }

  @Test
  void test12() {
    ReverseWordsInAString solution = new ReverseWordsInAString();
    String s = "         lorem ipsum      dolor";
    String actualAnswer = solution.reverseWords(s);

    assertThat(actualAnswer).isNotNull().isEqualTo("dolor ipsum lorem");
  }

}