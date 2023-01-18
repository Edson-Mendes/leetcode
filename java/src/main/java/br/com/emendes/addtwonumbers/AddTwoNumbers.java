package br.com.emendes.addtwonumbers;

/**
 * Você recebe duas LinkedLists não vazias representando dois inteiros não negativos.
 * Os dígitos são armazenados na ordem inversa e cada um de seus nós contém um único dígito.
 * Adicione os dois números e retorne a soma como uma LinkedList.
 */
public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode();
    ListNode current = result;

    int value1 = 0;
    int value2 = 0;
    int remainder = 0;
    int sum;

    while (l1 != null || l2 != null) {
      if (l1 != null) value1 = l1.value;
      if (l2 != null) value2 = l2.value;

      sum = value1 + value2 + remainder;
      current.value = sum % 10;
      remainder = sum / 10;

      if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) { // Verifica se ainda há dígitos
        current.next = new ListNode();
        current = current.next;
      } else {
        if (remainder != 0) { // Se não houver mais dígitos, verifica se a sobras
          current.next = new ListNode();
          current.next.value = remainder;
        }
      }

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;

      value1 = 0;
      value2 = 0;
    }

    return result;
  }

  private static class ListNode {

    int value;
    ListNode next;

    ListNode() {
    }

    ListNode(int value) {
      this.value = value;
    }

    ListNode(int value, ListNode next) {
      this.value = value;
      this.next = next;
    }

    public static ListNode of(String valueAsString) {
      // validações
      if (valueAsString.isBlank()) {
        throw new IllegalArgumentException("Parameter must not be blank!");
      }
      if (!valueAsString.matches("\\d+$")) {
        throw new IllegalArgumentException("Parameter must contains only 0-9");
      }
      ListNode result = new ListNode();
      ListNode current = result;

      int stringSize = valueAsString.length();
      for (int i = 0; i < stringSize; i++) {
        String digitAsString = String.valueOf(valueAsString.charAt(i));
        current.value = Integer.parseInt(digitAsString);
        if (i < stringSize - 1) {
          current.next = new ListNode();
          current = current.next;
        }
      }

      return result;
    }

    public void print() {
      System.out.print(value + " ");
      if (next != null) next.print();
      else System.out.println();
    }

  }

  public static void main(String[] args) {
    ListNode number1 = ListNode.of("9999999");
    ListNode number2 = ListNode.of("9999");

    AddTwoNumbers solution = new AddTwoNumbers();

    ListNode response = solution.addTwoNumbers(number1, number2);

    number1.print();
    number2.print();
    response.print();
  }

}
