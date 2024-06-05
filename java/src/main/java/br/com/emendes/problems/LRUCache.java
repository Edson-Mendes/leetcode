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
  private final Set<Node> cache;
  private final Map<Integer, Node> keyToNode;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.cache = new LinkedHashSet<>();
    this.keyToNode = new HashMap<>();
  }

  public int get(int key) {
    if (!keyToNode.containsKey(key))
      return -1;

    Node node = keyToNode.get(key);
    cache.remove(node);
    cache.add(node);
    return node.value;
  }

  public void put(int key, int value) {
    if (keyToNode.containsKey(key)) {
      keyToNode.get(key).value = value;
      get(key);
      return;
    }
    if (cache.size() == capacity) {
      Node lastNode = cache.iterator().next();
      cache.remove(lastNode);
      keyToNode.remove(lastNode.key);
    }
    Node node = new Node(key, value);
    cache.add(node);
    keyToNode.put(key, node);
  }

  private static class Node {
    public int key;
    public int value;

    public Node(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

}
