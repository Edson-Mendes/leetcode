package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class GenerateParenthesesTest {

  @Test
  @DisplayName("Must return list#size == 1 when n = 1")
  void test1() {
    GenerateParentheses solution = new GenerateParentheses();
    int inputN = 1;

    List<String> actualAnswer = solution.generateParenthesis(inputN);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1).contains("()");
  }

  @Test
  @DisplayName("Must return list#size == 2 when n = 2")
  void test2() {
    GenerateParentheses solution = new GenerateParentheses();
    int inputN = 2;

    List<String> actualAnswer = solution.generateParenthesis(inputN);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2).contains("()()", "(())");
  }

  @Test
  @DisplayName("Must return list#size == 5 when n = 3")
  void test3() {
    GenerateParentheses solution = new GenerateParentheses();
    int inputN = 3;

    List<String> actualAnswer = solution.generateParenthesis(inputN);

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(5)
        .contains("((()))","(()())","(())()","()(())","()()()");
  }

}