package br.com.emendes.problems;

/**
 * Design a stack (pilha) que suporte push, pop, top e recuperando o elemento mínimo em tempo constante.<br>
 * <br>
 * Implemente o MinStack class:
 * <ul>
 *   <li>MinStack() inicializa o objeto stack.</li>
 *   <li>void push(int val) adiciona o elemento val na stack.</li>
 *   <li>void pop() remove o elemento no topo da stack.</li>
 *   <li>int top() get o elemento do topo da stack.</li>
 *   <li>int getMin() recupera o menor elemento da stack.</li>
 * </ul>
 * Você deve implementar uma solução com complexidade de tempo de O(1) para cada função.<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>-2³¹ <= val <= 2³¹ - 1</li>
 *   <li>Métodos pop, top e getMin apenas serão chamados se a stack estiver não-vazia.</li>
 *   <li>No máximo 3 * 10⁴ chamadas aos métodos serão feitas.</li>
 * </ul>
 */
public class MinStack {

  private Node top;
  private Node min;

  public MinStack() {
    this.top = null;
    this.min = null;
  }

  public void push(int val) {
    top = new Node(val, top);
    insert(top);
  }

  public void pop() {
    Node node = top;
    top = top.next;
    node.next = null;
    remove(node);
  }

  public int top() {
    return top.val;
  }

  public int getMin() {
    return min.val;
  }

  private void insert(Node node) {
    if (min == null) {
      min = node;
      return;
    }
    if (node.val < min.val) {
      node.right = min;
      min = node;
      return;
    }
    Node actual = min;
    while (actual.right != null && actual.right.val < node.val) {
      actual = actual.right;
    }
    node.right = actual.right;
    actual.right = node;

  }

  private void remove(Node node) {
    if (node == min) {
      min = min.right;
    } else {
      Node actual = min;
      while (actual.right != node) {
        actual = actual.right;
      }
      actual.right = actual.right.right;
    }
    node.right = null;
  }

  private static class Node {

    int val;
    Node next;
    Node right;

    public Node(int val, Node next) {
      this.val = val;
      this.next = next;
      this.right = null;
    }

  }

}
