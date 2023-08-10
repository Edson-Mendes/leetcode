package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WildcardMatchingTest {

  @Test
  @DisplayName("must return true when s is \"a\" and p is \"a\"")
  void whenTrue1() {
    WildcardMatching solution = new WildcardMatching();

    String s = "a";
    String p = "a";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isTrue();
  }

  @Test
  @DisplayName("must return true when s is \"ab\" and p \"a?\"")
  void whenTrue2() {
    WildcardMatching solution = new WildcardMatching();

    String s = "ab";
    String p = "a?";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isTrue();
  }

  @Test
  @DisplayName("must return true when s is \"a\" and p \"a*\"")
  void whenTrue3() {
    WildcardMatching solution = new WildcardMatching();

    String s = "a";
    String p = "a*";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isTrue();
  }

  @Test
  @DisplayName("must return true when s is \"a\" and p \"a*****\"")
  void whenTrue4() {
    WildcardMatching solution = new WildcardMatching();

    String s = "a";
    String p = "a*****";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isTrue();
  }

  @Test
  @DisplayName("must return true when s is \"abcdeeeffffffggggghhhhhhiii\" and p \"abcde??*?????*iii\"")
  void whenTrue5() {
    WildcardMatching solution = new WildcardMatching();

    String s = "abcdeeeffffffggggghhhhhhiii";
    String p = "abcde??*?????*iii";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isTrue();
  }

  @Test
  @DisplayName("must return true when s is \"\" and p \"\"")
  void whenTrue6() {
    WildcardMatching solution = new WildcardMatching();

    String s = "";
    String p = "";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isTrue();
  }

  @Test
  @DisplayName("must return true when s is \"\" and p \"a\"")
  void whenFalse1() {
    WildcardMatching solution = new WildcardMatching();

    String s = "";
    String p = "a";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isFalse();
  }

  @Test
  @DisplayName("must return true when s is \"ab\" and p \"aa\"")
  void whenFalse2() {
    WildcardMatching solution = new WildcardMatching();

    String s = "ab";
    String p = "aa";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isFalse();
  }

  @Test
  @DisplayName("must return true when s is \"acdcb\" and p \"a*c?b\"")
  void whenFalse3() {
    WildcardMatching solution = new WildcardMatching();

    String s = "acdcb";
    String p = "a*c?b";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isFalse();
  }

  @Test
  @DisplayName("must return true when s is \"bbbbbbbabbaabbabbbbaaabbabbabaaabbababbbabbbabaaabaab\" and p \"b*b*ab**ba*b**b***bba\"")
  void whenFalse4() {
    WildcardMatching solution = new WildcardMatching();

    String s = "bbbbbbbabbaabbabbbbaaabbabbabaaabbababbbabbbabaaabaab";
    String p = "b*b*ab**ba*b**b***bba";

    boolean actualIsMatch = solution.isMatch(s, p);

    Assertions.assertThat(actualIsMatch).isFalse();
  }

}