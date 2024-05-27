package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import br.com.emendes.problems.util.ListNodeGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleIITest {

  @Test
  void test01() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode actualAnswer = solution.detectCycle(null);

    assertThat(actualAnswer).isNull();
  }

  @Test
  void test02() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode head = ListNodeGenerator.generate(1);
    ListNode actualAnswer = solution.detectCycle(head);

    assertThat(actualAnswer).isNull();
  }

  @Test
  void test03() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode head = ListNodeGenerator.generate(1, 2);
    ListNode actualAnswer = solution.detectCycle(head);

    assertThat(actualAnswer).isNull();
  }

  @Test
  void test04() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode head = ListNodeGenerator.generate(1, 2);
    ListNode beginCycle = cycleAt(0, head);
    ListNode actualAnswer = solution.detectCycle(head);

    assertThat(actualAnswer).isNotNull().isEqualTo(beginCycle);
  }

  @Test
  void test05() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode head = ListNodeGenerator.generate(3, 2, 0, -4);
    ListNode beginCycle = cycleAt(1, head);
    ListNode actualAnswer = solution.detectCycle(head);

    assertThat(actualAnswer).isNotNull().isEqualTo(beginCycle);
  }

  @Test
  void test06() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode head = ListNodeGenerator.generate(3, 2, 0, -4);
    ListNode actualAnswer = solution.detectCycle(head);

    assertThat(actualAnswer).isNull();
  }

  @Test
  void test07() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode head = ListNodeGenerator.generate(generateArray(10_000));
    ListNode beginCycle = cycleAt(300, head);
    ListNode actualAnswer = solution.detectCycle(head);

    assertThat(actualAnswer).isNotNull().isEqualTo(beginCycle);
  }

  @Test
  void test08() {
    LinkedListCycleII solution = new LinkedListCycleII();

    ListNode head = ListNodeGenerator.generate(generateArray(10_000));
    ListNode actualAnswer = solution.detectCycle(head);

    assertThat(actualAnswer).isNull();
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
  private static ListNode cycleAt(int pos, ListNode head) {
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

    return node;
  }

}