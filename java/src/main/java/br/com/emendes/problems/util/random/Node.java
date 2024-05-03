package br.com.emendes.problems.util.random;

/**
 * Node com uma referência a um node aleatório da linked list ou null.
 */
public class Node {
  public int val;
  public Node next;
  public Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}
