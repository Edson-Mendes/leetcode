package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidNumberTest {

  @Test
  void test01() {
    ValidNumber solution = new ValidNumber();

    String s = "0";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    ValidNumber solution = new ValidNumber();

    String s = "9.9e";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    ValidNumber solution = new ValidNumber();

    String s = "+4";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test04() {
    ValidNumber solution = new ValidNumber();

    String s = "-4";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    ValidNumber solution = new ValidNumber();

    String s = "-.";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test06() {
    ValidNumber solution = new ValidNumber();

    String s = "-e";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test07() {
    ValidNumber solution = new ValidNumber();

    String s = ".1e0";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test08() {
    ValidNumber solution = new ValidNumber();

    String s = "+.8";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test09() {
    ValidNumber solution = new ValidNumber();

    String s = "+E3";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test10() {
    ValidNumber solution = new ValidNumber();

    String s = "005047e+6";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  void test11() {
    ValidNumber solution = new ValidNumber();

    String s = "1e.";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  void test12() {
    ValidNumber solution = new ValidNumber();

    String s = "+";

    boolean actualAnswer = solution.isNumber(s);

    Assertions.assertThat(actualAnswer).isFalse();
  }

}