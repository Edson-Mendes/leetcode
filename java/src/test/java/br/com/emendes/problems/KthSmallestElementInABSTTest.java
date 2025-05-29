package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Integer.MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class KthSmallestElementInABSTTest {

  @Test
  void test01() {
    KthSmallestElementInABST solution = new KthSmallestElementInABST();

    TreeNode root = TreeNodeGenerator.generate(10);
    int actualAnswer = solution.kthSmallest(root, 1);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test02() {
    KthSmallestElementInABST solution = new KthSmallestElementInABST();

    TreeNode root = TreeNodeGenerator.generate(10, 6, 12);
    int actualAnswer = solution.kthSmallest(root, 1);

    assertThat(actualAnswer).isEqualTo(6);
  }

  @Test
  void test03() {
    KthSmallestElementInABST solution = new KthSmallestElementInABST();

    TreeNode root = TreeNodeGenerator.generate(10, 6, 12);
    int actualAnswer = solution.kthSmallest(root, 2);

    assertThat(actualAnswer).isEqualTo(10);
  }

  @Test
  void test04() {
    KthSmallestElementInABST solution = new KthSmallestElementInABST();

    TreeNode root = TreeNodeGenerator.generate(10, 6, 12);
    int actualAnswer = solution.kthSmallest(root, 3);

    assertThat(actualAnswer).isEqualTo(12);
  }

  @Test
  void test05() {
    KthSmallestElementInABST solution = new KthSmallestElementInABST();

    TreeNode root = TreeNodeGenerator.generate(3, 1, 4, MIN_VALUE, 2, MIN_VALUE, MIN_VALUE);
    int actualAnswer = solution.kthSmallest(root, 1);

    assertThat(actualAnswer).isEqualTo(1);
  }

  @Test
  void test06() {
    KthSmallestElementInABST solution = new KthSmallestElementInABST();

    TreeNode root = TreeNodeGenerator.generate(5, 3, 6, 2, 4, MIN_VALUE, MIN_VALUE, 1, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    int actualAnswer = solution.kthSmallest(root, 3);

    assertThat(actualAnswer).isEqualTo(3);
  }

  @ParameterizedTest
  @CsvSource(value = {"1,10", "2,20", "3,30", "4,40", "5,50"})
  void test07(int k, int expected) {
    KthSmallestElementInABST solution = new KthSmallestElementInABST();

    TreeNode root = TreeNodeGenerator.generate(50, 30, 60, 20, 40, MIN_VALUE, MIN_VALUE, 10, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    int actualAnswer = solution.kthSmallest(root, k);

    assertThat(actualAnswer).isEqualTo(expected);
  }

}