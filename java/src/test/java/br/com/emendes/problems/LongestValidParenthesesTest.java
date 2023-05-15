package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestValidParenthesesTest {

  @Test
  void test1() {
    String input = "";

    LongestValidParentheses solution = new LongestValidParentheses();

    int actualAnswer = solution.longestValidParentheses(input);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test2() {
    String input = "(";

    LongestValidParentheses solution = new LongestValidParentheses();

    int actualAnswer = solution.longestValidParentheses(input);

    Assertions.assertThat(actualAnswer).isZero();
  }

  @Test
  void test3() {
    String input = ")))))()((((((((";

    LongestValidParentheses solution = new LongestValidParentheses();

    int actualAnswer = solution.longestValidParentheses(input);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test4() {
    String input = ")))))()((((((((";

    LongestValidParentheses solution = new LongestValidParentheses();

    int actualAnswer = solution.longestValidParentheses(input);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test5() {
    String input = "(((((((((((((((()";

    LongestValidParentheses solution = new LongestValidParentheses();

    int actualAnswer = solution.longestValidParentheses(input);

    Assertions.assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test6() {
    String input = "(((())((((";

    LongestValidParentheses solution = new LongestValidParentheses();

    int actualAnswer = solution.longestValidParentheses(input);

    Assertions.assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test7() {
    String input = "(()())";

    LongestValidParentheses solution = new LongestValidParentheses();

    int actualAnswer = solution.longestValidParentheses(input);

    Assertions.assertThat(actualAnswer).isEqualTo(6);
  }

}