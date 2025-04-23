package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SummaryRangesTest {

  @Test
  void test01() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {};
    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().isEmpty();
  }

  @Test
  void test02() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {10};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(1).containsExactly("10");
  }

  @Test
  void test03() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {10, 20};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(2).containsExactly("10", "20");
  }

  @Test
  void test04() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {10, 11, 12, 13, 14, 15};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(1).containsExactly("10->15");
  }

  @Test
  void test05() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {10, 11, 12, 14, 15, 17};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(3)
        .containsExactly("10->12", "14->15", "17");
  }

  @Test
  void test06() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {0, 2, 3, 4, 6, 8, 9};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(4)
        .containsExactly("0", "2->4", "6", "8->9");
  }

  @Test
  void test07() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {0, 1, 2, 4, 5, 7};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(3)
        .containsExactly("0->2", "4->5", "7");
  }

  @Test
  void test08() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {0, 1, 2, 4, 5, 7, 10, 13, 17, 18};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(6)
        .containsExactly("0->2", "4->5", "7", "10", "13", "17->18");
  }

  @Test
  void test09() {
    SummaryRanges solution = new SummaryRanges();

    int[] nums = {0, 1, 2, 4, 5, 7, 10, 13, 17, 18, 20};

    List<String> actualAnswer = solution.summaryRanges(nums);

    assertThat(actualAnswer).isNotNull().hasSize(7)
        .containsExactly("0->2", "4->5", "7", "10", "13", "17->18", "20");
  }

}