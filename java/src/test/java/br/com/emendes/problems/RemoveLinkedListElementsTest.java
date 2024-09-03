package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveLinkedListElementsTest {

  @Test
  void test01() {
    RemoveLinkedListElements solution = new RemoveLinkedListElements();

    int val = 6;
    ListNode head = ListNodeGenerator.generate(1);
    ListNode actualHead = solution.removeElements(head, val);

    assertThat(actualHead).isNotNull().matches(a -> a.val == 1).matches(a -> a.next == null);
  }

  @Test
  void test02() {
    RemoveLinkedListElements solution = new RemoveLinkedListElements();

    int val = 6;
    ListNode head = ListNodeGenerator.generate(6);
    ListNode actualHead = solution.removeElements(head, val);

    assertThat(actualHead).isNull();
  }

  @Test
  void test03() {
    RemoveLinkedListElements solution = new RemoveLinkedListElements();

    int val = 6;
    ListNode head = ListNodeGenerator.generate(1, 2, 6, 3, 4, 5, 6);
    ListNode actualHead = solution.removeElements(head, val);

    assertThat(actualHead).isNotNull().matches(a -> a.val == 1).matches(a -> a.next != null);
    assertThat(actualHead.next).isNotNull().matches(a -> a.val == 2).matches(a -> a.next != null);
    assertThat(actualHead.next.next).isNotNull().matches(a -> a.val == 3).matches(a -> a.next != null);
    assertThat(actualHead.next.next.next).isNotNull().matches(a -> a.val == 4).matches(a -> a.next != null);
    assertThat(actualHead.next.next.next.next).isNotNull().matches(a -> a.val == 5).matches(a -> a.next == null);
  }

  @Test
  void test04() {
    RemoveLinkedListElements solution = new RemoveLinkedListElements();

    int val = 6;
    ListNode head = ListNodeGenerator.generate(6, 6, 6, 6, 6, 6, 6, 6, 6);
    ListNode actualHead = solution.removeElements(head, val);

    assertThat(actualHead).isNull();
  }

  @Test
  void test05() {
    RemoveLinkedListElements solution = new RemoveLinkedListElements();

    int val = 6;
    ListNode actualHead = solution.removeElements(null, val);

    assertThat(actualHead).isNull();
  }

}