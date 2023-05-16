package br.com.emendes.problems;

/**
 * Você recebe as heads de duas listas encadeadas ordenadas list1 e list2.<br>
 * Mesclar as duas listas em uma lista ordenada. A lista deve ser feita unindo os nós das duas primeiras listas.<br>
 * Retorna a head da lista vinculada mesclada.<br><br>
 * <p>
 * Restrições:<br>
 * O número de nós em ambas as listas está no intervalo [0, 50].<br>
 * -100 <= Node.val <= 100<br>
 * Tanto a lista1 quanto a lista2 são ordenadas em ordem não decrescente.
 */
public class MergeTwoSortedLists {

  // Solution 0ms
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    ListNode answer;
    ListNode curr;

    if (list2.val < list1.val) {
      answer = list2;
      list2 = list2.next;
    } else {
      answer = list1;
      list1 = list1.next;
    }

    curr = answer;
    curr.next = null;

    // Enquanto true, então ambas as listas possuem valor.
    while (list1 != null && list2 != null) {
      if (list2.val < list1.val) {
        curr.next = list2;
        list2 = list2.next;
      } else {
        curr.next = list1;
        list1 = list1.next;
      }
      curr = curr.next;
      curr.next = null;
    }

    if (list1 == null) {
      curr.next = list2;
    }
    if (list2 == null) {
      curr.next = list1;
    }

    return answer;
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

    public static ListNode from(int... values) {
      ListNode head = null;
      ListNode aux = null;

      for (int value : values) {
        if (head == null) {
          head = new ListNode(value);
          aux = head;
        } else {
          aux.next = new ListNode(value);
          aux = aux.next;
        }
      }

      return head;
    }

    @Override
    public String toString() {
      String valAsString = String.format("%d", this.val);
      return  valAsString + (this.next != null ? String.format(" %s", this.next) : "");
    }

  }

}
