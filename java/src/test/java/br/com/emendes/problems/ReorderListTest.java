package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReorderListTest {

  @Test
  void test01() {
    ReorderList solution = new ReorderList();

    ListNode head = ListNodeGenerator.generate(1);
    solution.reorderList(head);

    Assertions.assertThat(head).isNotNull();
    Assertions.assertThat(head.val).isEqualTo(1);
    Assertions.assertThat(head.next).isNull();
  }

  @Test
  void test02() {
    ReorderList solution = new ReorderList();

    ListNode head = ListNodeGenerator.generate(1, 2);
    solution.reorderList(head);

    Assertions.assertThat(head).isNotNull();
    Assertions.assertThat(head.val).isEqualTo(1);
    Assertions.assertThat(head.next).isNotNull();
    Assertions.assertThat(head.next.val).isEqualTo(2);
    Assertions.assertThat(head.next.next).isNull();
  }

  @Test
  void test03() {
    ReorderList solution = new ReorderList();

    ListNode head = ListNodeGenerator.generate(1, 2, 3);
    solution.reorderList(head);

    Assertions.assertThat(head).isNotNull();
    Assertions.assertThat(head.val).isEqualTo(1);
    Assertions.assertThat(head.next).isNotNull();
    Assertions.assertThat(head.next.val).isEqualTo(3);
    Assertions.assertThat(head.next.next).isNotNull();
    Assertions.assertThat(head.next.next.val).isEqualTo(2);
    Assertions.assertThat(head.next.next.next).isNull();
  }

  @Test
  void test04() {
    ReorderList solution = new ReorderList();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4);
    solution.reorderList(head);

    Assertions.assertThat(head).isNotNull();
    Assertions.assertThat(head.val).isEqualTo(1);
    Assertions.assertThat(head.next).isNotNull();
    Assertions.assertThat(head.next.val).isEqualTo(4);
    Assertions.assertThat(head.next.next).isNotNull();
    Assertions.assertThat(head.next.next.val).isEqualTo(2);
    Assertions.assertThat(head.next.next.next).isNotNull();
    Assertions.assertThat(head.next.next.next.val).isEqualTo(3);
    Assertions.assertThat(head.next.next.next.next).isNull();
  }

  @Test
  void test05() {
    ReorderList solution = new ReorderList();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5);
    solution.reorderList(head);

    Assertions.assertThat(head).isNotNull();
    Assertions.assertThat(head.val).isEqualTo(1);
    Assertions.assertThat(head.next).isNotNull();
    Assertions.assertThat(head.next.val).isEqualTo(5);
    Assertions.assertThat(head.next.next).isNotNull();
    Assertions.assertThat(head.next.next.val).isEqualTo(2);
    Assertions.assertThat(head.next.next.next).isNotNull();
    Assertions.assertThat(head.next.next.next.val).isEqualTo(4);
    Assertions.assertThat(head.next.next.next.next).isNotNull();
    Assertions.assertThat(head.next.next.next.next.val).isEqualTo(3);
    Assertions.assertThat(head.next.next.next.next.next).isNull();
  }

  @Test
  void test06() {
    ReorderList solution = new ReorderList();

    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5, 6);
    solution.reorderList(head);

    Assertions.assertThat(head).isNotNull();
    Assertions.assertThat(head.val).isEqualTo(1);
    Assertions.assertThat(head.next).isNotNull();
    Assertions.assertThat(head.next.val).isEqualTo(6);
    Assertions.assertThat(head.next.next).isNotNull();
    Assertions.assertThat(head.next.next.val).isEqualTo(2);
    Assertions.assertThat(head.next.next.next).isNotNull();
    Assertions.assertThat(head.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(head.next.next.next.next).isNotNull();
    Assertions.assertThat(head.next.next.next.next.val).isEqualTo(3);
    Assertions.assertThat(head.next.next.next.next.next).isNotNull();
    Assertions.assertThat(head.next.next.next.next.next.val).isEqualTo(4);
    Assertions.assertThat(head.next.next.next.next.next.next).isNull();
  }

}