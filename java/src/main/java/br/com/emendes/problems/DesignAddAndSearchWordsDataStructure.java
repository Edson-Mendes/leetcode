package br.com.emendes.problems;

/**
 * Crie uma estrutura de dados que suporte a adição de novas palavras e a descoberta de
 * se uma sequência corresponde a alguma sequência adicionada anteriormente.<br>
 * <br>
 * Implemente a classe WordDictionary:<br>
 * -> WordDictionary() inicializao objeto.<br>
 * -> void addWord(word) adiciona word a estrutura de dados.<br>
 * -> bool search(word) retorna true se existe alguma string na estrutura de dados que corresponde a word,
 * ou false caso contrário. word pode conter pontos '.' onde os pontos podem corresponder a qualquer letra.<br>
 * <br>
 * Restrições:<br>
 * -> 1 <= word.length <= 25<br>
 * -> word em addWord() consiste de letras minúsculas.<br>
 * -> word in search() consiste de letras minúsculas ou pontos '.'.<br>
 * -> Haverá no máximo 2 pontos na palavra para consultas de pesquisa.<br>
 * -> No máximo 10⁴ chamadas serão feitas para addWord e search.
 */
public class DesignAddAndSearchWordsDataStructure {

  public static class WordDictionary {

    private final Trie trie;

    public WordDictionary() {
      trie = new Trie();
    }

    public void addWord(String word) {
      trie.add(word, 0);
    }

    public boolean search(String word) {
      Trie found = trie.search(word, 0);
      return found != null && found.isEnd;
    }

    private static class Trie {

      public boolean isEnd = false;
      public Trie[] children = new Trie[26];

      public void add(String word, int index) {
        if (index == word.length()) {
          isEnd = true;
          return;
        }
        int position = word.charAt(index) - 'a';
        if (children[position] == null)
          children[position] = new Trie();

        children[position].add(word, index + 1);
      }

      public Trie search(String word, int index) {
        if (index == word.length()) return this;

        char c = word.charAt(index);
        if (c == '.') {
          for (Trie t : children) {
            if (t != null) {
              Trie trieFound = t.search(word, index + 1);
              if (trieFound != null && trieFound.isEnd) return trieFound;
            }
          }
          return null;
        }

        return children[c - 'a'] != null ? children[c - 'a'].search(word, index + 1) : null;
      }

    }

  }

}
