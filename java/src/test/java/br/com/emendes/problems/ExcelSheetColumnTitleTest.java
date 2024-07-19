package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExcelSheetColumnTitleTest {

  @Test
  void test01() {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    String actualAnswer = solution.convertToTitle(1);

    assertThat(actualAnswer).isNotNull().isEqualTo("A");
  }

  @Test
  void test02() {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    String actualAnswer = solution.convertToTitle(2);

    assertThat(actualAnswer).isNotNull().isEqualTo("B");
  }

  @Test
  void test03() {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    String actualAnswer = solution.convertToTitle(28);

    assertThat(actualAnswer).isNotNull().isEqualTo("AB");
  }

  @Test
  void test04() {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    String actualAnswer = solution.convertToTitle(52);

    assertThat(actualAnswer).isNotNull().isEqualTo("AZ");
  }

  @Test
  void test05() {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    String actualAnswer = solution.convertToTitle(54);

    assertThat(actualAnswer).isNotNull().isEqualTo("BB");
  }

  @Test
  void test06() {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    String actualAnswer = solution.convertToTitle(701);

    assertThat(actualAnswer).isNotNull().isEqualTo("ZY");
  }

  @Test
  void test07() {
    ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

    String actualAnswer = solution.convertToTitle(3754);

    assertThat(actualAnswer).isNotNull().isEqualTo("ENJ");
  }

}