package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrieTest {

  @Test
  void test01() {
    Trie trie = new Trie();

    boolean actualSearch = trie.search("mei");

    assertThat(actualSearch).isFalse();
  }

  @Test
  void test02() {
    Trie trie = new Trie();

    boolean actualSearch = trie.startsWith("mei");

    assertThat(actualSearch).isFalse();
  }

  @Test
  void test03() {
    Trie trie = new Trie();

    trie.insert("mei");
    boolean actualSearch = trie.search("mei");

    assertThat(actualSearch).isTrue();
  }

  @Test
  void test04() {
    Trie trie = new Trie();

    trie.insert("mei");
    boolean actualSearch = trie.startsWith("mei");

    assertThat(actualSearch).isTrue();
  }

  @Test
  void test05() {
    Trie trie = new Trie();

    trie.insert("meia");
    boolean actualSearch = trie.search("mei");

    assertThat(actualSearch).isFalse();
  }

  @Test
  void test06() {
    Trie trie = new Trie();

    trie.insert("meia");
    boolean actualSearch = trie.startsWith("mei");

    assertThat(actualSearch).isTrue();
  }

  @Test
  void test07() {
    Trie trie = new Trie();

    trie.insert("apple");
    assertThat(trie.search("apple")).isTrue();
    assertThat(trie.search("app")).isFalse();
    assertThat(trie.startsWith("app")).isTrue();
    trie.insert("app");
    assertThat(trie.search("app")).isTrue();
  }

}