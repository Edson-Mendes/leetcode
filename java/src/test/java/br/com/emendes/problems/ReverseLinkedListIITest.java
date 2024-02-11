package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListIITest {

  @Test
  void test01() {
    ReverseLinkedListII solution = new ReverseLinkedListII();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5);
    ListNode actualHead = solution.reverseBetween(head, 1, 1);

    assertThat(actualHead).isNotNull();
    assertThat(actualHead.val).isEqualTo(1);
    assertThat(actualHead.next).isNotNull();
    assertThat(actualHead.next.val).isEqualTo(2);
    assertThat(actualHead.next.next).isNotNull();
    assertThat(actualHead.next.next.val).isEqualTo(3);
    assertThat(actualHead.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.val).isEqualTo(4);
    assertThat(actualHead.next.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.next.val).isEqualTo(5);
    assertThat(actualHead.next.next.next.next.next).isNull();
  }

  @Test
  void test02() {
    ReverseLinkedListII solution = new ReverseLinkedListII();

    ListNode head = ListNodeGenerator.generate(5);
    ListNode actualHead = solution.reverseBetween(head, 1, 1);

    assertThat(actualHead).isNotNull();
    assertThat(actualHead.val).isEqualTo(5);
    assertThat(actualHead.next).isNull();
  }

  @Test
  void test03() {
    ReverseLinkedListII solution = new ReverseLinkedListII();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5);
    ListNode actualHead = solution.reverseBetween(head, 2, 4);

    assertThat(actualHead).isNotNull();
    assertThat(actualHead.val).isEqualTo(1);
    assertThat(actualHead.next).isNotNull();
    assertThat(actualHead.next.val).isEqualTo(4);
    assertThat(actualHead.next.next).isNotNull();
    assertThat(actualHead.next.next.val).isEqualTo(3);
    assertThat(actualHead.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.val).isEqualTo(2);
    assertThat(actualHead.next.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.next.val).isEqualTo(5);
    assertThat(actualHead.next.next.next.next.next).isNull();
  }

  @Test
  void test04() {
    ReverseLinkedListII solution = new ReverseLinkedListII();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5);
    ListNode actualHead = solution.reverseBetween(head, 1, 5);

    assertThat(actualHead).isNotNull();
    assertThat(actualHead.val).isEqualTo(5);
    assertThat(actualHead.next).isNotNull();
    assertThat(actualHead.next.val).isEqualTo(4);
    assertThat(actualHead.next.next).isNotNull();
    assertThat(actualHead.next.next.val).isEqualTo(3);
    assertThat(actualHead.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.val).isEqualTo(2);
    assertThat(actualHead.next.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.next.val).isEqualTo(1);
    assertThat(actualHead.next.next.next.next.next).isNull();
  }

  @Test
  void test05() {
    ReverseLinkedListII solution = new ReverseLinkedListII();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5);
    ListNode actualHead = solution.reverseBetween(head, 1, 3);

    assertThat(actualHead).isNotNull();
    assertThat(actualHead.val).isEqualTo(3);
    assertThat(actualHead.next).isNotNull();
    assertThat(actualHead.next.val).isEqualTo(2);
    assertThat(actualHead.next.next).isNotNull();
    assertThat(actualHead.next.next.val).isEqualTo(1);
    assertThat(actualHead.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.val).isEqualTo(4);
    assertThat(actualHead.next.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.next.val).isEqualTo(5);
    assertThat(actualHead.next.next.next.next.next).isNull();
  }

  @Test
  void test06() {
    ReverseLinkedListII solution = new ReverseLinkedListII();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5);
    ListNode actualHead = solution.reverseBetween(head, 3, 5);

    assertThat(actualHead).isNotNull();
    assertThat(actualHead.val).isEqualTo(1);
    assertThat(actualHead.next).isNotNull();
    assertThat(actualHead.next.val).isEqualTo(2);
    assertThat(actualHead.next.next).isNotNull();
    assertThat(actualHead.next.next.val).isEqualTo(5);
    assertThat(actualHead.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.val).isEqualTo(4);
    assertThat(actualHead.next.next.next.next).isNotNull();
    assertThat(actualHead.next.next.next.next.val).isEqualTo(3);
    assertThat(actualHead.next.next.next.next.next).isNull();
  }

}