package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvaluateReversePolishNotationTest {

  @Test
  void test01() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"10"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"10", "2", "+"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(12);
  }

  @Test
  void test03() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"10", "2", "-"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(8);
  }

  @Test
  void test04() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"10", "2", "*"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(20);
  }

  @Test
  void test05() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"10", "2", "/"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test06() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"2", "1", "+", "3", "*"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(9);
  }

  @Test
  void test07() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"4", "13", "5", "/", "+"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test08() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(22);
  }

  @Test
  void test09() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"10", "3", "/"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test10() {
    EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    String[] tokens = {"3", "10", "/"};

    int actualAnswer = solution.evalRPN(tokens);

    assertThat(actualAnswer).isZero();
  }

}