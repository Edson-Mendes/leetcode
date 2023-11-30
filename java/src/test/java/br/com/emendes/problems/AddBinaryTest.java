package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

  @Test
  void test01() {
    AddBinary solution = new AddBinary();

    String actualAnswer = solution.addBinary("0", "0");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("0");
  }

  @Test
  void test02() {
    AddBinary solution = new AddBinary();

    String actualAnswer = solution.addBinary("0", "1");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("1");
  }

  @Test
  void test03() {
    AddBinary solution = new AddBinary();

    String actualAnswer = solution.addBinary("1", "0");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("1");
  }

  @Test
  void test04() {
    AddBinary solution = new AddBinary();

    String actualAnswer = solution.addBinary("1", "1");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("10");
  }

  @Test
  void test05() {
    AddBinary solution = new AddBinary();

    String actualAnswer = solution.addBinary("1", "1");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("10");
  }

  @Test
  void test06() {
    AddBinary solution = new AddBinary();

    String actualAnswer = solution.addBinary("10", "1");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("11");
  }

  @Test
  void test07() {
    AddBinary solution = new AddBinary();

    String actualAnswer = solution.addBinary("1000", "1");

    Assertions.assertThat(actualAnswer).isNotNull().isEqualTo("1001");
  }

}