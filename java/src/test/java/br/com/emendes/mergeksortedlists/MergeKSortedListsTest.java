package br.com.emendes.mergeksortedlists;

import br.com.emendes.mergeksortedlists.MergeKSortedLists.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MergeKSortedListsTest {

  @Test
  @DisplayName("Must return null when input is {}")
  void test1() {
    ListNode[] listsInput = {};
    Assertions.assertThat(listsInput).isEmpty();

    MergeKSortedLists solution = new MergeKSortedLists();

    ListNode actualAnswer = solution.mergeKLists(listsInput);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  @DisplayName("Must return null when input is a {null}")
  void test2() {
    ListNode[] listsInput = {null};
    Assertions.assertThat(listsInput.length).isOne();

    MergeKSortedLists solution = new MergeKSortedLists();

    ListNode actualAnswer = solution.mergeKLists(listsInput);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  @DisplayName("Must return [1, 4, 7] when input is a {[1, 4, 7]}")
  void test3() {
    ListNode[] listsInput = {ListNode.of(1, 4, 7)};
    Assertions.assertThat(listsInput.length).isOne();
    Assertions.assertThat(listsInput[0]).hasToString("1 4 7");

    MergeKSortedLists solution = new MergeKSortedLists();

    ListNode actualAnswer = solution.mergeKLists(listsInput);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1 4 7");
  }

  @Test
  @DisplayName("Must return [1, 1, 2, 3, 4, 7] when input is a {[1, 4, 7], [1, 2, 3]}")
  void test4() {
    ListNode[] listsInput = {ListNode.of(1, 4, 7), ListNode.of(1, 2, 3)};
    Assertions.assertThat(listsInput).hasSize(2);
    Assertions.assertThat(listsInput[0]).hasToString("1 4 7");
    Assertions.assertThat(listsInput[1]).hasToString("1 2 3");

    MergeKSortedLists solution = new MergeKSortedLists();

    ListNode actualAnswer = solution.mergeKLists(listsInput);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1 1 2 3 4 7");
  }

  @Test
  @DisplayName("Must return [1, 1, 2, 2, 3, 4, 4, 5, 7] when input is a {[1, 4, 7], [1, 2, 3], [2, 4, 5]}")
  void test5() {
    ListNode[] listsInput = {ListNode.of(1, 4, 7), ListNode.of(1, 2, 3), ListNode.of(2, 4, 5)};
    Assertions.assertThat(listsInput).hasSize(3);
    Assertions.assertThat(listsInput[0]).hasToString("1 4 7");
    Assertions.assertThat(listsInput[1]).hasToString("1 2 3");
    Assertions.assertThat(listsInput[2]).hasToString("2 4 5");

    MergeKSortedLists solution = new MergeKSortedLists();

    ListNode actualAnswer = solution.mergeKLists(listsInput);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1 1 2 2 3 4 4 5 7");
  }

}