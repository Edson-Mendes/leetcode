package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.junit.jupiter.api.Test;

import static br.com.emendes.problems.util.ListNodeHelper.listNodeToArray;
import static org.assertj.core.api.Assertions.assertThat;

class InsertionSortListTest {

  @Test
  void test01() {
    InsertionSortList solution = new InsertionSortList();

    ListNode head = ListNodeGenerator.generate(10);
    ListNode actualHead = solution.insertionSortList(head);
    int[] actualListNodeArray = listNodeToArray(actualHead);

    assertThat(actualListNodeArray).isNotNull().hasSize(1).containsExactly(10);
  }

  @Test
  void test02() {
    InsertionSortList solution = new InsertionSortList();

    ListNode head = ListNodeGenerator.generate(10, 12);
    ListNode actualHead = solution.insertionSortList(head);
    int[] actualListNodeArray = listNodeToArray(actualHead);

    assertThat(actualListNodeArray).isNotNull().hasSize(2).containsExactly(10, 12);
  }

  @Test
  void test03() {
    InsertionSortList solution = new InsertionSortList();

    ListNode head = ListNodeGenerator.generate(12, 10);
    ListNode actualHead = solution.insertionSortList(head);
    int[] actualListNodeArray = listNodeToArray(actualHead);

    assertThat(actualListNodeArray).isNotNull().hasSize(2).containsExactly(10, 12);
  }

  @Test
  void test04() {
    InsertionSortList solution = new InsertionSortList();

    ListNode head = ListNodeGenerator.generate(4, 2, 1, 3);
    ListNode actualHead = solution.insertionSortList(head);
    int[] actualListNodeArray = listNodeToArray(actualHead);

    assertThat(actualListNodeArray).isNotNull().hasSize(4).containsExactly(1, 2, 3, 4);
  }

  @Test
  void test05() {
    InsertionSortList solution = new InsertionSortList();

    ListNode head = ListNodeGenerator.generate(-1, 5, 3, 4, 0);
    ListNode actualHead = solution.insertionSortList(head);
    int[] actualListNodeArray = listNodeToArray(actualHead);

    assertThat(actualListNodeArray).isNotNull().hasSize(5).containsExactly(-1, 0, 3, 4, 5);
  }

  @Test
  void test06() {
    InsertionSortList solution = new InsertionSortList();

    ListNode head = ListNodeGenerator.generate(6, 5, 3, 1, 8, 7, 2, 4);
    ListNode actualHead = solution.insertionSortList(head);
    int[] actualListNodeArray = listNodeToArray(actualHead);

    assertThat(actualListNodeArray).isNotNull().hasSize(8).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
  }

}