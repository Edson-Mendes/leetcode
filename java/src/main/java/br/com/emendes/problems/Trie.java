package br.com.emendes.problems;

/**
 * A trie (pronunciado como "try") ou prefix tree é uma estrutura de dados tree usado eficientemente para
 * armazenar e recuperar keys em um conjunto de dados de strings. Existem várias aplicações
 * dessa estrutura de dados, tipo preenchimento automático e corretor ortográfico.<br>
 * <br>
 * Implemente a Trie class:<br>
 * -> Trie() inicializa o objeto trie.<br>
 * -> void insert(String word) insere a string word na trie.<br>
 * -> boolean search(string word) retorna true se a string word está na trie, e false caso contrário.<br>
 * -> boolean startWith(string prefix) retorna true se existe um string previamente inserida com o prefixo
 * prefix, se false caso contrário.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= word.length, prefix.length <= 2000<br>
 * -> word e prefix consistem de letras minúsculas e inglesas.<br>
 * -> No máximo 3 * 10⁴ chamadas no total serão feitas para insert, search e startWith.
 * <br><br>
 * Leetcode problem: 208. Implement Trie (Prefix Tree)
 */
public class Trie {

  private TrieNode trieNode = new TrieNode();

  public void insert(String word) {
    TrieNode node = trieNode;
    for (char c : word.toCharArray()) {
      int i = c - 'a';
      if (node.next[i] == null)
        node.next[i] = new TrieNode();
      node = node.next[i];
    }
    node.isEnd = true;
  }

  public boolean search(String word) {
    TrieNode node = find(word);
    return node != null && node.isEnd;
  }

  public boolean startsWith(String prefix) {
    TrieNode node = find(prefix);
    return node != null;
  }

  private TrieNode find(String word) {
    TrieNode node = trieNode;
    for (char c : word.toCharArray()) {
      int i = c - 'a';
      if (node.next[i] == null)
        return null;
      node = node.next[i];
    }
    return node;
  }

  private class TrieNode {
    public TrieNode[] next = new TrieNode[26];
    public boolean isEnd = false;
  }

// **********************************************************
//   ******************* First solution *******************
//  private final Map<Character, Trie> next = new HashMap<>();
//  private boolean isEnd = false;
//
//  public void insert(String word) {
//    insert(word, 0);
//  }
//
//  public boolean search(String word) {
//    return search(word, 0);
//  }
//
//  public boolean startsWith(String prefix) {
//    return startsWith(prefix, 0);
//  }
//
//  private void insert(String word, int index) {
//    Trie trie = next.computeIfAbsent(word.charAt(index), c -> new Trie());
//    if (index == word.length() - 1) {
//      trie.isEnd = true;
//      return;
//    }
//    trie.insert(word, index + 1);
//  }
//
//  private boolean search(String word, int index) {
//    Trie trie = next.get(word.charAt(index));
//    if (trie == null) return false;
//    if (index == word.length() - 1) return trie.isEnd;
//
//    return trie.search(word, index + 1);
//  }
//
//  private boolean startsWith(String prefix, int index) {
//    Trie trie = next.get(prefix.charAt(index));
//    if (trie == null) return false;
//    if (index == prefix.length() - 1) return true;
//
//    return trie.startsWith(prefix, index + 1);
//  }

}
