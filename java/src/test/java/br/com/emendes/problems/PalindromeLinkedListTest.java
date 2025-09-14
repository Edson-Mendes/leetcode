package br.com.emendes.problems;

import br.com.emendes.problems.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeLinkedListTest {

  private final PalindromeLinkedList pll = new PalindromeLinkedList();

  private ListNode buildList(String values) {
    String[] parts = values.split(";");
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    for (String part : parts) {
      current.next = new ListNode(Integer.parseInt(part.trim()));
      current = current.next;
    }
    return dummy.next;
  }

  @ParameterizedTest
  @CsvSource({
      "1, true",
      "5;5, true",
      "1;2, false",
      "1;2;3;2;1, true",
      "1;2;3;4;5, false",
      "1;2;2;1, true",
      "1;2;3;4, false"
  })
  void testIsPalindrome(String input, boolean expected) {
    ListNode head = buildList(input);
    boolean result = pll.isPalindrome(head);
    assertEquals(expected, result,
        () -> "Falhou para entrada: " + input);
  }
}