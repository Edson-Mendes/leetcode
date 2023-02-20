package br.com.emendes.removenthnodefromendoflist;

/**
 * Dado o cabeçalho de uma lista encadeada, remova o enésimo nó do final da lista e retorne seu cabeçalho.<br><br>
 * Restrições:<br>
 * 1 <= sz <= 30<br>
 * 0 <= Node.val <= 100<br>
 * 1 <= n <= sz
 */
public class RemoveNThNodeFromEndOfList {

  // Solução em 0ms.
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode actual = head;
    ListNode previous = head;
    int count = -1;
    while (count < n && actual != null) {
      actual = actual.next;
      count++;
    }

    if (actual == null && count < n) return head.next;

    while (actual != null) {
      actual = actual.next;
      previous = previous.next;
    }

    previous.next = previous.next.next;

    return head;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    int size() {
      int count = 0;
      ListNode actual = this;
      while (actual != null) {
        actual = actual.next;
        count++;
      }

      return count;
    }

    @Override
    public String toString() {
      if (this.next != null){
        return String.format("%d %s", this.val, next.toString());
      }
      return String.format("%d", this.val);
    }
  }

  public static void main(String[] args) {

    ListNode head = new ListNode(1);
    ListNode actual = head;

    for (int i = 2; i < 8; i++) {
      actual.next = new ListNode(i);
      actual = actual.next;
    }

    System.out.println(head);

    RemoveNThNodeFromEndOfList solution = new RemoveNThNodeFromEndOfList();
    ListNode newHead = solution.removeNthFromEnd(head, 1);

    System.out.println(newHead);

  }
}
