package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

  @Test
  void test01() {
    LengthOfLastWord solution = new LengthOfLastWord();

    String s = "e";
    int actualAnswer = solution.lengthOfLastWord(s);

    Assertions.assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    LengthOfLastWord solution = new LengthOfLastWord();

    String s = "lorem";
    int actualAnswer = solution.lengthOfLastWord(s);

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test03() {
    LengthOfLastWord solution = new LengthOfLastWord();

    String s = "lorem ipsum dolor sit";
    int actualAnswer = solution.lengthOfLastWord(s);

    Assertions.assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test04() {
    LengthOfLastWord solution = new LengthOfLastWord();

    String s = "Hello World";
    int actualAnswer = solution.lengthOfLastWord(s);

    Assertions.assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test05() {
    LengthOfLastWord solution = new LengthOfLastWord();

    String s = "   fly me   to   the moon  ";
    int actualAnswer = solution.lengthOfLastWord(s);

    Assertions.assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test06() {
    LengthOfLastWord solution = new LengthOfLastWord();

    String s = "luffy is still joyboy";
    int actualAnswer = solution.lengthOfLastWord(s);

    Assertions.assertThat(actualAnswer).isEqualTo(6);
  }

}