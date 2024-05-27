package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleTest {

  @Test
  void test01() {
    LinkedListCycle solution = new LinkedListCycle();

    boolean actualAnswer = solution.hasCycle(null);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test02() {
    LinkedListCycle solution = new LinkedListCycle();

    ListNode head = ListNodeGenerator.generate(1);
    boolean actualAnswer = solution.hasCycle(head);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test03() {
    LinkedListCycle solution = new LinkedListCycle();

    ListNode head = ListNodeGenerator.generate(1, 2);
    boolean actualAnswer = solution.hasCycle(head);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test04() {
    LinkedListCycle solution = new LinkedListCycle();

    ListNode head = ListNodeGenerator.generate(1, 2);
    cycleAt(0, head);
    boolean actualAnswer = solution.hasCycle(head);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test05() {
    LinkedListCycle solution = new LinkedListCycle();

    ListNode head = ListNodeGenerator.generate(3, 2, 0, -4);
    cycleAt(1, head);
    boolean actualAnswer = solution.hasCycle(head);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test06() {
    LinkedListCycle solution = new LinkedListCycle();

    ListNode head = ListNodeGenerator.generate(3, 2, 0, -4);
    boolean actualAnswer = solution.hasCycle(head);

    assertThat(actualAnswer).isFalse();
  }

  @Test
  void test07() {
    LinkedListCycle solution = new LinkedListCycle();

    ListNode head = ListNodeGenerator.generate(generateArray(10_000));
    cycleAt(300, head);
    boolean actualAnswer = solution.hasCycle(head);

    assertThat(actualAnswer).isTrue();
  }

  @Test
  void test08() {
    LinkedListCycle solution = new LinkedListCycle();

    ListNode head = ListNodeGenerator.generate(generateArray(10_000));
    boolean actualAnswer = solution.hasCycle(head);

    assertThat(actualAnswer).isFalse();
  }

  /**
   * Gera um array com tamanho igual a size, e valores de 0 até size.
   */
  private static int[] generateArray(int size) {
    if (size < 0) throw new IllegalArgumentException("size must not be negative");
    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = i;
    }

    return array;
  }

  /**
   * Pega a cauda da linked list.
   */
  private static ListNode getTail(ListNode head) {
    if (head == null) return null;
    while (head.next != null) {
      head = head.next;
    }

    return head;
  }

  /**
   * Faz com que o último elemento da linked list aponte para o elemento da posição pos
   */
  private static void cycleAt(int pos, ListNode head) {
    if (pos < 0) throw new IllegalArgumentException("invalid position: %s".formatted(pos));
    int count = 0;
    ListNode node = head;
    while (node != null && count < pos) {
      node = node.next;
      count++;
    }
    if (node == null) {
      throw new IllegalArgumentException("invalid position: %s".formatted(pos));
    }
    ListNode tail = getTail(head);
    tail.next = node;
  }

}