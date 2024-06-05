package br.com.emendes.problems;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Projete uma estrutura de dados que siga as restrições de um Least Recently Used (LRU) cache.<br>
 * <br>
 * Implement the LRUCache class:<br>
 * <ul>
 *   <li>LRUCache(int capacity) inicializa a LRU cache com capacity positivo.</li>
 *   <li>int get(int key) Retorne o valor da key se a key existir, caso contrário, retorne -1.</li>
 *   <li>void put(int key, int value) Atualize o valor da chave se ela existir.
 *   Caso contrário, adicione o par chave-valor ao cache.
 *   Se o número de chaves exceder a capacidade desta operação, remova a chave usada menos recentemente.</li>
 * </ul>
 * As funções get e put devem ser executadas em complexidade de tempo média O(1).<br>
 * <br>
 * Restrições:<br>
 * <ul>
 *   <li>1 <= capacity <= 3000</li>
 *   <li>0 <= key <= 10⁴</li>
 *   <li>0 <= value <= 10⁵</li>
 *   <li>Serão feitas no máximo 2 * 10⁵ chamadas para get e put.</li>
 * </ul>
 */
public class LRUCache {

  private final int capacity;
  private final Map<Integer, Node> cache;
  private final Node head;
  private final Node tail;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.cache = new HashMap<>();
    this.head = new Node(-1, -1);
    this.tail = new Node(-2, -2);
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    if (!cache.containsKey(key))
      return -1;

    Node node = cache.get(key);
    removeNode(node);
    addLast(node);
    return node.value;
  }

  public void put(int key, int value) {
    if (cache.containsKey(key)) {
      Node node = cache.get(key);
      node.value = value;
      removeNode(node);
      addLast(node);
      return;
    }
    if (cache.size() == capacity) {
      Node first = removeFirst();
      cache.remove(first.key);
    }
    Node node = new Node(key, value);
    cache.put(key, node);
    addLast(node);
  }

  private void removeNode(Node node) {
    Node prev = node.prev;
    Node next = node.next;
    prev.next = next;
    next.prev = prev;
  }

  private void addLast(Node node) {
    Node oldLast = tail.prev;
    oldLast.next = node;
    tail.prev = node;
    node.prev = oldLast;
    node.next = tail;
  }

  private Node removeFirst() {
    Node node = head.next;
    removeNode(node);
    return node;
  }

  private static class Node {
    final int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

}
