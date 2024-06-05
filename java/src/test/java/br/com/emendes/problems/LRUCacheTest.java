package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LRUCacheTest {

  @Test
  void test01() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    int actualValue = solution.get(10);

    Assertions.assertThat(actualValue).isEqualTo(10);
  }

  @Test
  void test02() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    int actualValue = solution.get(15);

    Assertions.assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test03() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    solution.put(11, 11);
    int actualValue = solution.get(10);

    Assertions.assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test04() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    solution.put(11, 11);
    int actualValue = solution.get(11);

    Assertions.assertThat(actualValue).isEqualTo(11);
  }

  @Test
  void test05() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.put(12, 12);
    int actualValue = solution.get(11);

    Assertions.assertThat(actualValue).isEqualTo(11);
  }

  @Test
  void test06() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.put(12, 12);
    int actualValue = solution.get(10);

    Assertions.assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test07() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.get(10);
    solution.put(12, 12);
    int actualValue = solution.get(10);

    Assertions.assertThat(actualValue).isEqualTo(10);
  }

  @Test
  void test08() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.get(10);
    solution.put(12, 12);

    int actualValue = solution.get(11);

    Assertions.assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test09() {
    LRUCache solution = new LRUCache(2);

    solution.put(2, 1);
    solution.put(2, 2);
    solution.get(2);
    solution.put(1, 1);
    solution.put(4, 1);

    int actualValue = solution.get(2);

    Assertions.assertThat(actualValue).isEqualTo(-1);
  }

}