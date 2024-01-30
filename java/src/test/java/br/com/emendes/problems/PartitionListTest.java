package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PartitionListTest {

  @Test
  void test01() {
    PartitionList solution = new PartitionList();

    ListNode actualAnswer = solution.partition(null, 3);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    PartitionList solution = new PartitionList();

    ListNode head = ListNodeGenerator.generate(1, 4, 3, 2, 5, 2);
    ListNode actualAnswer = solution.partition(head, -100);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.next.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next.next.next).isNull();
  }

  @Test
  void test03() {
    PartitionList solution = new PartitionList();

    ListNode head = ListNodeGenerator.generate(1, 4, 3, 2, 5, 2);
    ListNode actualAnswer = solution.partition(head, 100);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.next.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next.next.next).isNull();
  }

  @Test
  void test04() {
    PartitionList solution = new PartitionList();

    ListNode head = ListNodeGenerator.generate(1, 4, 3, 2, 5, -100);
    ListNode actualAnswer = solution.partition(head, -100);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.next.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.next.val).isEqualTo(-100);
    Assertions.assertThat(actualAnswer.next.next.next.next.next.next).isNull();
  }

  @Test
  void test05() {
    PartitionList solution = new PartitionList();

    ListNode head = ListNodeGenerator.generate(-100, 4, 3, 2, 5, 2);
    ListNode actualAnswer = solution.partition(head, -100);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(-100);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.next.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next.next.next).isNull();
  }

  @Test
  void test06() {
    PartitionList solution = new PartitionList();

    ListNode head = ListNodeGenerator.generate(100, 4, 3, 2, 5, 2);
    ListNode actualAnswer = solution.partition(head, 100);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.next.val).isEqualTo(100);
    Assertions.assertThat(actualAnswer.next.next.next.next.next.next).isNull();
  }

  @Test
  void test07() {
    PartitionList solution = new PartitionList();

    ListNode head = ListNodeGenerator.generate(1, 4, 3, 2, 5, 100);
    ListNode actualAnswer = solution.partition(head, 100);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.next.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.next.val).isEqualTo(100);
    Assertions.assertThat(actualAnswer.next.next.next.next.next.next).isNull();
  }

  @Test
  void test08() {
    PartitionList solution = new PartitionList();

    ListNode head = ListNodeGenerator.generate(1, 4, 3, 2, 5, 2);
    ListNode actualAnswer = solution.partition(head, 3);

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.val).isEqualTo(4);
    Assertions.assertThat(actualAnswer.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.val).isEqualTo(3);
    Assertions.assertThat(actualAnswer.next.next.next.next.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.next.next.next.next.val).isEqualTo(5);
    Assertions.assertThat(actualAnswer.next.next.next.next.next.next).isNull();
  }

}