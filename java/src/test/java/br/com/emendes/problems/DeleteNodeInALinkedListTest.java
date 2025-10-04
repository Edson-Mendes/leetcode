package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DeleteNodeInALinkedListTest {

  @Test
  void test01() {
    DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
    ListNode head = ListNodeGenerator.generate(1, 2, 3, 4, 5, 6, 7, 8, 9);
    ListNode node = get(head, 3);
    solution.deleteNode(node);

    assertThat(head).isNotNull();
    List<Integer> actualList = toList(head);
    assertThat(actualList).isNotNull().containsExactly(1, 2, 4, 5, 6, 7, 8, 9);
  }

  @Test
  void test02() {
    DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
    ListNode head = ListNodeGenerator.generate(4, 5, 1, 9);
    ListNode node = get(head, 5);
    solution.deleteNode(node);

    assertThat(head).isNotNull();
    List<Integer> actualList = toList(head);
    assertThat(actualList).isNotNull().containsExactly(4, 1, 9);
  }

  @Test
  void test03() {
    DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
    ListNode head = ListNodeGenerator.generate(4, 5, 1, 9);
    ListNode node = get(head, 1);
    solution.deleteNode(node);

    assertThat(head).isNotNull();
    List<Integer> actualList = toList(head);
    assertThat(actualList).isNotNull().containsExactly(4, 5, 9);
  }

  @Test
  void test04() {
    DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
    ListNode head = ListNodeGenerator.generate(4, 5, 1, 9);
    ListNode node = get(head, 4);
    solution.deleteNode(node);

    assertThat(head).isNotNull();
    List<Integer> actualList = toList(head);
    assertThat(actualList).isNotNull().containsExactly(5, 1, 9);
  }

  private List<Integer> toList(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }

    return list;
  }

  private ListNode get(ListNode head, int val) {
    while (head.val != val)
      head = head.next;
    return head;
  }

}