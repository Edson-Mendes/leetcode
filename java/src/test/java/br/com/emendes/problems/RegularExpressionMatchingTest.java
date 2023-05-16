package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RegularExpressionMatchingTest {

  @Test
  @DisplayName("Must return true when s is \"ab\" and pattern is \".b\"")
  void test1() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "ab";
    String pInput = ".b";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"ab\" and pattern is \"a*b\"")
  void test2() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "ab";
    String pInput = "a*b";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return false when s is \"ab\" and pattern is \"a.b\"")
  void test3() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "ab";
    String pInput = "a.b";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isFalse();
  }

  @Test
  @DisplayName("Must return true when s is \"abbbbbbbbbbb\" and pattern is \"ab*b\"")
  void test4() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "abbbbbbbbbbb";
    String pInput = "ab*b";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"abb\" and pattern is \"ab*b\"")
  void test5() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "abb";
    String pInput = "ab*b";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"abbcc\" and pattern is \"ab*...\"")
  void test6() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "abbcc";
    String pInput = "ab*...";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"aab\" and pattern is \"c*a*b\"")
  void test7() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "aab";
    String pInput = "c*a*b";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"ab\" and pattern is \"ab*.\"")
  void test8() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "ab";
    String pInput = "ab*.";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"aaabc\" and pattern is \"a*.bc\"")
  void test9() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "aaabc";
    String pInput = "a*.bc";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"aaabbc\" and pattern is \"a*.bc\"")
  void test10() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "aaabbc";
    String pInput = "a*.bc";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return true when s is \"ab\" and pattern is \".*\"")
  void test11() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "ab";
    String pInput = ".*";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isTrue();
  }

  @Test
  @DisplayName("Must return false when s is \"ab\" and pattern is \".*c\"")
  void test12() {
    RegularExpressionMatching solution = new RegularExpressionMatching();

    String sInput = "ab";
    String pInput = ".*c";

    boolean actualAnswer = solution.isMatch(sInput, pInput);

    Assertions.assertThat(actualAnswer).isFalse();
  }

}