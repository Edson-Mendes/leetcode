package br.com.emendes.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DecodeWaysTest {

  @ParameterizedTest
  @CsvSource({"11,2", "226,3", "105,1", "1,1", "0,0", "06,0", "00006,0", "111111111111111111111111111111,1346269"})
  void test05(String input, int expectedAnswer) {
    DecodeWays solution = new DecodeWays();

    int actualAnswer = solution.numDecodings(input);

    assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}