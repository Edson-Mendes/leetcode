package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

  @Test
  @DisplayName("Must return \"fl\" given input array {\"flower\", \"flow\", \"flight\"}")
  void test1() {
    LongestCommonPrefix solution = new LongestCommonPrefix();
    String[] input = {"flower", "flow", "flight"};

    String expectedAnswer = "fl";

    String actualAnswer = solution.longestCommonPrefix(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return \"\" given input array {\"dog\", \"racecar\", \"car\"}")
  void test2() {
    LongestCommonPrefix solution = new LongestCommonPrefix();
    String[] input = {"dog", "racecar", "car"};

    String expectedAnswer = "";

    String actualAnswer = solution.longestCommonPrefix(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return \"car\" given input array {\"car\", \"car\", \"car\"}")
  void test3() {
    LongestCommonPrefix solution = new LongestCommonPrefix();
    String[] input = {"car", "car", "car"};

    String expectedAnswer = "car";

    String actualAnswer = solution.longestCommonPrefix(input);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}