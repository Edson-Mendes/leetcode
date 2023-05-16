package br.com.emendes.problems;

/**
 * Dado uma linked list, troque a cada dois nós adjacentes e retorne head.<br>
 * Você deve resolver o problema sem modificar os valores nos nós da lista, ou seja, apenas os próprios nós podem ser alterados. <br>
 *
 * Restrições:<br>
 * O número de nós na lista está no intervalo [0, 100].<br>
 * 0 <= Node.val <= 100<br>
 */
public class SwapNodesInPairs {

  // Solução em 0ms.
  public ListNode swapPairs(ListNode head) {
    if (head == null) return null;
    if (head.next == null) return head;

    ListNode aux = head;
    head = head.next;

    aux.next = aux.next.next;
    head.next = aux;

    while (aux.next != null && aux.next.next != null) {
      swap(aux, aux.next);
      aux = aux.next.next;
    }

    return head;
  }

  private void swap(ListNode left, ListNode pair1) {
    ListNode pair2 = pair1.next;
    left.next = pair2;

    pair1.next = pair2.next;
    pair2.next = pair1;
  }

  public static class ListNode {
    int val;
    SwapNodesInPairs.ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, SwapNodesInPairs.ListNode next) {
      this.val = val;
      this.next = next;
    }

    public static SwapNodesInPairs.ListNode of(int... values) {
      SwapNodesInPairs.ListNode head = null;
      SwapNodesInPairs.ListNode aux = null;

      for (int value : values) {
        if (head == null) {
          head = new SwapNodesInPairs.ListNode(value);
          aux = head;
        } else {
          aux.next = new SwapNodesInPairs.ListNode(value);
          aux = aux.next;
        }
      }

      return head;
    }

    @Override
    public String toString() {
      String valAsString = String.format("%d", this.val);
      return valAsString + (this.next != null ? String.format(" %s", this.next) : "");
    }
  }

}
