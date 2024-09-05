package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {

  @Test
  void test01() {
    ReverseLinkedList solution = new ReverseLinkedList();

    ListNode actualAnswer = solution.reverseList(null);

    assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    ReverseLinkedList solution = new ReverseLinkedList();

    ListNode head = ListNodeGenerator.generate(10);
    ListNode actualAnswer = solution.reverseList(head);

    assertThat(actualAnswer).isNotNull().matches(a -> a.val == 10).matches(a -> a.next == null);
  }

  @Test
  void test03() {
    ReverseLinkedList solution = new ReverseLinkedList();

    ListNode head = ListNodeGenerator.generate(10, 9, 8);
    ListNode actualAnswer = solution.reverseList(head);

    assertThat(actualAnswer).isNotNull().matches(a -> a.val == 8).matches(a -> a.next != null);
    assertThat(actualAnswer.next).isNotNull().matches(a -> a.val == 9).matches(a -> a.next != null);
    assertThat(actualAnswer.next.next).isNotNull().matches(a -> a.val == 10).matches(a -> a.next == null);
  }

  @Test
  void test04() {
    ReverseLinkedList solution = new ReverseLinkedList();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5);
    ListNode actualAnswer = solution.reverseList(head);

    assertThat(actualAnswer).isNotNull().matches(a -> a.val == 5).matches(a -> a.next != null);
    assertThat(actualAnswer.next).isNotNull().matches(a -> a.val == 4).matches(a -> a.next != null);
    assertThat(actualAnswer.next.next).isNotNull().matches(a -> a.val == 3).matches(a -> a.next != null);
    assertThat(actualAnswer.next.next.next).isNotNull().matches(a -> a.val == 2).matches(a -> a.next != null);
    assertThat(actualAnswer.next.next.next.next).isNotNull().matches(a -> a.val == 1).matches(a -> a.next == null);
  }

}