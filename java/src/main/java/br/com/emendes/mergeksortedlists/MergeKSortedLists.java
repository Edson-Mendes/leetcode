package br.com.emendes.mergeksortedlists;

/**
 * Você recebe um array de k listas de listas encadeadas, cada lista encadeada é ordenada em ordem crescente.<br>
 * Merge todas as listas vinculadas em uma lista vinculada ordenada e retorne-a.<br><br>
 * Restrições:<br>
 * k == lists.length<br>
 * 0 <= k <= 10^4<br>
 * 0 <= lists[i].length <= 500<br>
 * -10^4 <= lists[i][j] <= 10^4<br>
 * lists[i] é ordenado em ordem crescente.<br>
 * A soma de lists[i].length não vai exceder 10^4.<br>
 */
public class MergeKSortedLists {

  // Solução em 1ms
  // Solução utilizando mergeTwoSortedLists mas com divisão e conquista.
  public ListNode mergeKLists(ListNode[] lists) {
    int listsLength = lists.length;

    if (listsLength == 0) return null;
    if (listsLength == 1) return lists[0];

    int currArrayIndex;
    int newArrayIndex;

    while (listsLength > 1) {
      newArrayIndex = 0;
      currArrayIndex = 0;
      while (currArrayIndex + 1 < listsLength) {
        lists[newArrayIndex++] = mergeTwoSortedLists(lists[currArrayIndex], lists[currArrayIndex + 1]);
        currArrayIndex += 2;
      }
      if (currArrayIndex < listsLength) {
        lists[newArrayIndex++] = lists[currArrayIndex];
      }
      listsLength = newArrayIndex;
    }

    return lists[0];
  }

  // Solução em 7 ms, ainda pode ser mais rápido.
  // Solução utilizando counting sort.
  public ListNode secondSolution(ListNode[] lists) {
    ListNode answer = null;
    long[] counting = new long[20_002];

    for (ListNode node : lists) {
      while (node != null) {
        counting[node.val + 10_000]++;
        node = node.next;
      }
    }

    int currValue = -10_000;
    long repeat;
    ListNode aux = null;
    boolean answerIsNotNull = false;

    while (currValue < 10_001) {
      repeat = counting[currValue + 10_000];
      while (repeat > 0) {
        if (answerIsNotNull) {
          aux.next = new ListNode(currValue);
          aux = aux.next;
        } else {
          answer = new ListNode(currValue);
          aux = answer;
          answerIsNotNull = true;
        }

        repeat--;
      }
      currValue++;
    }

    return answer;
  }

  // Solução em 105 ms, da pra ser mais rápido.
  // Essa solução REAPROVEITA os objetos que consiste cada ListNode.
  // Ou seja, os ListNodes de entrada são alterados.
  public ListNode firstSolution(ListNode[] lists) {
    int listsLength = lists.length;

    if (listsLength == 0) return null;
    if (listsLength == 1) return lists[0];

    ListNode currListNode = mergeTwoSortedLists(lists[0], lists[1]);

    for (int i = 2; i < listsLength; i++) {
      currListNode = mergeTwoSortedLists(lists[i], currListNode);
    }

    return currListNode;
  }

  private ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    ListNode mergedList;
    ListNode aux;

    if (list2.val < list1.val) {
      mergedList = list2;
      list2 = list2.next;
    } else {
      mergedList = list1;
      list1 = list1.next;
    }
    aux = mergedList;

    while (list1 != null && list2 != null) {
      if (list2.val < list1.val) {
        aux.next = list2;
        list2 = list2.next;
      } else {
        aux.next = list1;
        list1 = list1.next;
      }
      aux = aux.next;
    }

    if (list1 == null) {
      aux.next = list2;
    } else {
      aux.next = list1;
    }

    return mergedList;
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

    public static MergeKSortedLists.ListNode of(int... values) {
      MergeKSortedLists.ListNode head = null;
      MergeKSortedLists.ListNode aux = null;

      for (int value : values) {
        if (head == null) {
          head = new MergeKSortedLists.ListNode(value);
          aux = head;
        } else {
          aux.next = new MergeKSortedLists.ListNode(value);
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
