package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

  @Test
  void test1() {
    MergeTwoSortedLists.ListNode inputList1 = MergeTwoSortedLists.ListNode.from(1, 4, 6);
    MergeTwoSortedLists.ListNode inputList2 = MergeTwoSortedLists.ListNode.from(1, 2, 3, 7);

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    MergeTwoSortedLists.ListNode actualAnswer = solution.mergeTwoLists(inputList1, inputList2);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1 1 2 3 4 6 7");
  }

  @Test
  void test2() {
    MergeTwoSortedLists.ListNode inputList1 = MergeTwoSortedLists.ListNode.from(1, 2, 4);
    MergeTwoSortedLists.ListNode inputList2 = MergeTwoSortedLists.ListNode.from(1, 3, 4);

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    MergeTwoSortedLists.ListNode actualAnswer = solution.mergeTwoLists(inputList1, inputList2);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("1 1 2 3 4 4");
  }

  @Test
  void test3() {
    MergeTwoSortedLists.ListNode inputList1 = null;
    MergeTwoSortedLists.ListNode inputList2 = MergeTwoSortedLists.ListNode.from(0);

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    MergeTwoSortedLists.ListNode actualAnswer = solution.mergeTwoLists(inputList1, inputList2);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("0");
  }

  @Test
  void test4() {
    MergeTwoSortedLists.ListNode inputList1 = MergeTwoSortedLists.ListNode.from(0);
    MergeTwoSortedLists.ListNode inputList2 = null;

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    MergeTwoSortedLists.ListNode actualAnswer = solution.mergeTwoLists(inputList1, inputList2);

    Assertions.assertThat(actualAnswer).isNotNull().hasToString("0");
  }

  @Test
  void test5() {
    MergeTwoSortedLists.ListNode inputList1 = null;
    MergeTwoSortedLists.ListNode inputList2 = null;

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    MergeTwoSortedLists.ListNode actualAnswer = solution.mergeTwoLists(inputList1, inputList2);

    Assertions.assertThat(actualAnswer).isNull();
  }

}