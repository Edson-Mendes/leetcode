package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringWithAtLeastKRepeatingCharactersTest {

  @Test
  void test01() {
    LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
    int actualAnswer = solution.longestSubstring("a", 1);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test02() {
    LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
    int actualAnswer = solution.longestSubstring("aaaa", 5);

    assertThat(actualAnswer).isZero();
  }

  @Test
  void test03() {
    LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
    int actualAnswer = solution.longestSubstring("aaabb", 3);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @Test
  void test04() {
    LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
    int actualAnswer = solution.longestSubstring("ababbc", 2);

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test05() {
    LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
    int actualAnswer = solution.longestSubstring("acababdefb", 2);

    assertThat(actualAnswer).isEqualTo(4);
  }

  @Test
  void test06() {
    LongestSubstringWithAtLeastKRepeatingCharacters solution = new LongestSubstringWithAtLeastKRepeatingCharacters();
    int actualAnswer = solution.longestSubstring("zzzzzzzzzzaaaaaaaaabbbbbbbbhbhbhbhbhbhbhicbcbcibcbccccccccccbbbbbbbbaaaaaaaaafffaahhhhhiaahiiiiiiiiifeeeeeeeeee", 10);

    assertThat(actualAnswer).isEqualTo(21);
  }

}