package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ZigzagConversionTest {

  @Test
  @DisplayName("Must return PAHNAPLSIIGYIR when s is PAYPALISHIRING and numRows is 3")
  void mustReturn_PAHNAPLSIIGYIR_WhenSIs_PAYPALISHIRING_AndNumRowsIs_3() {
    String sInput = "PAYPALISHIRING";
    int numRowsInput = 3;
    String expectedAnswer = "PAHNAPLSIIGYIR";

    ZigzagConversion solution = new ZigzagConversion();

    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return PINALSIGYAHRPI when s is PAYPALISHIRING and numRows is 4")
  void mustReturn_PAHNAPLSIIGYIR_WhenSIs_PAYPALISHIRING_AndNumRowsIs_4() {
    String sInput = "PAYPALISHIRING";
    int numRowsInput = 4;

    String expectedAnswer = "PINALSIGYAHRPI";

    ZigzagConversion solution = new ZigzagConversion();
    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return A when s is A and numRows is 1")
  void mustReturn_A_WhenSIs_A_AndNumRowsIs_4() {
    String sInput = "A";
    int numRowsInput = 1;

    String expectedAnswer = "A";

    ZigzagConversion solution = new ZigzagConversion();
    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return PAYPALISHIRING when s is PAYPALISHIRING and numRows is 1")
  void mustReturn_PAYPALISHIRING_WhenSIs_PAYPALISHIRING_AndNumRowsIs_1() {
    String sInput = "PAYPALISHIRING";
    int numRowsInput = 1;

    String expectedAnswer = "PAYPALISHIRING";

    ZigzagConversion solution = new ZigzagConversion();
    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return PAYPALISHIRING when s is PAYPALISHIRING and numRows is 1000")
  void mustReturn_PAYPALISHIRING_WhenSIs_PAYPALISHIRING_AndNumRowsIs_1000() {
    String sInput = "PAYPALISHIRING";
    int numRowsInput = 1000;

    String expectedAnswer = "PAYPALISHIRING";

    ZigzagConversion solution = new ZigzagConversion();
    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return EDDNESESOMN when s is EDSONMENDES and numRows is 5")
  void mustReturn_EDDNESESOMN_WhenSIs_EDSONMENDES_AndNumRowsIs_5() {
    String sInput = "EDSONMENDES";
    int numRowsInput = 5;
    String expectedAnswer = "EDDNESESOMN";

    ZigzagConversion solution = new ZigzagConversion();

    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return EEDMNSNDSOE when s is EDSONMENDES and numRows is 4")
  void mustReturn_EEDMNSNDSOE_WhenSIs_EDSONMENDES_AndNumRowsIs_4() {
    String sInput = "EDSONMENDES";
    int numRowsInput = 4;
    String expectedAnswer = "EEDMNSNDSOE";

    ZigzagConversion solution = new ZigzagConversion();

    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return EDSONMENDES when s is EDSONMENDES and numRows is 11")
  void mustReturn_EDSONMENDES_WhenSIs_EDSONMENDES_AndNumRowsIs_11() {
    String sInput = "EDSONMENDES";
    int numRowsInput = 11;
    String expectedAnswer = "EDSONMENDES";

    ZigzagConversion solution = new ZigzagConversion();

    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return EDSONMENDES when s is EDSONMENDES and numRows is 20")
  void mustReturn_EDSONMENDES_WhenSIs_EDSONMENDES_AndNumRowsIs_20() {
    String sInput = "EDSONMENDES";
    int numRowsInput = 20;
    String expectedAnswer = "EDSONMENDES";

    ZigzagConversion solution = new ZigzagConversion();

    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

  @Test
  @DisplayName("Must return EDSONMENDES when s is  and numRows is 1")
  void test() {
    String sInput = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
    int numRowsInput = 1;
    String expectedAnswer = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";

    ZigzagConversion solution = new ZigzagConversion();

    String actualAnswer = solution.convert(sInput, numRowsInput);

    Assertions.assertThat(actualAnswer).isEqualTo(expectedAnswer);
  }

}