package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TextJustificationTest {

  @Test
  void test01() {
    TextJustification solution = new TextJustification();

    String[] words = {"lorem"};
    int maxWidth = 10;
    List<String> actualAnswer = solution.fullJustify(words, maxWidth);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1).containsExactly("lorem     ");
  }

  @Test
  void test02() {
    TextJustification solution = new TextJustification();

    String[] words = {"lorem", "ipsum"};
    int maxWidth = 11;
    List<String> actualAnswer = solution.fullJustify(words, maxWidth);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1).containsExactly("lorem ipsum");
  }

  @Test
  void test03() {
    TextJustification solution = new TextJustification();

    String[] words = {"lorem", "ipsum", "dolor"};
    int maxWidth = 20;
    List<String> actualAnswer = solution.fullJustify(words, maxWidth);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1).containsExactly("lorem ipsum dolor   ");
  }

  @Test
  void test04() {
    TextJustification solution = new TextJustification();

    String[] words = {"lorem", "ipsum"};
    int maxWidth = 8;
    List<String> actualAnswer = solution.fullJustify(words, maxWidth);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2).containsExactly("lorem   ", "ipsum   ");
  }

  @Test
  void test05() {
    TextJustification solution = new TextJustification();

    String[] words = {"lorem", "ipsum", "dolor"};
    int maxWidth = 12;
    List<String> actualAnswer = solution.fullJustify(words, maxWidth);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2)
        .containsExactly("lorem  ipsum", "dolor       ");
  }

  @Test
  void test06() {
    TextJustification solution = new TextJustification();

    String[] words = {"lorem", "ipsum", "dolor", "sit", "amet"};
    int maxWidth = 13;
    List<String> actualAnswer = solution.fullJustify(words, maxWidth);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(3)
        .containsExactly("lorem   ipsum","dolor     sit","amet         ");
  }

  @Test
  void test07() {
    TextJustification solution = new TextJustification();

    String[] words = {"lorem", "ipsum", "dolor", "sit", "amet"};
    int maxWidth = 14;
    List<String> actualAnswer = solution.fullJustify(words, maxWidth);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2)
        .containsExactly("lorem    ipsum","dolor sit amet");
  }

}