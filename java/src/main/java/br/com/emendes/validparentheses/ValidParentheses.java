package br.com.emendes.validparentheses;

import java.util.HashMap;
import java.util.Map;

/**
 * Dada uma string s contendo apenas os caracteres '(', ')', '{', '}', '[' e ']',
 * determine se a String de entrada é válida.<br><br>
 * Uma string de entrada é válida se:<br>
 * Os colchetes abertos devem ser fechados pelo mesmo tipo de colchetes.<br>
 * Os colchetes abertos devem ser fechados na ordem correta.<br>
 * Cada colchete fechado tem um colchete aberto correspondente do mesmo tipo.<br><br>
 * Restrições:
 * 1 <= s.length <= 10^4<br>
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

  // Solução em 1ms
  public boolean isValid(String s) {
    int sLength = s.length();
    char[] brackets = s.toCharArray();
    int i = 0;

    // Caso a quantidade de brackets seja ímpar, não é possível fechar todos os brackets.
    if (sLength % 2 != 0) return false;

    Stack stack = new Stack();
    Map<Character, Character> mapBrackets = new HashMap<>();
    mapBrackets.put(')', '(');
    mapBrackets.put(']', '[');
    mapBrackets.put('}', '{');


    while (i < sLength) {
      switch (brackets[i]) {
        case '{', '[', '(' -> stack.push(brackets[i]);
        case '}', ']', ')' -> {
          char peek = stack.peek();
          if (peek == 'x' || peek != mapBrackets.get(brackets[i])) {
            return false;
          }
          stack.pop();
        }
        default -> {}
      }

      i++;
    }

    return stack.peek() == 'x';
  }

  static class Stack {

    private Node top;

    public void push(char bracket) {
      Node node;
      if (top == null) {
        node = new Node(bracket);
      } else {
        node = new Node(bracket, this.top);
      }

      this.top = node;
    }

    // Pra uso fora do código teria que ter uma verificação top == null.
    public char pop() {
      Node aux = top;
      top = top.next;

      return aux.bracket;
    }

    public char peek() {
      if (top == null) return 'x';

      return top.bracket;
    }

    private static class Node {
      char bracket;
      Node next;

      public Node(char bracket) {
        this.bracket = bracket;
      }

      public Node(char bracket, Node next) {
        this.bracket = bracket;
        this.next = next;
      }

    }
  }

}
