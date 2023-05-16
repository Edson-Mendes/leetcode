package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

  @Test
  @DisplayName("Must return 6 when input string is \"bbtablub\"")
  void mustReturn6_WhenInputStringIs_bbtablud() {
    String input = "bbtablud";
    LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    int actualResult = solution.lengthOfLongestSubstring(input);

    Assertions.assertThat(actualResult).isEqualTo(6);
  }

}