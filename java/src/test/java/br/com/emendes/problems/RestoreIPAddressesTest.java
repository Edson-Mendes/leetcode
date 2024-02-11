package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RestoreIPAddressesTest {

  @Test
  void test01() {
    RestoreIPAddresses solution = new RestoreIPAddresses();

    List<String> actualAnswer = solution.restoreIpAddresses("000");

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    RestoreIPAddresses solution = new RestoreIPAddresses();

    List<String> actualAnswer = solution.restoreIpAddresses("1112223334445");

    Assertions.assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test03() {
    RestoreIPAddresses solution = new RestoreIPAddresses();

    List<String> actualAnswer = solution.restoreIpAddresses("0000");

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(1).contains("0.0.0.0");
  }

  @Test
  void test04() {
    RestoreIPAddresses solution = new RestoreIPAddresses();

    List<String> actualAnswer = solution.restoreIpAddresses("101023");

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(5)
        .contains("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
  }

  @Test
  void test05() {
    RestoreIPAddresses solution = new RestoreIPAddresses();

    List<String> actualAnswer = solution.restoreIpAddresses("25525511135");

    Assertions.assertThat(actualAnswer).isNotNull().hasSize(2)
        .contains("255.255.11.135", "255.255.111.35");
  }

}