package br.com.emendes.reversenodesinkgroup;

/**
 * Dado a head de uma lista encadeada, inverta os nós da lista k de cada vez e retorne a lista modificada.<br>
 * k é um inteiro positivo e é menor ou igual ao comprimento da lista encadeada.
 * Se o número de nós não for um múltiplo de k, os nós deixados de fora, no final, devem permanecer como estão.<br>
 * Você não pode alterar os valores nos nós da lista, apenas os próprios nós podem ser alterados.<br><br>
 * <p>
 * Restrições:<br>
 * O número de nós na lista é n.<br>
 * 1 <= k <= n <= 5000<br>
 * 0 <= Node.val <= 1000<br><br>
 * <p>
 * Tente revolver em O(1) em complexidade de espaço de memória.
 */
public class ReverseNodesInKGroup {

  // Solução em 1ms, pode ser melhor
  // Solução em O(n) em espaço de memória.
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head.next == null || k == 1) return head;

    ListNode currNode = head;

    // Começo do reverse na head.
    ListNode endOfNewRange = new ListNode(currNode.val);
    ListNode startOfNewRange = endOfNewRange;
    int count = 1;

    while (count < k) {
      if (currNode.next == null) return head;

      ListNode newNode = new ListNode(currNode.next.val);
      newNode.next = startOfNewRange;

      startOfNewRange = newNode;
      currNode = currNode.next;
      count++;
    }

    head = startOfNewRange;
    endOfNewRange.next = currNode.next;
    // Fim do reverse na head.
    ///////////////////////////////////////////

    currNode = currNode.next;
    ListNode beforeNewRange;
    ListNode startInputRange;

    while (currNode != null) {
      beforeNewRange = endOfNewRange;

      startInputRange = currNode;
      endOfNewRange = new ListNode(currNode.val);
      startOfNewRange = endOfNewRange;
      count = 1;

      while (count < k && currNode.next != null) {
        ListNode newNode = new ListNode(currNode.next.val);
        newNode.next = startOfNewRange;

        startOfNewRange = newNode;
        currNode = currNode.next;
        count++;
      }

      if (count == k) {
        beforeNewRange.next = startOfNewRange;
      } else {
        beforeNewRange.next = startInputRange;
      }
      currNode = currNode.next;
    }

    return head;
  }

  public static class ListNode {
    int val;
    ReverseNodesInKGroup.ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ReverseNodesInKGroup.ListNode next) {
      this.val = val;
      this.next = next;
    }

    public static ReverseNodesInKGroup.ListNode of(int... values) {
      ReverseNodesInKGroup.ListNode head = null;
      ReverseNodesInKGroup.ListNode aux = null;

      for (int value : values) {
        if (head == null) {
          head = new ReverseNodesInKGroup.ListNode(value);
          aux = head;
        } else {
          aux.next = new ReverseNodesInKGroup.ListNode(value);
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
