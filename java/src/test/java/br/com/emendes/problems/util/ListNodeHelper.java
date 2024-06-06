package br.com.emendes.problems.util;

public class ListNodeHelper {

  public static int[] listNodeToArray(ListNode head) {
    int size = listNodeSize(head);
    int[] listNodeArray = new int[size];
    int i = 0;
    while (head != null) {
      listNodeArray[i++] = head.val;
      head = head.next;
    }

    return listNodeArray;
  }

  private static int listNodeSize(ListNode head) {
    int size = 0;

    while (head != null) {
      size++;
      head = head.next;
    }

    return size;
  }

}
