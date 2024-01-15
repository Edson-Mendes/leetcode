package br.com.emendes.problems.util;

public class ListNodeGenerator {

  public static ListNode generate(int... values) {
    if (values == null || values.length == 0) {
      throw new IllegalArgumentException("values must not be null or empty");
    }
    ListNode head = new ListNode(values[0]);
    ListNode curr = head;
    for (int i = 1; i < values.length; i++) {
      curr.next = new ListNode(values[i]);
      curr = curr.next;
    }

    return head;
  }

}
