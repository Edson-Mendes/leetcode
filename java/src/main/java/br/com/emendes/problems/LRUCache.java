package br.com.emendes.problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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

  private final Map<Integer, Integer> cache;
  private final int capacity;
  private int size;
  private final LinkedList<Integer> used;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.cache = new HashMap<>();
    this.used = new LinkedList<>();
  }

  public int get(int keyInt) {
    Integer key = keyInt;
    Integer value = cache.get(key);

    if (value != null) {
      used.remove(key);
      used.addLast(key);
      return value;
    }
    return -1;
  }

  public void put(int keyInt, int value) {
    Integer key = keyInt;
    if (cache.containsKey(key)) {
      used.remove(key);
    } else if (size == capacity) {
      Integer removedKey = used.removeFirst();
      cache.remove(removedKey);
    } else {
      size++;
    }
    cache.put(key, value);
    used.addLast(key);
  }

}
