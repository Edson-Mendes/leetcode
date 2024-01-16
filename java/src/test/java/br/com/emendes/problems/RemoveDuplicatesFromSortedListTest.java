package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {

  @Test
  void test01() {
    RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    ListNode actualAnswer = solution.deleteDuplicates(null);

    Assertions.assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    ListNode actualAnswer = solution.deleteDuplicates(ListNodeGenerator.generate(1));

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNull();
  }

  @Test
  void test03() {
    RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    ListNode actualAnswer = solution.deleteDuplicates(ListNodeGenerator.generate(1, 1, 1, 1, 1));

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNull();
  }

  @Test
  void test04() {
    RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    ListNode actualAnswer = solution.deleteDuplicates(ListNodeGenerator.generate(1, 1, 1, 1, 1, 2));

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next).isNull();
  }

  @Test
  void test05() {
    RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    ListNode actualAnswer = solution.deleteDuplicates(ListNodeGenerator.generate(1, 1, 1, 1, 1, 2, 2, 2));

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next).isNull();
  }

  @Test
  void test06() {
    RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();

    ListNode actualAnswer = solution.deleteDuplicates(ListNodeGenerator.generate(1, 2, 2, 2));

    Assertions.assertThat(actualAnswer).isNotNull();
    Assertions.assertThat(actualAnswer.val).isEqualTo(1);
    Assertions.assertThat(actualAnswer.next).isNotNull();
    Assertions.assertThat(actualAnswer.next.val).isEqualTo(2);
    Assertions.assertThat(actualAnswer.next.next).isNull();
  }


}