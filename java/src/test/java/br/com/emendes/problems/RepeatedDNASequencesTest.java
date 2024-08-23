package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RepeatedDNASequencesTest {

  @Test
  void test01() {
    RepeatedDNASequences solution = new RepeatedDNASequences();

    String s = "A";
    List<String> actualAnswer = solution.findRepeatedDnaSequences(s);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    RepeatedDNASequences solution = new RepeatedDNASequences();

    String s = "AAAAAAAAAA";
    List<String> actualAnswer = solution.findRepeatedDnaSequences(s);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test03() {
    RepeatedDNASequences solution = new RepeatedDNASequences();

    String s = "AAAAAAAAAAA";
    List<String> actualAnswer = solution.findRepeatedDnaSequences(s);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains("AAAAAAAAAA");
  }

  @Test
  void test04() {
    RepeatedDNASequences solution = new RepeatedDNASequences();

    String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    List<String> actualAnswer = solution.findRepeatedDnaSequences(s);

    assertThat(actualAnswer).isNotNull().hasSize(2).contains("AAAAACCCCC", "CCCCCAAAAA");
  }

  @Test
  void test05() {
    RepeatedDNASequences solution = new RepeatedDNASequences();

    String s = "AACCGTAACCGTCAATC";
    List<String> actualAnswer = solution.findRepeatedDnaSequences(s);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test06() {
    RepeatedDNASequences solution = new RepeatedDNASequences();

    String s = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    List<String> actualAnswer = solution.findRepeatedDnaSequences(s);

    assertThat(actualAnswer).isNotNull().hasSize(1).contains("AAAAAAAAAA");
  }

}