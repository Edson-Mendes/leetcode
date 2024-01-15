package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListIITest {

  @Test
  void test01() {
    RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();

    ListNode actualHead = solution.deleteDuplicates(null);

    Assertions.assertThat(actualHead).isNull();
  }

  @Test
  void test02() {
    RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();
    ListNode head = ListNodeGenerator.generate(1);

    ListNode actualHead = solution.deleteDuplicates(head);

    Assertions.assertThat(actualHead).isNotNull();
    Assertions.assertThat(actualHead.val).isEqualTo(1);
  }

  @Test
  void test03() {
    RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();
    ListNode head = ListNodeGenerator.generate(1, 1, 1, 2, 3);

    ListNode actualHead = solution.deleteDuplicates(head);

    Assertions.assertThat(actualHead).isNotNull();
    Assertions.assertThat(actualHead.val).isEqualTo(2);
    Assertions.assertThat(actualHead.next.val).isEqualTo(3);
  }

  @Test
  void test04() {
    RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();
    ListNode head = ListNodeGenerator.generate(1, 2, 3, 3, 4, 4, 5);

    ListNode actualHead = solution.deleteDuplicates(head);

    Assertions.assertThat(actualHead).isNotNull();
    Assertions.assertThat(actualHead.val).isEqualTo(1);
    Assertions.assertThat(actualHead.next.val).isEqualTo(2);
    Assertions.assertThat(actualHead.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualHead.next.next.next).isNull();
  }

  @Test
  void test05() {
    RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();
    ListNode head = ListNodeGenerator.generate(1, 2, 3, 3, 4, 4, 5, 6, 6, 6);

    ListNode actualHead = solution.deleteDuplicates(head);

    Assertions.assertThat(actualHead).isNotNull();
    Assertions.assertThat(actualHead.val).isEqualTo(1);
    Assertions.assertThat(actualHead.next.val).isEqualTo(2);
    Assertions.assertThat(actualHead.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualHead.next.next.next).isNull();
  }

  @Test
  void test06() {
    RemoveDuplicatesFromSortedListII solution = new RemoveDuplicatesFromSortedListII();
    ListNode head = ListNodeGenerator.generate(3, 3, 4, 4, 5, 5, 5, 6, 6, 6);

    ListNode actualHead = solution.deleteDuplicates(head);

    Assertions.assertThat(actualHead).isNull();
  }

}