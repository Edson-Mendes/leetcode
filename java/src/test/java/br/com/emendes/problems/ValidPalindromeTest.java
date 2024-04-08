package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

  @Test
  void test01() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome(" ");

    assertThat(actualIsPalindrome).isTrue();
  }

  @Test
  void test02() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("A man, a plan, a canal: Panama");

    assertThat(actualIsPalindrome).isTrue();
  }

  @Test
  void test03() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("race a car");

    assertThat(actualIsPalindrome).isFalse();
  }

  @Test
  void test04() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("_-_--abba");

    assertThat(actualIsPalindrome).isTrue();
  }

  @Test
  void test05() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("_-_--ab88888#$%ba");

    assertThat(actualIsPalindrome).isTrue();
  }

  @Test
  void test06() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("_ab123456789bA-");

    assertThat(actualIsPalindrome).isFalse();
  }

  @Test
  void test07() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("_ab987789bA-");

    assertThat(actualIsPalindrome).isTrue();
  }

  @Test
  void test08() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome(" 1 0 01 ");

    assertThat(actualIsPalindrome).isTrue();
  }

  @Test
  void test09() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("Ab___a");

    assertThat(actualIsPalindrome).isTrue();
  }

  @Test
  void test10() {
    ValidPalindrome solution = new ValidPalindrome();

    boolean actualIsPalindrome = solution.isPalindrome("@ # $ %....___ _");

    assertThat(actualIsPalindrome).isTrue();
  }

}