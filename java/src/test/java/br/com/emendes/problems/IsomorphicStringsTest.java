package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IsomorphicStringsTest {

  @Test
  void test01() {
    IsomorphicStrings solution = new IsomorphicStrings();

    boolean actualAnswer = solution.isIsomorphic("a", "a");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test02() {
    IsomorphicStrings solution = new IsomorphicStrings();

    boolean actualAnswer = solution.isIsomorphic("b", "a");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test03() {
    IsomorphicStrings solution = new IsomorphicStrings();

    boolean actualAnswer = solution.isIsomorphic("Aaa", "aaa");

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    IsomorphicStrings solution = new IsomorphicStrings();

    boolean actualAnswer = solution.isIsomorphic("egg", "add");

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    IsomorphicStrings solution = new IsomorphicStrings();

    boolean actualAnswer = solution.isIsomorphic("foo", "bar");

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test06() {
    IsomorphicStrings solution = new IsomorphicStrings();

    boolean actualAnswer = solution.isIsomorphic("paper", "title");

    assertThat(actualAnswer).isTrue();
  }

}