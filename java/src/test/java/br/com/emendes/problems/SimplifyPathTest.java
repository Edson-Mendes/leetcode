package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SimplifyPathTest {

  @Test
  void test01() {
    SimplifyPath solution = new SimplifyPath();

    String actualAnswer = solution.simplifyPath("/");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("/");
  }

  @Test
  void test02() {
    SimplifyPath solution = new SimplifyPath();

    String actualAnswer = solution.simplifyPath("////");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("/");
  }

  @Test
  void test03() {
    SimplifyPath solution = new SimplifyPath();

    String actualAnswer = solution.simplifyPath("/home/");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("/home");
  }

  @Test
  void test04() {
    SimplifyPath solution = new SimplifyPath();

    String actualAnswer = solution.simplifyPath("/../");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("/");
  }

  @Test
  void test05() {
    SimplifyPath solution = new SimplifyPath();

    String actualAnswer = solution.simplifyPath("/home//foo/");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("/home/foo");
  }

  @Test
  void test06() {
    SimplifyPath solution = new SimplifyPath();

    String actualAnswer = solution.simplifyPath("/home/../foo/");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("/foo");
  }

  @Test
  void test07() {
    SimplifyPath solution = new SimplifyPath();

    String actualAnswer = solution.simplifyPath("/a//b////c/d//././/..");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("/a/b/c");
  }

}