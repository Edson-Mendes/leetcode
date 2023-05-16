package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

  @Test
  void test1(){
    String input = "()";

    ValidParentheses solution = new ValidParentheses();

    boolean actualAnswer = solution.isValid(input);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test2(){
    String input = "()[]{}";

    ValidParentheses solution = new ValidParentheses();

    boolean actualAnswer = solution.isValid(input);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test3(){
    String input = "{[({[()]})]}";

    ValidParentheses solution = new ValidParentheses();

    boolean actualAnswer = solution.isValid(input);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test4(){
    String input = "{{{[[[]]]}}}";

    ValidParentheses solution = new ValidParentheses();

    boolean actualAnswer = solution.isValid(input);

    Assertions.assertThat(actualAnswer).isTrue();
  }

}