package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import br.com.emendes.problems.util.ListNodeHelper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SortListTest {

  @Test
  void test01() {
    SortList solution = new SortList();

    ListNode actualAnswer = solution.sortList(null);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    SortList solution = new SortList();

    ListNode head = ListNodeGenerator.generate(10);
    ListNode actualHead = solution.sortList(head);
    int[] actualListNodeArray = ListNodeHelper.listNodeToArray(actualHead);

    Assertions.assertThat(actualListNodeArray).isNotNull().containsExactly(10);
  }

  @Test
  void test03() {
    SortList solution = new SortList();

    ListNode head = ListNodeGenerator.generate(10, 12);
    ListNode actualHead = solution.sortList(head);
    int[] actualListNodeArray = ListNodeHelper.listNodeToArray(actualHead);

    Assertions.assertThat(actualListNodeArray).isNotNull().containsExactly(10, 12);
  }

  @Test
  void test04() {
    SortList solution = new SortList();

    ListNode head = ListNodeGenerator.generate(12, 10);
    ListNode actualHead = solution.sortList(head);
    int[] actualListNodeArray = ListNodeHelper.listNodeToArray(actualHead);

    Assertions.assertThat(actualListNodeArray).isNotNull().containsExactly(10, 12);
  }

  @Test
  void test05() {
    SortList solution = new SortList();

    ListNode head = ListNodeGenerator.generate(4, 2, 1, 3);
    ListNode actualHead = solution.sortList(head);
    int[] actualListNodeArray = ListNodeHelper.listNodeToArray(actualHead);

    Assertions.assertThat(actualListNodeArray).isNotNull().containsExactly(1, 2, 3, 4);
  }

  @Test
  void test06() {
    SortList solution = new SortList();

    ListNode head = ListNodeGenerator.generate(-1, 5, 3, 4, 0);
    ListNode actualHead = solution.sortList(head);
    int[] actualListNodeArray = ListNodeHelper.listNodeToArray(actualHead);

    Assertions.assertThat(actualListNodeArray).isNotNull().containsExactly(-1, 0, 3, 4, 5);
  }

}