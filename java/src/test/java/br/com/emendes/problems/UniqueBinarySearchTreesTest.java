package br.com.emendes.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueBinarySearchTreesTest {

  @Test
  void test01() {
    UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();

    int actualAnswer = solution.numTrees(1);

    assertThat(actualAnswer).isOne();
  }

  @Test
  void test02() {
    UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();

    int actualAnswer = solution.numTrees(2);

    assertThat(actualAnswer).isEqualTo(2);
  }

  @Test
  void test03() {
    UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();

    int actualAnswer = solution.numTrees(3);

    assertThat(actualAnswer).isEqualTo(5);
  }

  @Test
  void test04() {
    UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();

    int actualAnswer = solution.numTrees(4);

    assertThat(actualAnswer).isEqualTo(14);
  }

  @Test
  void test05() {
    UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();

    int actualAnswer = solution.numTrees(5);

    assertThat(actualAnswer).isEqualTo(42);
  }

}