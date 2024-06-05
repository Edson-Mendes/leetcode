package br.com.emendes.problems;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LRUCacheTest {

  @Test
  void test01() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    int actualValue = solution.get(10);

    assertThat(actualValue).isEqualTo(10);
  }

  @Test
  void test02() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    int actualValue = solution.get(15);

    assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test03() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    solution.put(11, 11);
    int actualValue = solution.get(10);

    assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test04() {
    LRUCache solution = new LRUCache(1);

    solution.put(10, 10);
    solution.put(11, 11);
    int actualValue = solution.get(11);

    assertThat(actualValue).isEqualTo(11);
  }

  @Test
  void test05() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.put(12, 12);
    int actualValue = solution.get(11);

    assertThat(actualValue).isEqualTo(11);
  }

  @Test
  void test06() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.put(12, 12);
    int actualValue = solution.get(10);

    assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test07() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.get(10);
    solution.put(12, 12);
    int actualValue = solution.get(10);

    assertThat(actualValue).isEqualTo(10);
  }

  @Test
  void test08() {
    LRUCache solution = new LRUCache(2);

    solution.put(10, 10);
    solution.put(11, 11);
    solution.get(10);
    solution.put(12, 12);

    int actualValue = solution.get(11);

    assertThat(actualValue).isEqualTo(-1);
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

    assertThat(actualValue).isEqualTo(-1);
  }

  @Test
  void test10() {
    LRUCache solution = new LRUCache(3);

    solution.put(1, 1);
    solution.put(2, 2);
    solution.put(3, 3);
    solution.put(4, 4);

    int actualFirst = solution.get(4);
    assertThat(actualFirst).isEqualTo(4);

    int actualSecond = solution.get(3);
    assertThat(actualSecond).isEqualTo(3);

    int actualThird = solution.get(2);
    assertThat(actualThird).isEqualTo(2);

    int actualFourth = solution.get(1);
    assertThat(actualFourth).isEqualTo(-1);

    solution.put(5, 5);

    int actualFifth = solution.get(1);
    assertThat(actualFifth).isEqualTo(-1);

    int actualSixth = solution.get(2);
    assertThat(actualSixth).isEqualTo(2);

    int actualSeventh = solution.get(3);
    assertThat(actualSeventh).isEqualTo(3);

    int actualEighth = solution.get(4);
    assertThat(actualEighth).isEqualTo(-1);

    int actualNineth = solution.get(5);
    assertThat(actualNineth).isEqualTo(5);
  }

}