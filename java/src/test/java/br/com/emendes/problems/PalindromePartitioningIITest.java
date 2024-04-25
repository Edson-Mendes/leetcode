package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromePartitioningIITest {

  @Test
  void test01() {
    PalindromePartitioningII solution = new PalindromePartitioningII();

    String s = "a";
    int actualCuts = solution.minCut(s);

    Assertions.assertThat(actualCuts).isZero();
  }

  @Test
  void test02() {
    PalindromePartitioningII solution = new PalindromePartitioningII();

    String s = "aab";
    int actualCuts = solution.minCut(s);

    Assertions.assertThat(actualCuts).isOne();
  }

  @Test
  void test03() {
    PalindromePartitioningII solution = new PalindromePartitioningII();

    String s = "ab";
    int actualCuts = solution.minCut(s);

    Assertions.assertThat(actualCuts).isOne();
  }

  @Test
  void test04() {
    PalindromePartitioningII solution = new PalindromePartitioningII();

    String s = "abba";
    int actualCuts = solution.minCut(s);

    Assertions.assertThat(actualCuts).isZero();
  }

  @Test
  void test05() {
    PalindromePartitioningII solution = new PalindromePartitioningII();

    String s = "apjesgpsxoeiokmqmfgvjslcjukbqxpsobyhjpbgdfruqdkeiszrlmtwgfxyfostpqczidfljwfbbrflkgdvtytbgqalguewnhvvmcgxboycffopmtmhtfizxkmeftcucxpobxmelmjtuzigsxnncxpaibgpuijwhankxbplpyejxmrrjgeoevqozwdtgospohznkoyzocjlracchjqnggbfeebmuvbicbvmpuleywrpzwsihivnrwtxcukwplgtobhgxukwrdlszfaiqxwjvrgxnsveedxseeyeykarqnjrtlaliyudpacctzizcftjlunlgnfwcqqxcqikocqffsjyurzwysfjmswvhbrmshjuzsgpwyubtfbnwajuvrfhlccvfwhxfqthkcwhatktymgxostjlztwdxritygbrbibdgkezvzajizxasjnrcjwzdfvdnwwqeyumkamhzoqhnqjfzwzbixclcxqrtniznemxeahfozp";
    int actualCuts = solution.minCut(s);

    Assertions.assertThat(actualCuts).isEqualTo(452);
  }

  @Test
  void test06() {
    PalindromePartitioningII solution = new PalindromePartitioningII();

    String s = "abbaee";
    int actualCuts = solution.minCut(s);

    Assertions.assertThat(actualCuts).isOne();
  }

}